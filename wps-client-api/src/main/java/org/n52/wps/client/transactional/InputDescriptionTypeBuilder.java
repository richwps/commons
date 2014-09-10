package org.n52.wps.client.transactional;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import net.opengis.ows.x11.AllowedValuesDocument;
import net.opengis.ows.x11.AnyValueDocument;
import net.opengis.ows.x11.DomainMetadataType;
import net.opengis.ows.x11.LanguageStringType;
import net.opengis.ows11.impl.DomainMetadataTypeImpl;
import net.opengis.wps.x100.CRSsType;
import net.opengis.wps.x100.ComplexDataCombinationType;
import net.opengis.wps.x100.ComplexDataCombinationsType;
import net.opengis.wps.x100.ComplexDataDescriptionType;
import net.opengis.wps.x100.InputDescriptionType;
import net.opengis.wps.x100.LiteralInputType;
import net.opengis.wps.x100.SupportedCRSsType;
import net.opengis.wps.x100.SupportedComplexDataInputType;
import net.opengis.wps.x100.SupportedUOMsType;
import net.opengis.wps.x100.UOMsType;
import net.opengis.wps.x100.ValuesReferenceType;
import org.geotools.ows.v1_1.OWS;

/**
 *
 * @author carstenduvel
 * @author dalcacer
 * @todo: FormatTypes (Three types problem)
 */
public class InputDescriptionTypeBuilder {

    /**
     * idt InputDescriptionType wrapped by this class. Used by
     * BasicProcessDescriptionType
     */
    private InputDescriptionType idt;

    /**
     * Helper: Initializes Identifier, Title, MinOccurs & MaxOccurs.
     *
     * @param identifier Unambiguous identifier or name of a process, input, or
     * output, unique for this server
     * @param title Title of a process, input, or output, normally available for
     * display to a human
     * @param minOccurs Minimum number of times that values for this parameter
     * are required
     * @param maxOccurs Maximum number of times that this parameter may be
     * present
     */
    private void initialize(final String identifier, final String title,
            final BigInteger minOccurs, final BigInteger maxOccurs) {
        idt = InputDescriptionType.Factory.newInstance();

        /* Mandatory (One) */
        this.setIdentifier(identifier);
        this.setTitle(title);

        this.setMinOccurs(minOccurs);
        this.setMaxOccurs(maxOccurs);

        /* Mandatory (One of the three) */
        //Inputs - See functions that call this one
        /* Optional (Zero or one) */
        //Abstract
        /* Optional (Zero or more) */
        //Metadata
    }

    /**
     * Constructor for Input with <b>BoundingBoxData</b>.
     *
     * @param defaultCRSURI Default Reference to one coordinate reference system
     * @param identifier Unambiguous identifier or name of a process, input, or
     * output, unique for this server
     * @param title Title of a process, input, or output, normally available for
     * display to a human
     * @param minOccurs Minimum number of times that values for this parameter
     * are required
     * @param maxOccurs Maximum number of times that this parameter may be
     * present
     */
    public InputDescriptionTypeBuilder(final String defaultCRSURI,
            final String identifier, final String title,
            final BigInteger minOccurs, final BigInteger maxOccurs) {
        initialize(identifier, title, minOccurs, maxOccurs);
        /* Mandatory (One of the three) */
        this.addNewBoundingBoxData(defaultCRSURI);
    }

    /**
     * Constructor for Input with <b>BoundingBoxData</b>.
     *
     * @param defaultCRSURI Default Reference to one coordinate reference system
     * @param supportedCRSURIs Reference to supported coordinate references
     * @param identifier Unambiguous identifier or name of a process, input, or
     * output, unique for this server
     * @param title Title of a process, input, or output, normally available for
     * display to a human
     * @param minOccurs Minimum number of times that values for this parameter
     * are required
     * @param maxOccurs Maximum number of times that this parameter may be
     * present
     */
    public InputDescriptionTypeBuilder(final String defaultCRSURI,
            final List<String> supportedCRSURIs, final String identifier,
            final String title,
            final BigInteger minOccurs, final BigInteger maxOccurs) {
        initialize(identifier, title, minOccurs, maxOccurs);
        /* Mandatory (One of the three) */
        this.addNewBoundingBoxData(defaultCRSURI, supportedCRSURIs);
    }

