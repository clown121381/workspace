package com.dao;

import java.util.List;

import com.city.CityTest;

public interface ICity {
	List<CityTest> finAll();
	int save(CityTest city);
	CityTest findById(Integer c_id);
	CityTest findByNameAndId(int loc_id,String c_name);
	int update(CityTest city);
	int delete(CityTest city);
	//List<CityTest> findPage();
}
