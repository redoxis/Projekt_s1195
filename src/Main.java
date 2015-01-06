
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


public class Main {
	public static void main(String[] args) {

	Person rroma = new Person("Radek","Romanowski");
	Person abal = new Person("Agnieszka", "Baldan");
	SuperVisor mgra = new SuperVisor("Michal", "Grabowski");
	SuperVisor kkali = new SuperVisor("Katarzyna", "Kalinowska");
	Sales zam1 = new Sales("2014-01-02",6584452,560);
	Sales zam2 = new Sales("2014-01-02",236952,1400);
	Sales zam3 = new Sales("2014-01-02",8584464,360);
	Role rola = new Role("Sprzdawca");
	Privilege pri = new Privilege("Tworzenie umów");
	
	
	
	
	String url			="jdbc:mysql://localhost";
	String user 		= "root";
	String password 	= " ";
	
	
	try
	{
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection connection = DriverManager.getConnection(url, user, password);
		
		Statement stt = (Statement) connection.createStatement();
		IUnitOfWork uow = new UnitOfWork (connection);
		
     	stt.execute("DROP DATABASE IF EXISTS sklep");
		stt.execute("CREATE DATABASE sklep");
		stt.execute("USE sklep");
		
		stt.execute("DROP TABLE IF EXISTS person");
		stt.execute("CREATE TABLE person(" +
				"id INT NOT NULL AUTO_INCREMENT," +
				"name TEXT," +
				"Surrname TXT," +
				"PRIMARY KEY(id)" +
				");");
		
		stt.execute("DROP TABLE IF EXISTS supervisor");
		stt.execute("CREATE TABLE supervisor(" +
				"id INT NOT NULL AUTO_INCREMENT," +
				"name TEXT," +
				"surrname TEXT," +
				"PRIMARY KEY(id)" +
				");");
		
		stt.execute("DROP TABLE IF EXISTS role");
		stt.execute("CREATE TABLE role(" +
				"id INT NOT NULL AUTO_INCREMENT," +
				"name TEXT," +
				"PRIMARY KEY(id)" +
				");");
		
		
		IRepository<Person> person = new PersonRepository(connection, new PersonBuilder(), uow);	
		IRepository<SuperVisor> superVisor = new SuperVisorRepository(connection, new SuperVisorBuilder(), uow);
		IRepository<Sales> sales = new SalesRepository(connection, new SalesBuilder(), uow);
		
		person.add(rroma);
		person.add(abal);

		
		List<Person> personFromDB = person.getAll();
		
		
		superVisor.add(mgra);
		superVisor.add(kkali);
		
		List<SuperVisor> superVistorFromDB = superVisor.getAll();
		
		sales.add(zam1);
		sales.add(zam2);
		sales.add(zam3);
		
		List<Sales>  salesFromDB = sales.getAll();	
		
		uow.commit();
		for(Person personFromDB1 : personFromDB)
			System.out.println(personFromDB1.getId()+" "+personFromDB1.getName()+" "+personFromDB1.getSurrname());
		
		for (SuperVisor superVisorFromDB:superVistorFromDB)
			System.out.println(superVisorFromDB.getId()+" "+superVisorFromDB.getName()+" "+superVisorFromDB.getSurrname());
		
		for(Sales salesFromDB1:salesFromDB)
			System.out.println(salesFromDB1.getId()+" "+salesFromDB1.getDate()+" "+salesFromDB1.getAcc()+" "+salesFromDB1.getCash());
			
		Sales s = sales.get(1);
		s.setDate("2014-01-05");
		sales.update(s);
			
		
		uow.commit();
		
		for(Sales salesFromDB1: sales.getAll())
			System.out.println(salesFromDB1.getId()+" "+salesFromDB1.getDate()+" "+salesFromDB1.getAcc()+" "+salesFromDB1.getCash());
		
			
		Person p = person.get(1);
		person.delete(p);
		
		
		uow.commit();
		for(Person personFromDB1: person.getAll())
			System.out.println(personFromDB1.getId()+" "+personFromDB1.getName()+" "+personFromDB1.getSurrname());
					
		stt.close();
		connection.close();
		
	}
	catch (Exception e)
	{
		e.printStackTrace();	
		
		System.out.println("blad");
		
	}
	
}
}