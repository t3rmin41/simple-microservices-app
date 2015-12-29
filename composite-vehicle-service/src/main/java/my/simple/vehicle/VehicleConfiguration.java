package my.simple.vehicle;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
public class VehicleConfiguration extends WebMvcConfigurerAdapter {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/bower_resources/**")
                .addResourceLocations("classpath:/templates/bower_components/");
        registry.addResourceHandler("/app/**")
                .addResourceLocations("classpath:/templates/app/");
    }
}
