/*
 * 
 *  字段Controller 创建于 2018-10-10 16:44:05 版权归作者和作者当前组织所有
 */
package com.linshang.code.core.web;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.linshang.code.common.ResultData;
import com.linshang.code.core.condition.FieldCondition;
import com.linshang.code.core.model.Field;
import com.linshang.code.core.service.FieldService;

/**
*@Title: FieldController
*@Description: 字段 的web控制层
*@author codegenerator
*/
@RestController
public class FieldController {
    
    private Log log = LogFactory.getLog(this.getClass());
    
    @Resource 
    private FieldService fieldService;

    /**
     * 跳转至列表页面
     * @return 返回页面以及页面模型
     */
    @RequestMapping("/core/field/list")
    public ResultData list(){
        log.info("字段列表查询");
        ResultData result = new ResultData(true,"字段列表查询");
        result.addData("result", fieldService.findAll());
        return  result;
    }
    
    
    /**
     * 加载表格数据 用户
     * 
     * @param fieldCondition
     *            用户查询参数
     * @param pageable
     *            分页参数
     * @return 查询所得数据
     */
    @RequestMapping("/core/field/gridData")
    @ResponseBody
    public  Page<Field> loadList(FieldCondition fieldCondition, Pageable pageable){
        log.info("获取字段列表数据");
        Page<Field> fieldPage = fieldService.list(fieldCondition,pageable);
        return fieldPage;
    }
    
    
    
    /**
     * 字段数据保存方法
     * @param field 要保存的数据
     * @return field 保存后的数据
     */
    @RequestMapping("/core/field/save")
    @ResponseBody
    public ResultData save(Field field){
        log.info("字段保存");
        try {
            fieldService.save(field);
        } catch (Exception e) {
        	log.error(e.getMessage(),e);
            return new ResultData(false,"字段保存失败");
        }
        return new ResultData(true,"字段保存成功");
    }
    
   
    
    /**
     * 跳转至详细信息页面
     * @param field 参数
     * @return 详情数据
     */ 
    @RequestMapping("/core/field/details")
    @ResponseBody
    public Field details(Field field){
        log.info("字段详细信息");
        field = fieldService.find(field.getId());
        return field;
    }
    
    /**
     * 删除数据操作组方法
     * @param field
     * @return
     */
    @RequestMapping("/core/field/delete")
    public ResultData delete(Field field){
        log.info("字段删除");
        try {
            fieldService.delete(field);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return new ResultData(false, "删除失败");
        }
        return new ResultData(true,"删除成功"); 
    }
    
    /**
     * 批量删除数据操作组方法
     * @param  fieldList
     * @return ture or false 如果成功返回true ,出现错误返回false
     */
    @RequestMapping("/core/field/deleteAll")
    public boolean delete(List<Field> fieldList){
        log.info("字段批量删除");
        try {
            fieldService.delete(fieldList);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return false;
        }
        return true; 
    }
    
}