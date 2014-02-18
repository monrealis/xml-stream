package eu.vytenis.xs.out;

import java.io.InputStream;

import eu.vytenis.xs.model.XsNodeList;
import eu.vytenis.xs.transformers.XsTransformer;

public class NodeListToOs implements XsTransformer<XsNodeList, InputStream> {

	public InputStream transform(XsNodeList from) {
		throw new UnsupportedOperationException();
	}

}
