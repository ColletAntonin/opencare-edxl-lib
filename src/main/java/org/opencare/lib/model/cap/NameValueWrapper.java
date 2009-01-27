/**
 * 
 */
package org.opencare.lib.model.cap;

import javax.xml.namespace.QName;

import org.apache.abdera.factory.Factory;
import org.apache.abdera.model.Element;
import org.opencare.lib.model.BaseWrapper;
import org.opencare.lib.model.Constants;

/**
 * @author nontster
 * 
 */
public class NameValueWrapper extends BaseWrapper implements NameValue, Constants {

	private boolean oldstyle = false;
	private String name = null;
	private String value = null;

	/**
	 * @param internal
	 */
	@SuppressWarnings("deprecation")
	public NameValueWrapper(Element internal) {
		super(internal);
		oldstyle = (internal.getQName().getNamespaceURI().equals(CAP_1_0_NS));
		if (oldstyle)
			parseOldStyle();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param factory
	 * @param qname
	 */
	@SuppressWarnings("deprecation")
	public NameValueWrapper(Factory factory, QName qname) {
		super(factory, qname);
		oldstyle = (qname.getNamespaceURI().equals(CAP_1_0_NS));
		if (oldstyle)
			parseOldStyle();
		// TODO Auto-generated constructor stub
	}

	private void parseOldStyle() {
		String t = getText();
		String[] pair = t.split("\\s*=\\s*", 2);
		if (pair.length == 2) {
			name = pair[0];
			value = pair[1];
		} else if (pair.length == 1) {
			name = pair[0];
			value = null;
		}
	}

	private void setOldStyle() {
		if (name != null) {
			setText(name + (value != null ? "=" + value : ""));
		} else {
			setText("");
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.NameValue#getName()
	 */
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return !oldstyle ? getSimpleExtension(CAP_VALUENAME) : name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.NameValue#getValue()
	 */
	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return !oldstyle ? getSimpleExtension(CAP_VALUE) : value;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.NameValue#setName(java.lang.String)
	 */
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		if (!oldstyle)
			setElementText(CAP_VALUENAME, name);
		else {
			this.name = name;
			setOldStyle();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.NameValue#setValue(java.lang.String)
	 */
	@Override
	public void setValue(String value) {
		// TODO Auto-generated method stub
		if (!oldstyle)
			setElementText(CAP_VALUE, value);
		else {
			this.value = value;
			setOldStyle();
		}
	}

}
