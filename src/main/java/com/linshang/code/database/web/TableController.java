package com.linshang.code.database.web;

import com.linshang.code.common.PropertyNameTools;
import com.linshang.code.database.service.TableService;
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

/**
 * TableController.
 * 
 * <p>获取数据库和表结构的相关新鲜</p>
 * 
 * @author sunzhongqiang
 * @version 1.0
 */
@RestController
public class TableController {
    private Log log = LogFactory.getLog(this.getClass());

    @Resource
    private TableService tableService;


    /**
     * 获取数据库的所有数据库.
     * 
     * @return 当前mysql的所有数据库
     */
    @RequestMapping("/db")
    @ResponseBody
    public List<Map<String, Object>> list() {
        log.info("遍历数据库，除了关键数据库");
        return tableService.dbList();
    }

    /**
     * 根据数据库获取数据库的表.
     * 
     * @param name 数据库名称
     * @return 当前数据库包含的表
     */
    @RequestMapping("/tables")
    @ResponseBody
    public List<Map<String, Object>> listTable(String name) {
        log.info("遍历数据库中的表");
        List<Map<String, Object>> tableList = tableService.findAllByDb(name);
        return tableList;
    }


    /**
     * 获取当前数据库表的详细信息.
     * 
     * @param db 数据库
     * @param table 表
     * @return 该表名称备注和其他相关信息
     */
    @RequestMapping("/info")
    @ResponseBody
    public Map<String, Object> info(String db, String table) {
        log.info("显示数据库表信息和表字段");
        Map<String, Object> tableComment = tableService.tableComment(db, table);
        Map<String, Object> result = new HashMap<String, Object>(64);
        result.put("TABLE_NAME", tableComment.get("TABLE_NAME"));
        result.put("TABLE_COMMENT", tableComment.get("TABLE_COMMENT"));
        result.put("TABLE_ROWS", tableComment.get("TABLE_ROWS"));
        result.put("AUTO_INCREMENT", tableComment.get("AUTO_INCREMENT"));
        String tableName = MapUtils.getString(tableComment, "TABLE_NAME");
        String table2Model = PropertyNameTools.table2Model(tableName);
        result.put("MODEL", table2Model);
        return result;
    }

    /**
     * 获取当前数据库表的字段信息.
     * 
     * @param db 相应数据库
     * @param table 表明
     * @return 该表所包含的字段列表
     */
    @RequestMapping("/fieldList")
    @ResponseBody
    public List<Map<String, Object>> fieldList(String db, String table) {
        log.info("显示数据库表字段信息");
        List<Map<String, Object>> columns = tableService.showDetails(db, table);
        return columns;
    }


}
