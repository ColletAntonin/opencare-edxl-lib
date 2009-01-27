package org.opencare.lib.model.edxl;

import javax.xml.namespace.QName;

import org.apache.abdera.factory.Factory;
import org.apache.abdera.model.Element;
import org.opencare.lib.model.BaseWrapper;
import org.opencare.lib.model.Constants;

public class ValueListWrapper extends BaseWrapper implements ValueList,
		Constants {

	public ValueListWrapper(Element internal) {
		super(internal);
		// TODO Auto-generated constructor stub
	}

	public ValueListWrapper(Factory factory, QName qname) {
		super(factory, qname);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return getSimpleExtension(EDXL_VALUE);
	}

	@Override
	public void setValue(String value) {
		// TODO Auto-generated method stub
		setElementText(EDXL_VALUE, value);
	}

	@Override
	public String getValueListUrn() {
		// TODO Auto-generated method stub
		return getSimpleExtension(EDXL_VALUE_LIST);
	}

	@Override
	public void setValueListUrn(String value) {
		// TODO Auto-generated method stub
		setElementText(EDXL_VALUE_LIST, value);
	}

}
