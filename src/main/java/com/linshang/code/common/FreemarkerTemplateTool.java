package com.linshang.code.common;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

@Component
public class FreemarkerTemplateTool {

    @Resource
    private Configuration configuration;

    /**
     * process Template Into String.
     * 
     * 根据模板和数据生成具体代码
     *
     * @param template 模板
     * @param model 数据模型
     * @return 生成后的模板数据
     * @throws IOException IO异常
     * @throws TemplateException 模板异常
     */
    public String processTemplateIntoString(Template template, Object model)
            throws IOException, TemplateException {

        StringWriter result = new StringWriter();
        template.process(model, result);
        return result.toString();
    }

    /**
     * 使用map参数，处理模板 Template 生成代码 String.
     *
     * @param templateName 模板文件
     * @param params 参数值
     * @return 生成好的代码
     * @throws IOException io异常
     * @throws TemplateException 模板异常
     */
    public String processString(String templateName, Map<String, Object> params)
            throws IOException, TemplateException {

        Template template = configuration.getTemplate(templateName);
        String htmlText = processTemplateIntoString(template, params);
        return htmlText;
    }

}
