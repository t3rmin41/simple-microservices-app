package my.simple.truck;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableDiscoveryClient
public class TruckApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(TruckApplication.class, args);
        System.out.println("Truck service has started");
    }
}
