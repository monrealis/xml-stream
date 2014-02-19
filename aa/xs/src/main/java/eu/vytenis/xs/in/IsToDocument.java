package eu.vytenis.xs.in;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.stream.StreamSource;

import org.w3c.dom.Document;

import eu.vytenis.xs.exc.XsException;
import eu.vytenis.xs.io.Bytes;
import eu.vytenis.xs.io.Streams;
import eu.vytenis.xs.io.Strings;
import eu.vytenis.xs.transformers.XsTransformer;

public class IsToDocument implements XsTransformer<InputStream, Document> {

	public Document transform(InputStream from) {
		DOMResult dr = new DOMResult();
		transform(from, dr);
		return (Document) dr.getNode();
	}

	private void transform(InputStream from, DOMResult dr) {
		try {
			createTransformer().transform(createSource(from), dr);
		} catch (TransformerException e) {
			throw new XsException(e);
		}
	}

	private StreamSource createSource(InputStream from) {
		byte[] bytes = Bytes.join(Strings.getBytes("<xt.root>\n"), Streams.read(from), Strings.getBytes("\n</xt.root>"));
		return new StreamSource(new ByteArrayInputStream(bytes));
	}

	private Transformer createTransformer() {
		try {
			return createFactory().newTransformer();
		} catch (TransformerConfigurationException e) {
			throw new XsException(e);
		}
	}

	private TransformerFactory createFactory() {
		return TransformerFactory.newInstance();
	}

}
