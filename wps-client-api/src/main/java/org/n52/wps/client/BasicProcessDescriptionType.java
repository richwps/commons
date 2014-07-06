/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.n52.wps.client;

import java.math.BigInteger;
import java.util.Collection;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.text.html.HTML;
import net.opengis.ows.x11.AnyValueDocument;
import net.opengis.ows.x11.CodeType;
import net.opengis.ows.x11.LanguageStringType;
import net.opengis.ows.x11.MetadataType;
import net.opengis.ows.x11.impl.LanguageStringTypeImpl;
import net.opengis.ows11.Ows11Factory;
import net.opengis.wps.x100.InputDescriptionType;
import net.opengis.wps.x100.LiteralInputType;
import net.opengis.wps.x100.OutputDescriptionType;
import net.opengis.wps.x100.ProcessDescriptionType;
import net.opengis.wps.x100.ProcessDescriptionsDocument;
import net.opengis.wps.x100.WSDLDocument;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlAnyURI;
import org.apache.xmlbeans.XmlErrorCodes;
import org.apache.xmlbeans.XmlOptions;
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
        //pdtpo = processOutputs;
        pdt.setProcessOutputs(processOutputs);
    }
    
    private void addNewTitle(String text) {
        LanguageStringType lst = pdt.addNewTitle();
        lst.setStringValue(text);
    }
    
    private void addNewIdentifier(String text) {
        CodeType ct = pdt.addNewIdentifier();
        ct.setStringValue(text);
    }   
    
    /* Optional */
    
    public void addNewAbstract(String text) {
        LanguageStringType lst = pdt.addNewAbstract();
        lst.setStringValue(text);
    }
    
    public void addNewWSDL(String text) {
        WSDLDocument.WSDL wsdl = pdt.addNewWSDL();
        wsdl.setHref(text);
        
    }
    
    public void addNewMetadata(String title) {
        MetadataType newMetadata = pdt.addNewMetadata();
        newMetadata.setTitle(title);
        /* Optional:
        newMetadata.setAbout(null);
        newMetadata.setAbstractMetaData(null);
        newMetadata.setActuate(null);
        newMetadata.setArcrole(null);
        newMetadata.setHref(null);
        newMetadata.setRole(null);
        newMetadata.setShow(null);
        newMetadata.setTitle(null);
        newMetadata.setType(null);
        */
    }
    
    public void addNewProfile(String text) {
        XmlAnyURI newProfile = pdt.addNewProfile();
        newProfile.setStringValue(text);
    }
    
    public void setStatusSupported(boolean statusSupported) {
       pdt.setStatusSupported(statusSupported);
    }
    
    public void setStoreSupported(boolean storeSupported) {
       pdt.setStoreSupported(true);
    }
    
    public void addNewDataInput(InputDescriptionType input) {
        ProcessDescriptionType.DataInputs dataInputs;
        if(pdt.getDataInputs()==null) {
            dataInputs = pdt.addNewDataInputs();
        } else {
            dataInputs = pdt.getDataInputs();
        }
       
        dataInputs.addNewInput();
        dataInputs.setInputArray(dataInputs.sizeOfInputArray()-1, input);
    }
    
    
    
    /* -- Getter & Setter -- */
    
    public ProcessDescriptionType getPdt() {
        return pdt;
    }

    public void setPdt(ProcessDescriptionType pdt) {
        this.pdt = pdt;
    }
    
}
