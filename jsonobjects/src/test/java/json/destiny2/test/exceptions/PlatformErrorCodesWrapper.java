package json.destiny2.test.exceptions;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

import json.destiny2.model.exceptions.PlatformErrorCodes;

/**
 * Auxiliar class for wrapping an enum for testing purposes.
 *
 */
public class PlatformErrorCodesWrapper {
	
	@JsonProperty("ErrorCode")
	@SerializedName("ErrorCode")
	private PlatformErrorCodes errorCode;

	public PlatformErrorCodes getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(PlatformErrorCodes errorCode) {
		this.errorCode = errorCode;
	}
	
	
}
