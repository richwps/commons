package de.hsos.richwps.dsl.api.elements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author dalcacer
 * @version 0.0.1
 */
public class Workflow extends ArrayList<IOperation> {

	/**
	 * Creates a new <b>sequential</b> script.
	 */
	public Workflow() {
		super();
	}

	/**
	 * Returns the amount of given bindings. Debugging/testing and statistical
	 * purpose only.
	 *
	 * @return amount bindings.
	 */
	public int countBindings() {
		int bindings = 0;
		for (Object o : this) {
			if (o instanceof Binding) {
				bindings++;
			}
		}
		return bindings;
	}

	/**
	 * Returns the amount of given assignments. Debugging/testing and
	 * statistical purpose only.
	 *
	 * @return amount assignments.
	 */
	public int countAssignments() {
		int assignments = 0;
		for (Object o : this) {
			if (o instanceof Assignment) {
				assignments++;
			}
		}
		return assignments;
	}

	/**
	 * Returns the amount of given execute-statements. Debugging/testing and
	 * statistical purpose only.
	 *
	 * @return amount execute-statements.
	 */
	public int countExecutes() {
		int executes = 0;
		for (Object o : this) {
			if (o instanceof Execute) {
				executes++;
			}
		}
		return executes;
	}

	/**
	 * Returns the amount of given execute-statements. Debugging/testing and
	 * statistical purpose only.
	 *
	 * @return amount execute-statements.
	 */
	public int countIfStatement() {
		int ifs = 0;
		for (Object o : this) {
			if (o instanceof IfStatement) {
				ifs++;
			}
		}
		return ifs;
	}

	/**
	 * Transforms this model to notation.
	 *
	 * @return ROLA notation.
	 */
	public String toNotation() {
		String notation = "";
		for (IOperation o : this) {
			notation += o.toNotation();
			notation += "\n\n";
		}
		return notation;
	}

	/**
	 * Assembles Process-handle with ProcessId, related Outputs and
	 * Output-References.
	 * 
	 * @param output
	 *            -reference-names
	 * 
	 * @return Assembly
	 */
	public List<OutputReferenceMapping> getOutputReferenceMappings(
			List<String> variableNames) {
		List<OutputReferenceMapping> processOutputsOnVariablesMapping = new ArrayList<OutputReferenceMapping>();
		Map<String, String> handleProcessIdMappings = new HashMap<String, String>();
		for (IOperation o : this) {
			if (o instanceof Binding) {
				handleProcessIdMappings.put(((Binding) o).getHandle(),
						((Binding) o).getProcessId());
			}
		}
		for (IOperation o : this) {
			if (o instanceof Execute) {
				String handle = ((Execute) o).getHandle();
				// HandleProcessIdMapping handleProcessIdMapping = new
				// HandleProcessIdMapping(
				// handle, handleProcessIdMappings.get(handle));
				List<String> outputnames = (ArrayList<String>) ((Execute) o)
						.getOutputnames();
				List<Reference> outputreferences = (List<Reference>) ((Execute) o)
						.getOutputreferences();
				for (int i = 0; i < outputnames.size(); i++) {
					if (variableNames.contains(outputreferences.get(i).getId())) {
						OutputReferenceMapping processOutputOnVariableMapping = new OutputReferenceMapping(
								handleProcessIdMappings.get(handle),
								outputnames.get(i), "var."
										+ outputreferences.get(i).getId());
						processOutputsOnVariablesMapping
								.add(processOutputOnVariableMapping);
					}
				}
			}
		}
		return processOutputsOnVariablesMapping;
	}
}
