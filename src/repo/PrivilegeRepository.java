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

public class PrivilegeRepository extends Repository<Privilege> implements IPrivilegeRepository
{

	public PrivilegeRepository(Connection connection, IEntityBuilder<Privilege> builder,  IUnitOfWork uow) {
		super(connection, builder, uow);
	}

	@Override
	public void setUpUpdateQuery(Privilege entity) throws SQLException {
		update.setInt(1, entity.getId());
		update.setString(2, entity.getName());
	
	
	}

	@Override
	public void setUpInsertQuery(Privilege entity) throws SQLException {	
		insert.setString(1, entity.getName());
		
		
	}

	@Override
	protected String getTableName() {
		return "privilege";
	}

	@Override
	public String getInsertQuery() {
		return "INSERT INTO privilege(name) values(?)";
	}

	@Override
	public String getUpdateQuery() {
		return "update privilege set (name)=(?) where id=?";
	}

	@Override
	public List<Privilege> withPrivilege(String PprivilegeName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Privilege> withPrivilege(int privilegeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void setUpUpdate(Privilege entity) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void setUpInsert(Privilege entity) throws Exception {
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
