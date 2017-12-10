package json.destiny2.model.user;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import json.destiny2.model.ignores.IgnoreResponse;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserToUserContext {

	private Boolean isFollowing;
	private Date globalIgnoreEndDate;
	
	//@JsonProperty("ignoreStatus")
	private IgnoreResponse ignoreStatus;
	
	public Boolean getIsFollowing() {
		return isFollowing;
	}
	public void setIsFollowing(Boolean isFollowing) {
		this.isFollowing = isFollowing;
	}
	public Date getGlobalIgnoreEndDate() {
		return globalIgnoreEndDate;
	}
	public void setGlobalIgnoreEndDate(Date globalIgnoreEndDate) {
		this.globalIgnoreEndDate = globalIgnoreEndDate;
	}
	public IgnoreResponse getIgnoreStatus() {
		return ignoreStatus;
	}
	public void setIgnoreStatus(IgnoreResponse ignoreStatus) {
		this.ignoreStatus = ignoreStatus;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((globalIgnoreEndDate == null) ? 0 : globalIgnoreEndDate.hashCode());
		result = prime * result + ((ignoreStatus == null) ? 0 : ignoreStatus.hashCode());
		result = prime * result + ((isFollowing == null) ? 0 : isFollowing.hashCode());
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
		UserToUserContext other = (UserToUserContext) obj;
		if (globalIgnoreEndDate == null) {
			if (other.globalIgnoreEndDate != null)
				return false;
		} else if (!globalIgnoreEndDate.equals(other.globalIgnoreEndDate))
			return false;
		if (ignoreStatus == null) {
			if (other.ignoreStatus != null)
				return false;
		} else if (!ignoreStatus.equals(other.ignoreStatus))
			return false;
		if (isFollowing == null) {
			if (other.isFollowing != null)
				return false;
		} else if (!isFollowing.equals(other.isFollowing))
			return false;
		return true;
	}

	
	
	
}
