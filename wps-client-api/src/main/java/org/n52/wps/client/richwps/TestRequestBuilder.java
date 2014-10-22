package org.n52.wps.client.richwps;

import net.opengis.wps.x100.DeployProcessDocument;
import net.opengis.wps.x100.ProcessDescriptionType;
import net.opengis.wps.x100.TestProcessDocument;


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
public class TestRequestBuilder {

    private TestProcessDocument testprocessdocument;
    /**
     * Deployment request.
     */
    private TestProcessDocument.TestProcess testprocess;

    public static String SERVICE="WPS";
    public static String VERSION="1.0.0";
    /**
     * Constructs a new TransactionalRequestBuilder.
     */
    public TestRequestBuilder() {
        this.testprocessdocument = TestProcessDocument.Factory.newInstance();
        testprocess = TestProcessDocument.TestProcess.Factory.newInstance();
        this.testprocess.setService(SERVICE);
        this.testprocess.setVersion(VERSION);
    }

    /**
     * DeployProcess: Sets process description.
     *
     * @param description process description.
     */
    public void setTestProcessDescription(final ProcessDescriptionTypeBuilder description) {
        this.testprocess.setProcessDescription(description.getPdt());
    }
    
     /**
     * DeployProcess: Sets process description.
     *
     * @param description process description.
     */
    public void setTestProcessDescription(final ProcessDescriptionType description) {
        this.testprocess.setProcessDescription(description);
    }
    /**
     * DeployProcess: Sets execution unit.
     *
     * @param exec execution unit, plain text or base 64 zip. FIXME, not
     * implemented, yet.
     */
    public void setTestExecutionUnit(final String exec) {
        this.testprocess.setExecutionUnit(XmlString.Factory.newValue(exec));
    }
    
    /**
     * DeployProcess: Sets deployment profile name.
     *
     * @param profileName deploymentProfileName
     */
    public void setTestProfileName(final String profileName) {
    	this.testprocess.setDeploymentProfileName(profileName);
    }
    
    public void setTestInputs(final net.opengis.wps.x100.DataInputsType inputs){
        this.testprocess.setDataInputs(inputs);
    }

    /**
     * DeployProcess: Returns the deploy request.
     *
     * @return deploy request.
     * @throws WPSClientException 
     */
    public TestProcessDocument getTestdocument() throws WPSClientException {
        this.testprocessdocument.setTestProcess(this.testprocess);
        return this.testprocessdocument;
        //return validateTestProcessDocument(this.test);
    }

    
    
    /**
     * Validates the DeployProcessDocument
     * @param doc
     * @throws WPSClientException 
     */
    private TestProcessDocument validateTestProcessDocument(TestProcessDocument doc) throws WPSClientException {
        /*if (doc.getDeployProcess().getProcessDescription() == null) {
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
    	}*/
    	return doc;
    }
    
   
}
