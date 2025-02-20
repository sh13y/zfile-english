package im.zhaojun.zfile.module.config.model.result;

import im.zhaojun.zfile.module.config.model.enums.FileClickModeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Global Site Settings Response Class
 *
 * @author zhaojun
 */
@Data
@ApiModel(value="Global Site Settings Response Class")
public class SiteConfigResult {

	@ApiModelProperty(value = "Is Initialized", example = "true")
	private Boolean installed;

	@ApiModelProperty(value = "Debug Mode", example = "true", notes = "When debug mode is enabled, administrator password can be reset")
	private Boolean debugMode;

	@ApiModelProperty(value = "Direct Link URL Prefix", example = "true", notes = "Direct link URL prefix, e.g., http(s)://ip:port/${prefix}/path/filename")
	private String directLinkPrefix;

	@ApiModelProperty(value = "Site Name", example = "ZFile Site Name")
	private String siteName;

	@ApiModelProperty(value = "ICP Filing Number", example = "ICP 12345678-1")
	private String icp;

	@ApiModelProperty(value = "Site Domain (Backend)", example = "https://zfile.vip", notes = "This value must be configured as the backend site domain, required for generating direct links and other operations.")
	private String domain;

	@ApiModelProperty(value = "Page Layout", notes = "full: Full Screen, center: Centered", example = "full", required = true)
	private String layout;

	@ApiModelProperty(value = "List Size", notes = "large: Large, default: Medium, small: Small", example = "default", required = true)
	private String tableSize;

	@ApiModelProperty(value = "Show Generate Link Button (Including Direct and Path Short Links)", example = "true", required = true)
	private Boolean showLinkBtn;

	@ApiModelProperty(value = "Show Generate Short Link Feature", example = "true", required = true)
	private Boolean showShortLink;

	@ApiModelProperty(value = "Show Generate Path Link Feature", example = "true", required = true)
	private Boolean showPathLink;

	@ApiModelProperty(value = "Show Document Area", example = "true", required = true)
	private Boolean showDocument;

	@ApiModelProperty(value = "Show Website Announcement", example = "true", required = true)
	private Boolean showAnnouncement;

	@ApiModelProperty(value = "Website Announcement", example = "ZFile Website Announcement")
	private String announcement;

	@ApiModelProperty(value = "Custom JS")
	private String customJs;

	@ApiModelProperty(value = "Custom CSS")
	private String customCss;

	@ApiModelProperty(value = "Custom Video File Extensions")
	private String customVideoSuffix;

	@ApiModelProperty(value = "Custom Image File Extensions")
	private String customImageSuffix;

	@ApiModelProperty(value = "Custom Audio File Extensions")
	private String customAudioSuffix;

	@ApiModelProperty(value = "Custom Text File Extensions")
	private String customTextSuffix;

	@ApiModelProperty(value = "Show All Storage Sources in Root Directory", notes = "If true, displays all storage sources in root directory. If false, automatically redirects to the first storage source.", example = "true", required = true)
	private Boolean rootShowStorage;

	@ApiModelProperty(value = "Frontend Domain", notes = "Frontend domain, required when frontend and backend are separated.", example = "http://xxx.example.com")
	private String frontDomain;

	@ApiModelProperty(value = "Show Login Button in Frontend", example = "true")
	private Boolean showLogin;

	@ApiModelProperty(value = "Default File Click Mode", example = "click")
	private FileClickModeEnum fileClickMode;

	@ApiModelProperty(value = "Maximum Simultaneous File Uploads", example = "5")
	private Integer maxFileUploads;

	@ApiModelProperty(value = "OnlyOffice Online Preview URL", example = "http://office.zfile.vip")
	private String onlyOfficeUrl;

	@ApiModelProperty(value = "Default Maximum Files to Display", example = "1000")
	private Integer maxShowSize;

	@ApiModelProperty(value = "Number of Files to Load More", example = "50")
	private Integer loadMoreSize;

	@ApiModelProperty(value = "Default Sort Field", example = "name")
	private String defaultSortField;

	@ApiModelProperty(value = "Default Sort Order", example = "asc")
	private String defaultSortOrder;

	@ApiModelProperty(value = "Site Home Name", example = "xxx's Site")
	private String siteHomeName;

	@ApiModelProperty(value = "Site Home Logo", example = "true")
	private String siteHomeLogo;

	@ApiModelProperty(value = "Site Logo Click Link", example = "https://www.zfile.vip")
	private String siteHomeLogoLink;

	@ApiModelProperty(value = "Site Logo Link Target Mode", example = "_blank")
	private String siteHomeLogoTargetMode;

	@ApiModelProperty(value = "Short Link Expiration Time Settings", example = "[{value: 1, unit: \"day\"}, {value: 1, unit: \"week\"}, {value: 1, unit: \"month\"}, {value: 1, unit: \"year\"}]")
	private String linkExpireTimes;

	@ApiModelProperty(value = "Remember Password by Default", example = "true")
	private Boolean defaultSavePwd;

}