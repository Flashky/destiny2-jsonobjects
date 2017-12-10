package json.destiny2.model.ignores;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class IgnoreResponse {

	/** Determines if a user is ignored or not. */
	private Boolean isIgnored;
	
	/** Determines the kind of ignore in the case of the user being ignored. */
	private IgnoreStatus ignoreFlags;

	/**
	 * 
	 * @return
	 */
	public boolean getIsIgnored() {
		return isIgnored;
	}

	public void setIsIgnored(Boolean isIgnored) {
		this.isIgnored = isIgnored;
	}

	/**
	 * Returns the kind of ignore that it is being applied to an user.
	 * @return {@link IgnoreStatus IgnoreStatus.NotIgnored} if the user is not ignored.
	 * In other case, it returns the kind of ignore applied.
	 */
	public IgnoreStatus getIgnoreFlags() {
		return ignoreFlags;
	}

	public void setIgnoreFlags(IgnoreStatus ignoreFlags) {
		this.ignoreFlags = ignoreFlags;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ignoreFlags == null) ? 0 : ignoreFlags.hashCode());
		result = prime * result + ((isIgnored == null) ? 0 : isIgnored.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IgnoreResponse other = (IgnoreResponse) obj;
		if (ignoreFlags != other.ignoreFlags)
			return false;
		if (isIgnored == null) {
			if (other.isIgnored != null)
				return false;
		} else if (!isIgnored.equals(other.isIgnored))
			return false;
		return true;
	}


	
	
	
	
}
