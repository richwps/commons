package org.n52.wps.client.richwps;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.util.List;

import net.opengis.wps.x100.DocumentOutputDefinitionType;
import net.opengis.wps.x100.InputType;
import net.opengis.wps.x100.ProcessDescriptionType;
import net.opengis.wps.x100.ProfileProcessDocument;
import net.opengis.wps.x100.ResponseFormType;

import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlString;
import org.n52.wps.client.ExecuteRequestBuilder;
import org.n52.wps.client.WPSClientException;
import org.n52.wps.io.data.IData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This implementation provides functionality to build a request for profiling a
 * process.
 * 
 * @author faltin
 *
 */
public class ProfileProcessRequestBuilder {
	private static Logger LOGGER = LoggerFactory
			.getLogger(ProfileProcessRequestBuilder.class);
	private ProcessDescriptionType processDesc;
	private ProfileProcessDocument profileProcessDocument;
	private ProfileProcessDocument.ProfileProcess profileProcess;
	private ExecuteRequestBuilder executeRequestBuilder;

	public static String SERVICE = "WPS";
	public static String VERSION = "1.0.0";

	/**
	 * Constructs a new ProfileProcessRequestBuilder.
	 * 
	 * @param pdtb
	 *            a ProcessDescription-Builder
	 */
	public ProfileProcessRequestBuilder(ProcessDescriptionTypeBuilder pdtb) {
		this.processDesc = pdtb.getPdt();
		executeRequestBuilder = new ExecuteRequestBuilder(processDesc);
		profileProcessDocument = ProfileProcessDocument.Factory.newInstance();
		profileProcess = ProfileProcessDocument.ProfileProcess.Factory
				.newInstance();
		profileProcess.setProcessDescription(processDesc);
		profileProcess.setService(SERVICE);
		profileProcess.setVersion(VERSION);
	}

	/**
	 * Constructs a new ProfileProcessRequestBuilder.
	 * 
	 * @param processDesc
	 *            the ProcessDescription
	 */
	public ProfileProcessRequestBuilder(ProcessDescriptionType processDesc) {
		this.processDesc = processDesc;
		executeRequestBuilder = new ExecuteRequestBuilder(processDesc);
		profileProcessDocument = ProfileProcessDocument.Factory.newInstance();
		profileProcess = ProfileProcessDocument.ProfileProcess.Factory
				.newInstance();
		profileProcess.setService(SERVICE);
		profileProcess.setVersion(VERSION);
		profileProcess.setProcessDescription(this.processDesc);
	}

	private void updateInputs() {
		profileProcess.setDataInputs(executeRequestBuilder.getExecute()
				.getExecute().getDataInputs());
	}

	/**
	 * Add an input element. Sets the data in the xml request
	 * 
	 * @param parameterID
	 *            the ID of the input (see process description)
	 * @param value
	 *            the actual value (for xml data xml for binary data is should
	 *            be base64 encoded data)
	 * @param schema
	 *            schema if applicable otherwise null
	 * @param encoding
	 *            encoding if not the default encoding (for default encoding set
	 *            it to null) (i.e. binary data, use base64)
	 * @param mimeType
	 *            mimetype of the data, has to be set
	 * @throws WPSClientException
	 */
	public void addComplexData(String parameterID, IData value, String schema,
			String encoding, String mimeType) throws WPSClientException {
		if (schema.isEmpty()) {
			schema = null;
		}
		if (encoding.isEmpty()) {
			encoding = null;
		}
		executeRequestBuilder.addComplexData(parameterID, value, schema,
				encoding, mimeType);
		updateInputs();
	}

	/**
	 * add an input element. sets the data in the xml request
	 * 
	 * @param parameterID
	 *            the ID of the input (see process description)
	 * @param value
	 *            the actual value as String (for xml data xml for binary data
	 *            is should be base64 encoded data)
	 * @param schema
	 *            schema if applicable otherwise null
	 * @param encoding
	 *            encoding if not the default encoding (for default encoding set
	 *            it to null) (i.e. binary data, use base64)
	 * @param mimeType
	 *            mimetype of the data, has to be set
	 * @throws WPSClientException
	 */
	public void addComplexData(String parameterID, String value, String schema,
			String encoding, String mimeType) throws WPSClientException {
		if (schema.isEmpty()) {
			schema = null;
		}
		if (encoding.isEmpty()) {
			encoding = null;
		}
		executeRequestBuilder.addComplexData(parameterID, value, schema,
				encoding, mimeType);
		updateInputs();
	}

