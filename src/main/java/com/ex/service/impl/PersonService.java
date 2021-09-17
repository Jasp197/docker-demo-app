package com.ex.service.impl;

import java.util.List;

import com.ex.model.Person;
import com.ex.repo.PersonRepo;
import com.ex.service.IPersonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService implements IPersonService {

	@Autowired
	private PersonRepo personRepo;

	@Override
	public List<Person> getAll() {
		// TODO Auto-generated method stub
		return personRepo.getAll();

	}

	@Override
	public List<Person> listPerson() {
		return personRepo.listPerson();

	}

	@Override
	public List<Person> search(String name) {
		return personRepo.search(name);

	}

	@Override
	public String add(Person p) {

		return personRepo.add(p);
	}

	@Override
	public String delete(int id) {
		return personRepo.delete(id);
	}

	@Override
	public String edit(Person p) {
		return personRepo.edit(p);
	}

}
