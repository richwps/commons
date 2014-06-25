package de.hsos.richwps.dsl.api.elements;

import de.hsos.richwps.dsl.api.exceptions.UnsupportedSyntaxException;
import java.text.MessageFormat;

/**
 * Represents an assignment which is used to store the value of reference b to
 * reference a.
 *
 * @author fbensmann
 * @author dalcacer
 * @version draft
 */
public class Assignment implements IOperation {

    /**
     * Reference that another reference is assigned to
     */
    private Reference lefthand = null;
    /**
     * Reference that is assigned to another reference
     */
    private Reference righthand = null;
    private String stringvalue;
    private Integer intvalue;

    public Assignment(Reference a, Reference b) throws Exception {
        if ((a instanceof InReference) || (a.getClass() == InReference.class)) {
            throw new UnsupportedSyntaxException("Binding values to worksequence inputs is not allowed.");
        }

        this.lefthand = a;
        this.righthand = b;
        this.stringvalue = null;
        this.intvalue = null;
    }

    public Assignment(Reference a, String value) throws Exception {
        if (a instanceof InReference) {
            throw new UnsupportedSyntaxException("Binding values to worksequence inputs is not allowed.");
        }
        this.lefthand = a;
        this.righthand = null;
        this.stringvalue = value;
        this.intvalue = null;
    }

    public Assignment(Reference a, Integer value) throws Exception {
        if (a instanceof InReference) {
            throw new UnsupportedSyntaxException("Binding values to worksequence inputs is not allowed.");
        }
        this.lefthand = a;
        this.righthand = null;
        this.stringvalue = null;
        this.intvalue = value;
    }

    public Reference getLefthand() {
        return lefthand;
    }

    public Reference getRighthand() {
        return righthand;
    }

    public String getStringvalue() {
        return stringvalue;
    }

    public Integer getIntvalue() {
        return intvalue;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Assignment other = (Assignment) obj;
        if (this.lefthand != other.lefthand && (this.lefthand == null || !this.lefthand.equals(other.lefthand))) {
            return false;
        }
        if (this.righthand != other.righthand && (this.righthand == null || !this.righthand.equals(other.righthand))) {
            return false;
        }
        if ((this.stringvalue == null) ? (other.stringvalue != null) : !this.stringvalue.equals(other.stringvalue)) {
            return false;
        }
        if (this.intvalue != other.intvalue && (this.intvalue == null || !this.intvalue.equals(other.intvalue))) {
            return false;
        }
        return true;
    }

    /**
     *
     */
    @Override
    public String toNotation() {
        String assignment = "";
        if (this.righthand instanceof Reference) {
            assignment = MessageFormat.format("{0} = {1}", this.lefthand.toNotation(), this.righthand.toNotation());
        } else if (this.righthand == null) {
            if (this.intvalue != null) {
                assignment = MessageFormat.format("{0} = {1}", this.lefthand.toNotation(), intvalue);
            } else if (this.stringvalue != null) {
                assignment = MessageFormat.format("{0} = {1}", this.lefthand.toNotation(), stringvalue);
            }
        }
        return assignment;
    }
}
