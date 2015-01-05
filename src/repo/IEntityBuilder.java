package repo;

import java.sql.ResultSet;

import java.sql.SQLException;

import domian.*;

public interface IEntityBuilder<TEntity extends Entity> {

	public TEntity build(ResultSet rs) throws SQLException;
}
