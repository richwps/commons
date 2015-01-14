package de.hsos.richwps.dsl.api.elements;

/**
 * This data structure contains the identifier of a rola variable respectively
 * output-reference, its related process and associated output-identifier of
 * this process.
 * 
 * @author faltin
 *
 */
public class ReferenceOutputMapping {
	private String processIdentifier;
	private String outputIdentifier;
	private String outputReference;

	/**
	 * Constructs a new ReferenceOutputMapping with the output-reference,
	 * related process-identifier and output-identifier.
	 * 
	 * @param processIdentifier
	 *            the process-identifier
	 * @param outputIdentifier
	 *            the output-identifier
	 * @param outputReference
	 *            the output-reference
	 */
	public ReferenceOutputMapping(String processIdentifier, String outputIdentifier,
			String outputReference) {
		this.processIdentifier = processIdentifier;
		this.outputIdentifier = outputIdentifier;
		this.outputReference = outputReference;
	}

	/**
	 * Returns the process-identifier.
	 * 
	 * @return the process-identifier
	 */
	public String getProcessIdentifier() {
		return processIdentifier;
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
