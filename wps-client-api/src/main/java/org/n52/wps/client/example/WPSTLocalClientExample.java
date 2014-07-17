package org.n52.wps.client.example;

import java.math.BigInteger;
import net.opengis.wps.x100.ProcessDescriptionType;
import org.n52.wps.client.BasicInputDescriptionType;
import org.n52.wps.client.BasicOutputDescriptionType;
import org.n52.wps.client.BasicProcessDescriptionType;
import org.n52.wps.client.TrasactionalRequestBuilder;
import org.n52.wps.client.WPSClientSession;

/**
 * @author dalcacer
 * @version 0.0.1
 */
public class WPSTLocalClientExample {

    public void testDeploy() {

        String wpstURL = "http://192.168.56.101:8080/wps/WPS-T";

        WPSClientSession wpsClient = WPSClientSession.getInstance();

        try {
            boolean connected = wpsClient.connectTransactional(wpstURL);
            System.out.println("Connected to "+wpstURL+" "+connected);
        } catch (Exception e) {
            System.err.println(e.getLocalizedMessage());
            e.printStackTrace();
        }
        
        //String defaultCRS_URI, String identifier,String title, BigInteger minOccurs, BigInteger maxOccurs
        BasicInputDescriptionType input = new BasicInputDescriptionType("test","test", "test", BigInteger.ONE, BigInteger.ONE);
        //String defaultCRS_URI, String identifier,String title, String processVersion
        BasicOutputDescriptionType output = new BasicOutputDescriptionType("test", "test", "test", "1");
        
        TrasactionalRequestBuilder builder = new TrasactionalRequestBuilder();
        //String identifier,String title, String processVersion, ProcessDescriptionType.ProcessOutputs processOutputs
        ProcessDescriptionType.ProcessOutputs outputs = ProcessDescriptionType.ProcessOutputs.Factory.newInstance();
        BasicProcessDescriptionType bpdt = new BasicProcessDescriptionType("test", "test", "1", outputs);
        
        builder.setDeployProcessDescription(bpdt);
        builder.setDeployExecutionUnit("brr");
        System.out.println(builder.getDeploydocument().toString());
        
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        WPSTLocalClientExample client = new WPSTLocalClientExample();
        client.testDeploy();
    }

}
