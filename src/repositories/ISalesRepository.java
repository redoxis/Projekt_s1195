package repositories;

import java.util.List;

import domian.*;

public interface ISalesRepository extends IRepository<Sales> {

	public List<Sales> withACC(int acc);
	
	public List<Person> withPersonID(int personId);
	List<Sales> withPerson(String name);
}
