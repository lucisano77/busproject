package com.lucisano.busroute.BusDB.Service;

import com.lucisano.busroute.BusDB.entity.Bus;
import com.lucisano.busroute.BusDB.Repository.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusService {

    @Autowired
    private BusRepository busRepository;

    // Fetch all buses
    public List<Bus> getAllBus() {
        return busRepository.findAll();
    }

    // Fetch buses by route name
    public List<Bus> getBusByRoute(String route) {
        return busRepository.findByRoute(route);
    }

    // Fetch a single bus by ID
    public Bus getBusById(Long id) {
        return busRepository.findById(id).orElse(null); // Returns null if not found
    }
}