/*
 *  ProjectRepository 创建于 2018-10-10 16:40:55 版权归作者和作者当前组织所有
 */
package com.linshang.code.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.linshang.code.core.model.Project;

/**
* ProjectRepository: 项目 数据资源层
* 2018-10-10 16:40:55
* @author codegenerator
* @version 1.0
*/
public interface ProjectRepository extends JpaRepository<Project, Long>{


}