package cn.bnu.aicfe.map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.WebApplicationInitializer;

@SpringBootApplication
public class App extends SpringBootServletInitializer implements WebApplicationInitializer{
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
