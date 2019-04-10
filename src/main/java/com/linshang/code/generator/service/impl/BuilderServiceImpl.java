package com.linshang.code.generator.service.impl;

import com.linshang.code.common.FreemarkerTemplateTool;
import com.linshang.code.core.service.FieldService;
import com.linshang.code.generator.model.BuildData;
import com.linshang.code.generator.service.BuilderService;
import java.io.IOException;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import freemarker.template.TemplateException;

@Service
public class BuilderServiceImpl implements BuilderService {

    @Resource
    private FreemarkerTemplateTool templateTool;

    @Override
    public String buildModel(String template, BuildData data) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String buildCondition(String template, BuildData data) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String buildRepository(String template, BuildData data) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String buildDao(String template, BuildData data) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String buildDaoImpl(String template, BuildData data) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String buildService(String template, BuildData data) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String buildServiceImpl(String template, BuildData data) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String buildController(String template, BuildData data) {
        // TODO Auto-generated method stub
        return null;
    }



    @Override
    public String buildAllCode(String template, BuildData data) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String buildCode(String template, Map<String, Object> data) {
        try {
            String code = templateTool.processString(template, data);
            return code;
        } catch (IOException | TemplateException e) {
            e.printStackTrace();
            return e.getMessage();
        }

    }

}
