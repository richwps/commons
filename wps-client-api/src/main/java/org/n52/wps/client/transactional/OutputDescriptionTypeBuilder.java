package org.n52.wps.client.transactional;

import java.util.ArrayList;
import net.opengis.ows.x11.DomainMetadataType;
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
import org.w3.x1999.xlink.ActuateType;
import org.w3.x1999.xlink.ShowType;
import org.w3.x1999.xlink.TypeType;

/**
 *
 * @author carstenduvel
 * @author dalcacer
 * @todo: FormatTypes (Three types problem) & Metadata
 */
public class OutputDescriptionTypeBuilder {

    /**
     * odt OutputDescriptionType wrapped by this class. Used by
     * BasicProcessDescriptionType
     */
    private OutputDescriptionType odt;

    /**
     * Helper: Initializes Identifier and Title general constructor.
     *
     * @param identifier Unambiguous identifier or name of a process, input, or
     * output, unique for this server
     * @param title Title of a process, input, or output, normally available for
     * display to a human
     */
    private void initialize(final String identifier, final String title) {
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

    /**
     *
     * @param defaultCRSURI Default Reference to one coordinate reference system
     * @param identifier Unambiguous identifier or name of a process, input, or
     * output, unique for this server
     * @param title Title of a process, input, or output, normally available for
     * display to a human
     */
    public OutputDescriptionTypeBuilder(final String defaultCRSURI,
            final String identifier, final String title) {
        initialize(identifier, title);
        /* Mandatory (One of the three) */
        this.addNewBoundingBoxOutput(defaultCRSURI);
    }

    /**
     *
     * @param outputFormChoice Identifies the type of this output and provides
     * supporting information
     * @param identifier Unambiguous identifier or name of a process, input, or
     * output, unique for this server
     * @param title Title of a process, input, or output, normally available for
     * display to a human
     */
    public OutputDescriptionTypeBuilder(final LiteralOutputType outputFormChoice,
            final String identifier, final String title) {
        initialize(identifier, title);
        /* Mandatory (One of the three) */
        this.addNewLiteralOutput(outputFormChoice);
    }
    
    public OutputDescriptionTypeBuilder(final String identifier, final String title) {
        initialize(identifier, title);
    }

    /**
     *
     * @param defaultMimeType Identification of default Format for process input
     * or output
     * @param supportedMimeType Identification of supportedf Format for process
     * input or output
     * @param identifier Unambiguous identifier or name of a process, input, or
     * output, unique for this server
     * @param title Title of a process, input, or output, normally available for
     * display to a human
     */
    public OutputDescriptionTypeBuilder(final String defaultMimeType,
            final String supportedMimeType, final String identifier,
            final String title) {
        initialize(identifier, title);
        /* Mandatory (One of the three) */
        this.addNewComplexOutput(defaultMimeType, supportedMimeType);
    }

    /**
     *
     * @param defaultFormats Identification of default Formats used by process
     * input or output
     * @param supportedFormats Identification of Formats supported by process
     * input or output
     * @param identifier Unambiguous identifier or name of a process, input, or
     * output, unique for this server
     * @param title Title of a process, input, or output, normally available for
     * display to a human
     */
    public OutputDescriptionTypeBuilder(
            final ComplexDataCombinationType defaultFormats,
            final ComplexDataCombinationsType supportedFormats,
            final String identifier, final String title) {
        initialize(identifier, title);
        /* Mandatory (One of the three) */
        SupportedComplexDataType newComplexOutput = odt.addNewComplexOutput();

        newComplexOutput.addNewDefault();
        newComplexOutput.setDefault(defaultFormats);

        newComplexOutput.addNewSupported();
        newComplexOutput.setSupported(supportedFormats);
    }

    /**
     *
     * @param mimeType Identification of mime type of this input or requested
     * for this output parameter's value
     * @param encoding Reference to encoding of this input or requested for this
     * output
     * @param schema Reference to XML Schema Document that specifies content
     * model of input or output parameter's value
     * @return ComplexDataCombinationType with intialized values
     */
    public static final ComplexDataCombinationType createComplexDataCombiType(
            final String mimeType, final String encoding, final String schema) {
        ComplexDataCombinationType formats;
        formats = ComplexDataCombinationType.Factory.newInstance();
        ComplexDataDescriptionType format = formats.addNewFormat();

        /* Mandatory (one) */
        format.setMimeType(mimeType);

        /* Optional (Zero or one) */
        if (encoding != null) {
            format.setEncoding(encoding);
        }
        if (schema != null) {
            format.setSchema(schema);
        }

        return formats;
    }

    /**
     *
     * @param mimeType Identification of mime type of this input or requested
     * for this output parameter's value
     * @param encoding Reference to encoding of this input or requested for this
     * output
     * @param schema Reference to XML Schema Document that specifies content
     * model of input or output parameter's value
     * @return ComplexDataCombinationsType with intialized values
     */
    public static final ComplexDataCombinationsType createComplexDataCombisType(
            final String mimeType, final String encoding, final String schema) {
        ComplexDataCombinationsType formats;
        formats = ComplexDataCombinationsType.Factory.newInstance();
        ComplexDataDescriptionType format = formats.addNewFormat();

        /* Mandatory (one) */
        format.setMimeType(mimeType);

        /* Optional (Zero or one) */
        if (encoding != null) {
            format.setEncoding(encoding);
        }
        if (schema != null) {
            format.setSchema(schema);
        }

        //formats.setFormatArray(0, format);
        return formats;
    }

    /**
     * Adds BoundingBoxOutput to odt using defaultURI.
     *
     * @param defaultURI Reference to the default coordinate reference system
     * (CRS)
     */
    public void addNewBoundingBoxOutput(final String defaultURI) {
        SupportedCRSsType supportedCRSsType = odt.addNewBoundingBoxOutput();

        SupportedCRSsType.Default defaultType;
        defaultType = supportedCRSsType.addNewDefault();
        defaultType.setCRS(defaultURI);

        /* Optional (One or More)*/
        CRSsType supportedType = supportedCRSsType.addNewSupported();
        supportedType.addCRS(defaultURI);

    }

    /**
     * Adds BoundingBoxOutput to odt using defaultURI and supportedURIs.
     *
     * @param defaultURI Reference to the default coordinate reference system
     * (CRS)
     * @param supportedURIs References to supported coordinate reference systems
     */
    public void addNewBoundingBoxOutput(final String defaultURI,
            final ArrayList<String> supportedURIs) {
        SupportedCRSsType supportedCRSsType = odt.addNewBoundingBoxOutput();

        SupportedCRSsType.Default defaultType;
        defaultType = supportedCRSsType.addNewDefault();
        defaultType.setCRS(defaultURI);

        CRSsType supportedType = supportedCRSsType.addNewSupported();
        
        //commented out supportedType.addCRS(defaultURI); because it creates
        //duplicates in combination with OutputBoundingBoxDataSpecifier
        for (String supportedURI : supportedURIs) {
            supportedType.addCRS(supportedURI);
        }

    }

  
    public void addNewLiteralOutput(final String type) {
        LiteralOutputType literalType = LiteralOutputType.Factory.newInstance();
        DomainMetadataType thedatatype = literalType.addNewDataType();
        thedatatype.setReference(type);
        literalType.setDataType(thedatatype);
        this.odt.setLiteralOutput(literalType);
    }
    
    /**
     * Called by Constructor to add LiteralOutput tag.
     * @param outputFormChoice Identifies the type of this output and provides
     * supporting information
     */
    private void addNewLiteralOutput(final LiteralOutputType outputFormChoice) {
        /* Optional (Zero or one) */
        LiteralOutputType literalOT = odt.addNewLiteralOutput();
        //literalOT.addNewDataType();
        //literalOT.addNewUOMs();

        literalOT = outputFormChoice;
    }
    
     
    /**
     * Called by Constructor to add ComplexOutput tag.
     * @param defaultMimeType Identification of default Format for process input
     * or output
     * @param supportedMimeType Identification of supportedf Format for process
     * input or output
     */
    public void addNewComplexOutput(final String defaultMimeType,
            final String supportedMimeType) {
        SupportedComplexDataType complexDataType = odt.addNewComplexOutput();

        /* -- Default -- */
        ComplexDataCombinationType defaultFormats;
        defaultFormats = complexDataType.addNewDefault();
        ComplexDataDescriptionType defaultFormat;
        defaultFormat = defaultFormats.addNewFormat();

        /* Mandatory (one) */
        defaultFormat.setMimeType(defaultMimeType);
        /* Optional (Zero or one) */
        //cddt.setEncoding(null);
        //cddt.setSchema(null);

        /* -- Supported --*/
        ComplexDataCombinationsType supportedFormats;
        supportedFormats = complexDataType.addNewSupported();
        ComplexDataDescriptionType supportedFormat;
        supportedFormat = supportedFormats.addNewFormat();

        /* Mandatory (one) */
        supportedFormat.setMimeType(supportedMimeType);
        /* Optional (Zero or one) */
        //supportedFormat.setEncoding(null);
        //supportedFormat.setSchema(null);

    }

    /**
     * Returns Abstract.
     *
     * @return  Brief narrative description of a process, input, or
     * output, normally available for display to a human
     */
    public final String getAbstract() {
        if (odt.getAbstract() == null) {
            return null;
        } else {
            return odt.getAbstract().getStringValue();
        }
    }

    /**
     * Sets Abstract to abstractText.
     * @param abstractText  Brief narrative description of a process, input, or
     * output, normally available for display to a human
     */
    public final void setAbstract(final String abstractText) {
        if (odt.getAbstract() != null) {
            this.odt.unsetAbstract();
        }
        LanguageStringType newAbstract = this.odt.addNewAbstract();
        newAbstract.setStringValue(abstractText);
    }

    /**
     * Returns Title.
     *
     * @return Title of a process, input, or output, normally available for
     * display to a human
     */
    public final String getTitle() {
        if (odt.getTitle() == null) {
            return null;
        } else {
            return odt.getTitle().getStringValue();
        }
    }

    /**
     * Sets Title to title.
     * @param title Title of a process, input, or output, normally available for
     * display to a human
     */
    public final void setTitle(final String title) {
        if (odt.getTitle() == null) {
            odt.addNewTitle().setStringValue(title);
        } else {
            odt.getTitle().setStringValue(title);
        }
    }

    /**
     * Returns Identifier.
     *
     * @return Unambiguous identifier or name of a process, input, or
     * output, unique for this server
     */
    public final String getIdentifier() {
        if (this.odt.getIdentifier() == null) {
            return null;
        } else {
            return odt.getIdentifier().getStringValue();
        }
    }

    /**
     * Sets Identifier to identifier.
     * @param identifier Unambiguous identifier or name of a process, input, or
     * output, unique for this server
     */
    public final void setIdentifier(final String identifier) {
        if (odt.getIdentifier() == null) {
            odt.addNewIdentifier().setStringValue(identifier);
        } else {
            odt.getIdentifier().setStringValue(identifier);
        }
    }

    /**
     * Removes "Abstract" Node.
     */
    public final void unsetAbstract() {
        odt.unsetAbstract();
    }

    /**
     * Removes "BoundingBoxOutput" Node.
     */
    public final void unsetBoundingBoxOutput() {
        odt.unsetBoundingBoxOutput();
    }

    /**
     * Removes "ComplexOutput" Node.
     */
    public final void unsetComplexOutput() {
        odt.unsetComplexOutput();
    }

    /**
     * Removes "LiteralOutput" Node.
     */
    public final void unsetLiteralOutput() {
        odt.unsetLiteralOutput();
    }

    /**
     * Adds Metadata containing only a Title to Metadatalist.
     *
     * @param title Title of Metadata
     */
    public final void addNewMetadata(final String title) {
        MetadataType newMetadata = odt.addNewMetadata();
        newMetadata.setTitle(title);
    }

    /**
     * Adds Metadata containing optional variables. ows:Metadata, see Table 32
     * of OGC 06-121r3
     *
     * @param title Title of this data(set), normally used for display to a
     * human
     * @param about about
     * @param abstractMetadata Additional metadata about this data(set)
     * @param actuate "make operate"
     * @param arcrole arcrole
     * @param href link
     * @param role role
     * @param show show
     * @param type type
     */
    public final void addNewMetadata(final String title, final String about,
            final MetadataType abstractMetadata,
            final ActuateType.Enum actuate, final String arcrole,
            final String href, final String role, final ShowType.Enum show,
            final TypeType.Enum type) {

        MetadataType newMetadata = odt.addNewMetadata();

        newMetadata.setTitle(title);

        //Optional:
        if (about != null) {
            newMetadata.setAbout(about);
        }
        if (abstractMetadata != null) {
            newMetadata.setAbstractMetaData(abstractMetadata);
        }
        if (actuate != null) {
            newMetadata.setActuate(actuate);
        }
        if (arcrole != null) {
            newMetadata.setArcrole(arcrole);
        }
        if (href != null) {
            newMetadata.setHref(href);
        }
        if (role != null) {
            newMetadata.setRole(role);
        }
        if (show != null) {
            newMetadata.setShow(show);
        }
        if (type != null) {
            newMetadata.setType(type);
        }
    }

    /**
     * Returns MetadataArray containing all Metadata of the odt.
     *
     * @return MetadataArray containing all Metadata of the
     * OutputDescriptionType
     */
    public final MetadataType[] getAllMetadata() {
        return odt.getMetadataArray();
    }

    /**
     * Returns the wrapped OutputDescriptionType.
     *
     * @return List of the required and optional outputs from executing this
     * process
     */
    public final OutputDescriptionType getOdt() {
        return odt;
    }

    /**
     * Sets the wrapped OutputDescriptionType to odt.
     *
     * @param newOdt List of the required and optional outputs from executing
     * this process
     */
    public final void setOdt(final OutputDescriptionType newOdt) {
        this.odt = newOdt;
    }

}
