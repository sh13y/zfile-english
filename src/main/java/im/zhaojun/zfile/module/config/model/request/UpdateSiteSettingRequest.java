package im.zhaojun.zfile.module.config.model.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * Site Settings Request Parameters Class
 *
 * @author zhaojun
 */
@Data
@ApiModel(description = "Site Settings Request Parameters Class")
public class UpdateSiteSettingRequest {

	@ApiModelProperty(value = "Site Name", required = true, example = "ZFile Site Name")
	@NotBlank(message = "Site name cannot be empty")
	private String siteName;

	@ApiModelProperty(value = "Site Domain", required = true, example = "https://zfile.vip")
	@NotBlank(message = "Site domain cannot be empty")
	private String domain;

	@ApiModelProperty(value = "Frontend Domain", notes = "Frontend domain, required when frontend and backend are separated.", example = "http://xxx.example.com")
	private String frontDomain;

	@ApiModelProperty(value = "Avatar URL", example = "https://cube.elemecdn.com/3/7c/3ea6beec64369c2642b92c6726f1epng.png")
	private String avatar;

	@ApiModelProperty(value = "ICP Filing Number", example = "ICP 12345678-1")
	private String icp;

	@ApiModelProperty(value = "Maximum Simultaneous File Uploads", example = "5")
	private Integer maxFileUploads;

	@ApiModelProperty(value = "Site Home Name", example = "xxx's Site")
	private String siteHomeName;

	@ApiModelProperty(value = "Site Home Logo", example = "true")
	private String siteHomeLogo;

	@ApiModelProperty(value = "Site Logo Click Link", example = "https://www.zfile.vip")
	private String siteHomeLogoLink;

	@ApiModelProperty(value = "Site Logo Link Target Mode", example = "_blank")
	private String siteHomeLogoTargetMode;

	@ApiModelProperty(value = "Website Favicon URL", example = "https://www.example.com/favicon.ico")
	private String faviconUrl;

}