    /**
     * Constructor for Input with <b>LiteralData</b>, should be followed by
     * addLiteraldata.
     *
     *
     * @param identifier Unambiguous identifier or name of a process, input, or
     * output, unique for this server
     * @param title Title of a process, input, or output, normally available for
     * display to a human
     * @param minOccurs Minimum number of times that values for this parameter
     * are required
     * @param maxOccurs Maximum number of times that this parameter may be
     * present
     */
    public InputDescriptionTypeBuilder(
            final String identifier, final String title,
            final BigInteger minOccurs, final BigInteger maxOccurs) {
        initialize(identifier, title, minOccurs, maxOccurs);
        /* Mandatory (One of the three) */
        //addLiteraldata...
    }

    /**
     * Constructor for Input with <b>ComplexData</b>.
     *
     * @param defaultFormat Add with createComplexDataDescriptionType(...)
     * @param supportedFormat Add with createComplexDataDescriptionType(...)
     * @param maxMegabytes The maximum file size, in megabytes, of this input.
     * If the input exceeds this size, the server will return an error instead
     * of processing the inputs.
     * @param identifier Unambiguous identifier or name of a process, input, or
     * output, unique for this server
     * @param title Title of a process, input, or output, normally available for
     * display to a human
     * @param minOccurs Minimum number of times that values for this parameter
     * are required
     * @param maxOccurs Maximum number of times that this parameter may be
     * present
     */
    public InputDescriptionTypeBuilder(
            final ComplexDataDescriptionType defaultFormat,
            final ComplexDataDescriptionType supportedFormat,
            final BigInteger maxMegabytes,
            final String identifier, final String title,
            final BigInteger minOccurs, final BigInteger maxOccurs) {
        initialize(identifier, title, minOccurs, maxOccurs);
        /* Mandatory (One of the three) */
        this.addNewComplexData(defaultFormat, supportedFormat, maxMegabytes);
    }

    /**
     * Called by Constructor for Input with <b>BoundingBoxData</b>.
     *
     * @param defaultURI Reference to default coordinate reference system
     */
    public void addNewBoundingBoxData(final String defaultURI) {
        SupportedCRSsType supportedCRSsType = idt.addNewBoundingBoxData();

        SupportedCRSsType.Default defaultType;
        defaultType = supportedCRSsType.addNewDefault();
        defaultType.setCRS(defaultURI);

        /* Optional (One or More)*/
        CRSsType supportedType = supportedCRSsType.addNewSupported();
        supportedType.addCRS(defaultURI);

    }

    /**
     * Called by Constructor for Input with <b>BoundingBoxData</b>.
     *
     * @param defaultURI Reference to default coordinate reference system
     * @param supportedURIs References to supported coordinate reference systems
     */
    public void addNewBoundingBoxData(final String defaultURI,
            final List<String> supportedURIs) {
        SupportedCRSsType supportedCRSsType = idt.addNewBoundingBoxData();

        SupportedCRSsType.Default defaultType;
        defaultType = supportedCRSsType.addNewDefault();
        defaultType.setCRS(defaultURI);

        /* Optional (One or More)*/
        CRSsType supportedType = supportedCRSsType.addNewSupported();

        //commented out supportedType.addCRS(defaultURI); because it creates
        //duplicates in combination with InputBoundingBoxDataSpecifier
        for (String supportedURI : supportedURIs) {
            supportedType.addCRS(supportedURI);
        }
    }

    /**
     * Adds new LiteralData with "AllowedValues" ValueChoice.
     *
     * @param allowedValues Indicates that are finite set of values and ranges
     * allowed for this input, and contains ordered list of all valid values
     * and/or ranges
     *
     * @param typeUri Reference to type
     * @param typeName Name of the type
     * @param defaultUOM Identifies default unit of measure of this or input
     * @param supportedUOMs Units of measure supported for this input
     * @param defaultValue Default value of this input, encoded in character
     * string
     *
     * @todo Simplify AllowedValues creation ?
     */
    public final void addNewLiteralDataAllowedValues(
            final AllowedValuesDocument.AllowedValues allowedValues,
            final String typeUri, final String typeName,
            final String defaultUOM, final Collection<String> supportedUOMs,
            final String defaultValue) {
        this.initializeLiteralData(typeUri, typeName, defaultUOM,
                supportedUOMs, defaultValue);
        LiteralInputType literalData = this.idt.getLiteralData();
        literalData.addNewAllowedValues();
        literalData.setAllowedValues(allowedValues);
    }

