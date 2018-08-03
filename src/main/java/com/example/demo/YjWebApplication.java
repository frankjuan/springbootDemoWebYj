package com.example.demo;

import com.example.demo.config.AcmeProperties;
import com.example.demo.util.SpringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@SpringBootApplication
public class YjWebApplication {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(YjWebApplication.class);
		//springApplication.addListeners(new MyEnvListener());
		springApplication.run(args);
	}

	@Component
	public class MyBean {

		@Autowired
		public MyBean(ApplicationArguments args) {
			boolean debug = args.containsOption("debug");
			List<String> files = args.getNonOptionArgs();
			System.out.println("ApplicationArguments......"+ args.getOptionNames());
			// if run with "--debug logfile.txt" debug=true, files=["logfile.txt"]
		}

	}

	@Component
	@Order(2)
	public class MyBeanCommandLineRunner1 implements CommandLineRunner {
		public void run(String... args) {
			System.out.println("MyBeanCommandLineRunner1...");
		}

	}

	@Component
	@Order(1)
	public class MyBeanCommandLineRunner2 implements CommandLineRunner {
		@Autowired
		MyBeanRandom myBeanRandom;
		@Autowired
        AcmeProperties acmeProperties;
		public void run(String... args) {
			System.out.println("MyBeanCommandLineRunner2...");
			myBeanRandom.printRandom();
            AcmeProperties.Security security =acmeProperties.getSecurity();
            System.out.println("acmeProperties.security.password:"+security.getPassword());
			ApplicationContext applicationContext =  SpringUtil.getApplicationContext();
			System.out.println("applicationContext: "+applicationContext);
		}
	}

	@Component
	public class MyBeanRandom {
		@Value("${my.number.in.range}")
		private String random;
		@Value("${my.uuid}")
		private String uuid;
		public void printRandom(){
			System.out.println("random:"+random+","+"uuid:"+uuid);
			System.out.println("random:"+random+","+"uuid:"+uuid);
		}
	}

}
