package my.simple.vehicle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

@Import({VehicleConfiguration.class})
@EnableCircuitBreaker
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class VehicleApplication {

    public static void main(String args[]) {
        ApplicationContext context = SpringApplication.run(VehicleApplication.class, args);
        System.out.println("Vehicle service has started");
        System.out.println("Application context ID : " + context.getId());
    }

}
