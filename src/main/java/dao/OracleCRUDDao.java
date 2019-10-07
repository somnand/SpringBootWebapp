package dao;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import models.Person;

@Repository("crudDAO")
public interface OracleCRUDDao extends CrudRepository<Person, UUID>
{}
