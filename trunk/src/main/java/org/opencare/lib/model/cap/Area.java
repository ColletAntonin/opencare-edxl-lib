/**
 * 
 */
package org.opencare.lib.model.cap;

import java.util.List;

import org.apache.abdera.model.Element;
import org.apache.abdera.model.ExtensibleElement;


/**
 * @author nontster
 * 
 */
public interface Area extends ExtensibleElement, Element {
	/** Text that generally describes the area * */
	String getDescription();

	/** Text that generally describes the area * */
	void setDescription(String description);

	/** Specific coordinates that describe the area * */
	String[] getPolygons();

	/** Specific coordinates that describe the area * */
	void addPolygon(String polygon);

	/** Specific coordinates that describe the area * */
	void addPolygon(String... polygons);

	/** Specific coordinates that describe the area * */
	String[] getCircles();

	/** Specific coordinates that describe the area * */
	void addCircle(String circle);

	/** Specific coordinates that describe the area * */
	void addCircle(String... circles);

	/** Specific coordinates that describe the area * */
	List<NameValue> getGeocodes();

	/** Specific coordinates that describe the area * */
	String getGeocode(String name);

	/** Specific coordinates that describe the area * */
	void addGeocode(String name, String value);

	/** Specific coordinates that describe the area * */
	void addGeocode(NameValue geocode);

	/** Specific coordinates that describe the area * */
	String getAltitude();

	/** Specific coordinates that describe the area * */
	void setAltitude(String altitude);

	/** Specific coordinates that describe the area * */
	String getCeiling();

	/** Specific coordinates that describe the area * */
	void setCeiling(String ceiling);
}
