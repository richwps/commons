package de.hsos.richwps.dsl.api.elements;

/**
 * Represents a reference (in/out/var) which can be used by assignments,
 * and execute statements.
 *
 * @author dalcacer
 * @version draft
 */
public class VarReference extends Reference {

    public VarReference(String identifier) {
        super(identifier);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        VarReference other = (VarReference) obj;
        if (this.getId().equals(other.getId())) {
            return true;
        }

        return false;
    }
    
    public String toNotation(){
        return "var."+this.getId();
    }
}
