package build;
import repo.*;

import java.sql.ResultSet;
import java.sql.SQLException;

import domian.*;

public class PersonBuilder implements IEntityBuilder<Person> {

	@Override
	public Person build(ResultSet rs) throws SQLException {
		Person person = new Person();
		person.setId(rs.getInt("id"));
		person.setName(rs.getString("name"));
		person.setSurrname(rs.getString("surrname"));
		person.setWorkplace(rs.getString("workplace"));
		person.setActive(rs.getBoolean("active"));
		return person;
	}

}
