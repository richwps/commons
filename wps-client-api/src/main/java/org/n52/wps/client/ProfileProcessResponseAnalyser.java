package org.n52.wps.client;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import net.opengis.ows.x11.ExceptionReportDocument.ExceptionReport;
import net.opengis.wps.x100.DocumentOutputDefinitionType;
import net.opengis.wps.x100.ExecuteDocument;
import net.opengis.wps.x100.OutputDataType;
import net.opengis.wps.x100.OutputDescriptionType;
import net.opengis.wps.x100.ProcessDescriptionType;
import net.opengis.wps.x100.ProfileProcessDocument;
import net.opengis.wps.x100.ProfileProcessResponseDocument;
import net.opengis.wps.x100.ProfileType;

import org.n52.wps.io.IParser;
import org.n52.wps.io.data.IData;

/**
 * This implementation provides functionality to analyse process profile
 * responses.
 * 
 * @author faltin
 *
 */

public class ProfileProcessResponseAnalyser {

	ExecuteResponseAnalyser executeResponseAnalyser;
	ProcessDescriptionType processDesc;
	ProfileProcessDocument profileProcessDocument;
	Object response;
	ExecuteDocument exec;

	public ProfileProcessResponseAnalyser(
			ProfileProcessDocument profileProcessDocument, Object response)
			throws WPSClientException {
		processDesc = profileProcessDocument.getProfileProcess()
				.getProcessDescription();
		this.profileProcessDocument = profileProcessDocument;
		if (response instanceof ExceptionReport) {
			throw new WPSClientException(
					"Output is not ComplexData but an Exception Report");
		}
		exec = ExecuteDocument.Factory.newInstance();
		exec.addNewExecute();
		exec.getExecute().setIdentifier(
				profileProcessDocument.getProfileProcess()
						.getProcessDescription().getIdentifier());
		exec.getExecute().setDataInputs(
				profileProcessDocument.getProfileProcess().getDataInputs());
		exec.getExecute().setResponseForm(
				profileProcessDocument.getProfileProcess().getResponseForm());
		this.response = response;
	}

	/**
	 * Returns the ProfileProcessDocument
	 * 
	 * @return the ProfileProcessDocument
	 */
	public ProfileProcessDocument getProfileProcessDocument() {
		return profileProcessDocument;

	}

	/**
	 * Returns the extracted execute document.
	 * 
	 * @return ExecuteDocument contained in ProfileProcessDocument
	 */
	public ExecuteDocument getExecuteDocument() {
		return exec;
	}

	/**
	 * Returns the measured profiles of the process.
	 * 
	 * @return the profiles
	 */
	public ProfileType[] getProfiles() {
		ProfileProcessResponseDocument doc;
		if (response instanceof ProfileProcessResponseDocument) {
			doc = (ProfileProcessResponseDocument) response;
			return doc.getProfileProcessResponse().getProfiles()
					.getProfileArray();
		}
		return null;
	}

	/**
	 * delivers the parsed ComplexData by name
	 * 
	 * @param outputID
	 *            id of the output element
	 * @param binding
	 *            Class of the output binding, e.g. GenericFileDataBinding
	 * @return the parsed ComplexData in the requested format defined by the
	 *         binding
	 * @throws WPSClientException
	 */
	public IData getComplexData(String outputID, Class binding)
			throws WPSClientException {
		return parseProcessOutput(outputID, binding);

	}

	/**
	 * delivers the parsed ComplexData by index
	 * 
	 * @param index
	 *            index of the output element starting with 0
	 * @param binding
	 *            Class of the output binding, e.g. GenericFileDataBinding
	 * @return the parsed ComplexData in the requested format defined by the
	 *         binding
	 * @throws WPSClientException
	 */
	public IData getComplexDataByIndex(int index, Class binding)
			throws WPSClientException {
		ProfileProcessResponseDocument doc = null;
		if (response instanceof ProfileProcessResponseDocument) {
			doc = (ProfileProcessResponseDocument) response;
		} else {
			throw new WPSClientException(
					"Output cannot be determined by index since it is either raw data or an exception report");
		}
		OutputDataType[] outputs = doc.getProfileProcessResponse()
				.getProcessOutputs().getOutputArray();
		int counter = 0;
		for (OutputDataType output : outputs) {
			if (output.getData().getComplexData() != null) {
				if (counter == index) {
					return this.parseProcessOutput(output.getIdentifier()
							.getStringValue(), binding);
				}
				counter++;
			}
		}
		return null;
	}

