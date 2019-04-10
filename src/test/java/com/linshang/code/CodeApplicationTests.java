package com.linshang.code;

import static org.junit.Assert.assertSame;
import com.linshang.code.common.FreemarkerTemplateTool;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import freemarker.template.TemplateException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CodeApplicationTests {
    @Resource
    private FreemarkerTemplateTool tool;

    @Test
    public void contextLoads() {}

    @Test
    public void testcode() {
        Map<String, Object> params = new HashMap<>();
        try {
            String code = tool.processString("/default/demo.ftl", params);
            assertSame("123123123", code);
        } catch (IOException | TemplateException e) {
            e.printStackTrace();
        }
    }

}
