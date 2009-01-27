package org.opencare.lib.model.cap;

import org.apache.abdera.model.Element;

/**
 * Implements the structure necessary to support parameters, event codes and geo
 * codes
 */
public interface NameValue extends Element {

	String getName();

	void setName(String name);

	String getValue();

	void setValue(String value);

}
