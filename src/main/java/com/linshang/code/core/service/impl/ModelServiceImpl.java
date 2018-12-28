package com.linshang.code.core.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.linshang.code.core.condition.ModelCondition;
import com.linshang.code.core.dao.ModelDao;
import com.linshang.code.core.dao.ModelRepository;
import com.linshang.code.core.model.Model;
import com.linshang.code.core.service.ModelService;
import com.mmk.gene.service.impl.BaseServiceImpl;
/**
* ModelServiceImpl: 模块 业务服务层实现
* 2018-10-10 16:42:39
* @author codegenerator
* @version 1.0
*/
@Service
public class ModelServiceImpl extends BaseServiceImpl<Model, Long> implements ModelService {

    private Log log = LogFactory.getLog(this.getClass());
    @Resource
    private ModelDao modelDao;
    
    private ModelRepository modelRepository;
    /**
    *构造方法
    * @param modelRepository 数据容器
    */
    @Autowired
    public ModelServiceImpl( ModelRepository modelRepository) {
        super(modelRepository);
        this.modelRepository = modelRepository;
    }

    @Override
    public Page<Model> list(ModelCondition modelCondition, Pageable pageable) {
        log.info("模块查询列表");
        return modelDao.list(modelCondition, pageable);
    }
    
    @Override
    public List<Model> list(ModelCondition modelCondition) {
        log.info("模块查询列表无分页");
        return modelDao.list(modelCondition);
    }

    @Override 
    public Model findBy(String field,Object value){
        log.info("模块根据字["+field+"="+value+"] 进行查询符合条件的唯一值");
        return modelDao.findBy(field,value);
    }
    
    @Override 
    public List<Model> findAllBy(String field,Object value){
        log.info("模块根据字["+field+"="+value+"] 进行查询符合条件的所有记录");
        return modelDao.findAllBy(field,value);
    }
}