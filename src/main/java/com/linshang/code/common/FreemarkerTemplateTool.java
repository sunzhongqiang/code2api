package com.linshang.code.common;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Map;

import javax.annotation.Resource;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class FreemarkerTemplateTool {

	@Resource
	private Configuration configuration;

	/**
	 * process Template Into String
	 *
	 * @param template
	 * @param model
	 * @return
	 * @throws IOException
	 * @throws TemplateException
	 */
	public String processTemplateIntoString(Template template, Object model) throws IOException, TemplateException {

		StringWriter result = new StringWriter();
		template.process(model, result);
		return result.toString();
	}

	/**
	 * process String
	 *
	 * @param templateName
	 * @param params
	 * @return
	 * @throws IOException
	 * @throws TemplateException
	 */
	public String processString(String templateName, Map<String, Object> params) throws IOException, TemplateException {

		Template template = configuration.getTemplate(templateName);
		String htmlText = processTemplateIntoString(template, params);
		return htmlText;
	}

}
