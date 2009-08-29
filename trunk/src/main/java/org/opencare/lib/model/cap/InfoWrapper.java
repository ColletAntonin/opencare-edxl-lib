/**
 * 
 */
package org.opencare.lib.model.cap;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.xml.namespace.QName;

import org.apache.abdera.factory.Factory;
import org.apache.abdera.i18n.iri.IRI;
import org.apache.abdera.model.AtomDate;
import org.apache.abdera.model.Element;
import org.opencare.lib.model.BaseWrapper;
import org.opencare.lib.model.Constants;

/**
 * @author nontster
 * 
 */
public class InfoWrapper extends BaseWrapper implements Info, Constants {

	/**
	 * @param internal
	 */
	public InfoWrapper(Element internal) {
		super(internal);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param factory
	 * @param qname
	 */
	public InfoWrapper(Factory factory, QName qname) {
		super(factory, qname);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getLanguage() {
		// TODO Auto-generated method stub
		String lang = getSimpleExtension(CAP_LANGUAGE);
		if (lang == null)
			lang = getSimpleExtension(CAP_1_0_LANGUAGE);
		return lang;

	}

	@Override
	public <T extends Element>T setLanguage(String language) {
		// TODO Auto-generated method stub
		setElementText(CAP_LANGUAGE, language, CAP_1_0_LANGUAGE);
		return (T)this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Info#addArea()
	 */
	@Override
	public Area addArea() {
		// TODO Auto-generated method stub
		return addExtension(CAP_AREA);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Info#addEventCode(java.lang.String,
	 *      java.lang.String)
	 */
	@Override
	public void addEventCode(String name, String value) {
		// TODO Auto-generated method stub
		NameValueWrapper nv = addExtension(CAP_EVENTCODE);
		nv.setName(name);
		nv.setValue(value);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Info#addEventCode(org.opencare.cap.NameValue)
	 */
	@Override
	public void addEventCode(NameValue eventCode) {
		// TODO Auto-generated method stub
		addExtension(eventCode);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Info#addParameter(java.lang.String,
	 *      java.lang.String)
	 */
	@Override
	public void addParameter(String name, String value) {
		// TODO Auto-generated method stub
		NameValueWrapper nv = addExtension(CAP_PARAMETER);
		nv.setName(name);
		nv.setValue(value);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Info#addParameter(org.opencare.cap.NameValue)
	 */
	@Override
	public void addParameter(NameValue parameter) {
		// TODO Auto-generated method stub
		addExtension(parameter);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Info#addResource()
	 */
	@Override
	public Resource addResource() {
		// TODO Auto-generated method stub
		return addExtension(CAP_RESOURCE);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Info#getAreas()
	 */
	@Override
	public List<Area> getAreas() {
		// TODO Auto-generated method stub
		List<Area> list = getExtensions(CAP_AREA);
		if (list == null || list.size() == 0)
			list = getExtensions(CAP_1_0_AREA);
		return list;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Info#getAudience()
	 */
	@Override
	public String getAudience() {
		// TODO Auto-generated method stub
		String aud = getSimpleExtension(CAP_AUDIENCE);
		if (aud == null)
			aud = getSimpleExtension(CAP_1_0_AUDIENCE);
		return aud;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Info#getCategories()
	 */
	@Override
	public Category[] getCategories() {
		// TODO Auto-generated method stub
		List<Element> list = getExtensions(CAP_CATEGORY);
		if (list == null || list.size() == 0)
			list = getExtensions(CAP_1_0_CATEGORY);
		Category[] cats = new Category[list.size()];
		int n = 0;
		for (Element el : list)
			cats[n++] = Category.valueOf(el.getText());
		return cats;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Info#getCertainty()
	 */
	@Override
	public Certainty getCertainty() {
		// TODO Auto-generated method stub
		String cert = getSimpleExtension(CAP_CERTAINTY);
		if (cert == null)
			cert = getSimpleExtension(CAP_1_0_CERTAINTY);
		return cert == null ? null : Certainty.valueOf(cert.replaceAll("\\s",
				"_"));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Info#getContact()
	 */
	@Override
	public String getContact() {
		// TODO Auto-generated method stub
		String contact = getSimpleExtension(CAP_CONTACT);
		if (contact == null)
			contact = getSimpleExtension(CAP_1_0_CONTACT);
		return contact;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Info#getDescription()
	 */
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		String desc = getSimpleExtension(CAP_DESCRIPTION);
		if (desc == null)
			desc = getSimpleExtension(CAP_1_0_DESCRIPTION);
		return desc;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Info#getEffective()
	 */
	@Override
	public Date getEffective() {
		// TODO Auto-generated method stub
		String date = getSimpleExtension(CAP_EFFECTIVE);
		if (date == null)
			date = getSimpleExtension(CAP_1_0_EFFECTIVE);
		return date == null ? null : AtomDate.parse(date);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Info#getEvent()
	 */
	@Override
	public String getEvent() {
		// TODO Auto-generated method stub
		String event = getSimpleExtension(CAP_EVENT);
		if (event == null)
			event = getSimpleExtension(CAP_1_0_EVENT);
		return event;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Info#getEventCode(java.lang.String)
	 */
	@Override
	public String getEventCode(String name) {
		// TODO Auto-generated method stub
		List<NameValue> values = getEventCodes();
		for (NameValue value : values)
			if (value.getName().equals(name))
				return value.getValue();
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Info#getEventCodes()
	 */
	@Override
	public List<NameValue> getEventCodes() {
		// TODO Auto-generated method stub
		List<NameValue> list = getExtensions(CAP_EVENTCODE);
		if (list == null || list.size() == 0)
			list = getExtensions(CAP_1_0_EVENTCODE);
		return list;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Info#getExpires()
	 */
	@Override
	public Date getExpires() {
		// TODO Auto-generated method stub
		String date = getSimpleExtension(CAP_EXPIRES);
		if (date == null)
			date = getSimpleExtension(CAP_1_0_EXPIRES);
		return date == null ? null : AtomDate.parse(date);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Info#getHeadline()
	 */
	@Override
	public String getHeadline() {
		// TODO Auto-generated method stub
		String headline = getSimpleExtension(CAP_HEADLINE);
		if (headline == null)
			headline = getSimpleExtension(CAP_1_0_HEADLINE);
		return headline;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Info#getInstructions()
	 */
	@Override
	public String getInstructions() {
		// TODO Auto-generated method stub
		String in = getSimpleExtension(CAP_INSTRUCTION);
		if (in == null)
			in = getSimpleExtension(CAP_1_0_INSTRUCTION);
		return in;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Info#getOnset()
	 */
	@Override
	public Date getOnset() {
		// TODO Auto-generated method stub
		String date = getSimpleExtension(CAP_ONSET);
		if (date == null)
			date = getSimpleExtension(CAP_1_0_ONSET);
		return date == null ? null : AtomDate.parse(date);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Info#getParameter(java.lang.String)
	 */
	@Override
	public String getParameter(String name) {
		// TODO Auto-generated method stub
		List<NameValue> values = getParameters();
		for (NameValue value : values)
			if (value.getName().equals(name))
				return value.getValue();
		return null;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Info#getParameters()
	 */
	@Override
	public List<NameValue> getParameters() {
		// TODO Auto-generated method stub
		List<NameValue> list = getExtensions(CAP_PARAMETER);
		if (list == null || list.size() == 0)
			list = getExtensions(CAP_1_0_PARAMETER);
		return list;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Info#getResources()
	 */
	@Override
	public List<Resource> getResources() {
		// TODO Auto-generated method stub
		List<Resource> list = getExtensions(CAP_RESOURCE);
		if (list == null || list.size() == 0)
			list = getExtensions(CAP_RESOURCE);
		return list;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Info#getResponses()
	 */
	@Override
	public Response[] getResponses() {
		// TODO Auto-generated method stub
		List<Element> list = getExtensions(CAP_RESPONSETYPE);
		if (list == null || list.size() == 0)
			list = getExtensions(CAP_1_0_RESPONSETYPE);
		Response[] resp = new Response[list.size()];
		int n = 0;
		for (Element el : list)
			resp[n++] = Response.valueOf(el.getText());
		return resp;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Info#getSenderName()
	 */
	@Override
	public String getSenderName() {
		// TODO Auto-generated method stub
		String name = getSimpleExtension(CAP_SENDERNAME);
		if (name == null)
			name = getSimpleExtension(CAP_1_0_SENDERNAME);
		return name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Info#getSeverity()
	 */
	@Override
	public Severity getSeverity() {
		// TODO Auto-generated method stub
		String sev = getSimpleExtension(CAP_SEVERITY);
		if (sev == null)
			sev = getSimpleExtension(CAP_1_0_SEVERITY);
		return sev == null ? null : Severity.valueOf(sev);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Info#getUrgency()
	 */
	@Override
	public Urgency getUrgency() {
		// TODO Auto-generated method stub
	    String urg = getSimpleExtension(CAP_URGENCY);
	    if (urg == null) urg = getSimpleExtension(CAP_1_0_URGENCY);
	    return urg == null ? null : Urgency.valueOf(urg);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Info#getWeb()
	 */
	@Override
	public IRI getWeb() {
		// TODO Auto-generated method stub
	    String iri = getSimpleExtension(CAP_WEB);
	    if (iri == null) iri = getSimpleExtension(CAP_1_0_WEB);
	    return iri == null ? null : new IRI(iri);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Info#setAudience(java.lang.String)
	 */
	@Override
	public void setAudience(String audience) {
		// TODO Auto-generated method stub
	    setElementText(CAP_AUDIENCE, audience,CAP_1_0_AUDIENCE);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Info#setCategories(org.opencare.model.Info.Category)
	 */
	@Override
	public void setCategories(Category category) {
		// TODO Auto-generated method stub
	    setCategories(new Category[] {category});
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Info#setCategories(org.opencare.model.Info.Category[])
	 */
	@Override
	public void setCategories(Category... categories) {
		// TODO Auto-generated method stub
	    List<Element> list = getExtensions(CAP_CATEGORY);
	    if (list == null || list.size() == 0) list = getExtensions(CAP_1_0_CATEGORY);
	    for (Element el : list) el.discard();
	    for (Category cat: categories) addSimpleExtension(CAP_CATEGORY, cat.name());

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Info#setCertainty(org.opencare.model.Info.Certainty)
	 */
	@Override
	public void setCertainty(Certainty certainty) {
		// TODO Auto-generated method stub
	    if (certainty != null)
	        setElementText(CAP_CERTAINTY, certainty.name(),CAP_1_0_CERTAINTY);
	      else removeElement(CAP_CERTAINTY,CAP_1_0_CERTAINTY);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Info#setContact(java.lang.String)
	 */
	@Override
	public void setContact(String contact) {
		// TODO Auto-generated method stub
	    setElementText(CAP_CONTACT, contact,CAP_1_0_CONTACT);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Info#setDescription(java.lang.String)
	 */
	@Override
	public void setDescription(String description) {
		// TODO Auto-generated method stub
		setElementText(CAP_DESCRIPTION, description,CAP_1_0_DESCRIPTION);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Info#setEffective(java.util.Date)
	 */
	@Override
	public void setEffective(Date effective) {
		// TODO Auto-generated method stub
		SimpleDateFormat format = new SimpleDateFormat(
				"yyyy-MM-dd'T'HH:mm:ssZ", new Locale("en", "US"));

		StringBuffer dateBuff = new StringBuffer();
		dateBuff.append(format.format(effective));

		dateBuff.insert(dateBuff.length() - 2, ':');

		setElementText(CAP_EFFECTIVE, dateBuff.toString());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Info#setEvent(java.lang.String)
	 */
	@Override
	public void setEvent(String event) {
		// TODO Auto-generated method stub
		setElementText(CAP_EVENT, event,CAP_1_0_EVENT);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Info#setExpires(java.util.Date)
	 */
	@Override
	public void setExpires(Date expires) {
		// TODO Auto-generated method stub
		SimpleDateFormat format = new SimpleDateFormat(
				"yyyy-MM-dd'T'HH:mm:ssZ", new Locale("en", "US"));

		StringBuffer dateBuff = new StringBuffer();
		dateBuff.append(format.format(expires));

		dateBuff.insert(dateBuff.length() - 2, ':');

		setElementText(CAP_EFFECTIVE, dateBuff.toString());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Info#setHeadline(java.lang.String)
	 */
	@Override
	public void setHeadline(String headline) {
		// TODO Auto-generated method stub
		setElementText(CAP_HEADLINE, headline,CAP_1_0_HEADLINE);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Info#setInstructions(java.lang.String)
	 */
	@Override
	public void setInstructions(String instructions) {
		// TODO Auto-generated method stub
		setElementText(CAP_INSTRUCTION, instructions,CAP_1_0_INSTRUCTION);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Info#setOnset(java.util.Date)
	 */
	@Override
	public void setOnset(Date onset) {
		// TODO Auto-generated method stub
		SimpleDateFormat format = new SimpleDateFormat(
				"yyyy-MM-dd'T'HH:mm:ssZ", new Locale("en", "US"));

		StringBuffer dateBuff = new StringBuffer();
		dateBuff.append(format.format(onset));

		dateBuff.insert(dateBuff.length() - 2, ':');

		setElementText(CAP_EFFECTIVE, dateBuff.toString());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Info#setResponses(org.opencare.model.Info.Response)
	 */
	@Override
	public void setResponses(Response response) {
		// TODO Auto-generated method stub
		if (response != null)
	        setElementText(CAP_RESPONSETYPE, response.name(),CAP_1_0_RESPONSETYPE);
	      else removeElement(CAP_RESPONSETYPE,CAP_1_0_RESPONSETYPE);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Info#setResponses(org.opencare.model.Info.Response[])
	 */
	@Override
	public void setResponses(Response... responses) {
		// TODO Auto-generated method stub
	    List<Element> list = getExtensions(CAP_RESPONSETYPE);
	    if (list == null || list.size() == 0) list = getExtensions(CAP_1_0_RESPONSETYPE);
	    for (Element el : list) el.discard();
	    for (Response res: responses) addSimpleExtension(CAP_RESPONSETYPE, res.name());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Info#setSenderName(java.lang.String)
	 */
	@Override
	public void setSenderName(String name) {
		// TODO Auto-generated method stub
		if (name != null)
	        setElementText(CAP_SENDERNAME, name,CAP_1_0_SENDERNAME);
	      else removeElement(CAP_SENDERNAME,CAP_1_0_SENDERNAME);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Info#setSeverity(org.opencare.model.Info.Severity)
	 */
	@Override
	public void setSeverity(Severity severity) {
		// TODO Auto-generated method stub
		if (severity != null)
	        setElementText(CAP_SEVERITY, severity.name(),CAP_1_0_SEVERITY);
	      else removeElement(CAP_SEVERITY,CAP_1_0_SEVERITY);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Info#setUrgency(org.opencare.model.Info.Urgency)
	 */
	@Override
	public void setUrgency(Urgency urgency) {
		// TODO Auto-generated method stub
		if (urgency != null)
	        setElementText(CAP_URGENCY, urgency.name(),CAP_1_0_URGENCY);
	      else removeElement(CAP_URGENCY,CAP_1_0_URGENCY);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Info#setWeb(org.apache.abdera.i18n.iri.IRI)
	 */
	@Override
	public void setWeb(IRI web) {
		// TODO Auto-generated method stub
		if (web != null)
	        setElementText(CAP_WEB, web.toString(),CAP_1_0_WEB);
	      else removeElement(CAP_WEB,CAP_1_0_WEB);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Info#setWeb(java.lang.String)
	 */
	@Override
	public void setWeb(String web) {
		// TODO Auto-generated method stub
		if (web != null)
	        setElementText(CAP_WEB, web,CAP_1_0_WEB);
	      else removeElement(CAP_WEB,CAP_1_0_WEB);
	}

}
