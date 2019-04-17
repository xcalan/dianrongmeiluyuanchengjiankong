package com.neu.service;

import java.util.List;



import com.neu.dao.FurDao;
import com.neu.entity.Fur;

import flexjson.JSONSerializer;

public class FurService {
	private FurDao furDao = new FurDao();

	/*
	 * 调用dao得到对象
	 */
	public List<Fur> findAllFurData(){
		return furDao.findAllFurData();
	}
		
	/*
	 * 将数据转成json对象
	 */
	public String toJson(List<Fur> furdatas){
		JSONSerializer serializer = new JSONSerializer();
		serializer.exclude("class");
		return serializer.serialize(furdatas);
	}
	
}
