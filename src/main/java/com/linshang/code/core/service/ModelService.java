package com.linshang.code.core.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.linshang.code.core.condition.ModelCondition;
import com.linshang.code.core.model.Model;
import com.mmk.gene.service.BaseService;

/**
* ModelService: 模块 业务服务层接口
*2018-10-10 16:42:39
*@author codegenerator
*@version 1.0
*/
public interface ModelService extends BaseService<Model, Long> {
    /**
     * 生成的列表分页查询方法
     * @param modelCondition  查询条件
     * @param pageable 分页参数
     * @return 分页返回查询的结果
     * @author codegenerator
     * 
     */
    Page<Model> list(ModelCondition modelCondition, Pageable pageable);
    
    /**
     * 不分页查询相关信息，根据传入的model类对象取得查询结果集List
     * @param  model 查询类
     * @return 查询的结果集
     * @author codegenerator
     * 
     */
    public List<Model> list(ModelCondition model);

    /**
     * 根据给定的字段和属性值，获得符合条件的第一个结果
     * @param field Model 中的某个字段
     * @param value 字段的值
     * @return Model 返回符合条件的结果，如果没有返回null
     * @author codegenerator
     * 
     * 
     */
    Model findBy(String field,Object value);
    
    /**
     * 根据给定的字段和属性值，获得符合条件的所有结果
     * @param field Model中的某个字段
     * @param value 字段的值
     * @return 返回符合条件的所有结果
     * @author codegenerator
     * 
     * 
     */
    List<Model> findAllBy(String field,Object value);
}