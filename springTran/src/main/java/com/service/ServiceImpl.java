package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Country;
import com.dao.CountryDao;

@Service
public class ServiceImpl implements IService{

	@Autowired
	CountryDao countryDao;
	@Override
	public void addService(Country country) {
		countryDao.addCountry(country);
	}

}
