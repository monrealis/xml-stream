package eu.vytenis.xs.in;

import java.io.InputStream;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import eu.vytenis.xs.io.Streams;
import eu.vytenis.xs.transformers.XsTransformer;

public class IsToHtmlDocument implements XsTransformer<InputStream, Document> {

	public Document transform(InputStream from) {
		return Jsoup.parse(Streams.readString(from));
	}

}
