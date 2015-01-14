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
import net.opengis.wps.x100.DocumentOutputDefinitionType;
import net.opengis.wps.x100.ProcessDescriptionType;
import net.opengis.wps.x100.ProfileProcessResponseDocument;

import org.n52.wps.client.ProfileProcessResponseAnalyser;
import org.n52.wps.client.RichWPSClientSession;
import org.n52.wps.client.WPSClientException;
import org.n52.wps.client.richwps.InputDescriptionTypeBuilder;
import org.n52.wps.client.richwps.OutputDescriptionTypeBuilder;
import org.n52.wps.client.richwps.ProcessDescriptionTypeBuilder;
import org.n52.wps.client.richwps.ProfileProcessRequestBuilder;

public class RichWPSProfilingExample {
	public static void main(String[] args) {
		new RichWPSProfilingExample();
	}

	public RichWPSProfilingExample() {
		try {

			// Phase 1. Build Processdescription.

			// Build Output Descriptions
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
			procOutputs.addNewOutput();
			procOutputs.setOutputArray(1, basicOutputDescriptionType.getOdt());
			String richwpsurl = "http://localhost:8080/wps/RichWPS";
			String wpsurl = "http://localhost:8080/wps/WebProcessingService";
			String processID = "testProcessId";
			ProcessDescriptionTypeBuilder pdtb = new ProcessDescriptionTypeBuilder(
					processID, "testProcessTitle", "1", procOutputs);

			// Build Input Descriptions
			InputDescriptionTypeBuilder idtb = new InputDescriptionTypeBuilder(
					"executionLiteralInput", "input1", BigInteger.ZERO,
					BigInteger.ONE);

			List<ComplexDataDescriptionType> supportedFormatList = new ArrayList<ComplexDataDescriptionType>();
			ComplexDataDescriptionType ogctype = InputDescriptionTypeBuilder
					.createComplexDataDescriptionType("text/xml", null, null);
			supportedFormatList.add(ogctype);
			idtb.addNewLiteralData("xs:string", "val");
			pdtb.addNewInputToDataInputs(idtb.getIdt());
			// Add Input
			ComplexDataDescriptionType cddt = InputDescriptionTypeBuilder
					.createComplexDataDescriptionType("application/json",
							"encoding", "schema");
			InputDescriptionTypeBuilder idtbComplex = new InputDescriptionTypeBuilder(
					"complexInput", "complexInput", new BigInteger("1"),
					new BigInteger("1"));
			BigInteger bi = new BigInteger("100");
			idtbComplex.addNewComplexData(cddt, cddt, bi);
			pdtb.addNewInputToDataInputs(idtbComplex.getIdt());
			// pdtb.add
			// Build request
			ProfileProcessRequestBuilder profileProcessRequestbuilder = new ProfileProcessRequestBuilder(
					pdtb);
			profileProcessRequestbuilder
					.setExecutionUnit("bind process org.n52.wps.server.algorithm.test.DummyTestClass to richwps/dummyProcess1 execute richwps/dummyProcess1 with in.name as LiteralInputData store	LiteralOutputData as var.firstResult bind process http localhost 8080 /wps/WebProcessingService	org.n52.wps.server.algorithm.test.DummyTestClass to	richwps/dummyProcess2 execute richwps/dummyProcess2	with var.firstResult as LiteralInputData store LiteralOutputData as out.result");
			profileProcessRequestbuilder.setDeploymentProfileName("rola");
			// ResponseFormBuilder responseFormBuilder = new
			// ResponseFormBuilder(
			// pdtb.getPdt());
			// responseFormBuilder.addOutput("result");
			// testProcessRequestbuilder.setOutputs(responseFormBuilder
			// .getResponseFormType());
			profileProcessRequestbuilder.addOutput("output1");
			profileProcessRequestbuilder.addOutput("result");
			// OutputDescriptionType
			profileProcessRequestbuilder.addOutput("var.firstResult");
			profileProcessRequestbuilder.getProfiledocument().getProfileProcess()
					.getResponseForm().getResponseDocument().getOutputArray(0)
					.setEncoding("LATIN1");
			DocumentOutputDefinitionType odt = profileProcessRequestbuilder
					.getProfiledocument().getProfileProcess().getResponseForm()
					.getResponseDocument().getOutputArray(0);
			odt.setMimeType("test");
			profileProcessRequestbuilder.getProfiledocument().getProfileProcess()
					.getResponseForm().getResponseDocument().getOutputArray(0)
					.setMimeType("GML");

			// Add inputs for execute
			profileProcessRequestbuilder.addLiteralData("executionLiteralInput",
					"executionLiteralInputValue");
			profileProcessRequestbuilder.addComplexDataReference("complexInput",
					"http://foo.bar", "", "", "");
			System.out.println("--- ProfileProcess request: ---");
			System.out.println(profileProcessRequestbuilder.getProfiledocument()
					.toString());

			// Response
			RichWPSClientSession richWPSClient = RichWPSClientSession
					.getInstance();
			richWPSClient.connect(wpsurl, richwpsurl);
			Object responseObject = richWPSClient.profile(wpsurl,
					profileProcessRequestbuilder.getProfiledocument());
			if (responseObject instanceof ProfileProcessResponseDocument) {
				ProfileProcessResponseDocument testProcessResponseDocument = (ProfileProcessResponseDocument) responseObject;
				ProfileProcessResponseAnalyser testProcessResponseAnalyser = new ProfileProcessResponseAnalyser(
						profileProcessRequestbuilder.getProfiledocument(),
						responseObject);
				System.out.println("complexReferenceByIndex(0): "
						+ testProcessResponseAnalyser
								.getComplexReferenceByIndex(0));

				System.out.println("--- ProfileProcess response: ---");
				System.out.println(testProcessResponseDocument.toString());
			} else if (responseObject instanceof ExceptionReportDocument) {
				ExceptionReportDocument response = (ExceptionReportDocument) responseObject;
				System.out.println("--- Exception report: ---");
				System.out.println(response.toString());
			}

			richWPSClient.disconnect(wpsurl);
		} catch (WPSClientException ex) {
			Logger.getLogger(RichWPSProfilingExample.class.getName()).log(
					Level.SEVERE, null, ex);
		}

	}

}
