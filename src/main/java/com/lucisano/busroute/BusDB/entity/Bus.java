package com.lucisano.busroute.BusDB.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bus")
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "route")
    private String route;

    @Column(name = "bound")
    private String bound;

    @Column(name = "service_type")
    private int serviceType;

    @Column(name = "orig_eng")
    private String origEng;

    @Column(name = "orig_tc")
    private String origTc;

    @Column(name = "orig_sc")
    private String origSc;

    @Column(name = "dest_en")
    private String destEn;

    @Column(name = "dest_tc")
    private String destTc;

    @Column(name = "dest_sc")
    private String destSc;

    public Long getId(){
        return id;
    }

    public void setId(Long id){
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

    // Getter and Setter for origEng
    public String getOrigEng() {
        return origEng;
    }

    public void setOrigEng(String origEng) {
        this.origEng = origEng;
    }

    // Getter and Setter for origTc
    public String getOrigTc() {
        return origTc;
    }

    public void setOrigTc(String origTc) {
        this.origTc = origTc;
    }

    // Getter and Setter for origSc
    public String getOrigSc() {
        return origSc;
    }

    public void setOrigSc(String origSc) {
        this.origSc = origSc;
    }

    // Getter and Setter for destEn
    public String getDestEn() {
        return destEn;
    }

    public void setDestEn(String destEn) {
        this.destEn = destEn;
    }

    // Getter and Setter for destTc
    public String getDestTc() {
        return destTc;
    }

    public void setDestTc(String destTc) {
        this.destTc = destTc;
    }

    // Getter and Setter for destSc
    public String getDestSc() {
        return destSc;
    }

    public void setDestSc(String destSc) {
        this.destSc = destSc;
    }
}