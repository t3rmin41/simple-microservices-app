package my.simple.truck;

import java.util.LinkedHashMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.endpoint.InfoEndpoint;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class TruckApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(TruckApplication.class, args);
        System.out.println("Truck service has started");
        System.out.println("Application context ID : " + context.getId());
    }
    
    @Bean
    public InfoEndpoint infoEndpoint() {
         final LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
         map.put("description", "Truck service");
         return new InfoEndpoint(map);
    }
}
