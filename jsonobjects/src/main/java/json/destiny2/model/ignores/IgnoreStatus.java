package json.destiny2.model.ignores;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.SerializedName;

/**
 * Possible ignore values of a user:
 * <pre>
 * IgnoreStatus.NotIgnored = 0
 * IgnoreStatus.IgnoredUser = 1
 * IgnoreStatus.IgnoredGroup = 2
 * IgnoreStatus.IgnoredByGroup = 4
 * IgnoreStatus.IgnoredPost = 8
 * IgnoreStatus.IgnoredTag = 16
 * IgnoreStatus.IgnoredGlobal = 32
 * </pre>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public enum IgnoreStatus {

	@SerializedName("0") NotIgnored(0),
	@SerializedName("1") IgnoredUser(1),
	@SerializedName("2") IgnoredGroup(2),
	@SerializedName("4") IgnoredByGroup(4),
	@SerializedName("8") IgnoredPost(8),
	@SerializedName("16") IgnoredTag(16),
	@SerializedName("32") IgnoredGlobal(32);
	
	private Integer value;
	private IgnoreStatus(Integer value)
	{
		this.value = value;
	}
	

	/**
	 * Returns an IgnoreStatus enum option related to the value parameter.
	 * 
	 * @param value A value related to an enum option.
	 * @return IgnoreStatus enum value. Will return <em>null</em> if there is no enum option assigned to that value.
	 */
	@JsonCreator
	public static IgnoreStatus getEnumFor(Integer value) {

		if(value != null)
		{
			for (IgnoreStatus e : IgnoreStatus.values()) {
				if (e.value.equals(value)) 
					return e;
	        }
		}
        return null;
    }
	
	

}
