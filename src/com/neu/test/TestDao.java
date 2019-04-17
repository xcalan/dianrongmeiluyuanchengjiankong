package com.neu.test;

import java.util.List;

import javax.sql.DataSource;

import org.junit.Test;



import com.neu.dao.FurDao;
import com.neu.entity.Fur;
//import com.neu.dao.NetDao;
//import com.neu.entity.Net;
import com.neu.service.FurService;
import com.neu.utils.DataSourceUtils;

public class TestDao {
	
	FurDao furDao = new FurDao();
	FurService furService = new FurService();
	
	@Test
	public void testGetDataSource(){
		DataSource ds = DataSourceUtils.getDataSource();
		System.out.println(ds);
	}

	@Test
	public void testFindAllFurData(){
		List<Fur> nets = furDao.findAllFurData();
		for(Fur net : nets){
			System.out.println(net);
		}
	}
	
	@Test
	public void testToJson(){
		List<Fur> furs = furService.findAllFurData();
		String toJson = furService.toJson(furs);
		System.out.println(toJson);
	}
}
