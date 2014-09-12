package org.n52.wps.client.example;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import net.opengis.ows.x11.AnyValueDocument;

import net.opengis.wps.x100.CapabilitiesDocument;
import net.opengis.wps.x100.ComplexDataCombinationType;
import net.opengis.wps.x100.ComplexDataCombinationsType;
import net.opengis.wps.x100.ComplexDataDescriptionType;
import net.opengis.wps.x100.ExecuteDocument;
import net.opengis.wps.x100.ExecuteResponseDocument;
import net.opengis.wps.x100.InputDescriptionType;
import net.opengis.wps.x100.ProcessBriefType;
import net.opengis.wps.x100.ProcessDescriptionType;
import net.opengis.wps.x100.ProcessDescriptionsDocument;
import org.apache.xmlbeans.XmlOptions;

import org.geotools.feature.FeatureCollection;
import org.n52.wps.client.transactional.InputDescriptionTypeBuilder;
import org.n52.wps.client.transactional.OutputDescriptionTypeBuilder;
import org.n52.wps.client.transactional.ProcessDescriptionTypeBuilder;
import org.n52.wps.client.ExecuteResponseAnalyser;
import org.n52.wps.client.WPSClientException;
import org.n52.wps.client.WPSClientSession;
import org.n52.wps.io.data.IData;
import org.n52.wps.io.data.binding.complex.GTVectorDataBinding;

/**
 *
 * @author carstenduvel
 */
public class WPSClientExampleBasic {

