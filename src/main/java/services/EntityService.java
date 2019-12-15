package services;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.EntityDAO;
import models.Person;
@Service
public class EntityService 
{
	@Autowired
	private EntityDAO entityDAO;//TODO link to DAO
	
	public boolean selectPersonById(Integer id)
	{
		if(entityDAO.viewEntity(id).size()>0)
			return true;//Entity is present
		else
			return false;
	}
	

}
