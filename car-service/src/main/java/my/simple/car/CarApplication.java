package my.simple.car;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;

@Controller
@EnableDiscoveryClient
@SpringBootApplication
@EnableCircuitBreaker
public class CarApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(CarApplication.class, args);
        System.out.println("Car service has started");
    }
}