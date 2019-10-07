package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import models.Person;

@Repository("oracleRepo")
public class OracleDataAccessService implements PersonDAO 
{
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public boolean insertPerson(UUID id, Person person) {
		String insertSQL = "insert into persons values(\'"+id+"\',\'"+person.getName()+"\')";
		jdbcTemplate.execute(insertSQL);
		return true;
	}

	@Override
	public List<Person> viewPersons() {
		String viewSQL = "select id,name from persons";
		ResultSetExtractor<List<Person>> rse=new ResultSetExtractor<List<Person>>() {

			@Override
			public List<Person> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Person> resultList = new ArrayList<Person>();
				while(rs.next())
				{
					Person object = new Person(UUID.fromString(rs.getString("id")),rs.getString("name"));
					resultList.add(object);
				}
				
				return resultList;
			}
			
		};
		return jdbcTemplate.query(viewSQL, rse);		
	}

	@Override
	public boolean deletePerson(UUID id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updatePerson(UUID id, Person updatedPerson) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Person selectPersonById(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
