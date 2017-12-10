package json.destiny2.model.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

import json.destiny2.model.exceptions.PlatformErrorCodes;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class Response {

	@JsonProperty("ErrorCode")
	@SerializedName("ErrorCode")
	private PlatformErrorCodes errorCode;
	
	@JsonProperty("ThrottleSeconds")
	@SerializedName("ThrottleSeconds")
	private Integer throttleSeconds;
	
	@JsonProperty("ErrorStatus")
	@SerializedName("ErrorStatus")
	private String errorStatus;
	
	@JsonProperty("Message")
	@SerializedName("Message")
	private String message;

	public PlatformErrorCodes getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(PlatformErrorCodes errorCode) {
		this.errorCode = errorCode;
	}

	public Integer getThrottleSeconds() {
		return throttleSeconds;
	}

	public void setThrottleSeconds(Integer throttleSeconds) {
		this.throttleSeconds = throttleSeconds;
	}

	public String getErrorStatus() {
		return errorStatus;
	}

	public void setErrorStatus(String errorStatus) {
		this.errorStatus = errorStatus;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((errorCode == null) ? 0 : errorCode.hashCode());
		result = prime * result + ((errorStatus == null) ? 0 : errorStatus.hashCode());
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		result = prime * result + ((throttleSeconds == null) ? 0 : throttleSeconds.hashCode());
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
		Response other = (Response) obj;
		if (errorCode != other.errorCode)
			return false;
		if (errorStatus == null) {
			if (other.errorStatus != null)
				return false;
		} else if (!errorStatus.equals(other.errorStatus))
			return false;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		if (throttleSeconds == null) {
			if (other.throttleSeconds != null)
				return false;
		} else if (!throttleSeconds.equals(other.throttleSeconds))
			return false;
		return true;
	}
	
	
}
