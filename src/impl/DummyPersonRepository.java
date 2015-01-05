package impl;

import java.util.List;

import domian.*;
import repositories.*;



public class DummyPersonRepository implements IRepository<Person> {

	private DummyDb db;
	
	
	public DummyPersonRepository(DummyDb db)
	{
		super();
		this.db =db;
	}
	public void add(Person entity) {
		db.persons.add(entity);
	}
	
	public void update(Person entity) 
	{
		// TODO Auto-generated method stub
		
	}
	public void delete(Person entity) 
	{
		db.persons.remove(entity);
	}
	
	public Person get(int id) 
	{
		for(Person person : db.persons)
			if(person.getId()==id)
				return person;
		return null;
	}
	public List<Person> getAll() 
	{

		return db.persons;
	}
}