package im.zhaojun.zfile.module.config.model.request;

import im.zhaojun.zfile.module.config.model.enums.FileClickModeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Display Settings Request Parameters Class
 *
 * @author zhaojun
 */
@Data
@ApiModel(description = "Display Settings Request Parameters Class")
public class UpdateViewSettingRequest {

	@ApiModelProperty(value = "Show All Storage Sources in Root Directory", notes = "If true, displays all storage sources in root directory. If false, automatically redirects to the first storage source.", example = "true", required = true)
	private Boolean rootShowStorage;

	@ApiModelProperty(value = "Page Layout", notes = "full: Full Screen, center: Centered", example = "full", required = true)
	private String layout;

	@ApiModelProperty(value = "List Size", notes = "large: Large, default: Medium, small: Small", example = "default", required = true)
	private String tableSize;

	@ApiModelProperty(value = "Custom Video File Extensions")
	private String customVideoSuffix;

	@ApiModelProperty(value = "Custom Image File Extensions")
	private String customImageSuffix;

	@ApiModelProperty(value = "Custom Audio File Extensions")
	private String customAudioSuffix;

	@ApiModelProperty(value = "Custom Text File Extensions")
	private String customTextSuffix;

	@ApiModelProperty(value = "Show Document Area", example = "true", required = true)
	private Boolean showDocument;

	@ApiModelProperty(value = "Show Website Announcement", example = "true", required = true)
	private Boolean showAnnouncement;

	@ApiModelProperty(value = "Website Announcement", example = "ZFile Website Announcement")
	private String announcement;

	@ApiModelProperty(value = "Custom CSS")
	private String customCss;

	@ApiModelProperty(value = "Custom JS")
	private String customJs;

	@ApiModelProperty(value = "Default File Click Mode", example = "click")
	private FileClickModeEnum fileClickMode;

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

	@ApiModelProperty(value = "Remember Password by Default", example = "true")
	private Boolean defaultSavePwd;

}