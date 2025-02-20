package im.zhaojun.zfile.module.config.model.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * File click mode enumeration, used to control whether files are opened with single or double click
 *
 * @author zhaojun
 */
@Getter
@AllArgsConstructor
public enum FileClickModeEnum {

	/**
	 * Single click to open file/folder
	 */
	CLICK("click"),

	/**
	 * Double click to open file/folder
	 */
	DBCLICK("dbclick");

	@EnumValue
	@JsonValue
	private final String value;

}