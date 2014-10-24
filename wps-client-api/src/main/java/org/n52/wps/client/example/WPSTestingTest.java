package org.n52.wps.client.example;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import net.opengis.wps.x100.ComplexDataCombinationType;
import net.opengis.wps.x100.ComplexDataCombinationsType;
import net.opengis.wps.x100.ComplexDataDescriptionType;
import net.opengis.wps.x100.ProcessDescriptionType;

import org.n52.wps.client.WPSClientException;
import org.n52.wps.client.richwps.DataInputTypeBuilder;
import org.n52.wps.client.richwps.InputDescriptionTypeBuilder;
import org.n52.wps.client.richwps.OutputDescriptionTypeBuilder;
import org.n52.wps.client.richwps.ProcessDescriptionTypeBuilder;
import org.n52.wps.client.richwps.ResponseFormBuilder;
import org.n52.wps.client.richwps.TestRequestBuilder;


/**
 *
 * @author dalcacer
 * @version 0.0.1
 */
public class WPSTestingTest {
    
    public static void main(String []args){
        new WPSTestingTest();
    }
    
    public WPSTestingTest(){
        try {
            TestRequestBuilder builder = new TestRequestBuilder();
            
            //Phase 1. Build Processdescription.
            
            //Build Outputs
            ProcessDescriptionType.ProcessOutputs procOutputs;
            procOutputs = ProcessDescriptionType.ProcessOutputs.Factory.newInstance();
            ComplexDataCombinationType outputDefaultFormats;
            outputDefaultFormats = OutputDescriptionTypeBuilder.createComplexDataCombiType("text/xml","base64", "http://foo.bar/gml/3.1.0/polygon.xsd");
            ComplexDataCombinationsType outputSupportedFormats;
            outputSupportedFormats = OutputDescriptionTypeBuilder.createComplexDataCombisType("text/xml", "UTF-8", "http://foo.bar/gml/3.1.0/polygon.xsd");
            
            OutputDescriptionTypeBuilder basicOutputDescriptionType;
            OutputDescriptionTypeBuilder basicOutputDescriptionType2;
            basicOutputDescriptionType = new OutputDescriptionTypeBuilder(outputDefaultFormats, outputSupportedFormats, "output1", "Buffered Polygon");
            basicOutputDescriptionType2 = new OutputDescriptionTypeBuilder(outputDefaultFormats, outputSupportedFormats, "output2", "Buffered Polygon");
            basicOutputDescriptionType.setAbstract("GML stream describing the buffered polygon feature.");
            
            procOutputs.addNewOutput();
            procOutputs.setOutputArray(0, basicOutputDescriptionType.getOdt());
            procOutputs.addNewOutput();
            procOutputs.setOutputArray(1, basicOutputDescriptionType2.getOdt());
            //System.out.println(procOutputs.toString());
            //String identifier,String title, String processVersion, ProcessDescriptionType.ProcessOutputs processOutputs
            
            
            ProcessDescriptionTypeBuilder pdtb = new ProcessDescriptionTypeBuilder("test", "test", "1", procOutputs);
            
            //Build Input
            InputDescriptionTypeBuilder idtb = new InputDescriptionTypeBuilder("input1", "input1", BigInteger.ZERO, BigInteger.ONE);
            List<ComplexDataDescriptionType> supportedFormatList = new ArrayList();
            ComplexDataDescriptionType ogctype = InputDescriptionTypeBuilder.createComplexDataDescriptionType("text/xml", null, null);
            supportedFormatList.add(ogctype);
            idtb.addNewComplexData(ogctype, ogctype, new BigInteger("50"));
            
            //Add Input
            pdtb.addNewInputToDataInputs(idtb.getIdt());
            
            
            // Build request
            builder.setTestProcessDescription(pdtb);
            builder.setTestExecutionUnit("brr");
            builder.setTestProfileName("rola");
            
            DataInputTypeBuilder inputsbuilder = new DataInputTypeBuilder(pdtb.getPdt());
            inputsbuilder.addComplexDataReference("input1", "http://mdi-sh.org/geoserver_lkn/ows?SERVICE=WFS&VERSION=1.0.0&REQUEST=GetFeature&TYPENAME=RichWPS:CWTWBODYNP&SRSNAME=EPSG:31467&outputFormat=JSON", null, null, "text/xml");
            builder.setTestInputs(inputsbuilder.getDataInputType());
            
            ResponseFormBuilder outputsBuilder = new ResponseFormBuilder(pdtb.getPdt());
            outputsBuilder.addOutput("output1");
            outputsBuilder.addOutput("output2");
            builder.setTestOutputs(outputsBuilder.getResponseFormType());
        
            System.out.println("--- TestProcess request: ---");
            System.out.println(builder.getTestdocument().toString());
        } catch (WPSClientException ex) {
            Logger.getLogger(WPSTestingTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
