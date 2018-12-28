package com.linshang.code.core.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.linshang.code.core.condition.FieldCondition;
import com.linshang.code.core.model.Field;
import com.mmk.gene.service.BaseService;

/**
* FieldService: 字段 业务服务层接口
*2018-10-10 16:44:05
*@author codegenerator
*@version 1.0
*/
public interface FieldService extends BaseService<Field, Long> {
    /**
     * 生成的列表分页查询方法
     * @param fieldCondition  查询条件
     * @param pageable 分页参数
     * @return 分页返回查询的结果
     * @author codegenerator
     * 
     */
    Page<Field> list(FieldCondition fieldCondition, Pageable pageable);
    
    /**
     * 不分页查询相关信息，根据传入的model类对象取得查询结果集List
     * @param  field 查询类
     * @return 查询的结果集
     * @author codegenerator
     * 
     */
    public List<Field> list(FieldCondition field);

    /**
     * 根据给定的字段和属性值，获得符合条件的第一个结果
     * @param field Field 中的某个字段
     * @param value 字段的值
     * @return Field 返回符合条件的结果，如果没有返回null
     * @author codegenerator
     * 
     * 
     */
    Field findBy(String field,Object value);
    
    /**
     * 根据给定的字段和属性值，获得符合条件的所有结果
     * @param field Field中的某个字段
     * @param value 字段的值
     * @return 返回符合条件的所有结果
     * @author codegenerator
     * 
     * 
     */
    List<Field> findAllBy(String field,Object value);
}