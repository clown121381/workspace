package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bean.Country;

@Repository("countryDao")
public class CountryDaoImpl implements CountryDao{

	@Autowired
	public JdbcTemplate jdbcTemplate;
	@Override
	@Transactional
	public void addCountry(Country country) {
		String sql = "insert into country values(?,?)";
		jdbcTemplate.update(sql,country.getId(),country.getName());
	}

}
