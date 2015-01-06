package repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domian.*;
import repositories.*;
import unitofwork.IUnitOfWork;

public class RoleRepository extends Repository<Role> implements IRoleRepository
{

	protected RoleRepository(Connection connection, IEntityBuilder<Role> builder, IUnitOfWork uow) {
		super(connection, builder, uow);
	}

	@Override
	public void setUpUpdateQuery(Role entity) throws SQLException {
		update.setInt(1, entity.getId());
		update.setString(2, entity.getName());
	
	
	}

	@Override
	public void setUpInsertQuery(Role entity) throws SQLException {	
		insert.setString(1, entity.getName());
		
		
	}

	@Override
	protected String getTableName() {
		return "role";
	}

	@Override
	public String getInsertQuery() {
		return "INSERT INTO role(name) values(?)";
	}

	@Override
	public String getUpdateQuery() {
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

	@Override
	protected void setUpUpdate(Role entity) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void setUpInsert(Role entity) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected String getUpdate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String getInsert() {
		// TODO Auto-generated method stub
		return null;
	}

}
