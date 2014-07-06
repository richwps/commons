/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.n52.wps.client;

import java.math.BigInteger;
import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;
import net.opengis.ows.x11.AllowedValuesDocument;
import net.opengis.ows.x11.AnyValueDocument;
import net.opengis.ows.x11.CodeType;
import net.opengis.ows.x11.DomainMetadataType;
import net.opengis.ows.x11.LanguageStringType;
import net.opengis.wps.x100.CRSsType;
import net.opengis.wps.x100.ComplexDataCombinationType;
import net.opengis.wps.x100.ComplexDataCombinationsType;
import net.opengis.wps.x100.ComplexDataDescriptionType;
import net.opengis.wps.x100.InputDescriptionType;
import net.opengis.wps.x100.LiteralInputType;
import net.opengis.wps.x100.SupportedCRSsType;
import net.opengis.wps.x100.SupportedComplexDataType;
import net.opengis.wps.x100.SupportedUOMsType;
import net.opengis.wps.x100.UOMsType;
import net.opengis.wps.x100.ValuesReferenceType;

/**
 *
 * @author carstenduvel
 */
public class BasicInputDescriptionType {
    private InputDescriptionType idt;
    
    /* general constructor */
    private void initialize(String identifier,String title, BigInteger minOccurs, BigInteger maxOccurs) {
        idt = InputDescriptionType.Factory.newInstance();
        
        /* Mandatory (One) */
        this.addNewIdentifier(identifier);
        this.addNewTitle(title);
        
        this.setMinOccurs(minOccurs);
        this.setMaxOccurs(maxOccurs);
        
        /* Mandatory (One of the three) */
        //Inputs - See functions that call this one
        
        /* Optional (Zero or one) */
        //Abstract
        
        /* Optional (Zero or more) */
        //Metadata
    }
    
    public BasicInputDescriptionType(String defaultCRS_URI, String identifier,String title, BigInteger minOccurs, BigInteger maxOccurs) {
        initialize(identifier,title,minOccurs,maxOccurs);
        /* Mandatory (One of the three) */
        this.addNewBoundingBoxData(defaultCRS_URI);
    }
    
    public BasicInputDescriptionType(String identifier,String title, BigInteger minOccurs, BigInteger maxOccurs) {
        initialize(identifier,title,minOccurs,maxOccurs);
        /* Mandatory (One of the three) */
        //addLiteraldata...
        System.out.println("Don't forget to initialize the literal data!");
    }
    
    public BasicInputDescriptionType(String defaultMimeType, String supportedMimeType, String identifier,String title, BigInteger minOccurs, BigInteger maxOccurs) {
        initialize(identifier,title,minOccurs,maxOccurs);
        /* Mandatory (One of the three) */
        this.addNewComplexData(defaultMimeType, supportedMimeType);
    }
    
    
    
    /* -- Simplified functions -- */
    
    
    
    private void addNewBoundingBoxData(String defaultURI) {
        SupportedCRSsType supportedCRSsType = idt.addNewBoundingBoxData();
        
        SupportedCRSsType.Default defaultType = supportedCRSsType.addNewDefault();
        defaultType.setCRS(defaultURI);//URI
        
        /* Optional (One or More)*/
        CRSsType supportedType = supportedCRSsType.addNewSupported();
        supportedType.addCRS(defaultURI); // <-- Array for more
        
    }   
    //private void addNewBoundingBoxOutput(String defaultURI,Container<String> supportedURIs) {}
    
    
    //Todo: Simplify AllowedValues creation
    public void addNewLiteralData(AllowedValuesDocument.AllowedValues allowedValues,
                                    String typeUri, String typeName, String defaultUOM,Collection<String> supportedUOMs, String defaultValue) {
        this.initializeLiteralData(typeUri,typeName,defaultUOM,supportedUOMs,defaultValue);
        LiteralInputType literalData = this.idt.getLiteralData();
        literalData.addNewAllowedValues();
        literalData.setAllowedValues(allowedValues);
    }
    
