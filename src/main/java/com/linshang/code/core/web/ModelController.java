/*
 * 
 *  模块Controller 创建于 2018-10-10 16:42:39 版权归作者和作者当前组织所有
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
import com.linshang.code.core.condition.ModelCondition;
import com.linshang.code.core.model.Model;
import com.linshang.code.core.service.ModelService;

/**
*@Title: ModelController
*@Description: 模块 的web控制层
*@author codegenerator
*/
@RestController
public class ModelController {
    
    private Log log = LogFactory.getLog(this.getClass());
    
    @Resource 
    private ModelService modelService;

    /**
     * 跳转至列表页面
     * @return 返回页面以及页面模型
     */
    @RequestMapping("/core/model/list")
    public ResultData list(){
        log.info("模块列表查询");
        ResultData result = new ResultData(true,"模块列表查询");
        result.addData("result", modelService.findAll());
        return  result;
    }
    
    
    /**
     * 加载表格数据 用户
     * 
     * @param modelCondition
     *            用户查询参数
     * @param pageable
     *            分页参数
     * @return 查询所得数据
     */
    @RequestMapping("/core/model/gridData")
    @ResponseBody
    public  Page<Model> loadList(ModelCondition modelCondition, Pageable pageable){
        log.info("获取模块列表数据");
        Page<Model> modelPage = modelService.list(modelCondition,pageable);
        return modelPage;
    }
    
    
    
    /**
     * 模块数据保存方法
     * @param model 要保存的数据
     * @return model 保存后的数据
     */
    @RequestMapping("/core/model/save")
    @ResponseBody
    public ResultData save(Model model){
        log.info("模块保存");
        try {
            modelService.save(model);
        } catch (Exception e) {
        	log.error(e.getMessage(),e);
            return new ResultData(false,"模块保存失败");
        }
        return new ResultData(true,"模块保存成功");
    }
    
   
    
    /**
     * 跳转至详细信息页面
     * @param model 参数
     * @return 详情数据
     */ 
    @RequestMapping("/core/model/details")
    @ResponseBody
    public Model details(Model model){
        log.info("模块详细信息");
        model = modelService.find(model.getId());
        return model;
    }
    
    /**
     * 删除数据操作组方法
     * @param model
     * @return
     */
    @RequestMapping("/core/model/delete")
    public ResultData delete(Model model){
        log.info("模块删除");
        try {
            modelService.delete(model);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return new ResultData(false, "删除失败");
        }
        return new ResultData(true,"删除成功"); 
    }
    
    /**
     * 批量删除数据操作组方法
     * @param  modelList
     * @return ture or false 如果成功返回true ,出现错误返回false
     */
    @RequestMapping("/core/model/deleteAll")
    public boolean delete(List<Model> modelList){
        log.info("模块批量删除");
        try {
            modelService.delete(modelList);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return false;
        }
        return true; 
    }
    
}