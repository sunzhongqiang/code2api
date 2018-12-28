/*
 * 
 *  项目Controller 创建于 2018-10-10 16:40:55 版权归作者和作者当前组织所有
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
import com.linshang.code.core.condition.ProjectCondition;
import com.linshang.code.core.model.Project;
import com.linshang.code.core.service.ProjectService;

/**
*@Title: ProjectController
*@Description: 项目 的web控制层
*@author codegenerator
*/
@RestController
public class ProjectController {
    
    private Log log = LogFactory.getLog(this.getClass());
    
    @Resource 
    private ProjectService projectService;

    /**
     * 跳转至列表页面
     * @return 返回页面以及页面模型
     */
    @RequestMapping("/core/project/list")
    public ResultData list(){
        log.info("项目列表查询");
        ResultData result = new ResultData(true,"项目列表查询");
        result.addData("result", projectService.findAll());
        return  result;
    }
    
    
    /**
     * 加载表格数据 用户
     * 
     * @param projectCondition
     *            用户查询参数
     * @param pageable
     *            分页参数
     * @return 查询所得数据
     */
    @RequestMapping("/core/project/gridData")
    @ResponseBody
    public  Page<Project> loadList(ProjectCondition projectCondition, Pageable pageable){
        log.info("获取项目列表数据");
        Page<Project> projectPage = projectService.list(projectCondition,pageable);
        return projectPage;
    }
    
    
    
    /**
     * 项目数据保存方法
     * @param project 要保存的数据
     * @return project 保存后的数据
     */
    @RequestMapping("/core/project/save")
    @ResponseBody
    public ResultData save(Project project){
        log.info("项目保存");
        try {
            projectService.save(project);
        } catch (Exception e) {
        	log.error(e.getMessage(),e);
            return new ResultData(false,"项目保存失败");
        }
        return new ResultData(true,"项目保存成功");
    }
    
   
    
    /**
     * 跳转至详细信息页面
     * @param project 参数
     * @return 详情数据
     */ 
    @RequestMapping("/core/project/details")
    @ResponseBody
    public Project details(Project project){
        log.info("项目详细信息");
        project = projectService.find(project.getId());
        return project;
    }
    
    /**
     * 删除数据操作组方法
     * @param project
     * @return
     */
    @RequestMapping("/core/project/delete")
    public ResultData delete(Project project){
        log.info("项目删除");
        try {
            projectService.delete(project);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return new ResultData(false, "删除失败");
        }
        return new ResultData(true,"删除成功"); 
    }
    
    /**
     * 批量删除数据操作组方法
     * @param  projectList
     * @return ture or false 如果成功返回true ,出现错误返回false
     */
    @RequestMapping("/core/project/deleteAll")
    public boolean delete(List<Project> projectList){
        log.info("项目批量删除");
        try {
            projectService.delete(projectList);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return false;
        }
        return true; 
    }
    
}