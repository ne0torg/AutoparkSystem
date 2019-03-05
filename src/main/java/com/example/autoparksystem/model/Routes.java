package com.example.autoparksystem.model;

import javax.persistence.*;

@Entity
@Table(name = "routes")
public class Routes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "routeNumber")
    private int routeNumber;

    @Column(name = "routeStart")
    private String routeStart;

    @Column(name = "routeFinish")
    private String routeFinish;

    @Column(name = "routeDayPrice")
    private int routeDayPrice;

    @Column(name = "routeDayPlan")
    private int routeDayPlan;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getRouteNumber() {
        return routeNumber;
    }

    public void setRouteNumber(int routeNumber) {
        this.routeNumber = routeNumber;
    }

    public String getRouteStart() {
        return routeStart;
    }

    public void setRouteStart(String routeStart) {
        this.routeStart = routeStart;
    }

    public String getRouteFinish() {
        return routeFinish;
    }

    public void setRouteFinish(String routeFinish) {
        this.routeFinish = routeFinish;
    }

    public int getRouteDayPrice() {
        return routeDayPrice;
    }

    public void setRouteDayPrice(int routeDayPrice) {
        this.routeDayPrice = routeDayPrice;
    }

    public int getRouteDayPlan() {
        return routeDayPlan;
    }

    public void setRouteDayPlan(int routeDayPlan) {
        this.routeDayPlan = routeDayPlan;
    }
}