    public final void addNewLiteralData(final String typeUri, final String defaultValue) {
        
         LiteralInputType literalDataInputType;
        if (idt.getLiteralData() == null) {
            literalDataInputType = idt.addNewLiteralData();
        } else {
            literalDataInputType = idt.getLiteralData();
        }

       
        DomainMetadataType dataType =  literalDataInputType.addNewDataType();
        dataType.setReference(typeUri);
        literalDataInputType.setDataType(dataType);
        literalDataInputType.setDefaultValue(defaultValue);
    }

    
    /**
     * Adds new LiteralData with "AnyValue" ValueChoice.
     *
     * @param anyValue Indicates that any value is allowed for this input
     *
     * @param typeUri Reference to type
     * @param typeName Name of the type
     * @param defaultUOM Identifies default unit of measure of this or input
     * @param supportedUOMs Units of measure supported for this input
     * @param defaultValue Default value of this input, encoded in character
     * string
     *
     * @todo Simplify Anyvalues creation ?
     */
    public final void addNewLiteralDataAnyValue(
            final AnyValueDocument.AnyValue anyValue,
            final String typeUri, final String typeName,
            final String defaultUOM, final Collection<String> supportedUOMs,
            final String defaultValue) {
        this.initializeLiteralData(typeUri, typeName, defaultUOM,
                supportedUOMs, defaultValue);
        LiteralInputType literalData = this.idt.getLiteralData();

        if (literalData.getAllowedValues() == null) {
            literalData.addNewAnyValue();
        }
        literalData.setAnyValue(anyValue);
    }

    /**
     * Adds new LiteralData with "Reference" ValueChoice. References an
     * externally defined finite set of values and ranges for this input
     *
     * @param reference URL from which this set of ranges and values can be
     * retrieved
     * @param valuesForm Reference to a description of the mimetype, encoding,
     * and schema used for this set of values and ranges.
     *
     * @param typeUri Reference to type
     * @param typeName Name of the type
     * @param defaultUOM Identifies default unit of measure of this or input
     * @param supportedUOMs Units of measure supported for this input
     * @param defaultValue Default value of this input, encoded in character
     * string
     *
     * @todo: Simplify Constructor
     */
    public final void addNewLiteralDataReference(final String reference,
            final String valuesForm, final String typeUri,
            final String typeName, final String defaultUOM,
            final Collection<String> supportedUOMs, final String defaultValue) {
        this.initializeLiteralData(typeUri, typeName, defaultUOM, supportedUOMs,
                defaultValue);
        LiteralInputType literalData = this.idt.getLiteralData();
        ValuesReferenceType newValuesReference;
        newValuesReference = literalData.addNewValuesReference();
        newValuesReference.setReference(reference);
        newValuesReference.setValuesForm(valuesForm);
        literalData.setValuesReference(newValuesReference);
    }

    /**
     * Helper: Initializes Literaldata Attributes that are the same for all
     * three types.
     *
     * @param typeUri Reference to type
     * @param typeName Name of the type
     * @param defaultUOM Identifies default unit of measure of this or input
     * @param supportedUOMs Units of measure supported for this input
     * @param defaultValue Default value of this input, encoded in character
     */
    private void initializeLiteralData(final String typeUri,
            final String typeName, final String defaultUOM,
            final Collection<String> supportedUOMs, final String defaultValue) {
        LiteralInputType literalIT;
        if (idt.getLiteralData() == null) {
            literalIT = idt.addNewLiteralData();
        } else {
            literalIT = idt.getLiteralData();
        }

        /* Mandatory: One of three -> called in super function */
        //literalIT.addNewAllowedValues();
        //literalIT.addNewAnyValue();
        //literalIT.addNewValuesReference();
        /* Optional (Zero or one) */
        if (typeUri != null && typeName != null) {
            DomainMetadataType dataType = literalIT.addNewDataType();
            dataType.setReference(typeUri);
            dataType.setStringValue(typeName);
        }

        SupportedUOMsType newUom;

        if (literalIT.getUOMs() == null) {
            newUom = literalIT.addNewUOMs();
        } else {
            newUom = literalIT.getUOMs();
        }

        if (defaultUOM != null) {
            SupportedUOMsType.Default newDefault = newUom.addNewDefault();
            DomainMetadataType newDefaultUOM = newDefault.addNewUOM();
            newDefaultUOM.setStringValue(defaultUOM);
        }

        if (supportedUOMs != null && !supportedUOMs.isEmpty()) {
            UOMsType supportedArray;
            if (newUom.getSupported() == null) {
                supportedArray = newUom.addNewSupported();
            } else {
                supportedArray = newUom.getSupported();
            }

            for (String supportedUOMName : supportedUOMs) {
                DomainMetadataType newUOM = supportedArray.addNewUOM();
                newUOM.setStringValue(supportedUOMName);
            }
        }
        literalIT.setDefaultValue(defaultValue);
    }

