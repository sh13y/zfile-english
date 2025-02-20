package im.zhaojun.zfile.module.config.model.request;

import im.zhaojun.zfile.module.link.model.enums.RefererTypeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Direct Link Settings Request Parameters Class
 *
 * @author zhaojun
 */
@Data
@ApiModel(description = "Direct Link Settings Request Parameters Class")
public class UpdateLinkSettingRequest {

	@ApiModelProperty(value = "Record Download Logs", example = "true")
	private Boolean recordDownloadLog;

	@ApiModelProperty(value = "Direct Link Referer Anti-Leech Type")
	private RefererTypeEnum refererType;

	@ApiModelProperty(value = "Allow Empty Referer for Direct Links")
	private Boolean refererAllowEmpty;

	@ApiModelProperty(value = "Direct Link Referer Value")
	private String refererValue;

	@ApiModelProperty(value = "Direct Link URL Prefix")
	private String directLinkPrefix;

	@ApiModelProperty(value = "Show Generate Link Button (Including Direct and Path Short Links)", example = "true", required = true)
	private Boolean showLinkBtn;

	@ApiModelProperty(value = "Show Generate Short Link Feature", example = "true", required = true)
	private Boolean showShortLink;

	@ApiModelProperty(value = "Show Generate Path Link Feature", example = "true", required = true)
	private Boolean showPathLink;

	@ApiModelProperty(value = "Allow Anonymous Access to Path Links", example = "true", required = true)
	private Boolean allowPathLinkAnonAccess;

	@ApiModelProperty(value = "Direct Link Download Time Limit (Seconds)", example = "_blank")
	private Integer linkLimitSecond;

	@ApiModelProperty(value = "Direct Link Download Count Limit", example = "_blank")
	private Integer linkDownloadLimit;

	@ApiModelProperty(value = "Short Link Expiration Time Settings", example = "[{value: 1, unit: \"day\"}, {value: 1, unit: \"week\"}, {value: 1, unit: \"month\"}, {value: 1, unit: \"year\"}]")
	private String linkExpireTimes;

}