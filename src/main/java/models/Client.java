package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="client")
public class Client
{
	@Id
	private int id;
	private String clientName;
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getClientName()
	{
		return clientName;
	}
	public void setClientName(String clientName)
	{
		this.clientName = clientName;
	}	
}
