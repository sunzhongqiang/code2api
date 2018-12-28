/*
 *  ModelRepository 创建于 2018-10-10 16:42:39 版权归作者和作者当前组织所有
 */
package com.linshang.code.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.linshang.code.core.model.Model;

/**
* ModelRepository: 模块 数据资源层
* 2018-10-10 16:42:39
* @author codegenerator
* @version 1.0
*/
public interface ModelRepository extends JpaRepository<Model, Long>{


}