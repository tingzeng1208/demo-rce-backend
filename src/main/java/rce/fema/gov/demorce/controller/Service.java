package rce.fema.gov.demorce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rce.fema.gov.demorce.persistence.dao.ApplicationDao;
import rce.fema.gov.demorce.model.Application;
import rce.fema.gov.demorce.viewmodel.ApplicationView;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("action")
public class Service {

    @Autowired
    ApplicationDao applicationDao;

    @GetMapping("/list")
    public List<ApplicationView> getAllApplication(){

        List<Application> applications = applicationDao.findAll();

        return applications.stream().map(a->new ApplicationView().map(a)).collect(Collectors.toList());
    }
}
