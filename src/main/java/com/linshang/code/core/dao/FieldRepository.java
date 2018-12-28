/*
 *  FieldRepository 创建于 2018-10-10 16:44:05 版权归作者和作者当前组织所有
 */
package com.linshang.code.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.linshang.code.core.model.Field;

/**
* FieldRepository: 字段 数据资源层
* 2018-10-10 16:44:05
* @author codegenerator
* @version 1.0
*/
public interface FieldRepository extends JpaRepository<Field, Long>{


}