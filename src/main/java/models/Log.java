package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Log
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String tinyURL;
    private String url;

    public Log()
    {
	super();
    }
    
    public Log(String tinyURL, String url)
    {
	super();	
	this.tinyURL = tinyURL;
	this.url = url;
    }

    public Long getId()
    {
	return id;
    }

    public void setId(Long id)
    {
	this.id = id;
    }

    public String getTinyURL()
    {
	return tinyURL;
    }

    public void setTinyURL(String tinyURL)
    {
	this.tinyURL = tinyURL;
    }

    public String getUrl()
    {
	return url;
    }

    public void setUrl(String url)
    {
	this.url = url;
    }

    @Override
    public String toString()
    {
	return "Log [id=" + id + ", tinyURL=" + tinyURL + ", url=" + url + "]";
    }
}
