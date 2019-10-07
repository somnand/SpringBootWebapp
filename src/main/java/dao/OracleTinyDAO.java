package dao;

import org.springframework.data.repository.CrudRepository;

import models.Log;

public interface OracleTinyDAO extends CrudRepository<Log, Long>
{
    //Auto-implemented at runtime by Spring
}