	/**
	 * add an input element. sets the data in the xml request
	 * 
	 * @param parameterID
	 *            the ID of the input (see process description)
	 * @param value
	 *            the actual value as String (for xml data xml for binary data
	 *            is should be base64 encoded data)
	 * @param schema
	 *            schema if applicable otherwise null
	 * @param encoding
	 *            encoding if not the default encoding (for default encoding set
	 *            it to null) (i.e. binary data, use base64)
	 * @param mimeType
	 *            mimetype of the data, has to be set
	 * @throws WPSClientException
	 */
	public void addComplexData(String parameterID, String value, String schema,
			String encoding, String mimeType, boolean asReference)
			throws WPSClientException {
		if (schema.isEmpty()) {
			schema = null;
		}
		if (encoding.isEmpty()) {
			encoding = null;
		}
		executeRequestBuilder.addComplexData(parameterID, value, schema,
				encoding, mimeType, asReference);
		updateInputs();
	}

	/**
	 * add an input element. sets the data in the xml request
	 * 
	 * @param inputType
	 * @throws WPSClientException
	 */
	public void addComplexData(InputType inputType) {
		executeRequestBuilder.addComplexData(inputType);
		updateInputs();
	}

	/**
	 * Add literal data to the request
	 * 
	 * @param parameterID
	 *            the ID of the input paramter according to the describe process
	 * @param value
	 *            the value. other types than strings have to be converted to
	 *            string. The datatype is automatically determined and set
	 *            accordingly to the process description
	 */
	public void addLiteralData(String parameterID, String value) {
		executeRequestBuilder.addLiteralData(parameterID, value);
		updateInputs();
	}

	/**
	 * Add boundingbox data to the request
	 * 
	 * @param parameterID
	 *            the ID of the input paramter according to the describe process
	 */
	public void addBoundingBoxData(final String parameterID, final String crs,
			final BigInteger dimensions, final List lowerCorner,
			final List upperCorner) {
		executeRequestBuilder.addBoundingBoxData(parameterID, crs, dimensions,
				lowerCorner, upperCorner);
		updateInputs();
	}

	/**
	 * Sets a reference to input data
	 * 
	 * @param parameterID
	 *            ID of the input element
	 * @param value
	 *            reference URL
	 * @param schema
	 *            schema if applicable otherwise null
	 * @param encoding
	 *            encoding if applicable (typically not), otherwise null
	 * @param mimetype
	 *            mimetype of the input according to the process description.
	 *            has to be set
	 */
	public void addComplexDataReference(String parameterID, String value,
			String schema, String encoding, String mimetype) {
		if (schema.isEmpty()) {
			schema = null;
		}
		if (encoding.isEmpty()) {
			encoding = null;
		}
		executeRequestBuilder.addComplexDataReference(parameterID, value,
				schema, encoding, mimetype);
		updateInputs();
	}

	/**
	 * checks, if the execute, which has been build is valid according to the
	 * process description.
	 * 
	 * @return
	 */
	public boolean isExecuteValid() {
		return executeRequestBuilder.isExecuteValid();
	}

	/**
	 * this sets store for the specific output.
	 * 
	 * @param parentInput
	 * @return
	 */
	public boolean setStoreSupport(String outputName, boolean storeSupport) {
		boolean storeSupportReturn = executeRequestBuilder.setStoreSupport(
				outputName, storeSupport);
		updateResponseForm();
		return storeSupportReturn;
	}

	/**
	 * this sets store for the specific output.
	 * 
	 * @param parentInput
	 * @return
	 */
	public boolean setAsReference(String outputName, boolean asReference) {
		boolean setAsReferenceReturn = executeRequestBuilder.setAsReference(
				outputName, asReference);
		updateResponseForm();
		return setAsReferenceReturn;
	}

