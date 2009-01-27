package org.opencare.lib.model.edxl;

import java.util.List;

import javax.xml.namespace.QName;

import org.apache.abdera.factory.Factory;
import org.apache.abdera.model.Element;
import org.opencare.lib.model.BaseWrapper;
import org.opencare.lib.model.Constants;

public class ValueSchemeWrapper extends BaseWrapper implements ValueScheme,
		Constants {

	/**
	 * @param internal
	 */
	public ValueSchemeWrapper(Element internal) {
		super(internal);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param factory
	 * @param qname
	 */
	public ValueSchemeWrapper(Factory factory, QName qname) {
		super(factory, qname);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setExplicitAddressScheme(String value) {
		// TODO Auto-generated method stub
		addSimpleExtension(EDXL_EXPLICITADDRESS_SCHEME, value);
	}

	@Override
	public String getExplicitAddressScheme() {
		// TODO Auto-generated method stub
		return getSimpleExtension(EDXL_EXPLICITADDRESS_SCHEME);
	}

	@Override
	public void addExplicitAddressValue(String value) {
		// TODO Auto-generated method stub
		addExplicitAddressValues(new String[] { value });
	}

	@Override
	public void addExplicitAddressValues(String... values) {
		// TODO Auto-generated method stub
		List<Element> list = getExtensions(EDXL_EXPLICITADDRESS_VALUE);
		for (Element el : list)
			el.discard();
		for (String value : values)
			addSimpleExtension(EDXL_EXPLICITADDRESS_VALUE, value);
	}

	@Override
	public String[] getExplicitAddressValue() {
		// TODO Auto-generated method stub

		List<Element> list = getExtensions(EDXL_EXPLICITADDRESS_VALUE);
		String[] value = new String[list.size()];

		int n = 0;
		for (Element el : list)
			value[n++] = el.getText();

		return value;
	}
}
