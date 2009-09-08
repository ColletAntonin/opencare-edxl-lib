package org.opencare.lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringReader;
import java.util.Date;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.apache.abdera.Abdera;
import org.apache.abdera.factory.Factory;
import org.apache.abdera.model.Document;
import org.apache.abdera.parser.Parser;
import org.opencare.lib.model.Constants;
import org.opencare.lib.model.ExtensionFactory;
import org.opencare.lib.model.cap.Alert;
import org.opencare.lib.model.cap.Area;
import org.opencare.lib.model.cap.Info;
import org.opencare.lib.model.edxl.ContentObject;
import org.opencare.lib.model.edxl.EDXLDistribution;
import org.opencare.lib.model.edxl.EmbeddedXMLContent;
import org.opencare.lib.model.edxl.TargetArea;
import org.opencare.lib.model.edxl.XmlContent;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase implements Constants {
	Abdera abdera;
	Factory factory;
	Document<EDXLDistribution> doc;
	EDXLDistribution edxl;
	
	/**
	 * Create the test case
	 * 
	 * @param testName
	 *            name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	protected void setUp() {
		abdera = new Abdera();
		factory = abdera.getFactory();
		factory.registerExtension(new ExtensionFactory());
		
		doc = factory.newDocument();
		doc.setCharset("UTF-8");

		edxl = (EDXLDistribution) factory.newElement(EDXL_EDXL_DISTRIBUTION, doc);
		edxl.setDistributionID("12345");
		edxl.setSenderID("nontster@gmail.com");

		edxl.setDateTimeSent(new Date());
		edxl.setDistributionStatus(EDXLDistribution.DistributionStatus.Actual);
		edxl.setDistributionType(EDXLDistribution.DistributionType.Report);
		edxl.setCombinedConfidentiality("UNCLASSIFIED AND NOT SENSITIVE");
		edxl.setLanguage("EN");
		edxl.addSenderRole("roleUrn1", "manager1");
		edxl.addSenderRole("roleUrn2", "manager2");
		edxl.addRecipientRole("roleUrn1", "staff1");
		edxl.addRecipientRole("roleUrn2", "staff2");
		edxl.addKeyword("keywordUrn1", "keyword1�");
		edxl.addKeyword("keywordUrn2", "keyword2");
		edxl.addDistributionReference("ref-0001");
		edxl.addExplicitAddress("EA", "EA-0001", "EA-0002");

		TargetArea targetArea = edxl.addTargetArea();
		targetArea.addCircles("38.26295, -122.07454 15",
				"138.26295, 122.07454 50");
		targetArea
				.addPolygons(
						"42,-124.2102 42,-120.1 39,-120 35.0,-114.6328 34.35,- 120.4418 38.9383,-123.817 42,-124.2102",
						"10,-100.2102 42,-120.1 39,-120 35.0,-114.6328 34.35,- 120.4418 38.9383,-123.817 42,-124.2102");

		targetArea.addCountries("TH", "US");
		targetArea.addSubDivisions("US-TX", "DK-025");
		targetArea.addLocCodeUNs("USFFB", "USSUU");

		ContentObject contentObject = edxl.addContentObject();
		contentObject.setContentDescription("this is description");
		contentObject.addContentKeyword("valueListUrn", "value");
		contentObject.setIncidentID("incident-001-1000");
		contentObject.setIncidentDescription("incident-desc");
		contentObject.addOriginatorRole("roleUrn", "manager");
		contentObject.addConsumerRole("roleUrn", "consumer");

		XmlContent xmlContent = contentObject.setXmlContent();
		EmbeddedXMLContent embedded = xmlContent.addEmbeddedXMLContent();
		Alert alert = embedded.addAlert();

		alert.setIdentifier("ABC123DEF456");
		alert.setSender("Nont Banditwong");
		alert.setSent(new Date());
		alert.setStatus(Alert.Status.Actual);

		// ...
		Info info = alert.addInfo();
		info.setCategories(Info.Category.Geo);
		info.setEvent("Something happened");
		info.setUrgency(Info.Urgency.Past);
		info.setSeverity(Info.Severity.Extreme);
		info.setLanguage("EN");
		info.addEventCode("name", "value");

		// ...
		Area area = info.addArea();
		area
				.addPolygon(
						"42,-124.2102 42,-120.1 39,-120 35.0,-114.6328 34.35,- 120.4418 38.9383,-123.817 42,-124.2102",
						"10,-100.2102 42,-120.1 39,-120 35.0,-114.6328 34.35,- 120.4418 38.9383,-123.817 42,-124.2102");		
	}

	/**
	 * Rigourous Test :-)
	 * @throws IOException 
	 */
	public void testApp() throws IOException {
				
		Parser parser = abdera.getParser();
		StringReader in2 = new StringReader(edxl.toString());
		Document<EDXLDistribution> edxl_doc = parser.parse(in2);
		 
				
		EDXLDistribution edxl_parsed = (EDXLDistribution) edxl_doc.getRoot();
		
		assertEquals(edxl_parsed.getDistributionID(),"12345"); 
		assertEquals(edxl_parsed.getSenderID(),"nontster@gmail.com"); 
		assertEquals(edxl_parsed.getDistributionStatus(),EDXLDistribution.DistributionStatus.Actual);
				
		assertEquals(edxl.getDistributionType(),EDXLDistribution.DistributionType.Report);
		assertEquals(edxl.getCombinedConfidentiality(),"UNCLASSIFIED AND NOT SENSITIVE");
		assertEquals(edxl.getLanguage(),"EN");
		
		//System.out.println(edxl_parsed);
	}
	
	public void testParse(){
		
		//create file object				
/*		File file = new File("C://workspace//opencare-edxl-lib//target//test-classes//org//opencare//lib//GEOFON.xml");
		int ch;
		StringBuffer strContent = new StringBuffer("");
		FileInputStream fin = null;
		

		try {
			fin = new FileInputStream(file);
			while( (ch = fin.read()) != -1)
				strContent.append((char)ch);
				fin.close(); 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block			
			System.out.println("File " + file.getAbsolutePath() + " could not be found on filesystem");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception while reading the file" + e);
		}

		//System.out.println("File contents :");
		//System.out.println(strContent);
		
		Parser parser = abdera.getParser();
		StringReader in2 = new StringReader(strContent.toString());
		Document<EDXLDistribution> edxl_doc = parser.parse(in2);
		 				
		EDXLDistribution edxl_parsed = (EDXLDistribution) edxl_doc.getRoot();
		System.out.println(edxl_parsed.getDistributionID());
		
*/
		 		
	}
}
