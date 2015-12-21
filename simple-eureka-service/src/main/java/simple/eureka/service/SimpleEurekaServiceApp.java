package simple.eureka.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SimpleEurekaServiceApp {
    public static void main(String args[]) {
        SpringApplication.run(SimpleEurekaServiceApp.class, args);
    }
}