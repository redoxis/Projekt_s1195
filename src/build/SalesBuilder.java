package build;
import repo.*;
import java.sql.ResultSet;
import java.sql.SQLException;

import domian.*;

public class SalesBuilder implements IEntityBuilder<Sales> {

	@Override
	public Sales build(ResultSet rs) throws SQLException {
		Sales sales = new Sales();
		sales.setId(rs.getInt("id"));
		sales.setDate(rs.getString("data"));
		sales.setAcc(rs.getInt("acc"));
		sales.setCash(rs.getInt("cash"));
	
		return sales;
	}

}
