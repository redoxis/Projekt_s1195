
import java.util.List;

import impl.*;
import domian.*;
import repositories.*;
import build.*;
import repo.*;
import unitofwork.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class Main {


	Person rroma = new Person();
	rroma.setName("Radek");
	rroma.setSurrname("Romanowski");
	
	
	String url="jdbc:hsqldb:hsql://localhost/workdb";
	try {
		
		Connection connection = DriverManager.getConnection(url);

		IUnitOfWork uow = new UnitOfWork(connection);
			
		
		
		IRepository<Person> person = new PersonRepository(connection, 
				new PersonBuilder(), uow);
		person.add(rroma);
		
		
		List<Person> personfromDb = person.getAll();
		
		for(Person fromDb : personfromDb)
			System.out.println(fromDb.getId()+" "+fromDb.getName()+" "+fromDb.getSurrname());
		
		Person rroma = person.get(2);
		rroma.setSurrname("Romanowski2");
		person.update(rroma);
		
		Person toDelete = personfromDb.get(0);
		
		person.delete(toDelete);
		
		uow.commit();
		for(Person fromDb : person.getAll())
			System.out.println(fromDb.getId()+" "+fromDb.getName()+" "+fromDb.getSurrname());
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	System.out.println("Koniec");
}

}
