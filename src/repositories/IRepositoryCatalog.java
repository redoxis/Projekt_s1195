
package repositories;

import domian.*;

public interface IRepositoryCatalog {

	public IRepository<Person> getPersons();
	public IRepository<Sales> getSale();
	public ISuperVisorRepository getSuperVisor();
}