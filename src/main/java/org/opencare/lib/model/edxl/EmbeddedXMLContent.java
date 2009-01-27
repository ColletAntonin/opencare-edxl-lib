package org.opencare.lib.model.edxl;

import java.util.List;

import org.apache.abdera.model.Element;
import org.apache.abdera.model.ExtensibleElement;
import org.opencare.lib.model.cap.Alert;

public interface EmbeddedXMLContent extends ExtensibleElement, Element {
	Alert addAlert();
	List<Alert> getAlert();
}
