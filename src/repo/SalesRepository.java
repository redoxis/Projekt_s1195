package repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domian.*;
import repositories.*;

public class SalesRepository extends Repository<Sales> implements ISalesRepository
{

	protected SalesRepository(Connection connection, IEntityBuilder<Sales> builder) {
		super(connection, builder);
	}

	@Override
	protected void setUpUpdateQuery(Sales entity) throws SQLException {
		update.setInt(1, entity.getId());
		update.setString(2, entity.getDate());
		update.setInt(3, entity.getAcc());
		update.setInt(4, entity.getCash());
	
	}

	@Override
	protected void setUpInsertQuery(Sales entity) throws SQLException {	
		insert.setString(1, entity.getDate());
		insert.setInt(2, entity.getAcc());
		insert.setInt(3, entity.getCash());
	}

	@Override
	protected String getTableName() {
		return "sales";
	}

	@Override
	protected String getInsertQuery() {
		return "INSERT INTO sales(date,acc,cash) values(?,?,?)";
	}

	@Override
	protected String getUpdateQuery() {
		return "update sales set (date,acc,cash)=(?,?,?) where id=?";
	}

	@Override
	public List<Sales> withACC(int acc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> withPersonID(int personId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Sales> withPerson(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
