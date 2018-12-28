package com.linshang.code.database.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Query;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SQLQuery;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import com.linshang.code.database.dao.TableDao;
import com.linshang.code.database.model.DbTable;
import com.mmk.gene.dao.impl.SpringDataQueryDaoImpl;



/**
*@Title: TableDaoImpl
*@Description: 表 数据持久层接口实现
*@author code generator
*@version 1.0
*@date 2016-07-19 17:15:43
*/
@Repository
public class TableDaoImpl extends SpringDataQueryDaoImpl<DbTable> implements TableDao {
    
    private Log log = LogFactory.getLog(this.getClass());
    
    public TableDaoImpl(){
        super(DbTable.class);
    }
    
    @Override
   	public List<Map<String,Object>> listDb() {
       	log.info("遍历所有数据库");
   		StringBuilder sql = new StringBuilder();
   		sql.append("select SCHEMA_NAME,true as isNode  ,true as leaf from information_schema.SCHEMATA where SCHEMA_NAME not  in('information_schema','mysql','performance_schema')");
   		return queryFieldsBySql(sql.toString(), null);
   	}
    
    
    @Override
	public List<Map<String,Object>> findAll(String db) {
    	log.info("获取当前数据库的所有的表");
		StringBuilder sql = new StringBuilder();
		sql.append("select TABLE_NAME,TABLE_SCHEMA ,true as isNode from information_schema.TABLES where TABLE_SCHEMA = ?1 ");
		return queryFieldsBySql(sql.toString(), null);
	}
    
    @Override
	public Map<String, Object> tableInfo(String db, String table) {
		log.info("获取当前数据库当前表的相信信息");
		String sql = "select TABLE_NAME,TABLE_COMMENT,TABLE_ROWS,AUTO_INCREMENT from information_schema.`TABLES` where TABLE_SCHEMA = ?1 and TABLE_NAME =?2 ";
		Map<Integer, Object> params = new HashMap<>(2);
		params.put(1, table);
		params.put(2, db);
		List<Map<String, Object>> resultList = queryFieldsBySql(sql.toString(), params);
		return (resultList.isEmpty() ? null : resultList.get(0));
	}

	@Override
	public List<Map<String, Object>> showColumn(String db,String table) {
		log.info("获取当前数据当前表的所有字段");
		StringBuilder sql = new StringBuilder();
		sql.append(" SELECT ");
		sql.append(" TABLE_NAME, ");
		sql.append(" COLUMN_NAME  columnName, ");
		sql.append(" DATA_TYPE , ");
		sql.append(" CASE IS_NULLABLE WHEN 'YES' THEN 'Y' ELSE 'N' END nullable, ");
		sql.append(" CASE COLUMN_KEY WHEN 'PRI'  THEN 'Y' ELSE 'N' END isPk, ");
		sql.append(" CASE EXTRA WHEN 'auto_increment' THEN 'Y' ELSE 'N' END autoincrement, ");
		sql.append(" CASE WHEN CHARACTER_MAXIMUM_LENGTH  is NULL and data_type='date'  ");
		sql.append(" 	then 0 when CHARACTER_MAXIMUM_LENGTH  is NULL and DATA_TYPE!='date'  ");
		sql.append(" 	then NUMERIC_PRECISION ELSE CHARACTER_MAXIMUM_LENGTH END length, ");
		sql.append(" COLUMN_COMMENT comment, ");
		sql.append(" 'mysql' as DB_TYPE ");
		sql.append(" FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME = ?1 and  TABLE_SCHEMA= ?2 ");
		Map<Integer, Object> params = new HashMap<>(2);
		params.put(1, table);
		params.put(2, db);
		return queryFieldsBySql(sql.toString(), params );
	}

	
    
    
}