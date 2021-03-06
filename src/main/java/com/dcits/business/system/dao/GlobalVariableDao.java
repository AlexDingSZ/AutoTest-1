package com.dcits.business.system.dao;

import java.util.List;

import com.dcits.business.base.dao.BaseDao;
import com.dcits.business.system.bean.GlobalVariable;

/**
 * 
 * @author xuwangcheng
 * @version 1.0.0.0,20171129
 *
 */
public interface GlobalVariableDao extends BaseDao<GlobalVariable> {
	
	/**
	 * 根据key值查找指定全局变量
	 * @param key
	 * @param variableType 
	 * @return
	 */
	GlobalVariable findByKey(String key);
	
	/**
	 * 更新指定全局变量的value值
	 * @param variableId
	 * @param value
	 */
	void updateValue(Integer variableId, String value);
	
	/**
	 * 根据变量或者模板类型查找
	 * @param variableType
	 * @return
	 */
	List<GlobalVariable> findByVariableType(String variableType);
	
	
}
