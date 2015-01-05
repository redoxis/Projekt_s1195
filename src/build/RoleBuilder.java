package build;
import repo.*;
import java.sql.ResultSet;
import java.sql.SQLException;

import domian.*;

public class RoleBuilder implements IEntityBuilder<Role> {

	@Override
	public Role build(ResultSet rs) throws SQLException {
		Role role = new Role();
		role.setName(rs.getString("name"));

		return role;
	}

}
