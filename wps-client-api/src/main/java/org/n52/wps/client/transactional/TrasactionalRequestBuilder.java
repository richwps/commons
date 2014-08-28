package org.n52.wps.client.transactional;

import net.opengis.wps.x100.DeployProcessDocument;
import net.opengis.wps.x100.UndeployProcessDocument;

import org.apache.xmlbeans.XmlString;

/**
 * Builds an transactional request (deploy, undeploy).
 *
 * @author dalcacer
 * @author woessner
 * @version 0.0.1
 */
public class TrasactionalRequestBuilder {

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
    
    /**
     * Constructs a new TransactionalRequestBuilder.
     */
    public TrasactionalRequestBuilder() {
        deploy = DeployProcessDocument.Factory.newInstance();
        deployprocess = DeployProcessDocument.DeployProcess.Factory.newInstance();
        undeploy = UndeployProcessDocument.Factory.newInstance();
        undeployprocess = UndeployProcessDocument.UndeployProcess.Factory.newInstance();
        undeployprocessprocess = UndeployProcessDocument.UndeployProcess.Process.Factory.newInstance();
    }

    /**
     * DeployProcess: Sets process description.
     *
     * @param description process description.
     */
    public void setDeployProcessDescription(final BasicProcessDescriptionType description) {
        this.deployprocess.setProcessDescription(description.getPdt());
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
     */
    public DeployProcessDocument getDeploydocument() {
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
     */
    public UndeployProcessDocument getUndeploydocument() {
    	this.undeployprocess.setProcess(this.undeployprocessprocess);
    	this.undeploy.setUndeployProcess(this.undeployprocess);
        return validateUndeployProcessDocument(this.undeploy);
    }
    
    /**
     * Validates the DeployProcessDocument
     * @param doc
     */
    private DeployProcessDocument validateDeployProcessDocument(DeployProcessDocument doc) {
    	// TODO: validation
    	return doc;
    }
    
    /**
     * Validates the UndeployProcessDocument
     * @param doc
     */
    private UndeployProcessDocument validateUndeployProcessDocument(UndeployProcessDocument doc) {
    	// TODO: validation
    	return doc;
    }
}
