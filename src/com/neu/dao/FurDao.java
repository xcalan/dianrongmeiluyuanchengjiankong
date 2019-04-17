package com.neu.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.neu.entity.Fur;
import com.neu.utils.DataSourceUtils;

public class FurDao {
		//通过工具类得到数据源对象，传递给QueryRunner对象
		private QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		
		/*
		 * 查询所有数据
		 */
		public List<Fur> findAllFurData(){
			try {
				List<Fur> list = runner.query("select * from fur_data_simulate", new BeanListHandler<Fur>(Fur.class));
				return list;
			} catch (SQLException e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}
}
