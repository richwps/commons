package org.n52.wps.client.richwps;

import java.util.ArrayList;
import net.opengis.ows.x11.MetadataType;
import net.opengis.wps.x100.InputDescriptionType;
import net.opengis.wps.x100.ProcessDescriptionType;
import org.apache.xmlbeans.XmlAnyURI;
import org.w3.x1999.xlink.ActuateType;
import org.w3.x1999.xlink.ShowType;
import org.w3.x1999.xlink.TypeType;

/**
 *
 * @author carstenduvel
 */
public final class ProcessDescriptionTypeBuilder {
    /**
     * pdt ProcessDescriptionType wrapped by this class.
     */
    private ProcessDescriptionType pdt;

    /**
     * Initializes a ProcessDescriptionType without the optional variables.
     *
     * @param identifier Unambiguous identifier or name of a process, input, or
     * output, unique for this server
     * @param title Title of a process, input, or output, normally available for
     * display to a human
     * @param processVersion Release version of process (not of WPS
     * specification)
     * @param processOutputs List of the required and optional outputs from
     * executing this process
     */
    public ProcessDescriptionTypeBuilder(final String identifier,
            final String title, final String processVersion,
            final ProcessDescriptionType.ProcessOutputs processOutputs) {
        pdt = ProcessDescriptionType.Factory.newInstance();

        /* Mandatory (One) */
        this.setIdentifier(identifier);
        this.setTitle(title);
        pdt.setProcessVersion(processVersion);
        this.setProcessOutputs(processOutputs);
    }

    /**
     * Initializes a ProcessDescriptionType with the optional variables.
     *
     * @param identifier Unambiguous identifier or name of a process, input, or
     * output, unique for this server
     * @param title Title of a process, input, or output, normally available for
     * display to a human
     * @param processVersion Release version of process (not of WPS
     * specification)
     * @param processOutputs List of the required and optional outputs from
     * executing this process
     *
     * @param abstractText Brief narrative description of a process, input, or
     * output, normally available for display to a human
     * @param wsdl Location of a WSDL document which describes this process.
     * @param dataInputs List of the required and optional inputs to this
     * process
     * @param storeSupported Indicates if complex data output(s) from this
     * process can be requested to be stored by the WPS server as web-accessible
     * resources
     * @param statusSupported Indicates if Execute operation response can be
     * returned quickly with status information
     * @param metadataList List of MetadataTypes
     * @param profiles URN type. E.g. OGC:WPS:somename
     */
    public ProcessDescriptionTypeBuilder(final String identifier,
            final String title, final String processVersion,
            final ProcessDescriptionType.ProcessOutputs processOutputs,
            final String abstractText, final String wsdl,
            final ProcessDescriptionType.DataInputs dataInputs,
            final boolean storeSupported, final boolean statusSupported,
            final ArrayList<MetadataType> metadataList,
            final ArrayList<String> profiles) {
        pdt = ProcessDescriptionType.Factory.newInstance();

        /* Mandatory (One) */
        this.setIdentifier(identifier);
        this.setTitle(title);
        pdt.setProcessVersion(processVersion);
        this.setProcessOutputs(processOutputs);

        /* Optional (Zero or one) */
        this.setAbstract(abstractText);
        this.setWSDL(wsdl);
        this.setProcessDataInputs(dataInputs);
        this.setStoreSupported(storeSupported);
        this.setStatusSupported(statusSupported);

        for (MetadataType metaData : metadataList) {
            this.addNewMetadata(metaData);
        }

        for (String profile : profiles) {
            this.addNewProfile(profile);
        }
    }

    /**
     *
     * @return Title of a process, input, or output, normally available for
     * display to a human
     */
    public String getTitle() {
        if (pdt.getTitle() == null) {
            return null;
        } else {
            return pdt.getTitle().getStringValue();
        }
    }

    /**
     *
     * @param title Title of a process, input, or output, normally available for
     * display to a human
     */
    public void setTitle(final String title) {
        if (pdt.getTitle() == null) {
            pdt.addNewTitle().setStringValue(title);
        } else {
            pdt.getTitle().setStringValue(title);
        }
    }

    /**
     *
     * @return Unambiguous identifier or name of a process, input, or output,
     * unique for this server
     */
    public String getIdentifier() {
        if (this.pdt.getIdentifier() == null) {
            return null;
        } else {
            return pdt.getIdentifier().getStringValue();
        }
    }

    /**
     *
     * @param identifier Unambiguous identifier or name of a process, input, or
     * output, unique for this server
     */
    public void setIdentifier(final String identifier) {
        if (pdt.getIdentifier() == null) {
            pdt.addNewIdentifier().setStringValue(identifier);
        } else {
            pdt.getIdentifier().setStringValue(identifier);
        }
    }

    /**
     *
     * @return Brief narrative description of a process, input, or
     * output, normally available for display to a human
     */
    public String getAbstract() {
        if (pdt.getAbstract() == null) {
            return null;
        } else {
            return pdt.getAbstract().getStringValue();
        }
    }

