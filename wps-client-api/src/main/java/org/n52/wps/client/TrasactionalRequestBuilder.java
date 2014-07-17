package org.n52.wps.client;

import net.opengis.wps.x100.*;
import net.opengis.wps.x100.impl.*;
import org.apache.xmlbeans.XmlObject;

/**
 *
 * @author dalcacer
 * @version 0.0.1
 */
public class TrasactionalRequestBuilder {
    
    private DeployProcessDocument deploy;
    private DeployProcessDocument.DeployProcess deployprocess;
    private UndeployProcessDocument undeploy;
    
    public TrasactionalRequestBuilder() {
        deploy = DeployProcessDocument.Factory.newInstance();
        deployprocess = DeployProcessDocument.DeployProcess.Factory.newInstance();
        undeploy = UndeployProcessDocument.Factory.newInstance();
    }
    
    public void setDeployProcessDescription(BasicProcessDescriptionType description) {
        this.deployprocess.setProcessDescription(description.getPdt());
    }
    
    public void setDeployExecutionUnit(String foo){
        XmlObject obj = XmlObject.Factory.newInstance();

        this.deployprocess.setExecutionUnit(obj);
    }
    
    public void setProcessDescription(BasicProcessDescriptionType description) {
        
    }
    
    public DeployProcessDocument getDeploydocument() {
        this.deploy.setDeployProcess(this.deployprocess);
        return this.deploy;
    }
    
    public UndeployProcessDocument getUndeploydocument() {
        return this.undeploy;
    }
    
}
