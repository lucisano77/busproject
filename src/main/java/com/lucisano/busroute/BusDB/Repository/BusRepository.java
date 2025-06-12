package com.lucisano.busroute.BusDB.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucisano.busroute.BusDB.entity.BusRoute;

import java.util.List;

public interface BusRepository extends JpaRepository<BusRoute, Long> {
    List<BusRoute> findByRoute(String route);
}
