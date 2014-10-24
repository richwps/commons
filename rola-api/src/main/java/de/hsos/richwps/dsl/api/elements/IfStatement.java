
package de.hsos.richwps.dsl.api.elements;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dalcacer
 * @√ersion 0.0.1
 */
public class IfStatement implements IOperation{

    private List<IOperation> ifoperations;
    private List<IOperation> elseoperations;
    private Reference lefthand;
    private Reference righthand;
    private String operator;
    
    public IfStatement(){
        this.operator="";
        this.ifoperations=new ArrayList<>();
        this.elseoperations=new ArrayList<>();
    }

    public List<IOperation> getIfoperations() {
        return ifoperations;
    }

    public void setIfoperations(List<IOperation> ifoperations) {
        this.ifoperations = ifoperations;
    }
    
    public void addIfOperation(IOperation op){
        this.ifoperations.add(op);
    }

    public List<IOperation> getElseoperations() {
        return elseoperations;
    }

    public void setElseoperations(List<IOperation> elseoperations) {
        this.elseoperations = elseoperations;
    }

    public void addElseOperation(IOperation op){
        this.elseoperations.add(op);
    }
    public Reference getLefthand() {
        return lefthand;
    }

    public void setLefthand(Reference lefthand) {
        this.lefthand = lefthand;
    }

    public Reference getRighthand() {
        return righthand;
    }

    public void setRighthand(Reference righthand) {
        this.righthand = righthand;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
    
    
    
    @Override
    public String toNotation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