    /**
     *
     * @param mimeType Identification of mime type of this input or requested
     * for this output parameter's value
     * @param encoding Reference to encoding of this input or requested for this
     * output
     * @param schema Reference to XML Schema Document that specifies content
     * model of input or output parameter's value
     * @return ComplexDataDescriptionType with intialized values
     */
    public static final ComplexDataDescriptionType
            createComplexDataDescriptionType(final String mimeType,
                    final String encoding, final String schema) {
        ComplexDataDescriptionType format;
        format = ComplexDataDescriptionType.Factory.newInstance();

        /* Mandatory (one) */
        format.setMimeType(mimeType);

        /* Optional (Zero or one) */
        if (encoding != null) {
            format.setEncoding(encoding);
        }
        if (schema != null) {
            format.setSchema(schema);
        }

        return format;
    }

    /**
     * Adds ComplexData with single supportedFormat.
     *
     * @param defaultFormat Add with createComplexDataDescriptionType(...)
     * @param supportedFormat Add with createComplexDataDescriptionType(...)
     * @param maxMegabytes The maximum file size, in megabytes, of this input.
     * If the input exceeds this size, the server will return an error instead
     * of processing the inputs.
     */
    public void addNewComplexData(
            final ComplexDataDescriptionType defaultFormat,
            final ComplexDataDescriptionType supportedFormat,
            final BigInteger maxMegabytes) {
        SupportedComplexDataInputType complexDataInputType;
        complexDataInputType = idt.addNewComplexData();

        if (maxMegabytes != null) {
            complexDataInputType.setMaximumMegabytes(maxMegabytes);
        }

        /* -- Default -- */
        ComplexDataCombinationType defaultFormats;
        defaultFormats = complexDataInputType.addNewDefault();
        defaultFormats.addNewFormat();
        defaultFormats.setFormat(defaultFormat);

        /* -- Supported --*/
        ComplexDataCombinationsType supportedFormats;
        supportedFormats = complexDataInputType.addNewSupported();
        supportedFormats.addNewFormat();
        supportedFormats.setFormatArray(0, supportedFormat);

    }

    /**
     * Adds ComplexData with multiple supportedFormats.
     *
     * @param defaultFormat Add with createComplexDataDescriptionType(...)
     * @param supportedFormatList Add with createComplexDataDescriptionType(...)
     * @param maxMegabytes The maximum file size, in megabytes, of this input.
     * If the input exceeds this size, the server will return an error instead
     * of processing the inputs.
     */
    public void addNewComplexData(
            final ComplexDataDescriptionType defaultFormat,
            final List<ComplexDataDescriptionType> supportedFormatList,
            final BigInteger maxMegabytes) {
        SupportedComplexDataInputType complexDataInputType;
        complexDataInputType = idt.addNewComplexData();

        if (maxMegabytes != null) {
            complexDataInputType.setMaximumMegabytes(maxMegabytes);
        }

        /* -- Default -- */
        ComplexDataCombinationType defaultFormats;
        defaultFormats = complexDataInputType.addNewDefault();
        defaultFormats.addNewFormat();
        defaultFormats.setFormat(defaultFormat);

        /* -- Supported --*/
        ComplexDataCombinationsType supportedFormats;
        supportedFormats = complexDataInputType.addNewSupported();

        for (ComplexDataDescriptionType suppFormat : supportedFormatList) {
            supportedFormats.addNewFormat().set(suppFormat);
        }
    }

