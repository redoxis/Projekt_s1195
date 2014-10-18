
import java.util.List;

import impl.*;
import domian.*;
import repositories.*;


public class Main {

	public static void main(String[] args) 
	{
		IRepositoryCatalog catalog = new DummyRepositoryCatalog();
		
		List<Person> sprzedawcy = catalog.getPersons().getAll();
		
	}

}
