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
import org.apache.abdera.model.AtomDate;
import org.apache.abdera.model.Element;
import org.opencare.lib.model.BaseWrapper;
import org.opencare.lib.model.Constants;

/**
 * @author nontster
 * 
 */
public class AlertWrapper extends BaseWrapper implements Alert, Constants {

	/**
	 * @param internal
	 */
	public AlertWrapper(Element internal) {
		super(internal);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param factory
	 * @param qname
	 */
	public AlertWrapper(Factory factory, QName qname) {
		super(factory, qname);
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Alert#addInfo(org.opencare.cap.Info)
	 */
	@Override
	public void addInfo(Info info) {
		// TODO Auto-generated method stub
		addExtension(info);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Alert#addInfo()
	 */
	@Override
	public Info addInfo() {
		// TODO Auto-generated method stub
		return addExtension(CAP_INFO);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Alert#getAddresses()
	 */
	@Override
	public String[] getAddresses() {
		// TODO Auto-generated method stub
		String addresses = getSimpleExtension(CAP_ADDRESSES);
		if (addresses == null)
			addresses = getSimpleExtension(CAP_1_0_ADDRESSES);
		return addresses == null ? null : addresses
				.split("\\s* \\s*(?=(?:[^\"]*\"[^\"]*\")*(?![^\"]*\"))");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Alert#getCodes()
	 */
	@Override
	public String[] getCodes() {
		// TODO Auto-generated method stub
		List<Element> codes = getExtensions(CAP_CODE);
		if (codes == null || codes.size() == 0)
			codes = getExtensions(CAP_1_0_CODE);
		String[] values = new String[codes.size()];
		int n = 0;
		for (Element code : codes)
			values[n++] = code.getText();
		return values;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Alert#getIdentifier()
	 */
	@Override
	public String getIdentifier() {
		// TODO Auto-generated method stub
		String id = getSimpleExtension(CAP_IDENTIFIER);
		if (id == null)
			id = getSimpleExtension(CAP_1_0_IDENTIFIER);
		return id;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Alert#getIncidents()
	 */
	@Override
	public String[] getIncidents() {
		// TODO Auto-generated method stub
		String incidents = getSimpleExtension(CAP_INCIDENTS);
		if (incidents == null)
			incidents = getSimpleExtension(CAP_1_0_INCIDENTS);
		return incidents == null ? null : incidents.split("\\s+");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Alert#getInfo()
	 */
	@Override
	public List<Info> getInfo() {
		// TODO Auto-generated method stub
		List<Info> info = getExtensions(CAP_INFO);
		if (info == null || info.size() == 0)
			info = getExtensions(CAP_1_0_INFO);
		return info;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Alert#getNote()
	 */
	@Override
	public String getNote() {
		// TODO Auto-generated method stub
		String note = getSimpleExtension(CAP_NOTE);
		if (note == null)
			note = getSimpleExtension(CAP_1_0_NOTE);
		return note;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Alert#getReferences()
	 */
	@Override
	public String[] getReferences() {
		// TODO Auto-generated method stub
		String refs = getSimpleExtension(CAP_REFERENCES);
		if (refs == null)
			refs = getSimpleExtension(CAP_1_0_REFERENCES);
		return refs == null ? null : refs.split("\\s+");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Alert#getRestriction()
	 */
	@Override
	public String getRestriction() {
		// TODO Auto-generated method stub
		String rest = getSimpleExtension(CAP_RESTRICTION);
		if (rest == null)
			rest = getSimpleExtension(CAP_1_0_RESTRICTION);
		return rest;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Alert#getScope()
	 */
	@Override
	public Scope getScope() {
		// TODO Auto-generated method stub
		String scope = getSimpleExtension(CAP_SCOPE);
		if (scope == null)
			scope = getSimpleExtension(CAP_1_0_SCOPE);
		return Scope.valueOf(scope);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Alert#getSender()
	 */
	@Override
	public String getSender() {
		// TODO Auto-generated method stub
		String sender = getSimpleExtension(CAP_SENDER);
		if (sender == null)
			sender = getSimpleExtension(CAP_1_0_SENDER);
		return sender;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Alert#getSent()
	 */
	@Override
	public Date getSent() {
		// TODO Auto-generated method stub
		String val = getSimpleExtension(CAP_SENT);
		if (val == null)
			val = getSimpleExtension(CAP_1_0_SENT);
		return val == null ? null : AtomDate.parse(val);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Alert#getSource()
	 */
	@Override
	public String getSource() {
		// TODO Auto-generated method stub
		String source = getSimpleExtension(CAP_SOURCE);
		if (source == null)
			source = getSimpleExtension(CAP_1_0_SOURCE);
		return source;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Alert#getStatus()
	 */
	@Override
	public Status getStatus() {
		// TODO Auto-generated method stub
		String status = getSimpleExtension(CAP_STATUS);
		if (status == null)
			status = getSimpleExtension(CAP_1_0_STATUS);
		return status == null ? null : Status.valueOf(status);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Alert#getType()
	 */
	@Override
	public Type getType() {
		// TODO Auto-generated method stub
		String type = getSimpleExtension(CAP_MSGTYPE);
		if (type == null)
			type = getSimpleExtension(CAP_1_0_MSGTYPE);
		return type == null ? null : Type.valueOf(type);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Alert#setAddresses(java.lang.String)
	 */
	@Override
	public void setAddresses(String addresses) {
		// TODO Auto-generated method stub
		setAddresses(new String[] { addresses });
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Alert#setAddresses(java.lang.String[])
	 */
	@Override
	public void setAddresses(String... addresses) {
		// TODO Auto-generated method stub
		StringBuffer buf = new StringBuffer();
		for (String address : addresses) {
			if (address.split("\\s+").length > 1) {
				if (address.charAt(0) != '"')
					buf.append('"');
				buf.append(address);
				if (address.charAt(address.length() - 1) != '"')
					buf.append('"');
			} else {
				buf.append(address);
			}
			buf.append(' ');
		}
		setElementText(CAP_ADDRESSES, buf.toString(), CAP_1_0_ADDRESSES);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Alert#setCodes(java.lang.String)
	 */
	@Override
	public void setCodes(String code) {
		// TODO Auto-generated method stub
		setCodes(new String[] { code });
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Alert#setCodes(java.lang.String[])
	 */
	@Override
	public void setCodes(String... codes) {
		// TODO Auto-generated method stub
		List<Element> list = getExtensions(CAP_CODE);
		if (list == null || list.size() == 0)
			list = getExtensions(CAP_1_0_CODE);
		for (Element code : list)
			code.discard();
		for (String code : codes)
			if (code != null)
				addSimpleExtension(CAP_CODE, code.trim());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Alert#setIdentifier(java.lang.String)
	 */
	@Override
	public void setIdentifier(String id) {
		// TODO Auto-generated method stub
		setElementText(CAP_IDENTIFIER, id, CAP_1_0_IDENTIFIER);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Alert#setIncidents(java.lang.String)
	 */
	@Override
	public void setIncidents(String id) {
		// TODO Auto-generated method stub
		setIncidents(new String[] { id });
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Alert#setIncidents(java.lang.String[])
	 */
	@Override
	public void setIncidents(String... ids) {
		// TODO Auto-generated method stub
		StringBuffer buf = new StringBuffer();
		for (String id : ids) {
			buf.append(id);
			buf.append(' ');
		}
		setElementText(CAP_INCIDENTS, buf.toString(), CAP_1_0_INCIDENTS);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Alert#setNote(java.lang.String)
	 */
	@Override
	public void setNote(String note) {
		// TODO Auto-generated method stub
		setElementText(CAP_NOTE, note, CAP_1_0_NOTE);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Alert#setReferences(java.lang.String)
	 */
	@Override
	public void setReferences(String id) {
		// TODO Auto-generated method stub
		setReferences(new String[] { id });
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Alert#setReferences(java.lang.String[])
	 */
	@Override
	public void setReferences(String... ids) {
		// TODO Auto-generated method stub
		StringBuffer buf = new StringBuffer();
		for (String id : ids) {
			buf.append(id);
			buf.append(' ');
		}
		setElementText(CAP_REFERENCES, buf.toString(), CAP_1_0_REFERENCES);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Alert#setRestriction(java.lang.String)
	 */
	@Override
	public void setRestriction(String restriction) {
		// TODO Auto-generated method stub
		setElementText(CAP_RESTRICTION, restriction, CAP_1_0_RESTRICTION);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Alert#setScope(org.opencare.model.Alert.Scope)
	 */
	@Override
	public void setScope(Scope scope) {
		// TODO Auto-generated method stub
		if (scope != null)
			setElementText(CAP_SCOPE, scope.name(), CAP_1_0_SCOPE);
		else
			removeElement(CAP_SCOPE, CAP_1_0_SCOPE);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Alert#setSender(java.lang.String)
	 */
	@Override
	public void setSender(String sender) {
		// TODO Auto-generated method stub
		
		//System.out.println(sender);
		
		setElementText(CAP_SENDER, sender, CAP_1_0_SENDER);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Alert#setSent(java.util.Date)
	 */
	@Override
	public void setSent(Date sent) {
		// TODO Auto-generated method stub
		
		SimpleDateFormat format = new SimpleDateFormat(
				"yyyy-MM-dd'T'HH:mm:ssZ", new Locale("en", "US"));

		StringBuffer dateBuff = new StringBuffer();
		dateBuff.append(format.format(sent));

		dateBuff.insert(dateBuff.length() - 2, ':');

		setElementText(CAP_SENT, dateBuff.toString(), CAP_1_0_SENT);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Alert#setSource(java.lang.String)
	 */
	@Override
	public void setSource(String source) {
		// TODO Auto-generated method stub
		setElementText(CAP_SOURCE, source, CAP_1_0_SOURCE);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Alert#setStatus(org.opencare.model.Alert.Status)
	 */
	@Override
	public void setStatus(Status status) {
		// TODO Auto-generated method stub
		if (status != null)
			setElementText(CAP_STATUS, status.name(), CAP_1_0_STATUS);
		else
			removeElement(CAP_STATUS, CAP_1_0_STATUS);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Alert#setType(org.opencare.model.Alert.Type)
	 */
	@Override
	public void setType(Type type) {
		// TODO Auto-generated method stub
		if (type != null)
			setElementText(CAP_MSGTYPE, type.name(), CAP_1_0_MSGTYPE);
		else
			removeElement(CAP_MSGTYPE, CAP_1_0_MSGTYPE);
	}
}
