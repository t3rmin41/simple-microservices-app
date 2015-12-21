package my.simple.truck;

import java.util.List;

import javax.inject.Inject;

import my.vehicle.entity.Truck;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TruckController {

    @Inject
    private TruckService truckService;
    
    @ResponseBody
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "Truck Service is running";
    }
    
    @ResponseBody
    @RequestMapping(value = "/trucks", method = RequestMethod.GET)
    public List<Truck> getTrucks() {
        return truckService.getAllTrucks();
    }
    
    @ResponseBody
    @RequestMapping(value = "/truck/{truckId}", method = RequestMethod.GET) 
    public Truck getTruckById(@PathVariable("truckId") Long truckId) {
        return truckService.getTruckById(truckId);
    }
}
