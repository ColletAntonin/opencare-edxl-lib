package org.opencare.lib.model;

import javax.xml.namespace.QName;

public interface Constants {

  public static final String SEC_FEATURE = "http://www.snellspace.com/public/xml-encryption";
  
  public static final String EDXL_NS = "urn:oasis:names:tc:emergency:EDXL:DE:1.0";
  
  public static final String EDXL_PFX = "";
  
  public static final QName EDXL_EDXL_DISTRIBUTION     = new QName(EDXL_NS, "EDXLDistribution", 		EDXL_PFX);
  public static final QName EDXL_DISTRIBUTION_ID       = new QName(EDXL_NS, "distributionID", 			EDXL_PFX);
  public static final QName EDXL_SENDER_ID             = new QName(EDXL_NS, "senderID",       			EDXL_PFX);
  public static final QName EDXL_DISTRIBUTION_STATUS   = new QName(EDXL_NS, "distributionStatus",		EDXL_PFX);
  public static final QName EDXL_DISTRIBUTION_TYPE     = new QName(EDXL_NS, "distributionType",			EDXL_PFX);
  public static final QName EDXL_DATETIME_SENT   	   = new QName(EDXL_NS, "dateTimeSent",				EDXL_PFX);
  public static final QName EDXL_COMBINED_CONFIDENTIALITY = new QName(EDXL_NS, "combinedConfidentiality",	EDXL_PFX);

  public static final QName EDXL_TARGET_AREA 			= new QName(EDXL_NS, "targetArea",	EDXL_PFX);
  public static final QName EDXL_CIRCLE 				= new QName(EDXL_NS, "circle",	EDXL_PFX);
  public static final QName EDXL_POLYGON 				= new QName(EDXL_NS, "polygon",	EDXL_PFX);
  public static final QName EDXL_COUNTRY 				= new QName(EDXL_NS, "country",	EDXL_PFX); 
  public static final QName EDXL_SUBDIVISION 			= new QName(EDXL_NS, "subdivision",	EDXL_PFX);
  public static final QName EDXL_LOC_CODE_UN			= new QName(EDXL_NS, "locCodeUN",	EDXL_PFX);
  
  public static final QName EDXL_CONTENT_OBJECT			= new QName(EDXL_NS, "contentObject",	EDXL_PFX);  
  public static final QName EDXL_VALUE_LIST				= new QName(EDXL_NS, "valueListUrn",	EDXL_PFX); 
  public static final QName EDXL_VALUE					= new QName(EDXL_NS, "value",	EDXL_PFX); 
  public static final QName EDXL_CONTENT_KEYWORD		= new QName(EDXL_NS, "contentKeyword",	EDXL_PFX);
  public static final QName EDXL_CONTENT_DESC			= new QName(EDXL_NS, "contentDescription",	EDXL_PFX);  
  public static final QName EDXL_INCIDENT_ID			= new QName(EDXL_NS, "incidentID",	EDXL_PFX);
  public static final QName EDXL_INCIDENT_DESC			= new QName(EDXL_NS, "incidentDescription",	EDXL_PFX);  
  public static final QName EDXL_ORIGINATOR_ROLE		= new QName(EDXL_NS, "originatorRole",	EDXL_PFX);
  public static final QName EDXL_CONSUMER_ROLE			= new QName(EDXL_NS, "consumerRole",	EDXL_PFX);  
  public static final QName EDXL_CONFIDENTIALITY		= new QName(EDXL_NS, "confidentiality",	EDXL_PFX);
  public static final QName EDXL_LANGUAGE				= new QName(EDXL_NS, "language",	EDXL_PFX); 
  public static final QName EDXL_XML_CONTENT			= new QName(EDXL_NS, "xmlContent",	EDXL_PFX);
  public static final QName EDXL_EMBEDDEDXML_CONTENT	= new QName(EDXL_NS, "embeddedXMLContent",	EDXL_PFX);
  public static final QName EDXL_KEYXML_CONTENT			= new QName(EDXL_NS, "keyXMLContent",	EDXL_PFX);
  public static final QName EDXL_EXPLICITADDRESS		= new QName(EDXL_NS, "explicitAddress",	EDXL_PFX);  
  public static final QName EDXL_EXPLICITADDRESS_SCHEME	= new QName(EDXL_NS, "explicitAddressScheme",	EDXL_PFX);
  public static final QName EDXL_EXPLICITADDRESS_VALUE	= new QName(EDXL_NS, "explicitAddressValue",	EDXL_PFX);
  public static final QName EDXL_DISTRIBUTION_REFERENCE	= new QName(EDXL_NS, "distributionReference",	EDXL_PFX);
  public static final QName EDXL_KEYWORD				= new QName(EDXL_NS, "keyword",	EDXL_PFX);  
  public static final QName EDXL_RECIPIENT_ROLE			= new QName(EDXL_NS, "recipientRole",	EDXL_PFX);
  public static final QName EDXL_SENDER_ROLE			= new QName(EDXL_NS, "senderRole",	EDXL_PFX);
  
 
  