	/**
	 * this sets store for the specific output.
	 * 
	 * @param parentInput
	 * @return
	 */
	public boolean setStatus(String outputName, boolean status) {
		boolean setStatusReturn = executeRequestBuilder.setStatus(outputName,
				status);
		updateResponseForm();
		return setStatusReturn;
	}

	/**
	 * Set this if you want the data to a schema offered in the process
	 * description
	 * 
	 * @param schema
	 * @param outputName
	 * @return
	 */
	public boolean setSchemaForOutput(String schema, String outputName) {
		boolean setSchemaForOutputReturn = executeRequestBuilder
				.setSchemaForOutput(schema, outputName);
		updateResponseForm();
		return setSchemaForOutputReturn;
	}

	/**
	 * sets the desired mimetype of the output. if not set, the default mimetype
	 * will be used as stated in the process description
	 * 
	 * @param mimeType
	 *            the name of the mimetype as announced in the
	 *            processdescription
	 * @param outputName
	 *            the Identifier of the output element
	 * @return success
	 */
	public boolean setMimeTypeForOutput(String mimeType, String outputName) {
		boolean setMimeTypeForOutputReturn = executeRequestBuilder
				.setMimeTypeForOutput(mimeType, outputName);
		updateResponseForm();
		return setMimeTypeForOutputReturn;
	}

	/**
	 * sets the encoding. necessary if data should not be retrieved in the
	 * default encoding (i.e. binary data in XML responses not raw data
	 * responses)
	 * 
	 * @param encoding
	 *            use base64
	 * @param outputName
	 *            ID of the output
	 * @return
	 */
	public boolean setEncodingForOutput(String encoding, String outputName) {
		boolean setEncodingForOutputReturn = executeRequestBuilder
				.setEncodingForOutput(encoding, outputName);
		updateResponseForm();
		return setEncodingForOutputReturn;
	}

	/**
	 * 
	 * @param outputIdentifier
	 * @param schema
	 * @param encoding
	 * @param mimeType
	 * @return
	 */
	public boolean setResponseDocument(String outputIdentifier, String schema,
			String encoding, String mimeType) {
		boolean setResponseDocumentReturn = executeRequestBuilder
				.setResponseDocument(outputIdentifier, schema, encoding,
						mimeType);
		updateResponseForm();
		return setResponseDocumentReturn;
	}

	/**
	 * Asks for data as raw data, i.e. without WPS XML wrapping
	 * 
	 * @param schema
	 *            if applicable otherwise null
	 * @param encoding
	 *            if default encoding = null, otherwise base64
	 * @param mimeType
	 *            requested mimetype of the output according to the process
	 *            description. if not set, default mime type is used.
	 * @return
	 */
	public boolean setRawData(String outputIdentifier, String schema,
			String encoding, String mimeType) {
		boolean setRawDataReturn = executeRequestBuilder.setRawData(
				outputIdentifier, schema, encoding, mimeType);
		updateResponseForm();
		return setRawDataReturn;
	}

	/**
	 * return a KVP representation for the created document.
	 * 
	 * @return KVP request string
	 * @throws UnsupportedEncodingException
	 *             if the URL encoding using UTF-8 fails
	 */
	public String getDocumentAsGETString() throws UnsupportedEncodingException {
		return executeRequestBuilder.getExecuteAsGETString();
	}

	/**
	 * ProfileProcess: Sets process description.
	 *
	 * @param description
	 *            process description.
	 */
	public void setProcessDescription(final ProcessDescriptionType description) {
		profileProcess.setProcessDescription(description);
	}

	/**
	 * ProfileProcess: Sets execution unit.
	 *
	 * @param exec
	 *            execution unit, plain text or base 64 zip. FIXME, not
	 *            implemented, yet.
	 */
	public void setExecutionUnit(final String exec) {
		profileProcess.setExecutionUnit(XmlString.Factory.newValue(exec));
	}

	/**
	 * ProfileProcess: Sets deployment profile name.
	 *
	 * @param profileName
	 *            deploymentProfileName
	 */
	public void setDeploymentProfileName(final String profileName) {
		profileProcess.setDeploymentProfileName(profileName);
	}

