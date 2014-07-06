/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.n52.wps.client;

import javafx.geometry.BoundingBox;
import javax.swing.text.html.HTML;
import net.opengis.ows.x11.CodeType;
import net.opengis.ows.x11.LanguageStringType;
import net.opengis.ows.x11.impl.LanguageStringTypeImpl;
import net.opengis.ows11.Ows11Factory;
import net.opengis.wps.x100.LiteralOutputType;
import net.opengis.wps.x100.OutputDescriptionType;
import net.opengis.wps.x100.ProcessDescriptionType;
import net.opengis.wps.x100.SupportedCRSsType;
import net.opengis.wps.x100.SupportedComplexDataInputType;
import net.opengis.wps.x100.SupportedComplexDataType;
import org.apache.xmlbeans.XmlErrorCodes;
import org.geotools.ows.v1_1.OWS;

/**
 *
 * @author carstenduvel
 */
public class BasicOutputDescriptionType {
    private OutputDescriptionType odt;
    
    /* general constructor */
    private void initialize(String identifier,String title, String processVersion) {
        odt = OutputDescriptionType.Factory.newInstance();
        
        /* Mandatory (One) */
        this.addNewIdentifier(identifier);
        this.addNewTitle(title);
        
        /* Mandatory (One of the three) */
        //See functions that call this one
        
        /* Optional (Zero or one) */
        //Abstract
        
        /* Optional (Zero or more) */
        //Metadata
    }
    
    public BasicOutputDescriptionType(SupportedCRSsType OutputFormChoice, String identifier,String title, String processVersion) {
        initialize(identifier,title,processVersion);
        /* Mandatory (One of the three) */
        this.addNewBoundingBoxOutput(OutputFormChoice);
    }
    
    public BasicOutputDescriptionType(LiteralOutputType OutputFormChoice, String identifier,String title, String processVersion) {
        initialize(identifier,title,processVersion);
        /* Mandatory (One of the three) */
        this.addNewLiteralOutput(OutputFormChoice);
    }
    
    public BasicOutputDescriptionType(SupportedComplexDataType OutputFormChoice, String identifier,String title, String processVersion) {
        initialize(identifier,title,processVersion);
        /* Mandatory (One of the three) */
        this.addNewComplexOutput(OutputFormChoice);
    }
    
    
    
    /* -- Simplified functions -- */
    
    private void addNewBoundingBoxOutput(SupportedCRSsType OutputFormChoice) {
        SupportedCRSsType scrst = odt.addNewBoundingBoxOutput();
        scrst = OutputFormChoice;
    }   
    
    private void addNewLiteralOutput(LiteralOutputType OutputFormChoice) {
        LiteralOutputType lot = odt.addNewLiteralOutput();
        lot = OutputFormChoice;
    }   
    
    private void addNewComplexOutput(SupportedComplexDataType OutputFormChoice) {
        SupportedComplexDataType scdit = odt.addNewComplexOutput();
        scdit = OutputFormChoice;
    }   
    
    /* String -> LanguageStringType/CodeType */
    private void addNewAbstract(String text) {
        LanguageStringType lst = odt.addNewAbstract();
        lst.setStringValue(text);
    }
    
    private void addNewTitle(String text) {
        LanguageStringType lst = odt.addNewTitle();
        lst.setStringValue(text);
    }
    
    private void addNewIdentifier(String text) {
        CodeType ct = odt.addNewIdentifier();
        ct.setStringValue(text);
    }   
    
    /* -- Getter & Setter -- */
    
    public OutputDescriptionType getOdt() {
        return odt;
    }

    public void setPdt(OutputDescriptionType odt) {
        this.odt = odt;
    }
    
}
