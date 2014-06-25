package de.hsos.richwps.dsl.api.elements;

/**
 * Represents a reference (in/out/var) which can be used by assignments, and
 * execute statements.
 *
 * @author dalcacer
 * @verson draft
 */
public class OutReference extends Reference {

    public OutReference(String identifier) {
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

        OutReference other = (OutReference) obj;
        if (this.getId().equals(other.getId())) {
            return true;
        }

        return false;
    }

    public String toNotation(){
        return "out."+this.getId();
    }
}
