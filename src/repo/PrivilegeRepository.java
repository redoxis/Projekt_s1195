package repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domian.*;
import repositories.*;

public class PrivilegeRepository extends Repository<Privilege> implements IPrivilegeRepository
{

	protected PrivilegeRepository(Connection connection, IEntityBuilder<Privilege> builder) {
		super(connection, builder);
	}

	@Override
	protected void setUpUpdateQuery(Privilege entity) throws SQLException {
		update.setInt(1, entity.getId());
		update.setString(2, entity.getName());
	
	
	}

	@Override
	protected void setUpInsertQuery(Privilege entity) throws SQLException {	
		insert.setString(1, entity.getName());
		
		
	}

	@Override
	protected String getTableName() {
		return "privilege";
	}

	@Override
	protected String getInsertQuery() {
		return "INSERT INTO privilege(name) values(?)";
	}

	@Override
	protected String getUpdateQuery() {
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


}
