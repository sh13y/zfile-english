package im.zhaojun.zfile.module.config.controller;

import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.github.xiaoymin.knife4j.annotations.ApiSort;
import im.zhaojun.zfile.module.storage.service.StorageSourceService;
import im.zhaojun.zfile.module.config.service.SystemConfigService;
import im.zhaojun.zfile.core.config.ZFileProperties;
import im.zhaojun.zfile.core.util.AjaxJson;
import im.zhaojun.zfile.module.config.model.dto.SystemConfigDTO;
import im.zhaojun.zfile.module.storage.model.request.base.FileListConfigRequest;
import im.zhaojun.zfile.module.config.model.result.SiteConfigResult;
import im.zhaojun.zfile.module.storage.model.result.StorageSourceConfigResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * Site Basic Module Controller
 *
 * @author zhaojun
 */
@Api(tags = "Site Basic Module")
@ApiSort(1)
@Slf4j
@RequestMapping("/api/site")
@RestController
public class SiteController {

	@Resource
	private ZFileProperties zFileProperties;

	@Resource
	private StorageSourceService storageSourceService;

	@Resource
	private SystemConfigService systemConfigService;

	@ApiOperationSupport(order = 1)
	@ApiOperation(value = "Get Global Site Settings", 
				 notes = "Get global site settings, including page layout, list size, announcements, and configuration information")
	@GetMapping("/config/global")
	public AjaxJson<SiteConfigResult> globalConfig() {
		SystemConfigDTO systemConfig = systemConfigService.getSystemConfig();

		SiteConfigResult siteConfigResult = new SiteConfigResult();
		BeanUtils.copyProperties(systemConfig, siteConfigResult);

		siteConfigResult.setDebugMode(zFileProperties.isDebug());
		return AjaxJson.getSuccessData(siteConfigResult);
	}


	@ApiOperationSupport(order = 2)
	@ApiOperation(value = "Get Storage Source Settings", 
				 notes = "Get settings for a specific storage source, including enabled status, name, storage type, and configuration information")
	@PostMapping("/config/storage")
	public AjaxJson<StorageSourceConfigResult> storageList(@Valid @RequestBody FileListConfigRequest fileListConfigRequest) {
		StorageSourceConfigResult storageSourceConfigResult = storageSourceService.getStorageConfigSource(fileListConfigRequest);
		return AjaxJson.getSuccessData(storageSourceConfigResult);
	}


	@ResponseBody
	@ApiOperationSupport(order = 3)
	@ApiOperation(value = "Reset Administrator Password", 
				 notes = "When debug mode is enabled, accessing this API will force change the administrator account password to 'admin 123456' and change the login verification method to image verification code. For details, see: https://docs.zfile.vip/#/question?id=reset-pwd")
	@GetMapping("/reset-password")
	public AjaxJson<?> resetPwd() {
		systemConfigService.resetAdminLoginInfo();
		return AjaxJson.getSuccess();
	}

}