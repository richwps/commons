package org.n52.wps.client.example;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import net.opengis.ows.x11.ExceptionReportDocument;
import net.opengis.wps.x100.ComplexDataCombinationType;
import net.opengis.wps.x100.ComplexDataCombinationsType;
import net.opengis.wps.x100.ComplexDataDescriptionType;
import net.opengis.wps.x100.ProcessDescriptionType;
import net.opengis.wps.x100.TestProcessResponseDocument;

import org.n52.wps.client.RichWPSClientSession;
import org.n52.wps.client.WPSClientException;
import org.n52.wps.client.richwps.InputDescriptionTypeBuilder;
import org.n52.wps.client.richwps.OutputDescriptionTypeBuilder;
import org.n52.wps.client.richwps.ProcessDescriptionTypeBuilder;
import org.n52.wps.client.richwps.ResponseFormBuilder;
import org.n52.wps.client.richwps.TestProcessRequestBuilder;

/**
 *
 * @author dalcacer
 * @author faltin
 * @version 0.0.1
 */
public class RichWPSTestingExample {

	public static void main(String[] args) {
		new RichWPSTestingExample();
	}

	public RichWPSTestingExample() {
		try {
			TestProcessRequestBuilder builder = new TestProcessRequestBuilder();

			// Phase 1. Build Processdescription.

			// Build Outputs
			ProcessDescriptionType.ProcessOutputs procOutputs;
			procOutputs = ProcessDescriptionType.ProcessOutputs.Factory
					.newInstance();
			ComplexDataCombinationType outputDefaultFormats;
			outputDefaultFormats = OutputDescriptionTypeBuilder
					.createComplexDataCombiType("text/xml", "base64",
							"http://foo.bar/gml/3.1.0/polygon.xsd");
			ComplexDataCombinationsType outputSupportedFormats;
			outputSupportedFormats = OutputDescriptionTypeBuilder
					.createComplexDataCombisType("text/xml", "UTF-8",
							"http://foo.bar/gml/3.1.0/polygon.xsd");

			OutputDescriptionTypeBuilder basicOutputDescriptionType;
			OutputDescriptionTypeBuilder basicOutputDescriptionType2;
			OutputDescriptionTypeBuilder basicOutputDescriptionType3;
			basicOutputDescriptionType = new OutputDescriptionTypeBuilder(
					outputDefaultFormats, outputSupportedFormats, "output1",
					"Buffered Polygon");
			basicOutputDescriptionType2 = new OutputDescriptionTypeBuilder(
					outputDefaultFormats, outputSupportedFormats, "output2",
					"Buffered Polygon");
			basicOutputDescriptionType
					.setAbstract("GML stream describing the buffered polygon feature.");
			basicOutputDescriptionType3 = new OutputDescriptionTypeBuilder(
					"result", "textData");
			basicOutputDescriptionType3.addNewLiteralOutput("xs:string");
			procOutputs.addNewOutput();
			procOutputs.setOutputArray(0, basicOutputDescriptionType3.getOdt());
			String richwpsurl = "http://localhost:8080/wps/RichWPS";
			String wpsurl = "http://localhost:8080/wps/WebProcessingService";
			String processID = "test";
			ProcessDescriptionTypeBuilder pdtb = new ProcessDescriptionTypeBuilder(
					processID, "test", "1", procOutputs);

			// Build Input
			InputDescriptionTypeBuilder idtb = new InputDescriptionTypeBuilder(
					"name", "input1", BigInteger.ZERO, BigInteger.ONE);

			List<ComplexDataDescriptionType> supportedFormatList = new ArrayList();
			ComplexDataDescriptionType ogctype = InputDescriptionTypeBuilder
					.createComplexDataDescriptionType("text/xml", null, null);
			supportedFormatList.add(ogctype);
			idtb.addNewLiteralData("xs:string", "val");
			// Add Input
			pdtb.addNewInputToDataInputs(idtb.getIdt());

			// Build request
			builder.setTestProcessDescription(pdtb);
			builder.setTestExecutionUnit("bind process org.n52.wps.server.algorithm.test.DummyTestClass to richwps/dummyProcess1 execute richwps/dummyProcess1 with in.name as LiteralInputData store	LiteralOutputData as var.firstResult bind process http localhost 8080 /wps/WebProcessingService	org.n52.wps.server.algorithm.test.DummyTestClass to	richwps/dummyProcess2 execute richwps/dummyProcess2	with var.firstResult as LiteralInputData store LiteralOutputData as out.result");
			builder.setTestProfileName("rola");

			ResponseFormBuilder outputsBuilder = new ResponseFormBuilder(
					pdtb.getPdt());
			outputsBuilder.addOutput("result");
			builder.setTestOutputs(outputsBuilder.getResponseFormType());

			System.out.println("--- TestProcess request: ---");
			System.out.println(builder.getTestdocument().toString());

			// Response
			RichWPSClientSession richWPSClient = RichWPSClientSession
					.getInstance();
			richWPSClient.connect(wpsurl, richwpsurl);
			Object responseObject = richWPSClient.test(wpsurl,
					builder.getTestdocument());
			if (responseObject instanceof TestProcessResponseDocument) {
				TestProcessResponseDocument response = (TestProcessResponseDocument) responseObject;
				System.out.println("--- TestProcess response: ---");
				System.out.println(response.toString());
			} else if (responseObject instanceof ExceptionReportDocument) {
				ExceptionReportDocument response = (ExceptionReportDocument) responseObject;
				System.out.println("--- Exception report: ---");
				System.out.println(response.toString());
			}

			richWPSClient.disconnect(wpsurl);
		} catch (WPSClientException ex) {
			Logger.getLogger(RichWPSTestingExample.class.getName()).log(
					Level.SEVERE, null, ex);
		}

	}
}
