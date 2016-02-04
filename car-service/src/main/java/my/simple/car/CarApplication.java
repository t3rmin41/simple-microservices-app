package my.simple.car;

import java.util.LinkedHashMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.endpoint.InfoEndpoint;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;

@Import({CarConfiguration.class})
@Controller
@EnableDiscoveryClient
@SpringBootApplication
@EnableCircuitBreaker
public class CarApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(CarApplication.class, args);
        System.out.println("Car service has started");
        System.out.println("Application context ID : " + context.getId());
    }
    
    @Bean
    public InfoEndpoint infoEndpoint() {
         final LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
         map.put("description", "Car service");
         return new InfoEndpoint(map);
    }
}