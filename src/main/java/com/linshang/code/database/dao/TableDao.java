package com.linshang.code.database.dao;

import java.util.List;
import java.util.Map;

import com.linshang.code.database.model.DbTable;
import com.mmk.gene.dao.SpringDataQueryDao;

/**
 * @Title: TableDao
 * @Description: 表 数据持久层接口
 * @author code generator
 * @version 1.0
 * @date 2016-07-19 17:15:43 Modified By Modified Date
 */
public interface TableDao extends SpringDataQueryDao<DbTable> {

	/**
	 * 遍历数据库的数据库
	 * 
	 * @return
	 */
	List<Map<String, Object>> listDb();

	/**
	 * 获取系统中所有的表
	 * 
	 * @return
	 */
	List<Map<String, Object>> findAll(String db);
	
	/**
	 * 表信息
	 * 
	 * @param db
	 * @param table
	 * @return
	 */
	Map<String, Object> tableInfo(String db, String table);

	/**
	 * 显示所有表的字段新
	 * 
	 * @param db
	 * @param table
	 * @return
	 */
	List<Map<String, Object>> showColumn(String db, String table);

	

}