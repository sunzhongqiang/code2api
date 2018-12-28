package com.linshang.code.generator.service.impl;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.linshang.code.common.PropertyNameTools;
import com.linshang.code.core.model.Field;
import com.linshang.code.core.service.FieldService;
import com.linshang.code.generator.model.BuildData;
import com.linshang.code.generator.service.BuilderService;

@Service
public class BuilderServiceImpl implements BuilderService {
	
	@Resource
	private FieldService fieldService;
	
	/**
	 * 获得主键类型
	 * @param list
	 * @return
	 */
	private String getPKType(List<Field> list) {
		String pk = "Long";
		for(Field field : list){
			if("Y".equals(field.getIsPk())){
				pk = field.getType();
				break;
			}
		}
		return pk;
	}
	
	/**
	 * 获得主键field并首字母大写返回
	 * @param list
	 * @return
	 */
	private String getPKFieldUp(List<Field> list) {
		String fieldUp = "Id";
		for(Field field : list){
			if("Y".equals(field.getIsPk())){
				fieldUp = PropertyNameTools.firstLetterUpperCase(field.getField());
				break;
			}
		}
		return fieldUp;
	}
	
	/**
	 * 获得主键字段
	 * @param fieldList
	 * @return
	 */
	private Object getPKField(List<Field> fieldList) {
		String fieldUp = "id";
		for(Field field : fieldList){
			if("Y".equals(field.getIsPk())){
				fieldUp = field.getField();
				break;
			}
		}
		return fieldUp;
	}
	
	private Map<String, Object> modelImport(List<Field> fieldList) {
		Map<String, Object> result = new LinkedHashMap<String, Object>();
		for (Field field : fieldList) {
			if ("String".equals(field.getType()) || "Long".equals(field.getType()) || "Integer".equals(field.getType())
					|| "Float".equals(field.getType()) || "Double".equals(field.getType())) 
			{
				continue;
			}
			if("Date".equals(field.getType())){
				if("Date".equals(field.getType())){
					result.put("Date","import java.util.Date;");
					result.put("Temporal","import javax.persistence.Temporal;");
					result.put("TemporalType","import javax.persistence.TemporalType;");
				}
			}
			
		}
		return result;
	}
	
	private String templatePath(String template,String type,String name){
		StringBuilder result = new StringBuilder("templates/");
		if(StringUtils.isNotBlank(template)){
			result.append(template);
			result.append("/");
		}
		result.append(type);
		result.append("/");
		result.append(name);
		result.append(".html");
		return result.toString();
	}

	@Override
	public String buildModel(String template, BuildData data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String buildCondition(String template, BuildData data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String buildRepository(String template, BuildData data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String buildDao(String template, BuildData data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String buildDaoImpl(String template, BuildData data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String buildService(String template, BuildData data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String buildServiceImpl(String template, BuildData data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String buildController(String template, BuildData data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String buildList(String template, BuildData data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String buildForm(String template, BuildData data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String buildDetails(String template, BuildData data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String buildListJs(String template, BuildData data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String buildFormJs(String template, BuildData data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String buildDetailsJs(String template, BuildData data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addIFrame(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String buildAllCode(String template, BuildData data) {
		// TODO Auto-generated method stub
		return null;
	}

}
