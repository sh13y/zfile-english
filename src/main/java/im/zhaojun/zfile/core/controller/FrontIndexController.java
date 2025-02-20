package im.zhaojun.zfile.core.controller;

import cn.hutool.core.util.StrUtil;
import im.zhaojun.zfile.module.config.model.dto.SystemConfigDTO;
import im.zhaojun.zfile.module.config.service.SystemConfigService;
import org.apache.commons.io.IOUtils;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/**
 * Front-end Index Page Controller
 *
 * @author zhaojun
 */
@Controller
public class FrontIndexController {

	@Resource
	private SystemConfigService systemConfigService;


	/**
	 * Redirect all pages not found to the index page to solve the vue history direct access 404 issue.
	 * Also, read the index.html file, modify the title and favicon before returning.
	 *
	 * @return Forward to /index.html
	 */
	@RequestMapping(value = {"/**/{[path:[^\\.]*}", "/"})
	@ResponseBody
	public String redirect() throws IOException {
		// Read resources/static/index.html file, modify title and favicon before returning
		ClassPathResource resource = new ClassPathResource("static/index.html");
		InputStream inputStream = resource.getInputStream();
		String content = IOUtils.toString(inputStream, StandardCharsets.UTF_8);

		SystemConfigDTO systemConfig = systemConfigService.getSystemConfig();
		String siteName = systemConfig.getSiteName();
		if (StrUtil.isNotBlank(siteName)) {
			content = content.replace("<title>ZFile</title>", "<title>" + siteName + "</title>");
		}

		String faviconUrl = systemConfig.getFaviconUrl();
		if (StrUtil.isNotBlank(faviconUrl)) {
			content = content.replace("/favicon.svg", faviconUrl);
		}

		return content;
	}

}