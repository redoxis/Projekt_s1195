package impl;

import java.util.List;

import domian.*;
import repositories.ISalesRepository;


public class DummySalesRepository implements ISalesRepository {

	private DummyDb db;
	
	
	public DummySalesRepository(DummyDb db)
	{
		super();
		this.db =db;
	}


	@Override
	public Sales get(int acc) 
	{
	for(Sales s: db.sales)
	{
		if(s.getAcc()==acc)
			return s;
	}

		return null;
	}


	@Override
	public List<Sales> getAll() {
		
		return db.sales;
	}


	@Override
	public void add(Sales entity) 
	{
		db.sales.add(entity);
		
	}


	@Override
	public void delete(Sales entity) 
	{
		
		db.sales.remove(entity);
		
	}


	@Override
	public void update(Sales entity) 
	{
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<Sales> withACC(int acc) 
	{
		
		return null;
	}


	@Override
	public List<Sales> withPerson(String name) 
	{
	Person person =null;
	for(Person p: db.persons)
	{
		if(p.getName()==name)
		{
			person=p;
			break;
		}
	}
	if(person==null)
	
		return null;
	return person.getSales();
	}


	@Override
	public List<Person> withPersonID(int personId) {
		// TODO Auto-generated method stub
		return null;
	}
}
	