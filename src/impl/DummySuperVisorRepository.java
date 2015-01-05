package impl;

import java.util.List;

import domian.*;
import repositories.*;



public class DummySuperVisorRepository implements IRepository<SuperVisor> {

	private DummyDb db;
	
	
	public DummySuperVisorRepository(DummyDb db)
	{
		super();
		this.db =db;
	}
	public void add(SuperVisor entity) {
		db.superVisor.add(entity);
	}
	
	public void update(SuperVisor entity) {
				
	}
	public void delete(SuperVisor entity) 
	{
		db.superVisor.remove(entity);
	}
	
	public SuperVisor get(int id) 
	{
		for(SuperVisor superVisor : db.superVisor)
			if(superVisor.getId()==id)
				return superVisor;
		return null;
	}
	public List<SuperVisor> getAll() 
	{

		return db.superVisor;
	}
}