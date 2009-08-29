/**
 * 
 */
package org.opencare.lib.model.cap;

import java.util.Date;
import java.util.List;

import org.apache.abdera.i18n.iri.IRI;
import org.apache.abdera.model.Element;
import org.apache.abdera.model.ExtensibleElement;

/**
 * @author nontster
 * 
 */
public interface Info extends ExtensibleElement, Element {
	/** Category of the event * */
	public enum Category {
		/** Geophysical * */
		Geo,
		/** Meteorological * */
		Met,
		/** General emergency and public safety * */
		Safety,
		/** Law enforcement, military, homeland and local/private security * */
		Security,
		/** Rescue and recovery * */
		Rescue,
		/** Fire suppression and rescue * */
		Fire,
		/** Medical and public health * */
		Health,
		/** Environmental * */
		Env,
		/** Public and private transportation * */
		Transport,
		/** Utility, telecommunication, other non-transport infrastructure * */
		Infra,
		/**
		 * Chemical, Biological, Radiological, Nuclear or High-Yield Explosive
		 * threat or attack *
		 */
		CBRNE,
		/** Other events * */
		Other
	}

	/** The recommended response * */
	public enum Response {
		/** Take shelter in place or per instruction * */
		Shelter,
		/** Evacuate as instructed * */
		Evacuate,
		/** Prepare as instructed * */
		Prepare,
		/** Execute a pre-planned activity as instructed * */
		Execute,
		/** Monitor information sources as instructed * */
		Monitor,
		/** Evaluate the information in this message * */
		Assess,
		/** No action recommended * */
		None
	}

	/** The urgency of the situation * */
	public enum Urgency {
		/** Respond immediately to the situation * */
		Immediate,
		/** Response should be taken soon * */
		Expected,
		/** Response should be taken in the near future * */
		Future,
		/** Response is no longer required * */
		Past,
		/** Urgency is not known * */
		Unknown
	}

	/** The severity of the situation * */
	public enum Severity {
		/** Extraordinary threat to life and property * */
		Extreme,
		/** Significant threat to life and property * */
		Severe,
		/** Possible threat to life and property * */
		Moderate,
		/** Minimal threat to life and property * */
		Minor,
		/** Severity unknown * */
		Unknown
	}

	/** The certainty of the situation * */
	public enum Certainty {
		/** Determined to be observed or ongoing * */
		Observed,
		/** Probability greater than ~50% * */
		Likely,
		/** Probability less than or equal to ~50% * */
		Possible,
		/** Not expected to occur. Probability equal to 0% * */
		Unlikely,
		/** Certainty unknown * */
		Unknown,
		/**
		 * Equivalent to Likely
		 * 
		 * @deprecated *
		 */
		Very_Likely
	}



	/** Listing of Categories describing the situation * */
	Category[] getCategories();

	/** Listing of Categories describing the situation * */
	void setCategories(Category category);

	/** Listing of Categories describing the situation * */
	void setCategories(Category... categories);

	/** Text describing the event * */
	String getEvent();

	/** Text describing the event * */
	void setEvent(String event);

	/** Listing of the expected responses * */
	Response[] getResponses();

	/** Listing of the expected responses * */
	void setResponses(Response response);

	/** Listing of the expected responses * */
	void setResponses(Response... responses);

	/** The urgency of the situation * */
	Urgency getUrgency();

	/** The urgency of the situation * */
	void setUrgency(Urgency urgency);

	/** The severity of the situation * */
	Severity getSeverity();

	/** The severity of the situation * */
	void setSeverity(Severity severity);

	/** The certainty of the situation * */
	Certainty getCertainty();

	/** The certainty of the situation * */
	void setCertainty(Certainty certainty);

	/** Text describing the intended audience of the alert * */
	String getAudience();

	/** Text describing the intended audience of the alert * */
	void setAudience(String audience);

	/** Application specific code describing the event * */
	List<NameValue> getEventCodes();

	/** Application specific code describing the event * */
	String getEventCode(String name);

	/** Application specific code describing the event * */
	void addEventCode(String name, String value);

	/** Application specific code describing the event * */
	void addEventCode(NameValue eventCode);

	/** The effective date and time of the information in the alert * */
	Date getEffective();

	/** The effective date and time of the information in the alert * */
	void setEffective(Date effective);

	/** The expected date and time of the beginning of the situation * */
	Date getOnset();

	/** The expected date and time of the beginning of the situation * */
	void setOnset(Date onset);

	/** The expiry date and time of the alert information * */
	Date getExpires();

	/** The expiry date and time of the alert information * */
	void setExpires(Date expires);

	/** Text naming the originator of the alert information * */
	String getSenderName();

	/** Text naming the originator of the alert information * */
	void setSenderName(String name);

	/**
	 * Text describing the headline of the alert information (brief, human
	 * readable, direct and actionable) *
	 */
	String getHeadline();

	/**
	 * Text describing the headline of the alert information (brief, human
	 * readable, direct and actionable) *
	 */
	void setHeadline(String headline);

	/** Text describing the event * */
	String getDescription();

	/** Text describing the event * */
	void setDescription(String description);

	/** Text describing the recommended action to be taken * */
	String getInstructions();

	/** Text describing the recommended action to be taken * */
	void setInstructions(String instructions);

	/**
	 * A full, absolute URL for an HTML or text resource with additional
	 * information about the situation *
	 */
	IRI getWeb();

	/**
	 * A full, absolute URL for an HTML or text resource with additional
	 * information about the situation *
	 */
	void setWeb(IRI web);

	/**
	 * A full, absolute URL for an HTML or text resource with additional
	 * information about the situation *
	 */
	void setWeb(String web);

	/**
	 * Text describing the contact for follow-up and confirmation of the alert
	 * information *
	 */
	String getContact();

	/**
	 * Text describing the contact for follow-up and confirmation of the alert
	 * information *
	 */
	void setContact(String contact);

	/** Application specific parameters associated with the alert * */
	List<NameValue> getParameters();

	/** Application specific parameters associated with the alert * */
	String getParameter(String name);

	/** Application specific parameters associated with the alert * */
	void addParameter(String name, String value);

	/** Application specific parameters associated with the alert * */
	void addParameter(NameValue parameter);

	/** Listing of resources associated with this alert * */
	List<Resource> getResources();

	/** Listing of areas associated with this alert * */
	List<Area> getAreas();

	/** Listing of areas associated with this alert * */
	Area addArea();

	/** Listing of resources associated with this alert * */
	Resource addResource();
	
	/** RFC 3066 natural language identifier * */
	String getLanguage();

	/** RFC 3066 natural language identifier * */		
	<T extends Element>T setLanguage(String language);
	
}
