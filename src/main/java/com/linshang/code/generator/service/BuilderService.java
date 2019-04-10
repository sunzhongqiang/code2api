package com.linshang.code.generator.service;

import com.linshang.code.generator.model.BuildData;
import java.util.Map;

public interface BuilderService {

    /**
     * 根据模型生成model代码
     * 
     * @param model
     * @param fieldList
     * @return
     */
    String buildModel(String template, BuildData data);

    /**
     * 生成查询使用的Condition类
     * 
     * @param project
     * @return
     */
    String buildCondition(String template, BuildData data);

    /**
     * 根据模型生成Repository代码
     * 
     * @param model
     * @param fieldList
     * @return
     */
    String buildRepository(String template, BuildData data);

    String buildDao(String template, BuildData data);

    String buildDaoImpl(String template, BuildData data);

    /**
     * 根据模型生成Service代码
     * 
     * @param model
     * @param fieldList
     * @return
     */
    String buildService(String template, BuildData data);

    String buildServiceImpl(String template, BuildData data);

    /**
     * 根据模型生成Controller代码
     * 
     * @param model
     * @param fieldList
     * @return
     */
    String buildController(String template, BuildData data);



    /**
     * 构建所有代码
     * 
     * @param project
     */
    String buildAllCode(String template, BuildData data);

    /**
     * 使用指定模板和绑定数据生成代码.
     * 
     * @param template 模板文件
     * @param data 自定义数据
     * @return 生成好的代码
     */
    String buildCode(String template, Map<String, Object> data);
}
