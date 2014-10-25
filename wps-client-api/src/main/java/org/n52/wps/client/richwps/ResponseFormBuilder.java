package org.n52.wps.client.richwps;

import net.opengis.wps.x100.DocumentOutputDefinitionType;
import net.opengis.wps.x100.InputDescriptionType;
import net.opengis.wps.x100.OutputDescriptionType;
import net.opengis.wps.x100.ProcessDescriptionType;
import net.opengis.wps.x100.ResponseDocumentType;
import net.opengis.wps.x100.ResponseFormType;

/**
 * 
 * @author johannesfaltin
 *
 */
public class ResponseFormBuilder {
	private ResponseFormType responseFormType;
	private ProcessDescriptionType processDescriptionType;
	private ResponseDocumentType responseDocumentType;

	/**
	 * 
	 * @param processDescriptionType
	 */
	public ResponseFormBuilder(ProcessDescriptionType processDescriptionType) {
		responseFormType = net.opengis.wps.x100.ResponseFormType.Factory
				.newInstance();
		this.processDescriptionType = processDescriptionType;
		this.responseDocumentType = ResponseDocumentType.Factory.newInstance();
		this.responseFormType.setResponseDocument(this.responseDocumentType);
	}

	/**
	 * @return
	 */
	public ResponseFormType getResponseFormType() {
		return responseFormType;
	}

	/**
	 * @param outputName
	 */
	public void addOutput(String outputName) {
		OutputDescriptionType outputDesc = getOutputDescription(outputName);
		addOutputIdentifier(outputDesc);
	}

	/**
	 * Add an output element to response document. Output element references
	 * output between orchestrated processes
	 * 
	 * @param intermediateOutputName
	 */
	public void addIntermediateOutput(String intermediateOutputName) {
		// TODO create identifier which references output. Add to response
		// document.
	}

	/**
	 * 
	 * @param id
	 * @return
	 */
	private OutputDescriptionType getOutputDescription(String outputName) {
		for (OutputDescriptionType outputDesc : processDescriptionType
				.getProcessOutputs().getOutputArray()) {
			if (outputDesc.getIdentifier().getStringValue().equals(outputName)) {
				return outputDesc;
			}
		}
		return null;
	}

	/**
	 * 
	 * @param outputDesc
	 * @return
	 */
	private DocumentOutputDefinitionType addOutputIdentifier(
			OutputDescriptionType outputDesc) {
		DocumentOutputDefinitionType outputDef;
		if (responseFormType == null) {
			responseFormType = net.opengis.wps.x100.ResponseFormType.Factory
					.newInstance();
			responseFormType.addNewResponseDocument();
		}
		outputDef = responseFormType.getResponseDocument().addNewOutput();
		outputDef.setIdentifier(outputDesc.getIdentifier());
		return outputDef;
	}
}
