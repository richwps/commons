package de.hsos.richwps.dsl.api.elements;

/**
 * Represents a reference (in/out/var) which can be used by assignments, and
 * execute statements.
 *
 * @author dalcacer
 * @version draft
 */
public class Reference {

    private String id;

    public Reference(String identifier) {
        this.id = identifier;

    }

    public String getId() {
        return this.id;
    }

    public void setId(String identifier) {
        this.id = identifier;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Reference other = (Reference) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }

    /**
     * Never used, because of inheritance.
     *
     * @see InReference
     * @see OutReference
     * @see VarReference
     * .
     */
    public String toNotation() {
        return "";
    }
}
