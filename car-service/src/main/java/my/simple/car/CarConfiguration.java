package my.simple.car;

import java.util.LinkedHashMap;

import org.springframework.boot.actuate.endpoint.InfoEndpoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
public class CarConfiguration extends WebMvcConfigurerAdapter {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/bower_resources/**")
                .addResourceLocations("classpath:/templates/bower_components/");
        registry.addResourceHandler("/app/**")
                .addResourceLocations("classpath:/templates/app/");
    }
    
    @Bean
    public InfoEndpoint infoEndpoint() {
         final LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
         map.put("description", "Car service");
         return new InfoEndpoint(map);
    }
}
