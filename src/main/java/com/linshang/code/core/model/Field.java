/*
 * 
 *  Field 创建于 2018-10-10 16:44:05 版权归作者和作者当前组织所有
 */
package com.linshang.code.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
* Field: 字段 数据领域模型
* 2018-10-10 16:44:05
*@author codegenerator
*@version 1.0
*/
@Entity
@Table(name="field")
public class Field {
    /**
     * 
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",columnDefinition="COMMENT ''")
    private Long id;
    
    @Transient
    private String isPk;

    /**
     * 
     */
    @Column(name="column_name",columnDefinition="COMMENT ''")
    private String columnName;

    /**
     * 
     */
    @Column(name="comment",columnDefinition="COMMENT ''")
    private String comment;

    /**
     * 
     */
    @Column(name="exists_method",columnDefinition="COMMENT ''")
    private Boolean existsMethod;

    /**
     * 
     */
    @Column(name="field",columnDefinition="COMMENT ''")
    private String field;

    /**
     * 
     */
    @Column(name="find_all_by",columnDefinition="COMMENT ''")
    private Boolean findAllBy;

    /**
     * 
     */
    @Column(name="find_by",columnDefinition="COMMENT ''")
    private Boolean findBy;

    /**
     * 
     */
    @Column(name="input_type",columnDefinition="COMMENT ''")
    private String inputType;

    /**
     * 
     */
    @Column(name="length",columnDefinition="COMMENT ''")
    private Long length;

    /**
     * 
     */
    @Column(name="list_show",columnDefinition="COMMENT ''")
    private Boolean listShow;

    /**
     * 
     */
    @Column(name="match_type",columnDefinition="COMMENT ''")
    private String matchType;

    /**
     * 
     */
    @Column(name="model_id",columnDefinition="COMMENT ''")
    private Long modelId;

    /**
     * 
     */
    @Column(name="nullable",columnDefinition="COMMENT ''")
    private Boolean nullable;

    /**
     * 
     */
    @Column(name="type",columnDefinition="COMMENT ''")
    private String type;

    /**
     * 
     */
    @Column(name="validate",columnDefinition="COMMENT ''")
    private String validate;


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
	* @return columnName ：
	*/
    public String getColumnName() {
        return columnName;
    }
    /** 
    *@param columnName 设置 
    */
    public void setColumnName(String columnName) {
        this.columnName = columnName;
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
	* @return existsMethod ：
	*/
    public Boolean getExistsMethod() {
        return existsMethod;
    }
    /** 
    *@param existsMethod 设置 
    */
    public void setExistsMethod(Boolean existsMethod) {
        this.existsMethod = existsMethod;
    }

    /** 
	* @return field ：
	*/
    public String getField() {
        return field;
    }
    /** 
    *@param field 设置 
    */
    public void setField(String field) {
        this.field = field;
    }

    /** 
	* @return findAllBy ：
	*/
    public Boolean getFindAllBy() {
        return findAllBy;
    }
    /** 
    *@param findAllBy 设置 
    */
    public void setFindAllBy(Boolean findAllBy) {
        this.findAllBy = findAllBy;
    }

    /** 
	* @return findBy ：
	*/
    public Boolean getFindBy() {
        return findBy;
    }
    /** 
    *@param findBy 设置 
    */
    public void setFindBy(Boolean findBy) {
        this.findBy = findBy;
    }

    /** 
	* @return inputType ：
	*/
    public String getInputType() {
        return inputType;
    }
    /** 
    *@param inputType 设置 
    */
    public void setInputType(String inputType) {
        this.inputType = inputType;
    }

    /** 
	* @return length ：
	*/
    public Long getLength() {
        return length;
    }
    /** 
    *@param length 设置 
    */
    public void setLength(Long length) {
        this.length = length;
    }

    /** 
	* @return listShow ：
	*/
    public Boolean getListShow() {
        return listShow;
    }
    /** 
    *@param listShow 设置 
    */
    public void setListShow(Boolean listShow) {
        this.listShow = listShow;
    }

    /** 
	* @return matchType ：
	*/
    public String getMatchType() {
        return matchType;
    }
    /** 
    *@param matchType 设置 
    */
    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    /** 
	* @return modelId ：
	*/
    public Long getModelId() {
        return modelId;
    }
    /** 
    *@param modelId 设置 
    */
    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    /** 
	* @return nullable ：
	*/
    public Boolean getNullable() {
        return nullable;
    }
    /** 
    *@param nullable 设置 
    */
    public void setNullable(Boolean nullable) {
        this.nullable = nullable;
    }

    /** 
	* @return type ：
	*/
    public String getType() {
        return type;
    }
    /** 
    *@param type 设置 
    */
    public void setType(String type) {
        this.type = type;
    }

    /** 
	* @return validate ：
	*/
    public String getValidate() {
        return validate;
    }
    /** 
    *@param validate 设置 
    */
    public void setValidate(String validate) {
        this.validate = validate;
    }
	public String getIsPk() {
		return isPk;
	}
	public void setIsPk(String isPk) {
		this.isPk = isPk;
	}


}