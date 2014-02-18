package eu.vytenis.xs.in;

import java.io.InputStream;

import eu.vytenis.xs.model.XsNodeList;
import eu.vytenis.xs.transformers.XsTransformer;

public class IsToNodeList implements XsTransformer<InputStream, XsNodeList> {

	public XsNodeList transform(InputStream from) {
		throw new UnsupportedOperationException();
	}

}
