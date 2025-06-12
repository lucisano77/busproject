package com.lucisano.busroute.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lucisano.busroute.BusDB.Service.BusRouteService;
import com.lucisano.busroute.BusDB.entity.BusRoute;

@RestController
@RequestMapping("/bus")
public class BusController {

    @Autowired
    private BusRouteService busService;

    // Get all buses
    @GetMapping("/all")
    public List<BusRoute> getAllBus() {
        return busService.getAllBusRoute();
    }

    // Get buses by route name
    @GetMapping("/byRoute")
    public List<BusRoute> getBusesByRouteName(@RequestParam String routeName) {
        return busService.getBusByRoute(routeName);
    }

    @GetMapping("/insertbusroute")
    public String fetchAndInsertBuses() {
        busService.fetchAndInsertBuses("https://data.etabus.gov.hk/v1/transport/kmb/route/");
        return "Bus fetched and saved successfully!";
    }

}