    /**
     * Recreates wpsDescribeProcess_response.xml example.
     */
    public final void testBasicTypes() {
        ProcessDescriptionType.ProcessOutputs procOutputs;
        procOutputs = ProcessDescriptionType.ProcessOutputs.Factory.newInstance();
        ComplexDataCombinationType outputDefaultFormats;
        outputDefaultFormats = OutputDescriptionTypeBuilder.createComplexDataCombiType("text/xml","base64", "http://foo.bar/gml/3.1.0/polygon.xsd");
        ComplexDataCombinationsType outputSupportedFormats;
        outputSupportedFormats = OutputDescriptionTypeBuilder.createComplexDataCombisType("text/xml", "UTF-8", "http://foo.bar/gml/3.1.0/polygon.xsd");

        OutputDescriptionTypeBuilder basicOutputDescriptionType;
        basicOutputDescriptionType = new OutputDescriptionTypeBuilder(outputDefaultFormats, outputSupportedFormats, "BufferedPolygon", "Buffered Polygon");
        basicOutputDescriptionType.setAbstract("GML stream describing the buffered polygon feature.");

        procOutputs.addNewOutput();
        procOutputs.setOutputArray(0, basicOutputDescriptionType.getOdt());

        ProcessDescriptionTypeBuilder basicProcDesc; 
        basicProcDesc = new ProcessDescriptionTypeBuilder(
                "Buffer",
                "Create a buffer around a polygon.",
                "2", 
                procOutputs);

        basicProcDesc.setAbstract("Create a buffer around a single polygon."
                + " Accepts the polygon as GML and provides GML output for the"
                + " buffered feature.");
        basicProcDesc.addNewMetadata("spatial");
        basicProcDesc.addNewMetadata("geometry");
        basicProcDesc.addNewMetadata("buffer");
        basicProcDesc.addNewMetadata("GML");
        basicProcDesc.addNewProfile("urn:ogc:wps:1.0.0:buffer");

        basicProcDesc.setStatusSupported(false);
        basicProcDesc.setStoreSupported(true);
        basicProcDesc.setWSDL("http://foo.bar/foo");

        ComplexDataDescriptionType defaultFormat = InputDescriptionTypeBuilder.createComplexDataDescriptionType("text/xml", "base64", "http://foo.bar/gml/3.1.0/polygon.xsd");
        ComplexDataDescriptionType supportedFormat = InputDescriptionTypeBuilder.createComplexDataDescriptionType("text/xml", "UTF-8", "http://foo.bar/gml/3.1.0/polygon.xsd");
        InputDescriptionTypeBuilder inputPolygon = new InputDescriptionTypeBuilder(defaultFormat, supportedFormat, BigInteger.valueOf(5), "InputPolygon", "Polygon to be buffered", BigInteger.ONE, BigInteger.ONE);
        inputPolygon.setAbstract("URI to a set of GML that describes the polygon.");

        InputDescriptionTypeBuilder bufferDistance;
        bufferDistance = new InputDescriptionTypeBuilder("BufferDistance", 
                "Buffer Distance", BigInteger.ZERO, BigInteger.ONE);
        bufferDistance.setAbstract("Distance to be used to calculate buffer.");

        AnyValueDocument.AnyValue av;
        av = AnyValueDocument.AnyValue.Factory.newInstance();
        Collection<String> supportedUOM = new ArrayList<String>();
        supportedUOM.add("meters");
        supportedUOM.add("feet");
        bufferDistance.addNewLiteralDataAnyValue(av, 
                "http://www.w3.org/TR/xmlschema-2/#float", "float", "meters", 
                supportedUOM, "100");

        basicProcDesc.addNewInputToDataInputs(inputPolygon.getIdt());
        basicProcDesc.addNewInputToDataInputs(bufferDistance.getIdt());

        ProcessDescriptionsDocument pdd;
        pdd = ProcessDescriptionsDocument.Factory.newInstance();
        ProcessDescriptionsDocument.ProcessDescriptions pddpd;
        pddpd = pdd.addNewProcessDescriptions();
        pddpd.addNewProcessDescription();
        pddpd.setProcessDescriptionArray(0, basicProcDesc.getPdt());

        XmlOptions xo = new XmlOptions();
        xo.setSavePrettyPrint();
        final int identation = 4;
        xo.setSavePrettyPrintIndent(identation);
        //xo.setUseDefaultNamespace();
        //String output = pdd.xmlText(xo);
        xo.setCharacterEncoding("UTF-8");
        xo.setGenerateJavaVersion("1.0");

        System.out.println("\n");

        try {
            BufferedWriter log;
            log = new BufferedWriter(new OutputStreamWriter(System.out));

            log.write("####\n");
            pdd.save(log, xo);
            log.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("\n");

        //System.out.println("--------####---------");
        //System.out.println(output);
        //System.out.println("--------####---------");
    }

    /**
     *
     */
    public void testExecute() {

        //String wpsURL = "http://localhost:8080/wps/WebProcessingService";
        String wpsURL = "http://geoprocessing.demo.52north.org:8080/wps/WebProcessingService";

        String processID = "org.n52.wps.server.algorithm.SimpleBufferAlgorithm";

        try {
            ProcessDescriptionType describeProcessDocument = requestDescribeProcess(
                    wpsURL, processID);
            System.out.println(describeProcessDocument);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            CapabilitiesDocument capabilitiesDocument = requestGetCapabilities(wpsURL);
            ProcessDescriptionType describeProcessDocument = requestDescribeProcess(
                    wpsURL, processID);
            // define inputs
            HashMap<String, Object> inputs = new HashMap<String, Object>();
            // complex data by reference
            inputs.put(
                    "data",
                    "http://geoprocessing.demo.52north.org:8080/geoserver/ows?service=WFS&version=1.0.0&request=GetFeature&typeName=topp:tasmania_roads&outputFormat=GML3");
            // literal data
            inputs.put("width", "0.05");
            IData data = executeProcess(wpsURL, processID,
                    describeProcessDocument, inputs);

            if (data instanceof GTVectorDataBinding) {
                FeatureCollection featureCollection = ((GTVectorDataBinding) data)
                        .getPayload();
                System.out.println(featureCollection.size());
            }
        } catch (WPSClientException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @param url
     * @return
     * @throws WPSClientException
     */
    public CapabilitiesDocument requestGetCapabilities(String url)
            throws WPSClientException {

        WPSClientSession wpsClient = WPSClientSession.getInstance();

        wpsClient.connect(url);

        CapabilitiesDocument capabilities = wpsClient.getWPSCaps(url);

        ProcessBriefType[] processList = capabilities.getCapabilities()
                .getProcessOfferings().getProcessArray();

        for (ProcessBriefType process : processList) {
            System.out.println(process.getIdentifier().getStringValue());
        }
        return capabilities;
    }

    /**
     *
     * @param url
     * @param processID
     * @return
     * @throws IOException
     */
    public ProcessDescriptionType requestDescribeProcess(String url,
            String processID) throws IOException {

        WPSClientSession wpsClient = WPSClientSession.getInstance();

        ProcessDescriptionType processDescription = wpsClient
                .getProcessDescription(url, processID);

        InputDescriptionType[] inputList = processDescription.getDataInputs()
                .getInputArray();

        for (InputDescriptionType input : inputList) {
            System.out.println(input.getIdentifier().getStringValue());
        }
        return processDescription;
    }

    /**
     *
     * @param url
     * @param processID
     * @param processDescription
     * @param inputs
     * @return
     * @throws Exception
     */
    public IData executeProcess(String url, String processID,
            ProcessDescriptionType processDescription,
            HashMap<String, Object> inputs) throws Exception {
        org.n52.wps.client.ExecuteRequestBuilder executeBuilder = new org.n52.wps.client.ExecuteRequestBuilder(
                processDescription);

        for (InputDescriptionType input : processDescription.getDataInputs()
                .getInputArray()) {
            String inputName = input.getIdentifier().getStringValue();
            Object inputValue = inputs.get(inputName);
            if (input.getLiteralData() != null) {
                if (inputValue instanceof String) {
                    executeBuilder.addLiteralData(inputName,
                            (String) inputValue);
                }
            } else if (input.getComplexData() != null) {
                // Complexdata by value
                if (inputValue instanceof FeatureCollection) {
                    IData data = new GTVectorDataBinding(
                            (FeatureCollection) inputValue);
                    executeBuilder
                            .addComplexData(
                                    inputName,
                                    data,
                                    "http://schemas.opengis.net/gml/3.1.1/base/feature.xsd",
                                    "UTF-8", "text/xml");
                }
                // Complexdata Reference
                if (inputValue instanceof String) {
                    executeBuilder
                            .addComplexDataReference(
                                    inputName,
                                    (String) inputValue,
                                    "http://schemas.opengis.net/gml/3.1.1/base/feature.xsd",
                                    "UTF-8", "text/xml");
                }

                if (inputValue == null && input.getMinOccurs().intValue() > 0) {
                    throw new IOException("Property not set, but mandatory: "
                            + inputName);
                }
            }
        }
        executeBuilder.setMimeTypeForOutput("text/xml", "result");
        executeBuilder.setSchemaForOutput(
                "http://schemas.opengis.net/gml/3.1.1/base/feature.xsd",
                "result");
        ExecuteDocument execute = executeBuilder.getExecute();
        execute.getExecute().setService("WPS");
        WPSClientSession wpsClient = WPSClientSession.getInstance();
        Object responseObject = wpsClient.execute(url, execute);
        if (responseObject instanceof ExecuteResponseDocument) {
            ExecuteResponseDocument response = (ExecuteResponseDocument) responseObject;
            ExecuteResponseAnalyser analyser = new ExecuteResponseAnalyser(
                    execute, response, processDescription);
            IData data = (IData) analyser.getComplexDataByIndex(0,
                    GTVectorDataBinding.class);
            return data;
        }
        throw new Exception("Exception: " + responseObject.toString());
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        WPSClientExampleBasic client = new WPSClientExampleBasic();
        //client.testExecute();
        client.testBasicTypes();
    }

}
