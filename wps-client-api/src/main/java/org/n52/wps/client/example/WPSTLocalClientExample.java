package org.n52.wps.client.example;

import net.opengis.ows.x11.ExceptionReportDocument;
import net.opengis.wps.x100.DeployProcessResponseDocument;
import net.opengis.wps.x100.ProcessDescriptionType;
import net.opengis.wps.x100.UndeployProcessResponseDocument;

import org.n52.wps.client.WPSClientException;
import org.n52.wps.client.WPSTClientSession;
import org.n52.wps.client.transactional.BasicProcessDescriptionType;
import org.n52.wps.client.transactional.TrasactionalRequestBuilder;

/**
 * @author dalcacer
 * @author woessner
 * @version 0.0.2
 */
public class WPSTLocalClientExample {
	
	String wpsURL, wpstURL;
    WPSTClientSession wpstClient;
    
    
    public WPSTLocalClientExample(String wpsURL, String wpstURL) {
    	wpstClient = WPSTClientSession.getInstance();
    	this.wpsURL = wpsURL;
    	this.wpstURL = wpstURL;
	}

    public void testDeploy() throws WPSClientException {

        TrasactionalRequestBuilder builder = new TrasactionalRequestBuilder();
        //String identifier,String title, String processVersion, ProcessDescriptionType.ProcessOutputs processOutputs
        ProcessDescriptionType.ProcessOutputs outputs = ProcessDescriptionType.ProcessOutputs.Factory.newInstance();
        BasicProcessDescriptionType bpdt = new BasicProcessDescriptionType("test", "test", "1", outputs);
        
        // build request
        builder.setDeployProcessDescription(bpdt);
        builder.setDeployExecutionUnit("brr");
        builder.setDeploymentProfileName("rola");
        System.out.println("--- DeployProcess request: ---");
        System.out.println(builder.getDeploydocument().toString());
        
        // deploy
        Object responseObject = wpstClient.deploy(wpstURL, builder.getDeploydocument());
        
        // analyze response
        if (responseObject instanceof DeployProcessResponseDocument) {
        	DeployProcessResponseDocument response = (DeployProcessResponseDocument) responseObject;
        	System.out.println("--- DeployProcess response: ---");
        	System.out.println(response.toString());
        }
        else if (responseObject instanceof ExceptionReportDocument) {
			ExceptionReportDocument response = (ExceptionReportDocument) responseObject;
			System.out.println("--- Exception report: ---");
			System.out.println(response.toString());
        }
    }
    
    public void testUndeploy() throws WPSClientException {
    	TrasactionalRequestBuilder builder = new TrasactionalRequestBuilder();
    	
    	// build request
    	builder.setIdentifier("test");
    	builder.setKeepExecutionUnit(true);
    	System.out.println("--- UndeployProcess request: ---");
        System.out.println(builder.getUndeploydocument().toString());

        // undeploy
        Object responseObject = wpstClient.undeploy(wpstURL, builder.getUndeploydocument());
        
        //analyze response
        if (responseObject instanceof UndeployProcessResponseDocument) {
        	UndeployProcessResponseDocument response = (UndeployProcessResponseDocument) responseObject;
        	System.out.println("--- UndeployProcess response: ---");
        	System.out.println(response.toString());
        }
        else if (responseObject instanceof ExceptionReportDocument) {
			ExceptionReportDocument response = (ExceptionReportDocument) responseObject;
			System.out.println("--- Exception report: ---");
			System.out.println(response.toString());
        }
            	
    }

    public void connect() {
    	try {
            boolean connected = wpstClient.connect(wpsURL, wpstURL);
            System.out.println("Connected to "+wpstURL+" "+connected);
        } catch (Exception e) {
            System.err.println(e.getLocalizedMessage());
            e.printStackTrace();
        }
    }
    
    public void disconnect() {
    	wpstClient.disconnect(wpsURL);
    }
    
    /**
     *
     * @param args
     * @throws WPSClientException 
     */
    public static void main(String[] args) throws WPSClientException {
    	String wpsURL = "http://localhost:8085/wps/WebProcessingService";
        String wpstURL = "http://localhost:8085/wps/WPS-T";
    	
        WPSTLocalClientExample client = new WPSTLocalClientExample(wpsURL, wpstURL);
        
        client.connect();
        client.testDeploy();
        client.testUndeploy();
        client.disconnect();
    }

}
