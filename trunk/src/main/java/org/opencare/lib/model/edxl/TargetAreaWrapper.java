package org.opencare.lib.model.edxl;

import java.util.List;

import javax.xml.namespace.QName;

import org.apache.abdera.factory.Factory;
import org.apache.abdera.model.Element;
import org.opencare.lib.model.BaseWrapper;
import org.opencare.lib.model.Constants;

public class TargetAreaWrapper extends BaseWrapper implements TargetArea,
		Constants {

	public TargetAreaWrapper(Element internal) {
		super(internal);
		// TODO Auto-generated constructor stub
	}
	
	public TargetAreaWrapper(Factory factory, QName qname) {
		super(factory, qname);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addCircle(String circle) {
		// TODO Auto-generated method stub
		addCircles(new String[] { circle });
	}

	@Override
	public void addCircles(String... circles) {
		// TODO Auto-generated method stub
		List<Element> list = getExtensions(EDXL_CIRCLE);
		for (Element el : list)
			el.discard();
		for (String circle : circles)
			addSimpleExtension(EDXL_CIRCLE, circle);
	}

	@Override
	public String[] getCircles() {
		// TODO Auto-generated method stub
		List<Element> list = getExtensions(EDXL_CIRCLE);
		String[] circles = new String[list.size()];
		int n = 0;
		for (Element el : list)
			circles[n++] = el.getText();
		return circles;
	}
	
	@Override
	public void addPolygon(String polygon) {
		// TODO Auto-generated method stub
		addPolygons(new String[] { polygon });
	}

	@Override
	public void addPolygons(String... polygons) {
		// TODO Auto-generated method stub
		List<Element> list = getExtensions(EDXL_POLYGON);
		for (Element el : list)
			el.discard();
		for (String polygon : polygons)
			addSimpleExtension(EDXL_POLYGON, polygon);
	}

	@Override
	public String[] getPolygons() {
		// TODO Auto-generated method stub
		List<Element> list = getExtensions(EDXL_POLYGON);
		String[] polygons = new String[list.size()];
		int n = 0;
		for (Element el : list)
			polygons[n++] = el.getText();
		return polygons;
	}
	
	
	@Override
	public String[] getCountries() {
		// TODO Auto-generated method stub
		List<Element> list = getExtensions(EDXL_COUNTRY);
		String[] countries = new String[list.size()];
		int n = 0;
		for (Element el : list)
			countries[n++] = el.getText();
		return countries;
	}

	@Override
	public void addCountry(String country) {
		// TODO Auto-generated method stub
		addCountries(new String[] { country });
	}

	@Override
	public void addCountries(String... countries) {
		// TODO Auto-generated method stub
		List<Element> list = getExtensions(EDXL_COUNTRY);
		for (Element el : list)
			el.discard();
		for (String country : countries)
			addSimpleExtension(EDXL_COUNTRY, country);
	}
	
	@Override
	public String[] getSubdivisions() {
		// TODO Auto-generated method stub
		List<Element> list = getExtensions(EDXL_SUBDIVISION);
		String[] subdivisions = new String[list.size()];
		
		int n = 0;
		
		for(Element el : list)
			subdivisions[n++] = el.getText();
		return subdivisions;
	}
		
	@Override
	public void addSubDivision(String subdivision) {
		// TODO Auto-generated method stub
		addSubDivisions(new String[] {subdivision});		
	}

	@Override
	public void addSubDivisions(String... subdivisions) {
		// TODO Auto-generated method stub
		List<Element> list = getExtensions(EDXL_SUBDIVISION);
		for(Element el : list)
			el.discard();
		for(String subdivision : subdivisions)
			addSimpleExtension(EDXL_SUBDIVISION, subdivision);
	}

	@Override
	public String[] getLocCodeUNs() {
		// TODO Auto-generated method stub
	
		List<Element> list = getExtensions(EDXL_LOC_CODE_UN);
		String[] locCodeUNs = new String[list.size()];
		
		int n = 0;
		
		for(Element el : list)
			locCodeUNs[n++] = el.getText();				
		return locCodeUNs;
	}

	@Override
	public void addLocCodeUN(String locCodeUN) {
		// TODO Auto-generated method stub
		addLocCodeUNs(new String[]{locCodeUN});
	}

	@Override
	public void addLocCodeUNs(String... locCodeUNs) {
		// TODO Auto-generated method stub
		List<Element> list = getExtensions(EDXL_LOC_CODE_UN);
		
		for(Element el : list)
			el.discard();
		for(String locCodeUN : locCodeUNs)
			addSimpleExtension(EDXL_LOC_CODE_UN, locCodeUN);			
	}

}
