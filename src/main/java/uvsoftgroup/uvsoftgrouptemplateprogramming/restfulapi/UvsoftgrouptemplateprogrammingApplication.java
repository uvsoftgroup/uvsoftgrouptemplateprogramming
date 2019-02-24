package uvsoftgroup.uvsoftgrouptemplateprogramming.restfulapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication(scanBasePackages="uvsoftgroup.uvsoftgrouptemplateprogramming.restfulapi.*")
@EnableAutoConfiguration
@PropertySources({
	@PropertySource(value="classpath:application.properties"),
	@PropertySource(value="classpath:application-dev.properties"),
	@PropertySource(value="classpath:application-prod.properties"),
	@PropertySource(value="classpath:application-qa.properties"),
	@PropertySource(value="classpath:application-rel.properties"),
	@PropertySource(value="classpath:application-ua.properties"),
	@PropertySource(value="classpath:application-tst.properties")
})

public class UvsoftgrouptemplateprogrammingApplication {

	public static void main(String[] args) {
		SpringApplication.run(UvsoftgrouptemplateprogrammingApplication.class, args);
	}
	
	
    
}