  /* CAP */
  public static final String CAP_NS = "urn:oasis:names:tc:emergency:cap:1.1";
  
  /** @deprecated Use "urn:oasis:names:tc:emergency:cap:1.1" **/
  public static final String CAP_1_0_NS = "http://www.incident.com/cap/1.0";
  public static final String CAP_PFX = "";
  
  public static final QName CAP_ALERT            = new QName(CAP_NS, "alert",        CAP_PFX);
  public static final QName CAP_IDENTIFIER       = new QName(CAP_NS, "identifier",   CAP_PFX);
  public static final QName CAP_SENDER           = new QName(CAP_NS, "sender",       CAP_PFX);
  public static final QName CAP_SENT             = new QName(CAP_NS, "sent",         CAP_PFX);
  public static final QName CAP_STATUS           = new QName(CAP_NS, "status",       CAP_PFX);
  public static final QName CAP_MSGTYPE          = new QName(CAP_NS, "msgType",      CAP_PFX);
  public static final QName CAP_SOURCE           = new QName(CAP_NS, "source",       CAP_PFX);
  public static final QName CAP_SCOPE            = new QName(CAP_NS, "scope",        CAP_PFX);
  public static final QName CAP_RESTRICTION      = new QName(CAP_NS, "restriction",  CAP_PFX);
  public static final QName CAP_ADDRESSES        = new QName(CAP_NS, "addresses",    CAP_PFX);
  public static final QName CAP_CODE             = new QName(CAP_NS, "code",         CAP_PFX);
  public static final QName CAP_NOTE             = new QName(CAP_NS, "note",         CAP_PFX);
  public static final QName CAP_REFERENCES       = new QName(CAP_NS, "references",   CAP_PFX);
  public static final QName CAP_INCIDENTS        = new QName(CAP_NS, "incidents",    CAP_PFX);
  public static final QName CAP_INFO             = new QName(CAP_NS, "info",         CAP_PFX);
  public static final QName CAP_LANGUAGE         = new QName(CAP_NS, "language",     CAP_PFX);
  public static final QName CAP_CATEGORY         = new QName(CAP_NS, "category",     CAP_PFX);
  public static final QName CAP_EVENT            = new QName(CAP_NS, "event",        CAP_PFX);
  public static final QName CAP_RESPONSETYPE     = new QName(CAP_NS, "responseType", CAP_PFX);
  public static final QName CAP_URGENCY          = new QName(CAP_NS, "urgency",      CAP_PFX);
  public static final QName CAP_SEVERITY         = new QName(CAP_NS, "severity",     CAP_PFX);
  public static final QName CAP_CERTAINTY        = new QName(CAP_NS, "certainty",    CAP_PFX);
  public static final QName CAP_AUDIENCE         = new QName(CAP_NS, "audience",     CAP_PFX);
  public static final QName CAP_EVENTCODE        = new QName(CAP_NS, "eventCode",    CAP_PFX);
  public static final QName CAP_EFFECTIVE        = new QName(CAP_NS, "effective",    CAP_PFX);
  public static final QName CAP_ONSET            = new QName(CAP_NS, "onset",        CAP_PFX);
  public static final QName CAP_EXPIRES          = new QName(CAP_NS, "expires",      CAP_PFX);
  public static final QName CAP_SENDERNAME       = new QName(CAP_NS, "senderName",   CAP_PFX);
  public static final QName CAP_HEADLINE         = new QName(CAP_NS, "headline",     CAP_PFX);
  public static final QName CAP_DESCRIPTION      = new QName(CAP_NS, "description",  CAP_PFX);
  public static final QName CAP_INSTRUCTION      = new QName(CAP_NS, "instruction",  CAP_PFX);
  public static final QName CAP_WEB              = new QName(CAP_NS, "web",          CAP_PFX);
  public static final QName CAP_CONTACT          = new QName(CAP_NS, "contact",      CAP_PFX);
  public static final QName CAP_PARAMETER        = new QName(CAP_NS, "parameter",    CAP_PFX);
  public static final QName CAP_VALUENAME        = new QName(CAP_NS, "valueName",    CAP_PFX);
  public static final QName CAP_VALUE            = new QName(CAP_NS, "value",        CAP_PFX);
  public static final QName CAP_RESOURCE         = new QName(CAP_NS, "resource",     CAP_PFX);
  public static final QName CAP_RESOURCEDESC     = new QName(CAP_NS, "resourceDesc", CAP_PFX);
  public static final QName CAP_MIMETYPE         = new QName(CAP_NS, "mimeType",     CAP_PFX);
  public static final QName CAP_SIZE             = new QName(CAP_NS, "size",         CAP_PFX);
  public static final QName CAP_URI              = new QName(CAP_NS, "uri",          CAP_PFX);
  public static final QName CAP_DEREFURI         = new QName(CAP_NS, "derefUri",     CAP_PFX);
  public static final QName CAP_DIGEST           = new QName(CAP_NS, "digest",       CAP_PFX);
  public static final QName CAP_AREA             = new QName(CAP_NS, "area",         CAP_PFX);
  public static final QName CAP_AREADESC         = new QName(CAP_NS, "areaDesc",     CAP_PFX);
  public static final QName CAP_POLYGON          = new QName(CAP_NS, "polygon",      CAP_PFX);
  public static final QName CAP_CIRCLE           = new QName(CAP_NS, "circle",       CAP_PFX);
  public static final QName CAP_GEOCODE          = new QName(CAP_NS, "geocode",      CAP_PFX);
  public static final QName CAP_ALTITUDE         = new QName(CAP_NS, "altitude",     CAP_PFX);
  public static final QName CAP_CEILING          = new QName(CAP_NS, "ceiling",      CAP_PFX);
  
