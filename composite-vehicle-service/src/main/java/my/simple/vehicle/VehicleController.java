package my.simple.vehicle;

import javax.inject.Inject;

import my.vehicle.entity.VehicleSummary;

import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@EnableHystrix
@Controller
public class VehicleController {

    @Inject
    private VehicleService vehicleService;
    
    @ResponseBody
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "Vehicle service running";
    }
    
    @ResponseBody
    @HystrixCommand(commandKey = "getAllVehicles", groupKey = "Vehicles", fallbackMethod = "returnErrorMessage")
    @RequestMapping(value = "/vehicles", method = RequestMethod.GET)
    public VehicleSummary getAllVehicles() {
        return vehicleService.getAllVehicles();
    }

    @HystrixCommand
    private String returnErrorMessage() {
        return "Fallback error message";
    }
}
