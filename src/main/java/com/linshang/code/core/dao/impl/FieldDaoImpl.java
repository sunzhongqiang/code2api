/*
 * 
 *  FieldDaoImpl 创建于 2018-10-10 16:44:05 版权归作者和作者当前组织所有
 */
package com.linshang.code.core.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import com.linshang.code.core.condition.FieldCondition;
import com.linshang.code.core.dao.FieldDao;
import com.linshang.code.core.model.Field;
import com.mmk.gene.dao.impl.SpringDataQueryDaoImpl;



/**
* FieldDaoImpl: 字段 数据持久层接口实现
*@author codegenerator
*@version 1.0
*
*/
@Repository
public class FieldDaoImpl extends SpringDataQueryDaoImpl<Field> implements FieldDao {
    
    
    public FieldDaoImpl(){
        super(Field.class);
    }
    
    /**
     * 分页查询相关信息，根据传入的bean类对象和分页对象page取得查询结果集List
     * @param fieldCondition 查询类
     * @param pageable 传入的分页对象
     * @return 符合条件的查询结果集
     * @author codegenerator
     * 
     */
    @Override 
    public Page<Field> list(FieldCondition fieldCondition,Pageable pageable){
        StringBuilder sb=new StringBuilder("select model from Field model  where 1=1  ");
        Map<String,Object> params = new HashMap<>(16);
        return queryByJpql(sb.toString(), params, pageable);
    }

    @Override 
    public List<Field> list(FieldCondition fieldCondition){
        StringBuilder sb=new StringBuilder("select model from Field model  where 1=1  ");
        Map<String,Object> params = new HashMap<>(16);
        return queryByJpql(sb.toString(), params);
    }
    
    
    @Override 
    public Page< Map<String,Object>> listBySql(FieldCondition condition,Pageable pageable){
        StringBuilder sb=new StringBuilder("select id,column_name,comment,exists_method,field,find_all_by,find_by,input_type,length,list_show,match_type,model_id,nullable,type,validate from field  where 1=1  ");
        Map<Integer,Object> params = new HashMap<>(16);
        return queryFieldsBySql(sb.toString(), params, pageable);
    }
    
    @Override 
    public Field findBy(String field,Object value){
        StringBuilder sb=new StringBuilder("select model from Field model  where model.");
        sb.append(field);
        sb.append(" = :value ");
        Map<String,Object> params = new HashMap<>(16);
        params.put("value",value);
        List<Field> result = queryByJpql(sb.toString(), params,0l,1l);
        return result.isEmpty() ? null : result.get(0);
    }
    
    @Override 
    public List<Field> findAllBy(String field,Object value){
        StringBuilder sb=new StringBuilder("select model from Field model  where model.");
        sb.append(field);
        sb.append(" = :value ");
        Map<String,Object> params = new HashMap<>(16);
        params.put("value",value);
        return queryByJpql(sb.toString(), params);
    }
    
    
}