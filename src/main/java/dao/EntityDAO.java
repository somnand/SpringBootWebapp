package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import models.Person;
import models.SimpleEntity;

@Repository
public class EntityDAO
{
	private JdbcTemplate jdbcTemplate;
	
	public List<SimpleEntity> viewEntity(Integer id)
	{
		String viewSQL = "SELECT TOP 1 simple_id FROM simple_entity WHERE simple_id = "+id.toString();
		
		ResultSetExtractor<List<SimpleEntity>> rse=new ResultSetExtractor<List<SimpleEntity>>() {
			@Override
			public List<SimpleEntity> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<SimpleEntity> resultList = new ArrayList<SimpleEntity>();
				while(rs.next())
				{
					SimpleEntity object = new SimpleEntity(Integer.parseInt(rs.getString("simple_id")),rs.getString("simple_value"));
					resultList.add(object);
				}
				
				return resultList;
			}			
		};
		
		return jdbcTemplate.query(viewSQL, rse);
		
	}	
}