    /**
     * Returns Abstract.
     *
     * @return Text of the abstract.abstractText Brief narrative description of
     * a process, input, or output, normally available for display to a human
     */
    public final String getAbstract() {
        if (idt.getAbstract() == null) {
            return null;
        } else {
            return idt.getAbstract().getStringValue();
        }
    }

    /**
     * Sets text.
     *
     * @param abstractText Text of the abstract.abstractText Brief narrative
     * description of a process, input, or output, normally available for
     * display to a human
     */
    public final void setAbstract(final String abstractText) {
        if (idt.getAbstract() != null) {
            this.idt.unsetAbstract();
        }
        LanguageStringType newAbstract = this.idt.addNewAbstract();
        newAbstract.setStringValue(abstractText);
    }

    /**
     * Returns Title.
     *
     * @return Title of a process, input, or output, normally available for
     * display to a human
     */
    public final String getTitle() {
        if (idt.getTitle() == null) {
            return null;
        } else {
            return idt.getTitle().getStringValue();
        }
    }

    /**
     * Sets title.
     *
     * @param title Title of a process, input, or output, normally available for
     * display to a human
     */
    public final void setTitle(final String title) {
        if (idt.getTitle() == null) {
            idt.addNewTitle().setStringValue(title);
        } else {
            idt.getTitle().setStringValue(title);
        }
    }

    /**
     * Returns Identifier.
     *
     * @return Unambiguous identifier or name of a process, input, or output,
     * unique for this server
     */
    public final String getIdentifier() {
        if (this.idt.getIdentifier() == null) {
            return null;
        } else {
            return idt.getIdentifier().getStringValue();
        }
    }

    /**
     * Sets Identifier.
     *
     * @param identifier Unambiguous identifier or name of a process, input, or
     * output, unique for this server
     */
    public final void setIdentifier(final String identifier) {
        if (idt.getIdentifier() == null) {
            idt.addNewIdentifier().setStringValue(identifier);
        } else {
            idt.getIdentifier().setStringValue(identifier);
        }
    }

    /**
     * Returns MinOccurs.
     *
     * @return Minimum number of times that values for this parameter are
     * required
     */
    public final BigInteger getMinOccurs() {
        return this.idt.getMinOccurs();
    }

    /**
     * Sets minOccurs.
     *
     * @param minOccurs Minimum number of times that values for this parameter
     * are required
     */
    public final void setMinOccurs(final BigInteger minOccurs) {
        this.idt.setMinOccurs(minOccurs);
    }

    /**
     * Returns MaxOccurs.
     *
     * @return Maximum number of times that this parameter may be present
     */
    public final BigInteger getMaxOccurs() {
        return this.idt.getMaxOccurs();
    }

    /**
     * Sets maxOccurs.
     *
     * @param maxOccurs Maximum number of times that this parameter may be
     * present
     */
    public final void setMaxOccurs(final BigInteger maxOccurs) {
        this.idt.setMaxOccurs(maxOccurs);
    }

    /**
     * Removes "Abstract" Node.
     */
    public final void unsetAbstract() {
        idt.unsetAbstract();
    }

    /**
     * Removes "BoundingBoxData" Node.
     */
    public final void unsetBoundingBoxData() {
        idt.unsetBoundingBoxData();
    }

    /**
     * Removes "ComplexData" Node.
     */
    public final void unsetComplexData() {
        idt.unsetComplexData();
    }

    /**
     * Removes "LiteralData" Node.
     */
    public final void unsetLiteralData() {
        idt.unsetLiteralData();
    }


    /* -- Getter & Setter -- */
    /**
     * Returns the wrapped InputDescriptionType.
     *
     * @return List of the required and optional inputs to this process
     */
    public final InputDescriptionType getIdt() {
        return idt;
    }

    /**
     * Sets the wrapped InputDescriptionType to idt.
     *
     * @param newIdt List of the required and optional inputs to this process
     */
    public final void setIdt(final InputDescriptionType newIdt) {
        this.idt = newIdt;
    }

    @Override
    public String toString() {
        return "BasicInputDescriptionType{" + "idt=" + idt + '}';
    }
}
