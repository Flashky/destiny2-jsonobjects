package json.destiny2.test.ignores;

import json.destiny2.model.ignores.IgnoreStatus;


/**
 * Auxiliar class for wrapping an enum for testing purposes.
 *
 */
public class IgnoreStatusWrapper {
	
	private IgnoreStatus ignoreFlags;

	public IgnoreStatus getIgnoreFlags() {
		return ignoreFlags;
	}

	public void setIgnoreFlags(IgnoreStatus ignoreFlags) {
		this.ignoreFlags = ignoreFlags;
	}


}
