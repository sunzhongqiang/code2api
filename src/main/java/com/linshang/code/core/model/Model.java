/*
 * 
 *  Model 创建于 2018-10-10 16:42:39 版权归作者和作者当前组织所有
 */
package com.linshang.code.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
* Model: 模块 数据领域模型
* 2018-10-10 16:42:39
*@author codegenerator
*@version 1.0
*/
@Entity
@Table(name="model")
public class Model {
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
    @Column(name="author",columnDefinition="COMMENT ''")
    private String author;

    /**
     * 
     */
    @Column(name="comment",columnDefinition="COMMENT ''")
    private String comment;

    /**
     * 
     */
    @Column(name="description",columnDefinition="COMMENT ''")
    private String description;

    /**
     * 
     */
    @Column(name="model",columnDefinition="COMMENT ''")
    private String model;

    /**
     * 
     */
    @Column(name="module_package",columnDefinition="COMMENT ''")
    private String modulePackage;

    /**
     * 
     */
    @Column(name="package_name",columnDefinition="COMMENT ''")
    private String packageName;

    /**
     * 
     */
    @Column(name="project_id",columnDefinition="COMMENT ''")
    private Long projectId;

    /**
     * 
     */
    @Column(name="table_name",columnDefinition="COMMENT ''")
    private String tableName;


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
	* @return author ：
	*/
    public String getAuthor() {
        return author;
    }
    /** 
    *@param author 设置 
    */
    public void setAuthor(String author) {
        this.author = author;
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
	* @return model ：
	*/
    public String getModel() {
        return model;
    }
    /** 
    *@param model 设置 
    */
    public void setModel(String model) {
        this.model = model;
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
	* @return packageName ：
	*/
    public String getPackageName() {
        return packageName;
    }
    /** 
    *@param packageName 设置 
    */
    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    /** 
	* @return projectId ：
	*/
    public Long getProjectId() {
        return projectId;
    }
    /** 
    *@param projectId 设置 
    */
    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    /** 
	* @return tableName ：
	*/
    public String getTableName() {
        return tableName;
    }
    /** 
    *@param tableName 设置 
    */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }


}