	/**
	 * delivers just the URL of a referenced output identified by index
	 * 
	 * @param index
	 *            index of the output
	 * @return URL of the stored output
	 * @throws WPSClientException
	 */
	public String getComplexReferenceByIndex(int index)
			throws WPSClientException {
		ProfileProcessResponseDocument doc = null;
		if (response instanceof ProfileProcessResponseDocument) {
			doc = (ProfileProcessResponseDocument) response;
		} else {
			throw new WPSClientException(
					"Output cannot be determined by index since it is either raw data or an exception report");
		}
		OutputDataType[] outputs = doc.getProfileProcessResponse()
				.getProcessOutputs().getOutputArray();

		int counter = 0;
		for (OutputDataType output : outputs) {
			if (output.getReference() != null) {
				if (counter == index) {
					return output.getReference().getHref();
				}
				counter++;
			}
		}
		throw new RuntimeException("No reference found in response");
	}

	/**
	 * parses a specific WPS output
	 * 
	 * @param outputID
	 *            id of the output
	 * @param outputDataBindingClass
	 *            class of the desired output binding
	 * @return parsed WPS output as IData
	 * @throws WPSClientException
	 */
	private IData parseProcessOutput(String outputID,
			Class outputDataBindingClass) throws WPSClientException {
		OutputDescriptionType outputDesc = null;

		String schema = null;
		String mimeType = null;
		String encoding = null;

		if (exec.getExecute().isSetResponseForm()
				&& exec.getExecute().getResponseForm().isSetRawDataOutput()) {
			// get data specification from request
			schema = exec.getExecute().getResponseForm().getRawDataOutput()
					.getSchema();
			mimeType = exec.getExecute().getResponseForm().getRawDataOutput()
					.getMimeType();
			encoding = exec.getExecute().getResponseForm().getRawDataOutput()
					.getEncoding();
		} else if (exec.getExecute().isSetResponseForm()
				&& exec.getExecute().getResponseForm().isSetResponseDocument()) {
			DocumentOutputDefinitionType[] outputs = exec.getExecute()
					.getResponseForm().getResponseDocument().getOutputArray();
			for (DocumentOutputDefinitionType output : outputs) {
				if (output.getIdentifier().getStringValue().equals(outputID)) {
					schema = output.getSchema();
					mimeType = output.getMimeType();
					encoding = output.getEncoding();
				}
			}

		}

		if (mimeType == null) {
			for (OutputDescriptionType tempDesc : processDesc
					.getProcessOutputs().getOutputArray()) {
				if (outputID.equals(tempDesc.getIdentifier().getStringValue())) {
					outputDesc = tempDesc;
					break;
				}
			}
			// get default data spec since mime type is not set
			mimeType = outputDesc.getComplexOutput().getDefault().getFormat()
					.getMimeType();
			encoding = outputDesc.getComplexOutput().getDefault().getFormat()
					.getEncoding();
			schema = outputDesc.getComplexOutput().getDefault().getFormat()
					.getSchema();
		}

		IParser parser = StaticDataHandlerRepository.getParserFactory()
				.getParser(schema, mimeType, encoding, outputDataBindingClass);
		InputStream is = null;
		if (response instanceof InputStream) {
			is = (InputStream) response;
		} else if (response instanceof ProfileProcessResponseDocument) {
			ProfileProcessResponseDocument responseDocument = (ProfileProcessResponseDocument) response;
			OutputDataType[] processOutputs = responseDocument
					.getProfileProcessResponse().getProcessOutputs()
					.getOutputArray();
			for (OutputDataType processOutput : processOutputs) {
				if (processOutput.getIdentifier().getStringValue()
						.equalsIgnoreCase(outputID)) {
					if (processOutput.isSetReference()) {
						// request the reference
						String urlString = processOutput.getReference()
								.getHref();
						URL url;
						try {
							url = new URL(urlString);
							is = url.openStream();
						} catch (MalformedURLException e) {
							throw new WPSClientException(
									"Could not fetch response from referenced URL",
									e);
						} catch (IOException e) {
							throw new WPSClientException(
									"Could not fetch response from referenced URL",
									e);
						}

					} else {
						is = processOutput.getData().getComplexData()
								.newInputStream();
					}

				}
			}

		} else {
			throw new WPSClientException("Wrong output type");
		}

		if (parser != null) {
			if (encoding.equalsIgnoreCase("base64")) {
				return parser.parseBase64(is, mimeType, schema);
			} else {
				return parser.parse(is, mimeType, schema);
			}
		}

		throw new RuntimeException("Could not find suitable parser");
	}

}