	/**
	 * ProfileProcess: Sets Data Inputs.
	 * 
	 * @param inputs
	 */
	public void setInputs(final net.opengis.wps.x100.DataInputsType inputs) {
		profileProcess.setDataInputs(inputs);
	}

	/**
	 * ProfileProcess: Sets Data Outputs.
	 * 
	 * @param outputs
	 */
	public void setOutputs(final net.opengis.wps.x100.ResponseFormType outputs) {
		executeRequestBuilder.getExecute().getExecute()
				.setResponseForm(outputs);
		updateResponseForm();
	}

	/**
	 * ProfileProcess: Returns the profileProcess request.
	 *
	 * @return profileProcessDocument
	 * @throws WPSClientException
	 */
	public ProfileProcessDocument getProfiledocument()
			throws WPSClientException {
		profileProcessDocument.setProfileProcess(profileProcess);
		return validateProfileProcessDocument(profileProcessDocument);
	}

	/**
	 * Validates the ProfileProcessDocument
	 * 
	 * @param doc
	 * @throws WPSClientException
	 */
	private ProfileProcessDocument validateProfileProcessDocument(
			ProfileProcessDocument doc) throws WPSClientException {

		if (doc.getProfileProcess().getProcessDescription() == null) {
			throw new WPSClientException(
					"ProfileProcess document does not contain a ProcessDescription");
		}
		if (doc.getProfileProcess().getExecutionUnit() == null) {
			throw new WPSClientException(
					"ProfileProcess document does not contain an ExecutionUnit");
		} else {
			if (((SimpleValue) doc.getProfileProcess().getExecutionUnit())
					.getStringValue().isEmpty()) {
				throw new WPSClientException(
						"ExecutionUnit of ProfileProcessDocument does not contain any value");
			}
		}
		return doc;
	}

	/**
	 * ProfileProcess: Adds Output to ResponseForm.
	 * 
	 * @param outputName
	 */
	public void addOutput(String outputName) {
		String rolaOutputIdentifier = null;
		try {
			executeRequestBuilder.addOutput(outputName);
		} catch (NullPointerException e) {
			rolaOutputIdentifier = getRolaIdentifier(outputName);
			addRolaOutput(rolaOutputIdentifier);
		}
		updateResponseForm();
	}

	private void updateResponseForm() {
		profileProcess.setResponseForm(executeRequestBuilder.getExecute()
				.getExecute().getResponseForm());
	}

	private void addRolaOutput(String outputName) {
		addOutputIdentifier(outputName);
	}

	private String getRolaIdentifier(String outputName) {
		String execUnitString;
		String rolaIdentifier = null;
		execUnitString = profileProcess.getExecutionUnit().xmlText();
		if (execUnitString.contains(outputName)) {
			rolaIdentifier = outputName;
		}
		if (rolaIdentifier == null) {
			throw new IllegalArgumentException(
					"Argument is not a rola identifier in Execution Unit.");
		}
		return rolaIdentifier;
	}

	private DocumentOutputDefinitionType addOutputIdentifier(String identifier) {
		DocumentOutputDefinitionType outputDef;
		ResponseFormType responseForm = executeRequestBuilder.getExecute()
				.getExecute().getResponseForm();
		if (responseForm == null) {
			responseForm = executeRequestBuilder.getExecute().getExecute()
					.addNewResponseForm();
			responseForm.addNewResponseDocument();
		}
		outputDef = getExistingUndefinedOutput();
		if (outputDef == null) {
			outputDef = responseForm.getResponseDocument().addNewOutput();
		}
		outputDef.addNewIdentifier().setStringValue(identifier);
		return outputDef;
	}

	private DocumentOutputDefinitionType getExistingUndefinedOutput() {
		DocumentOutputDefinitionType[] outputDefs = executeRequestBuilder
				.getExecute().getExecute().getResponseForm()
				.getResponseDocument().getOutputArray();
		DocumentOutputDefinitionType outputDef = null;
		for (DocumentOutputDefinitionType documentOutputDefinitionType : outputDefs) {
			if (documentOutputDefinitionType.getIdentifier() == null) {
				outputDef = documentOutputDefinitionType;
			}
		}
		return outputDef;
	}
}
