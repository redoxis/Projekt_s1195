package repositories;

import java.util.List;

import domian.*;


public interface IPrivilegeRepository extends IRepository<Privilege> {


	public List<Privilege> withPrivilege(String PprivilegeName);
	public List<Privilege> withPrivilege(int privilegeId);
}