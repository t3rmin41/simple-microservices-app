package my.simple.vehicle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
//import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.context.ApplicationContext;

@EnableCircuitBreaker
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class VehicleApplication {

    public static void main(String args[]) {
        ApplicationContext context = SpringApplication.run(VehicleApplication.class, args);
        System.out.println("Vehicle service has started");
    }

}