    //Todo: Simplify Anyvalues creation
    public void addNewLiteralData(AnyValueDocument.AnyValue anyValue,
                                   String typeUri, String typeName, String defaultUOM,Collection<String> supportedUOMs, String defaultValue) {
        this.initializeLiteralData(typeUri,typeName,defaultUOM,supportedUOMs,defaultValue);
        LiteralInputType literalData = this.idt.getLiteralData();
        literalData.addNewAnyValue();
        literalData.setAnyValue(anyValue);
    }
    
    //Todo: Simplify Constructor
    public void addNewLiteralData(String reference, String valuesForm,
                                    String typeUri, String typeName, String defaultUOM,Collection<String> supportedUOMs, String defaultValue) {
        this.initializeLiteralData(typeUri,typeName,defaultUOM,supportedUOMs,defaultValue);
        LiteralInputType literalData = this.idt.getLiteralData();
        ValuesReferenceType newValuesReference = literalData.addNewValuesReference();
        newValuesReference.setReference(reference);
        newValuesReference.setValuesForm(valuesForm);
        literalData.setValuesReference(newValuesReference);
    }
    
    
    private void initializeLiteralData(String typeUri, String typeName, String defaultUOM,Collection<String> supportedUOMs, String defaultValue) {
        LiteralInputType literalIT;
        if(idt.getLiteralData()==null) {
            literalIT = idt.addNewLiteralData();
        } else {
            literalIT = idt.getLiteralData();
        }
        
        /* Mandatory: One of three*/
        literalIT.addNewAllowedValues();
        literalIT.addNewAnyValue();
        literalIT.addNewValuesReference();
        
        /* Optional (Zero or one) */
        
        if(typeUri!=null&&typeName!=null) {
            DomainMetadataType dataType = literalIT.addNewDataType();
            dataType.setReference(typeUri);
            dataType.setStringValue(typeName);
        }
        
        SupportedUOMsType newUom;
        
        //Get/Create & Assign
        newUom=(literalIT.getUOMs()==null)?literalIT.addNewUOMs():literalIT.getUOMs();
        
        
        
        if(defaultUOM!=null) {
            SupportedUOMsType.Default newDefault = newUom.addNewDefault();
            DomainMetadataType newDefaultUOM = newDefault.addNewUOM();
            newDefaultUOM.setStringValue(defaultUOM);
        }
        
        if(supportedUOMs != null && !supportedUOMs.isEmpty()) {
            UOMsType supportedArray = (newUom.getSupported()==null)?newUom.addNewSupported():newUom.getSupported();
            
            for (String supportedUOMName : supportedUOMs) {
                DomainMetadataType newUOM = supportedArray.addNewUOM();
                newUOM.setStringValue(supportedUOMName);
            }
        }
        literalIT.setDefaultValue(defaultValue);
    }   
    
    private void addNewComplexData(String defaultMimeType, String supportedMimeType) {
        SupportedComplexDataType complexDataType = idt.addNewComplexData();
        
        /* -- Default -- */
        ComplexDataCombinationType cdct = complexDataType.addNewDefault();
        ComplexDataDescriptionType cddt = cdct.addNewFormat();
        
        /* Mandatory (one) */
        cddt.setMimeType(defaultMimeType);
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
    
    /* String -> LanguageStringType/CodeType */
    private void addNewAbstract(String text) {
        LanguageStringType lst = idt.addNewAbstract();
        lst.setStringValue(text);
    }
    
    private void addNewTitle(String text) {
        LanguageStringType lst = idt.addNewTitle();
        lst.setStringValue(text);
    }
    
    private void addNewIdentifier(String text) {
        CodeType ct = idt.addNewIdentifier();
        ct.setStringValue(text);
    }   
    
    public void setMinOccurs(BigInteger minOccurs) {        
        this.idt.setMinOccurs(minOccurs);
    }
    
    public void setMaxOccurs(BigInteger maxOccurs) {        
        this.idt.setMaxOccurs(maxOccurs);
    }
    
    /* -- Getter & Setter -- */
    
    public InputDescriptionType getIdt() {
        return idt;
    }

    public void setIdt(InputDescriptionType idt) {
        this.idt = idt;
    }
    
}
