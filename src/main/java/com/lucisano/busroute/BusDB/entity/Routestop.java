package com.lucisano.busroute.BusDB.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
@Entity
@Table(name = "routestop")
public class Routestop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generate primary key
    private Long id;
    @Column(name = "route")
    private String route;

    @Column(name = "bound")
    private String bound;

    @Column(name = "service_type")
    private int serviceType;

    @Column(name = "seq")
    private int seq;

    @Column(name = "stop")
    private String stop;

      public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    // Getter and Setter for bound
    public String getBound() {
        return bound;
    }

    public void setBound(String bound) {
        this.bound = bound;
    }

    // Getter and Setter for serviceType
    public int getServiceType() {
        return serviceType;
    }

    public void setServiceType(int serviceType) {
        this.serviceType = serviceType;
    }

    // Getter and Setter for seq
    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    // Getter and Setter for stop
    public String getStop() {
        return stop;
    }

    public void setStop(String stop) {
        this.stop = stop;
    }

}
