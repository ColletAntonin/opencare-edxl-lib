package org.opencare.lib.model.edxl;

import java.util.List;

import javax.xml.namespace.QName;

import org.apache.abdera.factory.Factory;
import org.apache.abdera.model.Element;
import org.opencare.lib.model.BaseWrapper;
import org.opencare.lib.model.Constants;
import org.opencare.lib.model.cap.Alert;

public class EmbeddedXMLContentWrapper extends BaseWrapper implements
		Constants, EmbeddedXMLContent {

	public EmbeddedXMLContentWrapper(Element internal) {
		super(internal);
		// TODO Auto-generated constructor stub
	}

	public EmbeddedXMLContentWrapper(Factory factory, QName qname) {
		super(factory, qname);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Alert> getAlert() {
		// TODO Auto-generated method stub
		List<Alert> list = getExtensions(CAP_ALERT);

		return list;
	}

	@Override
	public Alert addAlert() {
		// TODO Auto-generated method stub
		return addExtension(CAP_ALERT);
	}

}
