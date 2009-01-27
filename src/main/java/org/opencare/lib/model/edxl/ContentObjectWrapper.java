/**
 * 
 */
package org.opencare.lib.model.edxl;

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
public class ContentObjectWrapper extends BaseWrapper implements ContentObject,
		Constants {

	public ContentObjectWrapper(Element internal) {
		super(internal);
		// TODO Auto-generated constructor stub
	}
	
	public ContentObjectWrapper(Factory factory, QName qname) {
		super(factory, qname);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getContentDescription() {
		// TODO Auto-generated method stub
		return getSimpleExtension(EDXL_CONTENT_DESC);
	}
	
	@Override
	public void setContentDescription(String value) {
		// TODO Auto-generated method stub
		if (value != null)
			setElementText(EDXL_CONTENT_DESC, value);
		else
			removeElement(EDXL_CONTENT_DESC);	
	}
	


	@Override
	public List<ValueList> getContentKeywords() {
		// TODO Auto-generated method stub
		List<ValueList> list = getExtensions(EDXL_CONTENT_KEYWORD);		
		return list;
	}
	
	@Override
	public String getContentKeyword(String name) {
		// TODO Auto-generated method stub
		List<ValueList> values = getContentKeywords();
		for (ValueList value : values)
			if (value.getValueListUrn().equals(name))
				return value.getValue();
		return null;
	}

	@Override
	public void addContentKeyword(String name, String value) {
		// TODO Auto-generated method stub
		ValueListWrapper vw = addExtension(EDXL_CONTENT_KEYWORD);
		vw.setValueListUrn(name);
		vw.setValue(value);		
	}

	@Override
	public void addContentKeyword(ValueList keyword) {
		// TODO Auto-generated method stub
		addExtension(keyword);
	}

	@Override
	public String getIncidentID() {
		// TODO Auto-generated method stub
		return getSimpleExtension(EDXL_INCIDENT_ID);
	}
	
	@Override
	public void setIncidentID(String value) {
		// TODO Auto-generated method stub
		if (value != null)
			setElementText(EDXL_INCIDENT_ID, value);
		else
			removeElement(EDXL_INCIDENT_ID);	
	}
	
	@Override
	public String getIncidentDescription() {
		// TODO Auto-generated method stub
		return getSimpleExtension(EDXL_INCIDENT_DESC);
	}
	
	@Override
	public void setIncidentDescription(String value) {
		// TODO Auto-generated method stub
		if (value != null)
			setElementText(EDXL_INCIDENT_DESC, value);
		else
			removeElement(EDXL_INCIDENT_DESC);
	}


	@Override
	public List<ValueList> getOriginatorRoles() {
		// TODO Auto-generated method stub
		List<ValueList> list = getExtensions(EDXL_ORIGINATOR_ROLE);		
		return list;
	}
	
	@Override
	public String getOriginatorRole(String name) {
		// TODO Auto-generated method stub
		List<ValueList> values = getContentKeywords();
		for (ValueList value : values)
			if (value.getValueListUrn().equals(name))
				return value.getValue();
		return null;
	}
	
	@Override
	public void addOriginatorRole(String name, String value) {
		// TODO Auto-generated method stub
		ValueListWrapper vw = addExtension(EDXL_ORIGINATOR_ROLE);
		vw.setValueListUrn(name);
		vw.setValue(value);	
	}

	@Override
	public void addOriginatorRole(ValueList role) {
		// TODO Auto-generated method stub
		addExtension(role);
	}

	
	@Override
	public void addConsumerRole(String name, String value) {
		// TODO Auto-generated method stub
		ValueListWrapper vw = addExtension(EDXL_CONSUMER_ROLE);
		vw.setValueListUrn(name);
		vw.setValue(value);
	}

	@Override
	public void addConsumerRole(ValueList role) {
		// TODO Auto-generated method stub
		addExtension(role);
	}
	
	@Override
	public String getConsumerRole(String name) {
		// TODO Auto-generated method stub
		List<ValueList> values = getConsumerRoles();
		for (ValueList value : values)
			if (value.getValueListUrn().equals(name))
				return value.getValue();
		return null;
	}

	@Override
	public List<ValueList> getConsumerRoles() {
		// TODO Auto-generated method stub
		List<ValueList> list = getExtensions(EDXL_CONSUMER_ROLE);		
		return list;
	}
		
	@Override
	public String getConfidentiality() {
		// TODO Auto-generated method stub
		return getSimpleExtension(EDXL_CONFIDENTIALITY);
	}

	@Override
	public void setConfidentiality(String value) {
		// TODO Auto-generated method stub
		if (value != null)
			setElementText(EDXL_CONFIDENTIALITY, value);
		else
			removeElement(EDXL_CONFIDENTIALITY);
	}
	
	@Override
	public NonXMLContentType getNonXMLContent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setNonXMLContent(NonXMLContentType value) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public XmlContent getXmlContent() {
		// TODO Auto-generated method stub
		List<Element> list = getExtensions(EDXL_XML_CONTENT);
		if(list.size() > 0)
			return (XmlContent) list.get(0);
		return null;		
	}

	@Override
	public XmlContent setXmlContent() {
		// TODO Auto-generated method stub
		List<Element> list = getExtensions(EDXL_XML_CONTENT);
		for(Element el : list)
			el.discard();
		return addExtension(EDXL_XML_CONTENT);
			
	}

}
