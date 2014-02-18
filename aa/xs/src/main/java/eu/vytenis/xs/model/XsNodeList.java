package eu.vytenis.xs.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class XsNodeList {
	private List<XsNode> nodes = new ArrayList<XsNode>();

	public List<XsNode> getNodes() {
		return Collections.unmodifiableList(nodes);
	}

}
