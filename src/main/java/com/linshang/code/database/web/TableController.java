package com.linshang.code.database.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.collections4.MapUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.linshang.code.common.PropertyNameTools;
import com.linshang.code.database.service.TableService;

/**
*@Title: TableController
*@Description: 表 的web控制层
*@author code generator
*@version 1.0
*@date 2016-07-19 17:15:43
*/
@RestController
public class TableController{
	private Log log = LogFactory.getLog(this.getClass());
	
	@Resource 
	private TableService tableService;
	
	
	/**
	 * @Description 获取数据库的所有数据库
	 * @return
	 */
	@RequestMapping("/db")
	@ResponseBody
	public List<Map<String,Object>> list(){
		log.info("遍历数据库，除了关键数据库");
		return tableService.dbList();
	}

	/**
	 * 根据数据库获取数据库的表
	 * @param name
	 * @return
	 */
	@RequestMapping("/tables")
	@ResponseBody
	public List<Map<String,Object>>  list(String name){
		log.info("遍历数据库中的表");
		List<Map<String, Object>> tableList = tableService.findAllByDb(name);
		return tableList;
	}
	
	
	@RequestMapping("/table")
	@ResponseBody
	public Map<String,Object> info(String db,String table){
		log.info("显示数据库表信息和表字段");
		Map<String, Object> tableComment = tableService.tableComment(db, table);
		Map<String, Object> result = new HashMap<String, Object>(64);
		result.put("TABLE_NAME", tableComment.get("TABLE_NAME"));
		result.put("TABLE_COMMENT", tableComment.get("TABLE_COMMENT"));
		result.put("TABLE_ROWS",tableComment.get("TABLE_ROWS"));
		result.put("AUTO_INCREMENT", tableComment.get("AUTO_INCREMENT"));
		result.put("MODEL", PropertyNameTools.table2Model(MapUtils.getString(tableComment, "TABLE_NAME")));
		
		List<Map<String, Object>> columns = tableService.showDetails(db,table);
		result.put("columns", columns);
		return result;
	}
	
}