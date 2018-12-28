package com.linshang.code.generator.model;

import java.util.List;

import com.linshang.code.core.model.Field;
import com.linshang.code.core.model.Model;
import com.linshang.code.core.model.Project;

public class BuildData {
	private Project project;
	private Model model;
	private List<Field> fieldList;
	
	
	public Model getModel() {
		return model;
	}
	public void setModel(Model model) {
		this.model = model;
	}
	public List<Field> getFieldList() {
		return fieldList;
	}
	public void setFieldList(List<Field> fieldList) {
		this.fieldList = fieldList;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
}
