/*
 * 
 *  Project 创建于 2018-10-10 16:40:55 版权归作者和作者当前组织所有
 */
package com.linshang.code.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
* Project: 项目 数据领域模型
* 2018-10-10 16:40:55
*@author codegenerator
*@version 1.0
*/
@Entity
@Table(name="project")
public class Project {
    /**
     * 
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",columnDefinition="COMMENT ''")
    private Long id;

    /**
     * 
     */
    @Column(name="comment",columnDefinition="COMMENT ''")
    private String comment;

    /**
     * 
     */
    @Column(name="database_name",columnDefinition="COMMENT ''")
    private String databaseName;

    /**
     * 
     */
    @Column(name="description",columnDefinition="COMMENT ''")
    private String description;

    /**
     * 
     */
    @Column(name="group_package",columnDefinition="COMMENT ''")
    private String groupPackage;

    /**
     * 
     */
    @Column(name="module_package",columnDefinition="COMMENT ''")
    private String modulePackage;

    /**
     * 
     */
    @Column(name="path",columnDefinition="COMMENT ''")
    private String path;

    /**
     * 
     */
    @Column(name="project_name",columnDefinition="COMMENT ''")
    private String projectName;

    /**
     * 
     */
    @Column(name="template",columnDefinition="COMMENT ''")
    private String template;


    /** 
	* @return id ：
	*/
    public Long getId() {
        return id;
    }
    /** 
    *@param id 设置 
    */
    public void setId(Long id) {
        this.id = id;
    }

    /** 
	* @return comment ：
	*/
    public String getComment() {
        return comment;
    }
    /** 
    *@param comment 设置 
    */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /** 
	* @return databaseName ：
	*/
    public String getDatabaseName() {
        return databaseName;
    }
    /** 
    *@param databaseName 设置 
    */
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /** 
	* @return description ：
	*/
    public String getDescription() {
        return description;
    }
    /** 
    *@param description 设置 
    */
    public void setDescription(String description) {
        this.description = description;
    }

    /** 
	* @return groupPackage ：
	*/
    public String getGroupPackage() {
        return groupPackage;
    }
    /** 
    *@param groupPackage 设置 
    */
    public void setGroupPackage(String groupPackage) {
        this.groupPackage = groupPackage;
    }

    /** 
	* @return modulePackage ：
	*/
    public String getModulePackage() {
        return modulePackage;
    }
    /** 
    *@param modulePackage 设置 
    */
    public void setModulePackage(String modulePackage) {
        this.modulePackage = modulePackage;
    }

    /** 
	* @return path ：
	*/
    public String getPath() {
        return path;
    }
    /** 
    *@param path 设置 
    */
    public void setPath(String path) {
        this.path = path;
    }

    /** 
	* @return projectName ：
	*/
    public String getProjectName() {
        return projectName;
    }
    /** 
    *@param projectName 设置 
    */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /** 
	* @return template ：
	*/
    public String getTemplate() {
        return template;
    }
    /** 
    *@param template 设置 
    */
    public void setTemplate(String template) {
        this.template = template;
    }


}