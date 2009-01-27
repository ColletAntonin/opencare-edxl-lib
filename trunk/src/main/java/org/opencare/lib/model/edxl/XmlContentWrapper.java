package org.opencare.lib.model.edxl;

import java.util.List;

import javax.xml.namespace.QName;

import org.apache.abdera.factory.Factory;
import org.apache.abdera.model.Element;
import org.opencare.lib.model.BaseWrapper;
import org.opencare.lib.model.Constants;
import org.opencare.lib.model.cap.Alert;

public class XmlContentWrapper extends BaseWrapper implements XmlContent,
		Constants {

	public XmlContentWrapper(Element internal) {
		super(internal);
		// TODO Auto-generated constructor stub
	}

	public XmlContentWrapper(Factory factory, QName qname) {
		super(factory, qname);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<EmbeddedXMLContent> getEmbeddedXMLContent() {
		// TODO Auto-generated method stub
		List<EmbeddedXMLContent> list = getExtensions(EDXL_EMBEDDEDXML_CONTENT);
		
		return list;
	}

	@Override
	public EmbeddedXMLContent addEmbeddedXMLContent() {
		// TODO Auto-generated method stub
		return addExtension(EDXL_EMBEDDEDXML_CONTENT);
	}

	@Override
	public void addKeyXMLContent(String value) {
		// TODO Auto-generated method stub
		addKeyXMLContents(new String[] { value });
	}

	@Override
	public void addKeyXMLContents(String... values) {
		// TODO Auto-generated method stub
		List<Element> list = getExtensions(EDXL_KEYXML_CONTENT);
		for(Element el : list)
			el.discard();
		for(String value : values)
			addSimpleExtension(EDXL_KEYXML_CONTENT, value);
	}

	@Override
	public String[] getKeyXMLContent() {
		// TODO Auto-generated method stub
		List<Element> list = getExtensions(EDXL_KEYXML_CONTENT);
		String[] key = new String[list.size()];
		
		int n = 0;
		
		for(Element el : list)
			key[n++] = el.getText();
				
		return key;
	}

}
