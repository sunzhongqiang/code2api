package com.linshang.code.core.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.linshang.code.core.condition.FieldCondition;
import com.linshang.code.core.dao.FieldDao;
import com.linshang.code.core.dao.FieldRepository;
import com.linshang.code.core.model.Field;
import com.linshang.code.core.service.FieldService;
import com.mmk.gene.service.impl.BaseServiceImpl;
/**
* FieldServiceImpl: 字段 业务服务层实现
* 2018-10-10 16:44:05
* @author codegenerator
* @version 1.0
*/
@Service
public class FieldServiceImpl extends BaseServiceImpl<Field, Long> implements FieldService {

    private Log log = LogFactory.getLog(this.getClass());
    @Resource
    private FieldDao fieldDao;
    
    private FieldRepository fieldRepository;
    /**
    *构造方法
    * @param fieldRepository 数据容器
    */
    @Autowired
    public FieldServiceImpl( FieldRepository fieldRepository) {
        super(fieldRepository);
        this.fieldRepository = fieldRepository;
    }

    @Override
    public Page<Field> list(FieldCondition fieldCondition, Pageable pageable) {
        log.info("字段查询列表");
        return fieldDao.list(fieldCondition, pageable);
    }
    
    @Override
    public List<Field> list(FieldCondition fieldCondition) {
        log.info("字段查询列表无分页");
        return fieldDao.list(fieldCondition);
    }

    @Override 
    public Field findBy(String field,Object value){
        log.info("字段根据字["+field+"="+value+"] 进行查询符合条件的唯一值");
        return fieldDao.findBy(field,value);
    }
    
    @Override 
    public List<Field> findAllBy(String field,Object value){
        log.info("字段根据字["+field+"="+value+"] 进行查询符合条件的所有记录");
        return fieldDao.findAllBy(field,value);
    }
}