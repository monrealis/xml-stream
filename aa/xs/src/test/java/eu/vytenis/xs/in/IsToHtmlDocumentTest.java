package eu.vytenis.xs.in;

import java.io.ByteArrayInputStream;

import org.junit.Test;

public class IsToHtmlDocumentTest {

	@Test
	public void transformHtmlSucceeds() {
		String html = "<html><link src=''><body><h1>a</h1><p>one<p>two</body></html>";
		new IsToHtmlDocument().transform(new ByteArrayInputStream(html.getBytes()));
	}

}
