package impl;

import java.util.List;

import domian.*;
import repositories.*;



public class DummyRoleRepository implements IRepository<Role> {

	private DummyDb db;
	
	
	public DummyRoleRepository(DummyDb db)
	{
		super();
		this.db =db;
	}
	public void add(Role entity) {
		db.role.add(entity);
	}
	
	public void update(Role entity) 
	{
		// TODO Auto-generated method stub
		
	}
	public void delete(Role entity) 
	{
		db.role.remove(entity);
	}
	
	public Role get(int id) 
	{
		for(Role role : db.role)
			if(role.getId()==id)
				return role;
		return null;
	}
	public List<Role> getAll() 
	{		

		return db.role;
	}
}