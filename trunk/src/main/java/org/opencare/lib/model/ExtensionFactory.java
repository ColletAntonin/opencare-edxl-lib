package org.opencare.lib.model;

import org.apache.abdera.util.AbstractExtensionFactory;
import org.opencare.lib.model.cap.AlertWrapper;
import org.opencare.lib.model.cap.AreaWrapper;
import org.opencare.lib.model.cap.InfoWrapper;
import org.opencare.lib.model.cap.NameValueWrapper;
import org.opencare.lib.model.cap.ResourceWrapper;
import org.opencare.lib.model.edxl.ContentObjectWrapper;
import org.opencare.lib.model.edxl.EDXLDistributionWrapper;
import org.opencare.lib.model.edxl.EmbeddedXMLContentWrapper;
import org.opencare.lib.model.edxl.TargetAreaWrapper;
import org.opencare.lib.model.edxl.ValueListWrapper;
import org.opencare.lib.model.edxl.ValueSchemeWrapper;
import org.opencare.lib.model.edxl.XmlContentWrapper;

/**
 * Used by Abdera to determine which objects to create for specific parsed
 * elements
 */
public class ExtensionFactory extends AbstractExtensionFactory implements Constants {

	@SuppressWarnings("deprecation")
	public ExtensionFactory() {
		super(EDXL_NS);
		addMimeType(EDXL_EDXL_DISTRIBUTION, "application/alert+xml");
		addImpl(EDXL_EDXL_DISTRIBUTION, EDXLDistributionWrapper.class);
		addImpl(EDXL_TARGET_AREA, TargetAreaWrapper.class);
		addImpl(EDXL_CONTENT_OBJECT, ContentObjectWrapper.class);
		addImpl(EDXL_CONTENT_KEYWORD, ValueListWrapper.class);
		addImpl(EDXL_ORIGINATOR_ROLE, ValueListWrapper.class);
		addImpl(EDXL_CONSUMER_ROLE, ValueListWrapper.class);
		addImpl(EDXL_XML_CONTENT, XmlContentWrapper.class);
		addImpl(EDXL_EMBEDDEDXML_CONTENT, EmbeddedXMLContentWrapper.class);
		addImpl(EDXL_EXPLICITADDRESS, ValueSchemeWrapper.class);
		addImpl(EDXL_KEYWORD, ValueListWrapper.class);
		addImpl(EDXL_RECIPIENT_ROLE, ValueListWrapper.class);
		addImpl(EDXL_SENDER_ROLE, ValueListWrapper.class);		
		
		addImpl(CAP_ALERT, AlertWrapper.class);
		addImpl(CAP_1_0_ALERT, AlertWrapper.class);
		addImpl(CAP_INFO, InfoWrapper.class);
		addImpl(CAP_1_0_INFO, InfoWrapper.class);
		addImpl(CAP_RESOURCE, ResourceWrapper.class);
		addImpl(CAP_1_0_RESOURCE, ResourceWrapper.class);
		addImpl(CAP_AREA, AreaWrapper.class);
		addImpl(CAP_1_0_AREA, AreaWrapper.class);
		addImpl(CAP_EVENTCODE, NameValueWrapper.class);
		addImpl(CAP_PARAMETER, NameValueWrapper.class);
		addImpl(CAP_GEOCODE, NameValueWrapper.class);
		addImpl(CAP_1_0_EVENTCODE, NameValueWrapper.class);
		addImpl(CAP_1_0_PARAMETER, NameValueWrapper.class);
		addImpl(CAP_1_0_GEOCODE, NameValueWrapper.class);
	}

}
