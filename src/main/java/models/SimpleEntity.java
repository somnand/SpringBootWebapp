package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SimpleEntity 
{
	public SimpleEntity(Integer id, String value) {
		super();
		this.id = id;
		this.value = value;
	}

	@Id
	@Column(name="SIMPLE_ID")
	Integer id;
	
	@Column(name="SIMPLE_VALUE")
	String value;
}
