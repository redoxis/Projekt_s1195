package build;
import repo.*;
import java.sql.ResultSet;
import java.sql.SQLException;

import domian.*;

public class SuperVisorBuilder implements IEntityBuilder<SuperVisor> {

	@Override
	public SuperVisor build(ResultSet rs) throws SQLException {
		SuperVisor superVisor = new SuperVisor();
		superVisor.setId(rs.getInt("id"));
		superVisor.setName(rs.getString("name"));
		superVisor.setSurrname(rs.getString("surrname"));
		superVisor.setActive(rs.getBoolean("active"));
		return superVisor;
	}

}
