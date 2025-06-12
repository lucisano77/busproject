package com.lucisano.busroute.BusDB.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucisano.busroute.BusDB.entity.Bus;

import java.util.List;

public interface BusRepository extends JpaRepository<Bus, Long> {
    List<Bus> findByRoute(String route);
}
