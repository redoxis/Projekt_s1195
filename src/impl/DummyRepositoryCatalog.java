package impl;

import domian.*;

import repositories.*;

public class DummyRepositoryCatalog implements IRepositoryCatalog{
	private DummyDb db;
	
	@Override
	public IRepository<Person> getPersons() 
	{
		
		return new DummyPersonRepository(db);
	}

	@Override
	public IRepository<Sales> getSale() 
	{
		
		return new DummySalesRepository(db);
	}

	@Override
	public ISuperVisorRepository getSuperVisor() 
	{
		
		return null;
	}



}
