package de.hsos.richwps.dsl.api.elements;

import java.util.ArrayList;

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
     * Returns the amount of given bindings. Debugging/testing and
     * statistical purpose only.
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
     * Returns the amount of given execute-statements. Debugging/testing
     * and statistical purpose only.
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
     * Returns the amount of given execute-statements. Debugging/testing
     * and statistical purpose only.
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
}
