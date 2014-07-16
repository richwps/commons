/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.n52.wps.client;

import net.opengis.ows.x11.CodeType;
import net.opengis.ows.x11.LanguageStringType;
import net.opengis.ows.x11.MetadataType;
import net.opengis.wps.x100.CRSsType;
import net.opengis.wps.x100.ComplexDataCombinationType;
import net.opengis.wps.x100.ComplexDataCombinationsType;
import net.opengis.wps.x100.ComplexDataDescriptionType;
import net.opengis.wps.x100.LiteralOutputType;
import net.opengis.wps.x100.OutputDescriptionType;
import net.opengis.wps.x100.SupportedCRSsType;
import net.opengis.wps.x100.SupportedComplexDataType;

/**
 *
 * @author carstenduvel
 */

//Todo: FormatTypes (Three types problem) & Metadata

public class BasicOutputDescriptionType {
    private OutputDescriptionType odt;
    
    /* general constructor */
    private void initialize(String identifier,String title) {
        odt = OutputDescriptionType.Factory.newInstance();
        
        
        /* Mandatory (One) */
        this.setIdentifier(identifier);
        this.setTitle(title);
        
        /* Mandatory (One of the three) */
        //Outputs - See functions that call this one
        
        /* Optional (Zero or one) */
        //Abstract
        
        /* Optional (Zero or more) */
        //Metadata
    }
    
    public BasicOutputDescriptionType(String defaultCRS_URI, String identifier,String title, String processVersion) {
        initialize(identifier,title);
        /* Mandatory (One of the three) */
        this.addNewBoundingBoxOutput(defaultCRS_URI);
    }
    
    public BasicOutputDescriptionType(LiteralOutputType OutputFormChoice, String identifier,String title, String processVersion) {
        initialize(identifier,title);
        /* Mandatory (One of the three) */
        this.addNewLiteralOutput(OutputFormChoice);
    }
    
    public BasicOutputDescriptionType(String defaultMimeType, String supportedMimeType, String identifier,String title, String processVersion) {
        initialize(identifier,title);
        /* Mandatory (One of the three) */
        this.addNewComplexOutput(defaultMimeType, supportedMimeType);
    }
    
    public BasicOutputDescriptionType(ComplexDataCombinationType defaultFormats, ComplexDataCombinationsType supportedFormats,
            String identifier,String title, String processVersion) {
        initialize(identifier,title);
        /* Mandatory (One of the three) */
        SupportedComplexDataType newComplexOutput = odt.addNewComplexOutput();
        
        newComplexOutput.addNewDefault();
        newComplexOutput.setDefault(defaultFormats);
        
        newComplexOutput.addNewSupported();
        newComplexOutput.setSupported(supportedFormats);
    }
    
    public static ComplexDataCombinationType createComplexDataCombinationType(String mimeType, String encoding, String schema) {
        ComplexDataCombinationType formats = ComplexDataCombinationType.Factory.newInstance();
        ComplexDataDescriptionType format = formats.addNewFormat();
        
        /* Mandatory (one) */
        format.setMimeType(mimeType);
        
        /* Optional (Zero or one) */
        if(encoding!=null) {
            format.setEncoding(encoding);
        }
        if(schema!=null){
            format.setSchema(schema);
        }
        
        return formats;
    }
    
    public static ComplexDataCombinationsType createComplexDataCombinationsType(String mimeType, String encoding, String schema) {
        ComplexDataCombinationsType formats = ComplexDataCombinationsType.Factory.newInstance();
        ComplexDataDescriptionType format = formats.addNewFormat();
        
        /* Mandatory (one) */
        format.setMimeType(mimeType);
        
        /* Optional (Zero or one) */
        if(encoding!=null) {
            format.setEncoding(encoding);
        }
        if(schema!=null){
            format.setSchema(schema);
        }
        
        //formats.setFormatArray(0, format);
        
        return formats;
    }
    
    
    
