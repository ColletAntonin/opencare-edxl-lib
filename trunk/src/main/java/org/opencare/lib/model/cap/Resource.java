package org.opencare.lib.model.cap;

import java.io.IOException;
import java.io.InputStream;

import javax.activation.MimeType;
import javax.activation.MimeTypeParseException;

import org.apache.abdera.i18n.iri.IRI;
import org.apache.abdera.model.Element;
import org.apache.abdera.model.ExtensibleElement;

/**
 * A resource associated with an alert
 */
public interface Resource extends ExtensibleElement, Element {

	/** Text describing the resource * */
	String getDescription();

	/** Text describing the resource * */
	void setDescription(String description);

	/** MIME media type of the resource * */
	MimeType getMimeType() throws MimeTypeParseException;

	/** MIME media type of the resource * */
	void setMimeType(MimeType mimeType);

	/** MIME media type of the resource * */
	void setMimeType(String mimeType) throws MimeTypeParseException;

	/** Size of the events as number of octets * */
	long getSize();

	/** Size of the events as number of octets * */
	void setSize(long size);

	/** Location of the resource * */
	IRI getUri();

	/** Location of the resource * */
	void setUri(IRI uri);

	/** Location of the resource * */
	void setUri(String uri);

	/** Base64 encoded representation of the resource * */
	void setDerefUri();

	/** Base64 encoded representation of the resource * */
	void setDerefUri(InputStream in);

	/** Base64 encoded representation of the resource * */
	void setDerefUri(String uri);

	/** Base64 encoded representation of the resource * */
	InputStream getDerefUri() throws IOException;

	/** MD5 digest of the resource * */
	String getDigest();

	/** MD5 digest of the resource * */
	void setDigest(String hash);

}
