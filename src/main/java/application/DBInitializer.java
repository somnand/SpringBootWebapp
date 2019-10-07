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

	Log l1 = new Log("bit.ly/", "www.tinyurl.com/long-url-001");
	tinyDAO.save(l1);

	System.out.println("Database initialization finised");
    }
}