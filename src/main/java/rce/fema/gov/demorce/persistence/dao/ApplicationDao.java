package rce.fema.gov.demorce.persistence.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import rce.fema.gov.demorce.model.Application;

import java.util.List;

@Repository
public interface ApplicationDao extends CrudRepository<Application, String> {

//    @Query("select u from application u")
    List<Application> findAll();
}
