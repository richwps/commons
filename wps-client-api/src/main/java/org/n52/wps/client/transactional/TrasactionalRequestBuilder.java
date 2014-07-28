package org.n52.wps.client.transactional;

import net.opengis.wps.x100.*;
import org.apache.xmlbeans.XmlObject;

/**
 * Builds an transactional request (deploy, undeploy).
 *
 * @author dalcacer
 * @version 0.0.1
 */
public class TrasactionalRequestBuilder {

    /**
     * Deployment request.
     */
    private DeployProcessDocument deploy;
    /**
     * Processdescription.
     */
    private DeployProcessDocument.DeployProcess deployprocess;
    /**
     * Undeploy request.
     */
    private UndeployProcessDocument undeploy;

    /**
     * Constructs a new TransactionalRequestBuilder.
     */
    public TrasactionalRequestBuilder() {
        deploy = DeployProcessDocument.Factory.newInstance();
        deployprocess = DeployProcessDocument.DeployProcess.Factory.newInstance();
        undeploy = UndeployProcessDocument.Factory.newInstance();
    }

    /**
     * Sets process description.
     *
     * @param description process description.
     */
    public void setDeployProcessDescription(final BasicProcessDescriptionType description) {
        this.deployprocess.setProcessDescription(description.getPdt());
    }

    /**
     * Sets execution unit.
     *
     * @param exec execution unit, plain text or base 64 zip. FIXME, not
     * implemented, yet.
     */
    public void setDeployExecutionUnit(final String exec) {
        XmlObject obj = XmlObject.Factory.newInstance();

        this.deployprocess.setExecutionUnit(obj);
    }

    /**
     * Returns the deploy request.
     *
     * @return deploy request.
     */
    public DeployProcessDocument getDeploydocument() {
        this.deploy.setDeployProcess(this.deployprocess);
        return this.deploy;
    }

    /**
     * Returns the undeploy request.
     *
     * @return undeploy request.
     */
    public UndeployProcessDocument getUndeploydocument() {
        return this.undeploy;
    }
}
