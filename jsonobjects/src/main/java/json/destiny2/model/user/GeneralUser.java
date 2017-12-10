/**
 * 
 */
package json.destiny2.model.user;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Representa a un usuario User.GeneralUser
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GeneralUser {

	private Long membershipId;
	private String uniqueName;
	private String normalizedName;
	private String displayName;
	
	private Integer profilePicture;
	private Integer profileTheme;
	private Integer userTitle;
	
	/* ACCESS DATA */
	private Long successMessageFlags;
	private Boolean isDeleted;
	private String about;
	
	private Date firstAccess;
	private Date lastUpdate;
	
	private Long legacyPortalUID;
	
	//@JsonProperty("context")
	private UserToUserContext context;
	
	/* DISPLAY NAMES */
	private String psnDisplayName;
	private String xboxDisplayName;
	private String fbDisplayName;
	private String blizzardDisplayName;
		
	/* LOCALE SETTINGS */
	private String locale;
	private Boolean localeInheritDefault;
	
	
	/* TITLES, STATUS AND PICTURES */
	private Boolean showGroupMessaging; 
	private Boolean showActivity;
	private String profilePicturePath;
	private String profilePictureWidePath;
	private String profileThemeName;
	private String userTitleDisplay;
	private String statusText;
	private Date statusDate;

	
	/* BAN DATA */
	private Long lastBanReportId;
	private Date profileBanExpire;
	
	
	public Long getMembershipId() {
		return membershipId;
	}
	public void setMembershipId(Long membershipId) {
		this.membershipId = membershipId;
	}
	public String getUniqueName() {
		return uniqueName;
	}
	public void setUniqueName(String uniqueName) {
		this.uniqueName = uniqueName;
	}
	public String getNormalizedName() {
		return normalizedName;
	}
	public void setNormalizedName(String normalizedName) {
		this.normalizedName = normalizedName;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public Integer getProfilePicture() {
		return profilePicture;
	}
	public void setProfilePicture(Integer profilePicture) {
		this.profilePicture = profilePicture;
	}
	public Integer getProfileTheme() {
		return profileTheme;
	}
	public void setProfileTheme(Integer profileTheme) {
		this.profileTheme = profileTheme;
	}
	public Integer getUserTitle() {
		return userTitle;
	}
	public void setUserTitle(Integer userTitle) {
		this.userTitle = userTitle;
	}
	public Long getSuccessMessageFlags() {
		return successMessageFlags;
	}
	public void setSuccessMessageFlags(Long successMessageFlags) {
		this.successMessageFlags = successMessageFlags;
	}
	public Boolean getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public Date getFirstAccess() {
		return firstAccess;
	}
	public void setFirstAccess(Date firstAccess) {
		this.firstAccess = firstAccess;
	}
	public Date getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	public Long getLegacyPortalUID() {
		return legacyPortalUID;
	}
	public void setLegacyPortalUID(Long legacyPortalUID) {
		this.legacyPortalUID = legacyPortalUID;
	}
	public UserToUserContext getUserToUserContext() {
		return context;
	}
	public void setUserToUserContext(UserToUserContext context) {
		this.context = context;
	}
	public String getPsnDisplayName() {
		return psnDisplayName;
	}
	public void setPsnDisplayName(String psnDisplayName) {
		this.psnDisplayName = psnDisplayName;
	}
	public String getXboxDisplayName() {
		return xboxDisplayName;
	}
	public void setXboxDisplayName(String xboxDisplayName) {
		this.xboxDisplayName = xboxDisplayName;
	}
	public String getFbDisplayName() {
		return fbDisplayName;
	}
	public void setFbDisplayName(String fbDisplayName) {
		this.fbDisplayName = fbDisplayName;
	}
	public String getBlizzardDisplayName() {
		return blizzardDisplayName;
	}
	public void setBlizzardDisplayName(String blizzardDisplayName) {
		this.blizzardDisplayName = blizzardDisplayName;
	}
	public String getLocale() {
		return locale;
	}
	public void setLocale(String locale) {
		this.locale = locale;
	}
	public Boolean getLocaleInheritDefault() {
		return localeInheritDefault;
	}
	public void setLocaleInheritDefault(Boolean localeInheritDefault) {
		this.localeInheritDefault = localeInheritDefault;
	}
	public Boolean getShowGroupMessaging() {
		return showGroupMessaging;
	}
	public void setShowGroupMessaging(Boolean showGroupMessaging) {
		this.showGroupMessaging = showGroupMessaging;
	}
	public Boolean getShowActivity() {
		return showActivity;
	}
	public void setShowActivity(Boolean showActivity) {
		this.showActivity = showActivity;
	}
	public String getProfilePicturePath() {
		return profilePicturePath;
	}
	public void setProfilePicturePath(String profilePicturePath) {
		this.profilePicturePath = profilePicturePath;
	}
	public String getProfilePictureWidePath() {
		return profilePictureWidePath;
	}
	public void setProfilePictureWidePath(String profilePictureWidePath) {
		this.profilePictureWidePath = profilePictureWidePath;
	}
	public String getProfileThemeName() {
		return profileThemeName;
	}
	public void setProfileThemeName(String profileThemeName) {
		this.profileThemeName = profileThemeName;
	}
	public String getUserTitleDisplay() {
		return userTitleDisplay;
	}
	public void setUserTitleDisplay(String userTitleDisplay) {
		this.userTitleDisplay = userTitleDisplay;
	}
	public String getStatusText() {
		return statusText;
	}
	public void setStatusText(String statusText) {
		this.statusText = statusText;
	}
	public Date getStatusDate() {
		return statusDate;
	}
	public void setStatusDate(Date statusDate) {
		this.statusDate = statusDate;
	}
	public Long getLastBanReportId() {
		return lastBanReportId;
	}
	public void setLastBanReportId(Long lastBanReportId) {
		this.lastBanReportId = lastBanReportId;
	}
	public Date getProfileBanExpire() {
		return profileBanExpire;
	}
	public void setProfileBanExpire(Date profileBanExpire) {
		this.profileBanExpire = profileBanExpire;
	}
	
	public UserToUserContext getContext() {
		return context;
	}
	public void setContext(UserToUserContext context) {
		this.context = context;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((about == null) ? 0 : about.hashCode());
		result = prime * result + ((blizzardDisplayName == null) ? 0 : blizzardDisplayName.hashCode());
		result = prime * result + ((context == null) ? 0 : context.hashCode());
		result = prime * result + ((displayName == null) ? 0 : displayName.hashCode());
		result = prime * result + ((fbDisplayName == null) ? 0 : fbDisplayName.hashCode());
		result = prime * result + ((firstAccess == null) ? 0 : firstAccess.hashCode());
		result = prime * result + ((isDeleted == null) ? 0 : isDeleted.hashCode());
		result = prime * result + ((lastBanReportId == null) ? 0 : lastBanReportId.hashCode());
		result = prime * result + ((lastUpdate == null) ? 0 : lastUpdate.hashCode());
		result = prime * result + ((legacyPortalUID == null) ? 0 : legacyPortalUID.hashCode());
		result = prime * result + ((locale == null) ? 0 : locale.hashCode());
		result = prime * result + ((localeInheritDefault == null) ? 0 : localeInheritDefault.hashCode());
		result = prime * result + ((membershipId == null) ? 0 : membershipId.hashCode());
		result = prime * result + ((normalizedName == null) ? 0 : normalizedName.hashCode());
		result = prime * result + ((profileBanExpire == null) ? 0 : profileBanExpire.hashCode());
		result = prime * result + ((profilePicture == null) ? 0 : profilePicture.hashCode());
		result = prime * result + ((profilePicturePath == null) ? 0 : profilePicturePath.hashCode());
		result = prime * result + ((profilePictureWidePath == null) ? 0 : profilePictureWidePath.hashCode());
		result = prime * result + ((profileTheme == null) ? 0 : profileTheme.hashCode());
		result = prime * result + ((profileThemeName == null) ? 0 : profileThemeName.hashCode());
		result = prime * result + ((psnDisplayName == null) ? 0 : psnDisplayName.hashCode());
		result = prime * result + ((showActivity == null) ? 0 : showActivity.hashCode());
		result = prime * result + ((showGroupMessaging == null) ? 0 : showGroupMessaging.hashCode());
		result = prime * result + ((statusDate == null) ? 0 : statusDate.hashCode());
		result = prime * result + ((statusText == null) ? 0 : statusText.hashCode());
		result = prime * result + ((successMessageFlags == null) ? 0 : successMessageFlags.hashCode());
		result = prime * result + ((uniqueName == null) ? 0 : uniqueName.hashCode());
		result = prime * result + ((userTitle == null) ? 0 : userTitle.hashCode());
		result = prime * result + ((userTitleDisplay == null) ? 0 : userTitleDisplay.hashCode());
		result = prime * result + ((xboxDisplayName == null) ? 0 : xboxDisplayName.hashCode());
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
		GeneralUser other = (GeneralUser) obj;
		if (about == null) {
			if (other.about != null)
				return false;
		} else if (!about.equals(other.about))
			return false;
		if (blizzardDisplayName == null) {
			if (other.blizzardDisplayName != null)
				return false;
		} else if (!blizzardDisplayName.equals(other.blizzardDisplayName))
			return false;
		if (context == null) {
			if (other.context != null)
				return false;
		} else if (!context.equals(other.context))
			return false;
		if (displayName == null) {
			if (other.displayName != null)
				return false;
		} else if (!displayName.equals(other.displayName))
			return false;
		if (fbDisplayName == null) {
			if (other.fbDisplayName != null)
				return false;
		} else if (!fbDisplayName.equals(other.fbDisplayName))
			return false;
		if (firstAccess == null) {
			if (other.firstAccess != null)
				return false;
		} else if (!firstAccess.equals(other.firstAccess))
			return false;
		if (isDeleted == null) {
			if (other.isDeleted != null)
				return false;
		} else if (!isDeleted.equals(other.isDeleted))
			return false;
		if (lastBanReportId == null) {
			if (other.lastBanReportId != null)
				return false;
		} else if (!lastBanReportId.equals(other.lastBanReportId))
			return false;
		if (lastUpdate == null) {
			if (other.lastUpdate != null)
				return false;
		} else if (!lastUpdate.equals(other.lastUpdate))
			return false;
		if (legacyPortalUID == null) {
			if (other.legacyPortalUID != null)
				return false;
		} else if (!legacyPortalUID.equals(other.legacyPortalUID))
			return false;
		if (locale == null) {
			if (other.locale != null)
				return false;
		} else if (!locale.equals(other.locale))
			return false;
		if (localeInheritDefault == null) {
			if (other.localeInheritDefault != null)
				return false;
		} else if (!localeInheritDefault.equals(other.localeInheritDefault))
			return false;
		if (membershipId == null) {
			if (other.membershipId != null)
				return false;
		} else if (!membershipId.equals(other.membershipId))
			return false;
		if (normalizedName == null) {
			if (other.normalizedName != null)
				return false;
		} else if (!normalizedName.equals(other.normalizedName))
			return false;
		if (profileBanExpire == null) {
			if (other.profileBanExpire != null)
				return false;
		} else if (!profileBanExpire.equals(other.profileBanExpire))
			return false;
		if (profilePicture == null) {
			if (other.profilePicture != null)
				return false;
		} else if (!profilePicture.equals(other.profilePicture))
			return false;
		if (profilePicturePath == null) {
			if (other.profilePicturePath != null)
				return false;
		} else if (!profilePicturePath.equals(other.profilePicturePath))
			return false;
		if (profilePictureWidePath == null) {
			if (other.profilePictureWidePath != null)
				return false;
		} else if (!profilePictureWidePath.equals(other.profilePictureWidePath))
			return false;
		if (profileTheme == null) {
			if (other.profileTheme != null)
				return false;
		} else if (!profileTheme.equals(other.profileTheme))
			return false;
		if (profileThemeName == null) {
			if (other.profileThemeName != null)
				return false;
		} else if (!profileThemeName.equals(other.profileThemeName))
			return false;
		if (psnDisplayName == null) {
			if (other.psnDisplayName != null)
				return false;
		} else if (!psnDisplayName.equals(other.psnDisplayName))
			return false;
		if (showActivity == null) {
			if (other.showActivity != null)
				return false;
		} else if (!showActivity.equals(other.showActivity))
			return false;
		if (showGroupMessaging == null) {
			if (other.showGroupMessaging != null)
				return false;
		} else if (!showGroupMessaging.equals(other.showGroupMessaging))
			return false;
		if (statusDate == null) {
			if (other.statusDate != null)
				return false;
		} else if (!statusDate.equals(other.statusDate))
			return false;
		if (statusText == null) {
			if (other.statusText != null)
				return false;
		} else if (!statusText.equals(other.statusText))
			return false;
		if (successMessageFlags == null) {
			if (other.successMessageFlags != null)
				return false;
		} else if (!successMessageFlags.equals(other.successMessageFlags))
			return false;
		if (uniqueName == null) {
			if (other.uniqueName != null)
				return false;
		} else if (!uniqueName.equals(other.uniqueName))
			return false;
		if (userTitle == null) {
			if (other.userTitle != null)
				return false;
		} else if (!userTitle.equals(other.userTitle))
			return false;
		if (userTitleDisplay == null) {
			if (other.userTitleDisplay != null)
				return false;
		} else if (!userTitleDisplay.equals(other.userTitleDisplay))
			return false;
		if (xboxDisplayName == null) {
			if (other.xboxDisplayName != null)
				return false;
		} else if (!xboxDisplayName.equals(other.xboxDisplayName))
			return false;
		return true;
	}
	
	
	
	
	
	
}
