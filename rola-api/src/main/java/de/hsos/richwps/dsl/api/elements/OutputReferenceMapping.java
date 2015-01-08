package de.hsos.richwps.dsl.api.elements;

/**
 * This data structure contains the identifier of a rola variable respectively
 * output-reference, its related process and associated output-identifier of
 * this process.
 * 
 * @author faltin
 *
 */
public class OutputReferenceMapping {
	private String processId;
	private String outputIdentifier;
	private String outputReference;

	/**
	 * Constructs a new OutputreferenceMapping with the output-reference,
	 * related process-identifier and output-identifier.
	 * 
	 * @param processId
	 *            the process-identifier
	 * @param outputIdentifier
	 *            the output-identifier
	 * @param outputReference
	 *            the output-reference
	 */
	public OutputReferenceMapping(String processId, String outputIdentifier,
			String outputReference) {
		this.processId = processId;
		this.outputIdentifier = outputIdentifier;
		this.outputReference = outputReference;
	}

	/**
	 * Returns the process-identifier.
	 * 
	 * @return the process-identifier
	 */
	public String getProcessId() {
		return processId;
	}

	/**
	 * Returns the output-identifier.
	 * 
	 * @return the output-identifier.
	 */
	public String getOutputIdentifier() {
		return outputIdentifier;
	}

	/**
	 * Returns the output-reference.
	 * 
	 * @return the output-reference.
	 */
	public String getOutputReference() {
		return outputReference;
	}

}
