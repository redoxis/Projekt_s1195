package repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domian.*;
import repositories.*;

public class RoleRepository extends Repository<Role> implements IRoleRepository
{

	protected RoleRepository(Connection connection, IEntityBuilder<Role> builder) {
		super(connection, builder);
	}

	@Override
	protected void setUpUpdateQuery(Role entity) throws SQLException {
		update.setInt(1, entity.getId());
		update.setString(2, entity.getName());
	
	
	}

	@Override
	protected void setUpInsertQuery(Role entity) throws SQLException {	
		insert.setString(1, entity.getName());
		
		
	}

	@Override
	protected String getTableName() {
		return "role";
	}

	@Override
	protected String getInsertQuery() {
		return "INSERT INTO role(name) values(?)";
	}

	@Override
	protected String getUpdateQuery() {
		return "update role set (name)=(?) where id=?";
	}

	@Override
	public List<Person> withRole(String roleName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> withRole(int roleId) {
		// TODO Auto-generated method stub
		return null;
	}

}
