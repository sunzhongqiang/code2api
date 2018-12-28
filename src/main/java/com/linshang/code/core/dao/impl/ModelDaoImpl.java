/*
 * 
 *  ModelDaoImpl 创建于 2018-10-10 16:42:39 版权归作者和作者当前组织所有
 */
package com.linshang.code.core.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import com.linshang.code.core.condition.ModelCondition;
import com.linshang.code.core.dao.ModelDao;
import com.linshang.code.core.model.Model;
import com.mmk.gene.dao.impl.SpringDataQueryDaoImpl;



/**
* ModelDaoImpl: 模块 数据持久层接口实现
*@author codegenerator
*@version 1.0
*
*/
@Repository
public class ModelDaoImpl extends SpringDataQueryDaoImpl<Model> implements ModelDao {
    
    
    public ModelDaoImpl(){
        super(Model.class);
    }
    
    /**
     * 分页查询相关信息，根据传入的bean类对象和分页对象page取得查询结果集List
     * @param modelCondition 查询类
     * @param pageable 传入的分页对象
     * @return 符合条件的查询结果集
     * @author codegenerator
     * 
     */
    @Override 
    public Page<Model> list(ModelCondition modelCondition,Pageable pageable){
        StringBuilder sb=new StringBuilder("select model from Model model  where 1=1  ");
        Map<String,Object> params = new HashMap<>(16);
        return queryByJpql(sb.toString(), params, pageable);
    }

    @Override 
    public List<Model> list(ModelCondition modelCondition){
        StringBuilder sb=new StringBuilder("select model from Model model  where 1=1  ");
        Map<String,Object> params = new HashMap<>(16);
        return queryByJpql(sb.toString(), params);
    }
    
    
    @Override 
    public Page< Map<String,Object>> listBySql(ModelCondition condition,Pageable pageable){
        StringBuilder sb=new StringBuilder("select id,author,comment,description,model,module_package,package_name,project_id,table_name from model  where 1=1  ");
        Map<Integer,Object> params = new HashMap<>(16);
        return queryFieldsBySql(sb.toString(), params, pageable);
    }
    
    @Override 
    public Model findBy(String field,Object value){
        StringBuilder sb=new StringBuilder("select model from Model model  where model.");
        sb.append(field);
        sb.append(" = :value ");
        Map<String,Object> params = new HashMap<>(16);
        params.put("value",value);
        List<Model> result = queryByJpql(sb.toString(), params,0l,1l);
        return result.isEmpty() ? null : result.get(0);
    }
    
    @Override 
    public List<Model> findAllBy(String field,Object value){
        StringBuilder sb=new StringBuilder("select model from Model model  where model.");
        sb.append(field);
        sb.append(" = :value ");
        Map<String,Object> params = new HashMap<>(16);
        params.put("value",value);
        return queryByJpql(sb.toString(), params);
    }
    
    
}