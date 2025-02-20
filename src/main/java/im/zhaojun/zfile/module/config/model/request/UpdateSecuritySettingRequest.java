package im.zhaojun.zfile.module.config.model.request;

import im.zhaojun.zfile.module.login.model.enums.LoginVerifyModeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Login Security Settings Request Parameters Class
 *
 * @author zhaojun
 */
@Data
@ApiModel(description = "Login Security Settings Request Parameters Class")
public class UpdateSecuritySettingRequest {

	@ApiModelProperty(value = "Show Login Button in Frontend", example = "true")
	private Boolean showLogin;

	@ApiModelProperty(value = "Login Verification Mode, supports Captcha and 2FA authentication")
	private LoginVerifyModeEnum loginVerifyMode;

	@ApiModelProperty(value = "Login Verification Secret")
	private String loginVerifySecret;

}