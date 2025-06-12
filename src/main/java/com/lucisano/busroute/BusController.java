package com.lucisano.busroute;

import com.lucisano.busroute.BusDB.entity.Bus;
import com.lucisano.busroute.BusDB.Service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bus")
public class BusController {

    @Autowired
    private BusService busService;

    // Get all buses
    @GetMapping("/all")
    public List<Bus> getAllBus() {
        return busService.getAllBus();
    }

    // Get buses by route name
    @GetMapping("/byRoute")
    public List<Bus> getBusesByRouteName(@RequestParam String routeName) {
        return busService.getBusByRoute(routeName);
    }


}