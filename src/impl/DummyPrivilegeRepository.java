package impl;

import java.util.List;

import domian.*;
import repositories.*;



public class DummyPrivilegeRepository implements IRepository<Privilege> {

	private DummyDb db;
	
	
	public DummyPrivilegeRepository(DummyDb db)
	{
		super();
		this.db =db;
	}
	public void add(Privilege entity) {
		db.privilege.add(entity);
	}
	
	public void update(Privilege entity) 
	{
		// TODO Auto-generated method stub
		
	}
	public void delete(Privilege entity) 
	{
		db.privilege.remove(entity);
	}
	
	public Privilege get(int id) 
	{
		for(Privilege privilege : db.privilege)
			if(privilege.getId()==id)
				return privilege;
		return null;
	}
	public List<Privilege> getAll() 
	{

		return db.privilege;
	}
}