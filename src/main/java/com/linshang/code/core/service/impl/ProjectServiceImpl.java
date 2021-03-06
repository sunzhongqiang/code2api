package com.linshang.code.core.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.linshang.code.core.condition.ProjectCondition;
import com.linshang.code.core.dao.ProjectDao;
import com.linshang.code.core.dao.ProjectRepository;
import com.linshang.code.core.model.Project;
import com.linshang.code.core.service.ProjectService;
import com.mmk.gene.service.impl.BaseServiceImpl;
/**
* ProjectServiceImpl: 项目 业务服务层实现
* 2018-10-10 16:40:55
* @author codegenerator
* @version 1.0
*/
@Service
public class ProjectServiceImpl extends BaseServiceImpl<Project, Long> implements ProjectService {

    private Log log = LogFactory.getLog(this.getClass());
    @Resource
    private ProjectDao projectDao;
    
    private ProjectRepository projectRepository;
    /**
    *构造方法
    * @param projectRepository 数据容器
    */
    @Autowired
    public ProjectServiceImpl( ProjectRepository projectRepository) {
        super(projectRepository);
        this.projectRepository = projectRepository;
    }

    @Override
    public Page<Project> list(ProjectCondition projectCondition, Pageable pageable) {
        log.info("项目查询列表");
        return projectDao.list(projectCondition, pageable);
    }
    
    @Override
    public List<Project> list(ProjectCondition projectCondition) {
        log.info("项目查询列表无分页");
        return projectDao.list(projectCondition);
    }

    @Override 
    public Project findBy(String field,Object value){
        log.info("项目根据字["+field+"="+value+"] 进行查询符合条件的唯一值");
        return projectDao.findBy(field,value);
    }
    
    @Override 
    public List<Project> findAllBy(String field,Object value){
        log.info("项目根据字["+field+"="+value+"] 进行查询符合条件的所有记录");
        return projectDao.findAllBy(field,value);
    }
}