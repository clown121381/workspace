package com.example.service.impl;

import com.example.entity.Person;
import com.example.service.PersonService;

public class PersonServiceImpl implements PersonService{

	@Override
	public Person getPersonById(int id) {
		Person p = new StudentServiceImpl().getPersonById(id);
		if(p != null) {
			p = new StudentServiceImpl().getPersonById(id);
		}
		return p;
	}

}
 