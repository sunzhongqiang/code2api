/*
 * 
 *  FieldDao 创建于 2018-10-10 16:44:05 版权归作者和作者当前组织所有
 */
package com.linshang.code.core.dao;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.linshang.code.core.condition.FieldCondition;
import com.linshang.code.core.model.Field;
import com.mmk.gene.dao.SpringDataQueryDao;
/**
* FieldDao:字段 数据持久层接口
* @author codegenerator
* @version 1.0
*/
public interface FieldDao extends SpringDataQueryDao<Field>{
    
    /**
     * 分页查询相关信息，根据传入的bean类对象和分页对象page取得查询结果集List
     * @param field 查询类
     * @param pageable 传入的分页对象
     * @return 符合条件的查询结果集
     * @author codegenerator
     * 
     * 
     */
    Page<Field> list(FieldCondition field,Pageable pageable);
    /**
     * 不分页查询相关信息，根据传入的model类对象取得查询结果集List
     * @param field 查询类
     * @return 符合条件的查询结果集
     * @author codegenerator
     * 
     */
    List<Field> list(FieldCondition field);
    /**
     * 使用sql查询，并以map和分页的形式进行返回数据结果
     * @param field Field类
     * @param pageable 传入的分页对象
     * @return 符合条件的查询结果集
     * @author codegenerator
     * 
     * 
     */
    Page<Map<String,Object>> listBySql(FieldCondition field,Pageable pageable);
    /**
     * 根据给定的字段和属性值，获得符合条件的第一个结果
     * @param field Field 中的某个字段
     * @param value 字段对应的值
     * @return 返回符合条件的结果，如果没有返回null
     * @author codegenerator
     * 
     * 
     */
    Field findBy(String field,Object value);
    
    /**
     * 根据给定的字段和属性值，获得符合条件的所有结果
     * @param field Field 中的某个字段
     * @param value 字段对应的值
     * @return 返回符合条件的所有结果
     * @author codegenerator
     * 
     * 
     */
    List<Field> findAllBy(String field,Object value);
    
    

}