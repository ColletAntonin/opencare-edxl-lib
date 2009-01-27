package org.opencare.lib.model.edxl;

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

public class EDXLDistributionWrapper extends BaseWrapper implements
		EDXLDistribution, Constants {

	public EDXLDistributionWrapper(Element internal) {
		super(internal);
		// TODO Auto-generated constructor stub
	}

	public EDXLDistributionWrapper(Factory factory, QName qname) {
		super(factory, qname);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDistributionID() {
		// TODO Auto-generated method stub
		return getSimpleExtension(EDXL_DISTRIBUTION_ID);
	}

	@Override
	public void setDistributionID(String value) {
		// TODO Auto-generated method stub
		if (value != null)
			setElementText(EDXL_DISTRIBUTION_ID, value);
		else
			removeElement(EDXL_DISTRIBUTION_ID);
	}

	@Override
	public String getSenderID() {
		// TODO Auto-generated method stub
		return getSimpleExtension(EDXL_SENDER_ID);
	}

	@Override
	public void setSenderID(String value) {
		// TODO Auto-generated method stub
		if (value != null)
			setElementText(EDXL_SENDER_ID, value);
		else
			removeElement(EDXL_SENDER_ID);
	}

	@Override
	public Date getDateTimeSent() {
		// TODO Auto-generated method stub
		String val = getSimpleExtension(EDXL_DATETIME_SENT);
		return val == null ? null : AtomDate.parse(val);
	}

	@Override
	public void setDateTimeSent(Date value) {
		// TODO Auto-generated method stub

		SimpleDateFormat format = new SimpleDateFormat(
				"yyyy-MM-dd'T'HH:mm:ssZ", new Locale("en", "US"));

		StringBuffer dateBuff = new StringBuffer();
		dateBuff.append(format.format(value));

		dateBuff.insert(dateBuff.length() - 2, ':');

		setElementText(EDXL_DATETIME_SENT, dateBuff.toString());

	}

	@Override
	public DistributionStatus getDistributionStatus() {
		// TODO Auto-generated method stub

		String status = getSimpleExtension(EDXL_DISTRIBUTION_STATUS);
		return status == null ? null : DistributionStatus.valueOf(status);
	}

	@Override
	public void setDistributionStatus(DistributionStatus status) {
		// TODO Auto-generated method stub
		if (status != null)
			setElementText(EDXL_DISTRIBUTION_STATUS, status.name());
		else
			removeElement(EDXL_DISTRIBUTION_STATUS);
	}

	@Override
	public DistributionType getDistributionType() {
		// TODO Auto-generated method stub
		String type = getSimpleExtension(EDXL_DISTRIBUTION_TYPE);
		return type == null ? null : DistributionType.valueOf(type);
	}

	@Override
	public void setDistributionType(DistributionType type) {
		// TODO Auto-generated method stub
		if (type != null)
			setElementText(EDXL_DISTRIBUTION_TYPE, type.name());
		else
			removeElement(EDXL_DISTRIBUTION_TYPE);
	}

	@Override
	public String getCombinedConfidentiality() {
		// TODO Auto-generated method stub
		return getSimpleExtension(EDXL_COMBINED_CONFIDENTIALITY);
	}

	@Override
	public void setCombinedConfidentiality(String value) {
		// TODO Auto-generated method stub
		if (value != null)
			setElementText(EDXL_COMBINED_CONFIDENTIALITY, value);
		else
			removeElement(EDXL_COMBINED_CONFIDENTIALITY);
	}

	@Override
	public String getLanguage() {
		// TODO Auto-generated method stub
		return getSimpleExtension(EDXL_LANGUAGE);
	}

	@Override
	public void setLanguage(String lang) {
		// TODO Auto-generated method stub
		addSimpleExtension(EDXL_LANGUAGE, lang);
	}

	@Override
	public List<ValueList> getSenderRoles() {
		// TODO Auto-generated method stub
		List<ValueList> list = getExtensions(EDXL_SENDER_ROLE);
		return list;
	}

	@Override
	public String getSenderRole(String name) {
		// TODO Auto-generated method stub
		List<ValueList> list = getSenderRoles();
		for (ValueList value : list)
			if (value.getValueListUrn().equals(name))
				return value.getValue();

		return null;
	}

	@Override
	public void addSenderRole(String name, String value) {
		// TODO Auto-generated method stub
		ValueListWrapper vw = addExtension(EDXL_SENDER_ROLE);
		vw.setValueListUrn(name);
		vw.setValue(value);
	}

	@Override
	public void addSenderRole(ValueList role) {
		// TODO Auto-generated method stub
		addExtension(role);
	}

	@Override
	public List<ValueList> getRecipientRoles() {
		// TODO Auto-generated method stub
		List<ValueList> list = getExtensions(EDXL_RECIPIENT_ROLE);
		return list;
	}

	@Override
	public String getRecipientRole(String name) {
		// TODO Auto-generated method stub
		List<ValueList> list = getRecipientRoles();
		for (ValueList value : list)
			if (value.getValueListUrn().equals(name))
				return value.getValue();
		return null;
	}

	@Override
	public void addRecipientRole(String name, String value) {
		// TODO Auto-generated method stub
		ValueListWrapper vw = addExtension(EDXL_RECIPIENT_ROLE);
		vw.setValueListUrn(name);
		vw.setValue(value);
	}

	@Override
	public void addRecipientRole(ValueList role) {
		// TODO Auto-generated method stub
		addExtension(role);
	}

	@Override
	public List<ValueList> getKeywords() {
		// TODO Auto-generated method stub
		List<ValueList> list = getExtensions(EDXL_KEYWORD);
		return list;
	}

	@Override
	public String getKeyword(String name) {
		// TODO Auto-generated method stub
		List<ValueList> list = getKeywords();
		for (ValueList value : list)
			if (value.getValueListUrn().equals(name))
				return value.getValue();
		return null;
	}

	@Override
	public void addKeyword(String name, String value) {
		// TODO Auto-generated method stub
		ValueListWrapper vw = addExtension(EDXL_KEYWORD);
		vw.setValueListUrn(name);
		vw.setValue(value);
	}

	@Override
	public void addKeyword(ValueList keyword) {
		// TODO Auto-generated method stub
		addExtension(keyword);
	}

	@Override
	public String[] getDistributionReference() {
		// TODO Auto-generated method stub

		List<Element> list = getExtensions(EDXL_DISTRIBUTION_REFERENCE);
		String[] ref = new String[list.size()];
		int n = 0;
		for (Element el : list)
			ref[n++] = el.getText();
		return ref;
	}

	@Override
	public void addDistributionReference(String reference) {
		// TODO Auto-generated method stub
		addDistributionReferences(new String[] { reference });
	}

	@Override
	public void addDistributionReferences(String... references) {
		// TODO Auto-generated method stub
		List<Element> list = getExtensions(EDXL_DISTRIBUTION_REFERENCE);
		for (Element el : list)
			el.discard();
		for (String value : references)
			addSimpleExtension(EDXL_DISTRIBUTION_REFERENCE, value);
	}

	@Override
	public List<ValueScheme> getExplicitAddresses() {
		// TODO Auto-generated method stub
		List<ValueScheme> list = getExtensions(EDXL_EXPLICITADDRESS);
		return list;
	}

	@Override
	public String[] getExplicitAddress(String name) {
		// TODO Auto-generated method stub
		List<ValueScheme> list = getExplicitAddresses();
		for (ValueScheme value : list)
			if (value.getExplicitAddressScheme().equals(name))
				return value.getExplicitAddressValue();

		return null;
	}

	@Override
	public void addExplicitAddress(String name, String value) {
		ValueScheme vs = addExtension(EDXL_EXPLICITADDRESS);
		vs.setExplicitAddressScheme(name);
		vs.addExplicitAddressValue(value);
	}

	@Override
	public void addExplicitAddress(String name, String... values) {
		// TODO Auto-generated method stub
		ValueScheme vs = addExtension(EDXL_EXPLICITADDRESS);
		vs.setExplicitAddressScheme(name);
		vs.addExplicitAddressValues(values);
	}

	@Override
	public void addExplicitAddresses(ValueScheme value) {
		// TODO Auto-generated method stub
		addExtension(value);
	}

	@Override
	public TargetArea addTargetArea() {
		// TODO Auto-generated method stub
		return addExtension(EDXL_TARGET_AREA);
	}

	@Override
	public List<TargetArea> getTargetAreas() {
		// TODO Auto-generated method stub
		List<TargetArea> list = getExtensions(EDXL_TARGET_AREA);
		return list;
	}

	@Override
	public List<ContentObject> getContentObject() {
		// TODO Auto-generated method stub
		List<ContentObject> list = getExtensions(EDXL_CONTENT_OBJECT);
		return list;
	}

	@Override
	public ContentObject addContentObject() {
		// TODO Auto-generated method stub
		return addExtension(EDXL_CONTENT_OBJECT);
	}

}
