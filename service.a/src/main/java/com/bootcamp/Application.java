package com.bootcamp;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
//import org.springframework.context.annotation.Lazy;

@EnableCircuitBreaker
@EnableEurekaClient
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class Application {

//	  @Autowired
//	    @Lazy
//	    private Application application;
//	  
//	  @Value("${spring.application.name}")
//	    private String appName;
//	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

//	public Application getApplication() {
//		return application;
//	}
//
//	public void setApplication(Application application) {
//		this.application = application;
//	}
//
//	public String getAppName() {
//		return appName;
//	}
//
//	public void setAppName(String appName) {
//		this.appName = appName;
//	}

}