  public static final QName CAP_1_0_ALERT        = new QName(CAP_1_0_NS, "alert",        CAP_PFX);
  public static final QName CAP_1_0_IDENTIFIER   = new QName(CAP_1_0_NS, "identifier",   CAP_PFX);
  public static final QName CAP_1_0_SENDER       = new QName(CAP_1_0_NS, "sender",       CAP_PFX);
  public static final QName CAP_1_0_PASSWORD     = new QName(CAP_1_0_NS, "password",     CAP_PFX);
  public static final QName CAP_1_0_SOURCE       = new QName(CAP_1_0_NS, "source",       CAP_PFX);
  public static final QName CAP_1_0_SENT         = new QName(CAP_1_0_NS, "sent",         CAP_PFX);
  public static final QName CAP_1_0_STATUS       = new QName(CAP_1_0_NS, "status",       CAP_PFX);
  public static final QName CAP_1_0_SCOPE        = new QName(CAP_1_0_NS, "scope",        CAP_PFX);
  public static final QName CAP_1_0_RESTRICTION  = new QName(CAP_1_0_NS, "restriction",  CAP_PFX);
  public static final QName CAP_1_0_ADDRESSES    = new QName(CAP_1_0_NS, "addresses",    CAP_PFX);
  public static final QName CAP_1_0_CODE         = new QName(CAP_1_0_NS, "code",         CAP_PFX);
  public static final QName CAP_1_0_MSGTYPE      = new QName(CAP_1_0_NS, "msgType",      CAP_PFX);
  public static final QName CAP_1_0_NOTE         = new QName(CAP_1_0_NS, "note",         CAP_PFX);
  public static final QName CAP_1_0_REFERENCES   = new QName(CAP_1_0_NS, "references",   CAP_PFX);
  public static final QName CAP_1_0_INCIDENTS    = new QName(CAP_1_0_NS, "incidents",    CAP_PFX);
  public static final QName CAP_1_0_INFO         = new QName(CAP_1_0_NS, "info",         CAP_PFX);
  public static final QName CAP_1_0_LANGUAGE     = new QName(CAP_1_0_NS, "language",     CAP_PFX);
  public static final QName CAP_1_0_CATEGORY     = new QName(CAP_1_0_NS, "category",     CAP_PFX);
  public static final QName CAP_1_0_EVENT        = new QName(CAP_1_0_NS, "event",        CAP_PFX);
  public static final QName CAP_1_0_URGENCY      = new QName(CAP_1_0_NS, "urgency",      CAP_PFX);
  public static final QName CAP_1_0_SEVERITY     = new QName(CAP_1_0_NS, "severity",     CAP_PFX);
  public static final QName CAP_1_0_CERTAINTY    = new QName(CAP_1_0_NS, "certainty",    CAP_PFX);
  public static final QName CAP_1_0_AUDIENCE     = new QName(CAP_1_0_NS, "audience",     CAP_PFX);
  public static final QName CAP_1_0_EVENTCODE    = new QName(CAP_1_0_NS, "eventCode",    CAP_PFX);
  public static final QName CAP_1_0_EFFECTIVE    = new QName(CAP_1_0_NS, "effective",    CAP_PFX);
  public static final QName CAP_1_0_ONSET        = new QName(CAP_1_0_NS, "onset",        CAP_PFX);
  public static final QName CAP_1_0_EXPIRES      = new QName(CAP_1_0_NS, "expires",      CAP_PFX);
  public static final QName CAP_1_0_SENDERNAME   = new QName(CAP_1_0_NS, "senderName",   CAP_PFX);
  public static final QName CAP_1_0_HEADLINE     = new QName(CAP_1_0_NS, "headline",     CAP_PFX);
  public static final QName CAP_1_0_DESCRIPTION  = new QName(CAP_1_0_NS, "description",  CAP_PFX);
  public static final QName CAP_1_0_INSTRUCTION  = new QName(CAP_1_0_NS, "instruction",  CAP_PFX);
  public static final QName CAP_1_0_WEB          = new QName(CAP_1_0_NS, "web",          CAP_PFX);
  public static final QName CAP_1_0_CONTACT      = new QName(CAP_1_0_NS, "contact",      CAP_PFX);
  public static final QName CAP_1_0_PARAMETER    = new QName(CAP_1_0_NS, "parameter",    CAP_PFX);
  public static final QName CAP_1_0_RESOURCE     = new QName(CAP_1_0_NS, "resource",     CAP_PFX);
  public static final QName CAP_1_0_RESOURCEDESC = new QName(CAP_1_0_NS, "resourceDesc", CAP_PFX);
  public static final QName CAP_1_0_MIMETYPE     = new QName(CAP_1_0_NS, "mimeType",     CAP_PFX);
  public static final QName CAP_1_0_SIZE         = new QName(CAP_1_0_NS, "size",         CAP_PFX);
  public static final QName CAP_1_0_URI          = new QName(CAP_1_0_NS, "uri",          CAP_PFX);
  public static final QName CAP_1_0_DEREFURI     = new QName(CAP_1_0_NS, "derefUri",     CAP_PFX);
  public static final QName CAP_1_0_DIGEST       = new QName(CAP_1_0_NS, "digest",       CAP_PFX);
  public static final QName CAP_1_0_AREA         = new QName(CAP_1_0_NS, "area",         CAP_PFX);
  public static final QName CAP_1_0_AREADESC     = new QName(CAP_1_0_NS, "areaDesc",     CAP_PFX);
  public static final QName CAP_1_0_POLYGON      = new QName(CAP_1_0_NS, "polygon",      CAP_PFX);
  public static final QName CAP_1_0_CIRCLE       = new QName(CAP_1_0_NS, "circle",       CAP_PFX);
  public static final QName CAP_1_0_GEOCODE      = new QName(CAP_1_0_NS, "geocode",      CAP_PFX);
  public static final QName CAP_1_0_ALTITUDE     = new QName(CAP_1_0_NS, "altitude",     CAP_PFX);
  public static final QName CAP_1_0_CEILING      = new QName(CAP_1_0_NS, "ceiling",      CAP_PFX);
  public static final QName CAP_1_0_RESPONSETYPE = new QName(CAP_1_0_NS, "responseType", CAP_PFX);
   
}
