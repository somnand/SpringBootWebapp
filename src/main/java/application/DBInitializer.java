package application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

import dao.OracleTinyDAO;
import models.Log;

@EnableJpaRepositories(basePackages = { "dao" })
@Component
public class DBInitializer implements CommandLineRunner
{
    @Autowired
    OracleTinyDAO tinyDAO;

    @Override
    public void run(String[] args)
    {
	System.out.println("Invoking the command line runner **TEST-DATA**");
	long start=System.currentTimeMillis();
	tinyDAO.deleteAll();//Clean the database
	int N=10;
	for(int i=0;i<N;i++)
	{
	    Log l = new Log("bit.ly"+i, "www.tinyurl.com/long-url-00"+i);
	    tinyDAO.save(l);	    
	}
	long end=System.currentTimeMillis();
	System.out.println("Database initialization finised in "+(end-start)+" ms");
    }
}