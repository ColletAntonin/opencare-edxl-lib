/**
 * 
 */
package org.opencare.lib.model.cap;

import java.util.Date;
import java.util.List;

import org.apache.abdera.model.Element;
import org.apache.abdera.model.ExtensibleElement;

/**
 * @author nontster
 * 
 */
public interface Alert extends ExtensibleElement, Element {
	/** The status of the Alert * */
	public enum Status {
		/** An actionable alert * */
		Actual,
		/** Actionable only by designated excercise participants * */
		Exercise,
		/** Messages that support alert network internal functions * */
		System,
		/** Technical testing only * */
		Test,
		/** Preliminary template or draft * */
		Draft
	}

	/** The type of Alert document * */
	public enum Type {
		/** Initial situation report * */
		Alert,
		/** Updates and supercedes earlier alerts * */
		Update,
		/** Cancels earlier alerts * */
		Cancel,
		/** Acknowledges receipt of earlier alerts * */
		Ack,
		/** Reports an error condition * */
		Error
	}

	/** The intended distribution of the alert * */
	public enum Scope {
		/** For general dissemination to unrestricted audiences * */
		Public,
		/** For dissemination only to users with a need-to-know * */
		Restricted,
		/** For dissemination only to specified recipients * */
		Private
	}

	/** The unique identifier of the Alert * */
	String getIdentifier();

	/** The unique identifier of the Alert * */
	void setIdentifier(String id);

	/** The globally unique identifier of the Sender * */
	String getSender();

	/** The globally unique identifier of the Sender * */
	void setSender(String sender);

	/** The date and time the alert was generated and transmitted * */
	Date getSent();

	/** The date and time the alert was generated and transmitted * */
	void setSent(Date sent);
	
	/** The status of the alert * */
	Status getStatus();

	/** The status of the alert * */
	void setStatus(Status status);

	/** The type of alert * */
	Type getType();

	/** The type of alert * */
	void setType(Type type);

	/** Text identifying the source of the alert. * */
	String getSource();

	/** Text identifying the source of the alert. * */
	void setSource(String source);

	/** The scope of the alert * */
	Scope getScope();

	/** The scope of the alert * */
	void setScope(Scope scope);

	/** Text describing the dissemination restrictions associated with the alert * */
	String getRestriction();

	/** Text describing the dissemination restrictions associated with the alert * */
	void setRestriction(String restriction);

	/** Listing of intended recipients of private alert documents * */
	String[] getAddresses();

	/** Listing of intended recipients of private alert documents * */
	void setAddresses(String addresses);

	/** Listing of intended recipients of private alert documents * */
	void setAddresses(String... addresses);

	/** Listing of codes denoting special handling of the alert message * */
	String[] getCodes();

	/** Listing of codes denoting special handling of the alert message * */
	void setCodes(String code);

	/** Listing of codes denoting special handling of the alert message * */
	void setCodes(String... codes);

	/**
	 * Optional text describing the purpose or significance of the alert
	 * document *
	 */
	String getNote();

	/**
	 * Optional text describing the purpose or significance of the alert
	 * document *
	 */
	void setNote(String note);

	/**
	 * Listing of identifiers of earlier alert documents referenced by this
	 * alert *
	 */
	String[] getReferences();

	/**
	 * Listing of identifiers of earlier alert documents referenced by this
	 * alert *
	 */
	void setReferences(String id);

	/**
	 * Listing of identifiers of earlier alert documents referenced by this
	 * alert *
	 */
	void setReferences(String... ids);

	/** Listing of identifiers of earlier alerts related to this alert * */
	String[] getIncidents();

	/** Listing of identifiers of earlier alerts related to this alert * */
	void setIncidents(String id);

	/** Listing of identifiers of earlier alerts related to this alert * */
	void setIncidents(String... ids);

	/** Listing of info objects contained by this alert * */
	List<Info> getInfo();

	/** Listing of info objects contained by this alert * */
	void addInfo(Info info);

	/** Listing of info objects contained by this alert * */
	Info addInfo();
}
