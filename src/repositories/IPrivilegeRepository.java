package repositories;

import java.sql.SQLException;
import java.util.List;

import domian.*;


public interface IPrivilegeRepository extends IRepository<Privilege> {


	public List<Privilege> withPrivilege(String PprivilegeName);
	public List<Privilege> withPrivilege(int privilegeId);
	void setUpUpdateQuery(Privilege entity) throws SQLException;
	void setUpInsertQuery(Privilege entity) throws SQLException;
	String getInsertQuery();
	String getUpdateQuery();
}