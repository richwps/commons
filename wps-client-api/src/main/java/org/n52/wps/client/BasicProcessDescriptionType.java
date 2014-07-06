/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.n52.wps.client;

import javax.swing.text.html.HTML;
import net.opengis.ows.x11.CodeType;
import net.opengis.ows.x11.LanguageStringType;
import net.opengis.ows.x11.impl.LanguageStringTypeImpl;
import net.opengis.ows11.Ows11Factory;
import net.opengis.wps.x100.OutputDescriptionType;
import net.opengis.wps.x100.ProcessDescriptionType;
import org.apache.xmlbeans.XmlErrorCodes;
import org.geotools.ows.v1_1.OWS;

/**
 *
 * @author carstenduvel
 */
public class BasicProcessDescriptionType {
    private ProcessDescriptionType pdt;
    
    /* Requires the Mandatory values */
    public BasicProcessDescriptionType(String identifier,String title, String processVersion, ProcessDescriptionType.ProcessOutputs processOutputs) {
        pdt = ProcessDescriptionType.Factory.newInstance();
        
        /* Mandatory (One) */
        this.addNewIdentifier(identifier);
        this.addNewTitle(title);
        pdt.setProcessVersion(processVersion);
        this.addNewProcessOutputs(processOutputs);
        
        /* Optional (Zero or one) */
        //Abstract
        //WSDL
        //DataInputs
        //storeSupported
        //statusSupported
        
        /* Optional (Zero or more) */
        //Metadata
        //Profile
    }
    
    /* -- Simplified functions -- */
    
    private void addNewProcessOutputs(ProcessDescriptionType.ProcessOutputs processOutputs) {
        ProcessDescriptionType.ProcessOutputs pdtpo = pdt.addNewProcessOutputs();
        pdtpo = processOutputs;
    }
    
    /* String -> LanguageStringType/CodeType */
    private void addNewAbstract(String text) {
        LanguageStringType lst = pdt.addNewAbstract();
        lst.setStringValue(text);
    }
    
    private void addNewTitle(String text) {
        LanguageStringType lst = pdt.addNewTitle();
        lst.setStringValue(text);
    }
    
    private void addNewIdentifier(String text) {
        CodeType ct = pdt.addNewIdentifier();
        ct.setStringValue(text);
    }   
    
    
    
    
    public static void main(String[] args) {
        ProcessDescriptionType.ProcessOutputs po = ProcessDescriptionType.ProcessOutputs.Factory.newInstance();
        OutputDescriptionType odt = po.addNewOutput();
        
        
        BasicProcessDescriptionType bpdt = new BasicProcessDescriptionType(
                "Buffer", //Identifier
                "Create a buffer around a polygon.", //Title
                "2", //ProcessVersion
                po); //ProcessOuputs
        
        
        System.out.println("--------####---------");
        System.out.println(bpdt.pdt.toString());
        System.out.println("--------####---------");
    }
    
    
    /* -- Getter & Setter -- */
    
    public ProcessDescriptionType getPdt() {
        return pdt;
    }

    public void setPdt(ProcessDescriptionType pdt) {
        this.pdt = pdt;
    }
    
}
