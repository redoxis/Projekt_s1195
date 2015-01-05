package build;
import repo.*;
import java.sql.ResultSet;
import java.sql.SQLException;

import domian.*;

public class PrivilegeBuilder implements IEntityBuilder<Privilege> {

	@Override
	public Privilege build(ResultSet rs) throws SQLException {
		Privilege privilege = new Privilege();
		privilege.setName(rs.getString("name"));

		return privilege;
	}

}
