package im.zhaojun.zfile.module.config.controller;

import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.SecureUtil;
import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.github.xiaoymin.knife4j.annotations.ApiSort;
import im.zhaojun.zfile.core.util.AjaxJson;
import im.zhaojun.zfile.module.config.model.dto.SystemConfigDTO;
import im.zhaojun.zfile.module.config.model.request.UpdateLinkSettingRequest;
import im.zhaojun.zfile.module.config.model.request.UpdateSecuritySettingRequest;
import im.zhaojun.zfile.module.config.model.request.UpdateSiteSettingRequest;
import im.zhaojun.zfile.module.config.model.request.UpdateUserNameAndPasswordRequest;
import im.zhaojun.zfile.module.config.model.request.UpdateViewSettingRequest;
import im.zhaojun.zfile.module.config.service.SystemConfigService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * Site Settings Controller
 *
 * @author zhaojun
 */
@Api(tags = "Site Settings Module")
@ApiSort(2)
@RestController
@RequestMapping("/admin")
public class SettingController {

    @Resource
    private SystemConfigService systemConfigService;

    @ApiOperationSupport(order = 1)
    @ApiOperation(value = "Get Site Information",
            notes = "Get site-related information, including site name, style settings, announcement display, document area display, custom CSS, JS, and other parameters")
    @GetMapping("/config")
    public AjaxJson<SystemConfigDTO> getConfig() {
        SystemConfigDTO systemConfigDTO = systemConfigService.getSystemConfig();
        return AjaxJson.getSuccessData(systemConfigDTO);
    }


    @ApiOperationSupport(order = 2)
    @ApiOperation(value = "Update Administrator Username and Password")
    @PutMapping("/config/password")
    public AjaxJson<?> updatePwd(@Valid @RequestBody UpdateUserNameAndPasswordRequest settingRequest) {
        SystemConfigDTO systemConfigDTO = new SystemConfigDTO();
        BeanUtils.copyProperties(settingRequest, systemConfigDTO);
        String password = systemConfigDTO.getPassword();
        if (StrUtil.isNotEmpty(password)) {
            systemConfigDTO.setPassword(SecureUtil.md5(password));
        }
        systemConfigService.updateSystemConfig(systemConfigDTO);
        return AjaxJson.getSuccess();
    }


    @ApiOperationSupport(order = 3)
    @ApiOperation(value = "Update Site Settings")
    @PutMapping("/config/site")
    public AjaxJson<?> updateSiteSetting(@Valid @RequestBody UpdateSiteSettingRequest settingRequest) {
        SystemConfigDTO systemConfigDTO = new SystemConfigDTO();
        BeanUtils.copyProperties(settingRequest, systemConfigDTO);
        systemConfigService.updateSystemConfig(systemConfigDTO);
        return AjaxJson.getSuccess();
    }


    @ApiOperationSupport(order = 4)
    @ApiOperation(value = "Update Display Settings")
    @PutMapping("/config/view")
    public AjaxJson<?> updateViewSetting(@Valid @RequestBody UpdateViewSettingRequest settingRequest) {
        SystemConfigDTO systemConfigDTO = new SystemConfigDTO();
        BeanUtils.copyProperties(settingRequest, systemConfigDTO);
        systemConfigService.updateSystemConfig(systemConfigDTO);
        return AjaxJson.getSuccess();
    }


    @ApiOperationSupport(order = 5)
    @ApiOperation(value = "Update Login Security Settings")
    @PutMapping("/config/security")
    public AjaxJson<?> updateSecuritySetting(@Valid @RequestBody UpdateSecuritySettingRequest settingRequest) {
        SystemConfigDTO systemConfigDTO = new SystemConfigDTO();
        BeanUtils.copyProperties(settingRequest, systemConfigDTO);
        systemConfigService.updateSystemConfig(systemConfigDTO);
        return AjaxJson.getSuccess();
    }


    @ApiOperationSupport(order = 6)
    @ApiOperation(value = "Update Direct Link Settings")
    @PutMapping("/config/link")
    public AjaxJson<?> updateLinkSetting(@Valid @RequestBody UpdateLinkSettingRequest settingRequest) {
        SystemConfigDTO systemConfigDTO = new SystemConfigDTO();
        BeanUtils.copyProperties(settingRequest, systemConfigDTO);
        systemConfigService.updateSystemConfig(systemConfigDTO);
        return AjaxJson.getSuccess();
    }

}