package impl;

import java.util.List;

import domian.*;
import repositories.IPersonRepository;


public class DummyPersonRepository implements IPersonRepository {

	private DummyDb db;
	
	
	public DummyPersonRepository(DummyDb db)
	{
		super();
		this.db =db;
	}
	@Override
	public Person get(int id) {
		for(Person p : db.persons)
		{
			if(p.getId()==id)
				return p;
		}
		return null;
	}

	@Override
	public List<Person> getAll() {
		return db.persons;
	}

	@Override
	public void add(Person entity) {
		db.persons.add(entity);
		
	}

	@Override
	public void delete(Person entity) 
	{
		db.persons.remove(entity);
		
	}

	@Override
	public void update(Person entity) 
	{
	
			
	}


	public List<Person> withRole(Role role) 
	{
		return withRole(role.getId());
	}

	@Override
	public List<Person> withRole(String roleName) 
	{
	Role role = null;
		for(Role r: db.roles)
		{
			if(r.getName().equalsIgnoreCase(roleName))
			{
				role = r;
				break;
			}
			
		}
		if(role==null)
			return null;
			return role.getPerson();
		
	}

	@Override
	public List<Person> withRole(int roleId) 
	{
		Role role = null;
		for(Role r: db.roles)
		{
			if(r.getId()==roleId)
			{
				role =r;
				break;
			}
		}
		if(role==null) 
			return null;
			return role.getPerson();
		
	}

}