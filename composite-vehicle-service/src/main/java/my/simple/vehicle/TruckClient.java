package my.simple.vehicle;

import java.util.List;

import my.vehicle.entity.Truck;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "truck-service")
@Component
interface TruckClient {

    @RequestMapping(value = "/trucks", method = RequestMethod.GET)
    List<Truck> getTrucks();
    
    @RequestMapping(value = "/truck/{id}", method = RequestMethod.GET)
    Truck getTruckById(@PathVariable("id") Long id);
}
