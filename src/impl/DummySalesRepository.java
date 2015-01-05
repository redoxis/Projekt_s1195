package impl;

import java.util.List;

import domian.*;
import repositories.*;


public class DummySalesRepository implements IRepository<Sales> {

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



}
	