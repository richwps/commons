package org.n52.wps.client.transactional;

import net.opengis.wps.x100.DeployProcessDocument;
import net.opengis.wps.x100.ProcessDescriptionType;
import net.opengis.wps.x100.UndeployProcessDocument;

import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlString;
import org.n52.wps.client.WPSClientException;

/**
 * Builds an transactional request (deploy, undeploy).
 *
 * @author dalcacer
 * @author woessner
 * @version 0.0.1
 */
public class TransactionalRequestBuilder {

    /**
     * Deployment request.
     */
    private DeployProcessDocument deploy;
    
    /**
     * Deploy: processdescription.
     */
    private DeployProcessDocument.DeployProcess deployprocess;

    /**
     * Undeploy: request.
     */
    private UndeployProcessDocument undeploy;

    /**
     * Undeploy: undeployprocess
     */
    private UndeployProcessDocument.UndeployProcess undeployprocess;

    /**
     * Undeploy: undeployprocessprocess
     */
    private UndeployProcessDocument.UndeployProcess.Process undeployprocessprocess;
    
    public static String SERVICE="WPS";
    public static String VERSION="1.0.0";
    /**
     * Constructs a new TransactionalRequestBuilder.
     */
    public TransactionalRequestBuilder() {
        this.deploy = DeployProcessDocument.Factory.newInstance();
        deployprocess = DeployProcessDocument.DeployProcess.Factory.newInstance();
        this.deployprocess.setService(SERVICE);
        this.deployprocess.setVersion(VERSION);
        
        undeploy = UndeployProcessDocument.Factory.newInstance();
        
        undeployprocess = UndeployProcessDocument.UndeployProcess.Factory.newInstance();
        this.undeployprocess.setService(SERVICE);
        this.undeployprocess.setVersion(VERSION);
        
        undeployprocessprocess = UndeployProcessDocument.UndeployProcess.Process.Factory.newInstance();
    }

    /**
     * DeployProcess: Sets process description.
     *
     * @param description process description.
     */
    public void setDeployProcessDescription(final ProcessDescriptionTypeBuilder description) {
        this.deployprocess.setProcessDescription(description.getPdt());
    }
    
     /**
     * DeployProcess: Sets process description.
     *
     * @param description process description.
     */
    public void setDeployProcessDescription(final ProcessDescriptionType description) {
        this.deployprocess.setProcessDescription(description);
    }
    /**
     * DeployProcess: Sets execution unit.
     *
     * @param exec execution unit, plain text or base 64 zip. FIXME, not
     * implemented, yet.
     */
    public void setDeployExecutionUnit(final String exec) {
        this.deployprocess.setExecutionUnit(XmlString.Factory.newValue(exec));
    }
    
    /**
     * DeployProcess: Sets deployment profile name.
     *
     * @param profileName deploymentProfileName
     */
    public void setDeploymentProfileName(final String profileName) {
    	this.deployprocess.setDeploymentProfileName(profileName);
    }

    /**
     * DeployProcess: Returns the deploy request.
     *
     * @return deploy request.
     * @throws WPSClientException 
     */
    public DeployProcessDocument getDeploydocument() throws WPSClientException {
        this.deploy.setDeployProcess(this.deployprocess);
        return validateDeployProcessDocument(this.deploy);
    }

    /**
     * UndeployProcess: Sets the process identifier
     * @param identifer process identifer
     */
    public void setIdentifier (String identifier) {
    	if (this.undeployprocessprocess.getIdentifier() != null) {
    		this.undeployprocessprocess.getIdentifier().setStringValue(identifier);
    	} else {
    		this.undeployprocessprocess.addNewIdentifier().setStringValue(identifier);
    	}
    }
    
    /**
     * UndeployProcess: Sets the KeepExecutionUnit flag
     * @param keep
     */
    public void setKeepExecutionUnit (boolean keep) {
    	this.undeployprocessprocess.setKeepExecutionUnit(keep);
    }
    
    /**
     * UndeployProcess: Returns the undeploy request.
     *
     * @return undeploy request.
     * @throws WPSClientException 
     */
    public UndeployProcessDocument getUndeploydocument() throws WPSClientException {
    	this.undeployprocess.setProcess(this.undeployprocessprocess);
    	this.undeploy.setUndeployProcess(this.undeployprocess);
        return validateUndeployProcessDocument(this.undeploy);
    }
    
    /**
     * Validates the DeployProcessDocument
     * @param doc
     * @throws WPSClientException 
     */
    private DeployProcessDocument validateDeployProcessDocument(DeployProcessDocument doc) throws WPSClientException {
        if (doc.getDeployProcess().getProcessDescription() == null) {
    		throw new WPSClientException("DeployProcess document does not contain a ProcessDescription");
    	}
    	if (doc.getDeployProcess().getExecutionUnit() == null) {
    		throw new WPSClientException("DeployProcess document does not contain an ExecutionUnit");
    	} else {
    		if (((SimpleValue)doc.getDeployProcess().getExecutionUnit()).getStringValue().isEmpty()) {
    			throw new WPSClientException("ExecutionUnit of DeployProcessDocument does not contain any value");
    		}
		}
    	if (doc.getDeployProcess().getDeploymentProfileName() == null) {
    		throw new WPSClientException("DeployProcess document does not contain an ExecutionUnit");
    	} else {
    		if (doc.getDeployProcess().getDeploymentProfileName().isEmpty()) {
    			throw new WPSClientException("ExecutionUnit of DeployProcessDocument does not contain any value");
    		}
    	}
    	return doc;
    }
    
    /**
     * Validates the UndeployProcessDocument
     * @param doc
     * @throws WPSClientException 
     */
    private UndeployProcessDocument validateUndeployProcessDocument(UndeployProcessDocument doc) throws WPSClientException {
    	if (doc.getUndeployProcess().getProcess() == null) {
    		throw new WPSClientException("DeployProcess document does not contain a Process");
    	}
    	if (doc.getUndeployProcess().getProcess().getIdentifier() == null) {
    		throw new WPSClientException("UndeployProcess document does not contain an identifer");
    	} else {
    		if (doc.getUndeployProcess().getProcess().getIdentifier().getStringValue().isEmpty()) {
    			throw new WPSClientException("Identifer of UndeployProcessDocument does not contain any value");
    		}
    	}
    	return doc;
    }
}
