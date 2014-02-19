package eu.vytenis.xs.in;

import static org.junit.Assert.assertNotNull;

import java.io.ByteArrayInputStream;

import org.junit.Test;
import org.w3c.dom.Document;

import eu.vytenis.xs.exc.XsException;

public class IsToDocumentTest {

	@Test
	public void singleElementSucceeds() {
		assertNotNull(transform("<root />"));
	}

	@Test(expected = XsException.class)
	public void singleElementNsFails() {
		assertNotNull(transform("<a:root />"));
	}

	@Test
	public void singleElementNsSucceeds() {
		assertNotNull(transform("<a:root xmlns:a='urn:test:test' />"));
	}

	@Test
	public void multipleElementSucceeds() {
		assertNotNull(transform("<root /> <x />"));
	}

	@Test
	public void singleAttributeSucceeds() {
		assertNotNull(transform("a = 'b'"));
	}

	@Test
	public void multipleAttributesSucceeds() {
		assertNotNull(transform("a='b' c=\"\""));
	}

	private Document transform(String xml) {
		byte[] bytes = xml.getBytes();
		return new IsToDocument().transform(new ByteArrayInputStream(bytes));
	}

}
