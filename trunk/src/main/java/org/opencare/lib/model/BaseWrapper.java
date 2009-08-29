/**
 * 
 */
package org.opencare.lib.model;

import javax.xml.namespace.QName;

import org.apache.abdera.factory.Factory;
import org.apache.abdera.model.Element;
import org.apache.abdera.model.ExtensibleElementWrapper;

/**
 * @author nontster
 * 
 */
public abstract class BaseWrapper extends ExtensibleElementWrapper {

	/**
	 * @param internal
	 */
	public BaseWrapper(Element internal) {
		super(internal);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param factory
	 * @param qname
	 */
	public BaseWrapper(Factory factory, QName qname) {
		super(factory, qname);
		// TODO Auto-generated constructor stub
	}

	protected void setElementText(QName qname, String text, QName... remove) {
		for (QName other : remove)
			removeElement(other);
		Element el = getExtension(qname);
		if (el == null && text != null)
			addSimpleExtension(qname, text);
		else if (el != null && text != null)
			el.setText(text);
		else if (el != null && text == null)
			el.discard();
	}

	protected void removeElement(QName qname, QName... others) {
		Element el = getExtension(qname);
		if (el != null)
			el.discard();
		for (QName other : others)
			removeElement(other);
	}
}
