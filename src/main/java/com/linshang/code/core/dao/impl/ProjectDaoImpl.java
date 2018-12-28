/*
 * 
 *  ProjectDaoImpl 创建于 2018-10-10 16:40:55 版权归作者和作者当前组织所有
 */
package com.linshang.code.core.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import com.linshang.code.core.condition.ProjectCondition;
import com.linshang.code.core.dao.ProjectDao;
import com.linshang.code.core.model.Project;
import com.mmk.gene.dao.impl.SpringDataQueryDaoImpl;



/**
* ProjectDaoImpl: 项目 数据持久层接口实现
*@author codegenerator
*@version 1.0
*
*/
@Repository
public class ProjectDaoImpl extends SpringDataQueryDaoImpl<Project> implements ProjectDao {
    
    
    public ProjectDaoImpl(){
        super(Project.class);
    }
    
    /**
     * 分页查询相关信息，根据传入的bean类对象和分页对象page取得查询结果集List
     * @param projectCondition 查询类
     * @param pageable 传入的分页对象
     * @return 符合条件的查询结果集
     * @author codegenerator
     * 
     */
    @Override 
    public Page<Project> list(ProjectCondition projectCondition,Pageable pageable){
        StringBuilder sb=new StringBuilder("select model from Project model  where 1=1  ");
        Map<String,Object> params = new HashMap<>(16);
        return queryByJpql(sb.toString(), params, pageable);
    }

    @Override 
    public List<Project> list(ProjectCondition projectCondition){
        StringBuilder sb=new StringBuilder("select model from Project model  where 1=1  ");
        Map<String,Object> params = new HashMap<>(16);
        return queryByJpql(sb.toString(), params);
    }
    
    
    @Override 
    public Page< Map<String,Object>> listBySql(ProjectCondition condition,Pageable pageable){
        StringBuilder sb=new StringBuilder("select id,comment,database_name,description,group_package,module_package,path,project_name,template from project  where 1=1  ");
        Map<Integer,Object> params = new HashMap<>(16);
        return queryFieldsBySql(sb.toString(), params, pageable);
    }
    
    @Override 
    public Project findBy(String field,Object value){
        StringBuilder sb=new StringBuilder("select model from Project model  where model.");
        sb.append(field);
        sb.append(" = :value ");
        Map<String,Object> params = new HashMap<>(16);
        params.put("value",value);
        List<Project> result = queryByJpql(sb.toString(), params,0l,1l);
        return result.isEmpty() ? null : result.get(0);
    }
    
    @Override 
    public List<Project> findAllBy(String field,Object value){
        StringBuilder sb=new StringBuilder("select model from Project model  where model.");
        sb.append(field);
        sb.append(" = :value ");
        Map<String,Object> params = new HashMap<>(16);
        params.put("value",value);
        return queryByJpql(sb.toString(), params);
    }
    
    
}