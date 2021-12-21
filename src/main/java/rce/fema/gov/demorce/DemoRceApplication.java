package rce.fema.gov.demorce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoRceApplication {


	public static void main(String[] args) {

		SpringApplication.run(DemoRceApplication.class, args);
	}

//	@Bean
//	public String init(ApplicationDao applicationDao){
//		Application application = new Application();
//		application.setId(UUID.randomUUID().toString());
//		application.setApplicantname("Tony Smith");
//		application.setApplicationstatus(true);
//		applicationDao.save(application);
//
//		Application application2 = new Application();
//		application2.setId(UUID.randomUUID().toString());
//		application2.setApplicantname("Mike Madison");
//		application2.setApplicationstatus(true);
//		applicationDao.save(application2);
//		return "something";
//	}

}
