package im.zhaojun.zfile.module.login.model.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Login Verification Mode Enumeration
 *
 * @author zhaojun
 */
@Getter
@AllArgsConstructor
public enum LoginVerifyModeEnum {

	/**
	 * Login Mode Disabled
	 */
	OFF_MODE("off"),

	/**
	 * Image Captcha Mode
	 */
	IMG_VERIFY_MODE("image"),

	/**
	 * Two-Factor Authentication Mode
	 */
	TWO_FACTOR_AUTHENTICATION_MODE("2fa");

	@EnumValue
	@JsonValue
	private final String value;

}