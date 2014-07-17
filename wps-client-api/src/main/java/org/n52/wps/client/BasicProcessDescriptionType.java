/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.n52.wps.client;

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
public class BasicProcessDescriptionType {

    private ProcessDescriptionType pdt;

    /* Requires the Mandatory values */
    public BasicProcessDescriptionType(String identifier, String title, String processVersion, ProcessDescriptionType.ProcessOutputs processOutputs) {
        pdt = ProcessDescriptionType.Factory.newInstance();

        /* Mandatory (One) */
        this.setIdentifier(identifier);
        this.setTitle(title);
        pdt.setProcessVersion(processVersion);
        this.setProcessOutputs(processOutputs);

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
    public String getTitle() {
        return (pdt.getTitle() == null) ? null : pdt.getTitle().getStringValue();
    }

    private void setTitle(String text) {
        if (pdt.getTitle() == null) {
            pdt.addNewTitle().setStringValue(text);
        } else {
            pdt.getTitle().setStringValue(text);
        }
    }

    public String getIdentifier() {
        return (this.pdt.getIdentifier() == null) ? null : pdt.getIdentifier().getStringValue();
    }

    public void setIdentifier(String text) {
        if (pdt.getIdentifier() == null) {
            pdt.addNewIdentifier().setStringValue(text);
        } else {
            pdt.getIdentifier().setStringValue(text);
        }
    }

    public String getAbstract() {
        return (pdt.getAbstract() == null) ? null : pdt.getAbstract().getStringValue();
    }

    public void setAbstract(String text) {
        if (pdt.getAbstract() != null) {
            pdt.unsetAbstract();
        }
        pdt.addNewAbstract().setStringValue(text);
    }

    public String getWSDL() {
        return (pdt.getWSDL() == null) ? null : pdt.getWSDL().getHref();
    }

    public void setWSDL(String href) {
        if (pdt.getWSDL() != null) {
            pdt.unsetWSDL();
        }
        pdt.addNewWSDL().setHref(href);
    }

    public void addNewMetadata(String title) {
        MetadataType newMetadata = pdt.addNewMetadata();
        newMetadata.setTitle(title);
    }

    public void addNewMetadata(String title, String about, MetadataType abstractMetadata,
            ActuateType.Enum actuate, String arcrole, String href, String role, ShowType.Enum show, TypeType.Enum type) {

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

    public void addNewProfile(String profileURI) {
        XmlAnyURI newProfile = pdt.addNewProfile();
        newProfile.setStringValue(profileURI);
    }

    public boolean getStatusSupported() {
        return pdt.getStatusSupported();
    }

    public void setStatusSupported(boolean statusSupported) {
        pdt.setStatusSupported(statusSupported);
    }

    public boolean getStoreSupported() {
        return pdt.getStoreSupported();
    }

    public void setStoreSupported(boolean storeSupported) {
        pdt.setStoreSupported(true);
    }

    public void unsetAbstract() {
        pdt.unsetAbstract();
    }

    public void unsetDataInputs() {
        pdt.unsetDataInputs();
    }

    public void unsetStatusSupported() {
        pdt.unsetStatusSupported();
    }

    public void unsetStoreSupported() {
        pdt.unsetStoreSupported();
    }

    public void unsetWSDL() {
        pdt.unsetWSDL();
    }

    //Optional (Zero or One)
    public void addNewInputToDataInputs(InputDescriptionType input) {
        ProcessDescriptionType.DataInputs dataInputs;
        if (pdt.getDataInputs() == null) {
            dataInputs = pdt.addNewDataInputs();
        } else {
            dataInputs = pdt.getDataInputs();
        }
        dataInputs.addNewInput().set(input);
    }

    //Mandatory (One)
    private void setProcessOutputs(ProcessDescriptionType.ProcessOutputs processOutputs) {
        ProcessDescriptionType.ProcessOutputs pdtpo = pdt.addNewProcessOutputs();
        //pdtpo = processOutputs;
        pdt.setProcessOutputs(processOutputs);
    }

    /* -- Getter & Setter -- */
    public ProcessDescriptionType getPdt() {
        return pdt;
    }

    public void setPdt(ProcessDescriptionType pdt) {
        this.pdt = pdt;
    }

}
