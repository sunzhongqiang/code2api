package com.linshang.code.core.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.linshang.code.core.condition.ProjectCondition;
import com.linshang.code.core.model.Project;
import com.mmk.gene.service.BaseService;

/**
* ProjectService: 项目 业务服务层接口
*2018-10-10 16:40:55
*@author codegenerator
*@version 1.0
*/
public interface ProjectService extends BaseService<Project, Long> {
    /**
     * 生成的列表分页查询方法
     * @param projectCondition  查询条件
     * @param pageable 分页参数
     * @return 分页返回查询的结果
     * @author codegenerator
     * 
     */
    Page<Project> list(ProjectCondition projectCondition, Pageable pageable);
    
    /**
     * 不分页查询相关信息，根据传入的model类对象取得查询结果集List
     * @param  project 查询类
     * @return 查询的结果集
     * @author codegenerator
     * 
     */
    public List<Project> list(ProjectCondition project);

    /**
     * 根据给定的字段和属性值，获得符合条件的第一个结果
     * @param field Project 中的某个字段
     * @param value 字段的值
     * @return Project 返回符合条件的结果，如果没有返回null
     * @author codegenerator
     * 
     * 
     */
    Project findBy(String field,Object value);
    
    /**
     * 根据给定的字段和属性值，获得符合条件的所有结果
     * @param field Project中的某个字段
     * @param value 字段的值
     * @return 返回符合条件的所有结果
     * @author codegenerator
     * 
     * 
     */
    List<Project> findAllBy(String field,Object value);
}