/**
 * 
 */
package org.opencare.lib.model.cap;

import java.util.List;

import javax.xml.namespace.QName;

import org.apache.abdera.factory.Factory;
import org.apache.abdera.model.Element;
import org.opencare.lib.model.BaseWrapper;
import org.opencare.lib.model.Constants;

/**
 * @author nontster
 * 
 */
public class AreaWrapper extends BaseWrapper implements Area,
		Constants {

	/**
	 * @param internal
	 */
	public AreaWrapper(Element internal) {
		super(internal);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param factory
	 * @param qname
	 */
	public AreaWrapper(Factory factory, QName qname) {
		super(factory, qname);
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Area#addCircle(java.lang.String)
	 */
	@Override
	public void addCircle(String circle) {
		// TODO Auto-generated method stub
		addCircle(new String[] { circle });
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Area#addCircle(java.lang.String[])
	 */
	@Override
	public void addCircle(String... circles) {
		// TODO Auto-generated method stub
		List<Element> list = getExtensions(CAP_CIRCLE);
		if (list == null || list.size() == 0)
			list = getExtensions(CAP_1_0_CIRCLE);
		for (Element el : list)
			el.discard();
		for (String circle : circles)
			addSimpleExtension(CAP_CIRCLE, circle);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Area#addGeocode(java.lang.String,
	 *      java.lang.String)
	 */
	@Override
	public void addGeocode(String name, String value) {
		// TODO Auto-generated method stub
		NameValue nv = addExtension(CAP_GEOCODE);
		nv.setName(name);
		nv.setValue(value);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Area#addGeocode(org.opencare.cap.NameValue)
	 */
	@Override
	public void addGeocode(NameValue geocode) {
		// TODO Auto-generated method stub
		addExtension(geocode);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Area#addPolygon(java.lang.String)
	 */
	@Override
	public void addPolygon(String polygon) {
		// TODO Auto-generated method stub
		addPolygon(new String[] { polygon });
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Area#addPolygon(java.lang.String[])
	 */
	@Override
	public void addPolygon(String... polygons) {
		// TODO Auto-generated method stub
		List<Element> list = getExtensions(CAP_POLYGON);
		for (Element el : list)
			el.discard();
		for (String polygon : polygons)
			addSimpleExtension(CAP_POLYGON, polygon);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Area#getAltitude()
	 */
	@Override
	public String getAltitude() {
		// TODO Auto-generated method stub
		String alt = getSimpleExtension(CAP_ALTITUDE);
		if (alt == null)
			alt = getSimpleExtension(CAP_1_0_ALTITUDE);
		return alt;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Area#getCeiling()
	 */
	@Override
	public String getCeiling() {
		// TODO Auto-generated method stub
		String ceil = getSimpleExtension(CAP_CEILING);
		if (ceil == null)
			ceil = getSimpleExtension(CAP_1_0_CEILING);
		return ceil;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Area#getCircles()
	 */
	@Override
	public String[] getCircles() {
		// TODO Auto-generated method stub
		List<Element> list = getExtensions(CAP_CIRCLE);
		if (list == null || list.size() == 0)
			list = getExtensions(CAP_1_0_CIRCLE);
		String[] circles = new String[list.size()];
		int n = 0;
		for (Element el : list)
			circles[n++] = el.getText();
		return circles;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Area#getDescription()
	 */
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		String desc = getSimpleExtension(CAP_AREADESC);
		if (desc == null)
			desc = getSimpleExtension(CAP_1_0_AREADESC);
		return desc;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Area#getGeocode(java.lang.String)
	 */
	@Override
	public String getGeocode(String name) {
		// TODO Auto-generated method stub
		List<NameValue> values = getGeocodes();
		for (NameValue value : values)
			if (value.getName().equals(name))
				return value.getValue();
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Area#getGeocodes()
	 */
	@Override
	public List<NameValue> getGeocodes() {
		// TODO Auto-generated method stub
		List<NameValue> list = getExtensions(CAP_GEOCODE);
		if (list == null || list.size() == 0)
			list = getExtensions(CAP_1_0_GEOCODE);
		return list;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Area#getPolygons()
	 */
	@Override
	public String[] getPolygons() {
		// TODO Auto-generated method stub
		List<Element> list = getExtensions(CAP_POLYGON);
		if (list == null || list.size() == 0)
			list = getExtensions(CAP_1_0_POLYGON);
		String[] polygons = new String[list.size()];
		int n = 0;
		for (Element el : list)
			polygons[n++] = el.getText();
		return polygons;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Area#setAltitude(java.lang.String)
	 */
	@Override
	public void setAltitude(String altitude) {
		// TODO Auto-generated method stub
		setElementText(CAP_ALTITUDE, altitude, CAP_1_0_ALTITUDE);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Area#setCeiling(java.lang.String)
	 */
	@Override
	public void setCeiling(String ceiling) {
		// TODO Auto-generated method stub
		setElementText(CAP_CEILING, ceiling, CAP_1_0_CEILING);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Area#setDescription(java.lang.String)
	 */
	@Override
	public void setDescription(String description) {
		// TODO Auto-generated method stub
		setElementText(CAP_AREADESC, description, CAP_1_0_AREADESC);
	}

}
