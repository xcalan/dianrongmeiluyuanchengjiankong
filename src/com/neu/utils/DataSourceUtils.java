package com.neu.utils;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/*
 * 数据源工具类
 */
public class DataSourceUtils {
	
	private static ComboPooledDataSource ds = new ComboPooledDataSource();//创建一个连接池
	
	/*
	 * 得到数据源对象
	 */
	public static DataSource getDataSource(){
		return ds;
	}
}