    /* -- Simplified functions -- */
    
    private void addNewBoundingBoxOutput(String defaultURI) {
        if(odt.getComplexOutput()!=null||odt.getLiteralOutput()!=null) {
            
        }
        
        SupportedCRSsType supportedCRSsType = odt.addNewBoundingBoxOutput();
        
        SupportedCRSsType.Default defaultType = supportedCRSsType.addNewDefault();
        defaultType.setCRS(defaultURI);//URI
        
        /* Optional (One or More)*/
        CRSsType supportedType = supportedCRSsType.addNewSupported();
        supportedType.addCRS(defaultURI); // <-- Array for more
        
    }   
    //private void addNewBoundingBoxOutput(String defaultURI,Container<String> supportedURIs) {}
    
    private void addNewLiteralOutput(LiteralOutputType OutputFormChoice) {
        /* Optional (Zero or one) */
        LiteralOutputType literalOT = odt.addNewLiteralOutput();
        //literalOT.addNewDataType();
        //literalOT.addNewUOMs();
        
        literalOT = OutputFormChoice;
    }   
    
    private void addNewComplexOutput(String defaultMimeType, String supportedMimeType) {
        SupportedComplexDataType complexDataType = odt.addNewComplexOutput();
        
        /* -- Default -- */
        ComplexDataCombinationType defaultFormats = complexDataType.addNewDefault();
        ComplexDataDescriptionType defaultFormat = defaultFormats.addNewFormat();
        
        /* Mandatory (one) */
        defaultFormat.setMimeType(defaultMimeType);
        /* Optional (Zero or one) */
        //cddt.setEncoding(null);
        //cddt.setSchema(null);
        
        /* -- Supported --*/
        ComplexDataCombinationsType supportedFormats =  complexDataType.addNewSupported();
        ComplexDataDescriptionType supportedFormat = supportedFormats.addNewFormat();
        
        /* Mandatory (one) */
        supportedFormat.setMimeType(supportedMimeType);
        /* Optional (Zero or one) */
        //supportedFormat.setEncoding(null);
        //supportedFormat.setSchema(null);
       
    }   
    
    public String getAbstract() {
        return (odt.getAbstract()==null)?null:odt.getAbstract().getStringValue();
    }
    
    public void setAbstract(String text) {
        if(odt.getAbstract()!=null){this.odt.unsetAbstract();}
        LanguageStringType newAbstract = this.odt.addNewAbstract();
        newAbstract.setStringValue(text);
    }
    
    public String getTitle() {
        return (odt.getTitle()==null)?null:odt.getTitle().getStringValue();
    }
    
    private void setTitle(String text) {
        if(odt.getTitle()==null) {
            odt.addNewTitle().setStringValue(text);
        } else {
            odt.getTitle().setStringValue(text);
        }
    }
    
    public String getIdentifier() {
        return (this.odt.getIdentifier()==null)?null:odt.getIdentifier().getStringValue();
    }
    
    public void setIdentifier(String text) {
        if(odt.getIdentifier()==null) {
            odt.addNewIdentifier().setStringValue(text);
        } else {
            odt.getIdentifier().setStringValue(text);
        }
    }   
    
    public void unsetAbstract() {
        odt.unsetAbstract();
    }
    
    public void unsetBoundingBoxOutput() {
        odt.unsetBoundingBoxOutput();
    }

    public void unsetComplexOutput() {
        odt.unsetComplexOutput();
    }

    public void unsetLiteralOutput() {
        odt.unsetLiteralOutput();
    }
    
    
    public void addNewMetadata(String title) {
        MetadataType newMetadata = odt.addNewMetadata();
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
    
    public  MetadataType[] getAllMetadata() {
        return odt.getMetadataArray();
    }
    
    /* -- Getter & Setter -- */
    
    public OutputDescriptionType getOdt() {
        return odt;
    }

    public void setOdt(OutputDescriptionType odt) {
        this.odt = odt;
    }
    
}
