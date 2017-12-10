package json.destiny2.model.exceptions;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.SerializedName;

/**
 * Possible errors when requesting to the endpoint:
 * <pre>
 * PlatformErrorCodes.None = 0
 * PlatformErrorCodes.Success = 1
 * PlatformErrorCodes.TransportException = 2
 * PlatformErrorCodes.UnhandledException = 3
 * PlatformErrorCodes.NotImplemented = 4
 * PlatformErrorCodes.SystemDisabled = 5
 * PlatformErrorCodes.FailedToLoadAvailableLocalesConfiguration = 6
 * PlatformErrorCodes.ParameterParseFailure = 7
 * PlatformErrorCodes.ParameterInvalidRange = 8
 * PlatformErrorCodes.BadRequest = 9
 * PlatformErrorCodes.AuthenticationInvalid = 10
 * PlatformErrorCodes.DataNotFound = 11
 * PlatformErrorCodes.InsufficientPrivileges = 12
 * PlatformErrorCodes.Duplicate = 13
 * PlatformErrorCodes.UnknownSqlResult = 14
 * </pre>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public enum PlatformErrorCodes {

	@SerializedName("0") None,
	@SerializedName("1") Success,
	@SerializedName("2") TransportException,
	@SerializedName("3") UnhandledException,
	@SerializedName("4") NotImplemented,
	@SerializedName("5") SystemDisabled,
	@SerializedName("6") FailedToLoadAvailableLocalesConfiguration,
	@SerializedName("7") ParameterParseFailure,
	@SerializedName("8") ParameterInvalidRange,
	@SerializedName("9") BadRequest,
	@SerializedName("10") AuthenticationInvalid,
	@SerializedName("11") DataNotFound,
	@SerializedName("12") InsufficientPrivileges,
	@SerializedName("13") Duplicate,
	@SerializedName("14") UnknownSqlResult;

}
