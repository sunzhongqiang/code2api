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
