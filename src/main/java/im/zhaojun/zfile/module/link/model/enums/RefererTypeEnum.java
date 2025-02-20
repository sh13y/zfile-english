package im.zhaojun.zfile.module.link.model.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Referer Anti-Leech Type Enumeration
 *
 * @author zhaojun
 */
@Getter
@AllArgsConstructor
public enum RefererTypeEnum {

	/**
	 * Disable Referer Anti-Leech
	 */
	OFF("off"),

	/**
	 * Enable Whitelist Mode
	 */
	WHITE_LIST("white_list"),

	/**
	 * Enable Blacklist Mode
	 */
	BLACK_LIST("black_list");

	@EnumValue
	@JsonValue
	private final String value;

}