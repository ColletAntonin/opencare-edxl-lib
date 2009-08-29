/**
 * 
 */
package org.opencare.lib.model.cap;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javax.activation.DataHandler;
import javax.activation.MimeType;
import javax.activation.MimeTypeParseException;
import javax.xml.namespace.QName;

import org.apache.abdera.factory.Factory;
import org.apache.abdera.i18n.iri.IRI;
import org.apache.abdera.i18n.text.io.InputStreamDataSource;
import org.apache.abdera.model.Element;
import org.apache.axiom.attachments.utils.DataHandlerUtils;
import org.opencare.lib.model.BaseWrapper;
import org.opencare.lib.model.Constants;

/**
 * @author nontster
 * 
 */
public class ResourceWrapper extends BaseWrapper implements Resource, Constants {

	/**
	 * @param internal
	 */
	public ResourceWrapper(Element internal) {
		super(internal);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param factory
	 * @param qname
	 */
	public ResourceWrapper(Factory factory, QName qname) {
		super(factory, qname);
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Resource#getDerefUri()
	 */
	@Override
	public InputStream getDerefUri() throws IOException {
		// TODO Auto-generated method stub
		Element el = getExtension(CAP_DEREFURI);
		if (el == null)
			getExtension(CAP_1_0_DEREFURI);
		if (el == null)
			return null;
		DataHandler dh = null;
		dh = (DataHandler) DataHandlerUtils.getDataHandlerFromText(
				el.getText(), null);
		return (InputStream) dh.getContent();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Resource#getDescription()
	 */
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		String desc = getSimpleExtension(CAP_RESOURCEDESC);
		if (desc == null)
			desc = getSimpleExtension(CAP_1_0_RESOURCEDESC);
		return desc;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Resource#getDigest()
	 */
	@Override
	public String getDigest() {
		// TODO Auto-generated method stub
		String digest = getSimpleExtension(CAP_DIGEST);
		if (digest == null)
			digest = getSimpleExtension(CAP_1_0_DIGEST);
		return digest;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Resource#getMimeType()
	 */
	@Override
	public MimeType getMimeType() throws MimeTypeParseException {
		// TODO Auto-generated method stub
		String mt = getSimpleExtension(CAP_MIMETYPE);
		if (mt == null)
			mt = getSimpleExtension(CAP_1_0_MIMETYPE);
		return mt == null ? null : new MimeType(mt);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Resource#getSize()
	 */
	@Override
	public long getSize() {
		// TODO Auto-generated method stub
		String s = getSimpleExtension(CAP_SIZE);
		if (s == null)
			s = getSimpleExtension(CAP_1_0_SIZE);
		return s == null ? -1 : Long.valueOf(s);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Resource#getUri()
	 */
	@Override
	public IRI getUri() {
		// TODO Auto-generated method stub
		String iri = getSimpleExtension(CAP_URI);
		if (iri == null)
			iri = getSimpleExtension(CAP_1_0_URI);
		return iri == null ? null : new IRI(iri);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Resource#setDerefUri()
	 */
	@Override
	public void setDerefUri() {
		// TODO Auto-generated method stub
		if (getUri() == null)
			throw new IllegalStateException("URI is null");
		try {
			URL url = getUri().toURL();
			DataHandler dataHandler = new DataHandler(url);
			setDerefUri(dataHandler);
		} catch (Exception e) {
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Resource#setDerefUri(java.io.InputStream)
	 */
	@Override
	public void setDerefUri(InputStream in) {
		// TODO Auto-generated method stub
		try {
			DataHandler dataHandler = new DataHandler(
					new InputStreamDataSource(in));
			setDerefUri(dataHandler);
		} catch (Exception e) {
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Resource#setDerefUri(java.lang.String)
	 */
	@Override
	public void setDerefUri(String uri) {
		// TODO Auto-generated method stub
		try {
			DataHandler dataHandler = new DataHandler(new URL(uri));
			setDerefUri(dataHandler);
		} catch (Exception e) {
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Resource#setDescription(java.lang.String)
	 */
	@Override
	public void setDescription(String description) {
		// TODO Auto-generated method stub
		setElementText(CAP_RESOURCEDESC, description, CAP_1_0_RESOURCEDESC);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Resource#setDigest(java.lang.String)
	 */
	@Override
	public void setDigest(String hash) {
		// TODO Auto-generated method stub
		setElementText(CAP_DIGEST, hash, CAP_1_0_DIGEST);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Resource#setMimeType(javax.activation.MimeType)
	 */
	@Override
	public void setMimeType(MimeType mimeType) {
		// TODO Auto-generated method stub
		if (mimeType != null)
			setElementText(CAP_MIMETYPE, mimeType.toString(), CAP_1_0_MIMETYPE);
		else
			removeElement(CAP_MIMETYPE, CAP_1_0_MIMETYPE);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Resource#setMimeType(java.lang.String)
	 */
	@Override
	public void setMimeType(String mimeType) throws MimeTypeParseException {
		// TODO Auto-generated method stub
		setMimeType(mimeType == null ? null : new MimeType(mimeType));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Resource#setSize(long)
	 */
	@Override
	public void setSize(long size) {
		// TODO Auto-generated method stub
		if (size > -1)
			setElementText(CAP_SIZE, String.valueOf(size), CAP_1_0_SIZE);
		else
			removeElement(CAP_SIZE, CAP_1_0_SIZE);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Resource#setUri(org.apache.abdera.i18n.iri.IRI)
	 */
	@Override
	public void setUri(IRI uri) {
		// TODO Auto-generated method stub
		if (uri != null)
			setElementText(CAP_URI, uri.toASCIIString(), CAP_1_0_URI);
		else
			removeElement(CAP_URI, CAP_1_0_URI);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.opencare.model.Resource#setUri(java.lang.String)
	 */
	@Override
	public void setUri(String uri) {
		// TODO Auto-generated method stub
		setUri(new IRI(uri));
	}

	private void setDerefUri(DataHandler dataHandler) {
		Element el = getExtension(CAP_DEREFURI);
		if (el == null)
			getExtension(CAP_1_0_DEREFURI);
		if (el == null)
			el = addExtension(CAP_DEREFURI);
		el.setText(dataHandler);
	}
}