    /**
     *
     * @param abstractText Text of the abstract.abstractText Brief narrative
     * description of a process, input, or output, normally available for
     * display to a human
     */
    public void setAbstract(final String abstractText) {
        if (pdt.getAbstract() != null) {
            pdt.unsetAbstract();
        }
        pdt.addNewAbstract().setStringValue(abstractText);
    }

    /**
     *
     * @return wsdl Location of a WSDL document which describes this process.
     */
    public String getWSDL() {
        if (pdt.getWSDL() == null) {
            return null;
        } else {
            return pdt.getWSDL().getHref();
        }
    }

    /**
     *
     * @param href wsdl Location of a WSDL document which describes this 
     * process.
     */
    public void setWSDL(final String href) {
        if (pdt.getWSDL() != null) {
            pdt.unsetWSDL();
        }
        pdt.addNewWSDL().setHref(href);
    }

    /**
     * Adds Metadata containing only a Title to Metadatalist.
     *
     * @param title Title of Metadata
     */
    public void addNewMetadata(final String title) {
        MetadataType newMetadata = pdt.addNewMetadata();
        newMetadata.setTitle(title);
    }

    /**
     * Adds Metadata to Metadatalist.
     *
     * @param metaData Metadata
     */
    public void addNewMetadata(final MetadataType metaData) {
        MetadataType newMetadata = pdt.addNewMetadata();
        newMetadata.set(metaData);
    }

    /**
     * Adds Metadata containing optional variables.
     * ows:Metadata, see Table 32 of OGC 06-121r3
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
    public void addNewMetadata(final String title, final String about,
            final MetadataType abstractMetadata,
            final ActuateType.Enum actuate, final String arcrole,
            final String href, final String role, final ShowType.Enum show,
            final TypeType.Enum type) {
        MetadataType newMetadata = pdt.addNewMetadata();

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
     *
     * @param profileURI Profile to which the WPS process complies
     */
    public void addNewProfile(final String profileURI) {
        XmlAnyURI newProfile = pdt.addNewProfile();
        newProfile.setStringValue(profileURI);
    }

    /**
     *
     * @return statusSupported Indicates if Execute operation response can be
     * returned quickly with status information
     */
    public boolean getStatusSupported() {
        return pdt.getStatusSupported();
    }

    /**
     *
     * @param statusSupported statusSupported Indicates if Execute operation response can be
     * returned quickly with status information
     */
    public void setStatusSupported(final boolean statusSupported) {
        pdt.setStatusSupported(statusSupported);
    }

    /**
     *
     * @return storeSupported Indicates if complex data output(s) from this
     * process can be requested to be stored by the WPS server as web-accessible
     * resources
     */
    public boolean getStoreSupported() {
        return pdt.getStoreSupported();
    }

    /**
     *
     * @param storeSupported storeSupported Indicates if complex data output(s) from this
     * process can be requested to be stored by the WPS server as web-accessible
     * resources
     */
    public void setStoreSupported(final boolean storeSupported) {
        pdt.setStoreSupported(true);
    }

    /**
     * Removes "Abstract" Node.
     */
    public void unsetAbstract() {
        pdt.unsetAbstract();
    }

    /**
     * Removes "DataInputs" Node.
     */
    public void unsetDataInputs() {
        pdt.unsetDataInputs();
    }

    /**
     * Removes "StatusSupported" Node.
     */
    public void unsetStatusSupported() {
        pdt.unsetStatusSupported();
    }

    /**
     * Removes "StoreSupported" Node.
     */
    public void unsetStoreSupported() {
        pdt.unsetStoreSupported();
    }

    /**
     * Removes "WSDL" Node.
     */
    public void unsetWSDL() {
        pdt.unsetWSDL();
    }

    //Optional (Zero or One)
    /**
     *
     * @param input Input
     */
    public void addNewInputToDataInputs(final InputDescriptionType input) {
        ProcessDescriptionType.DataInputs dataInputs;
        if (pdt.getDataInputs() == null) {
            dataInputs = pdt.addNewDataInputs();
        } else {
            dataInputs = pdt.getDataInputs();
        }
        dataInputs.addNewInput().set(input);
    }

    /**
     *
     * @param newDataInputs List of the required and optional inputs to this
     * process
     */
    public void setProcessDataInputs(
            final ProcessDescriptionType.DataInputs newDataInputs) {
        ProcessDescriptionType.DataInputs pdtDI;
        pdtDI = pdt.addNewDataInputs();
        pdtDI.setInputArray(newDataInputs.getInputArray());
    }

    /**
     *
     * @param processOutputs List of the required and optional outputs from
     * executing this process
     */
    public void setProcessOutputs(
            final ProcessDescriptionType.ProcessOutputs processOutputs) {
        ProcessDescriptionType.ProcessOutputs pdtpo;
        pdtpo = pdt.addNewProcessOutputs();
        //pdtpo = processOutputs;
        pdt.setProcessOutputs(processOutputs);
    }

    /**
     *
     * @return Full description of process, including all input and output
     * parameters
     */
    public ProcessDescriptionType getPdt() {
        return pdt;
    }

    /**
     *
     * @param processDescriptionType Full description of process, including all
     * input and output parameters
     */
    public void setPdt(final ProcessDescriptionType processDescriptionType) {
        this.pdt = processDescriptionType;
    }

}
