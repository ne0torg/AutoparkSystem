package com.example.autoparksystem.controllers;

import com.example.autoparksystem.model.Cars;
import com.example.autoparksystem.model.Routes;
import com.example.autoparksystem.repos.CarsRepo;
import com.example.autoparksystem.repos.RoutesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class MainController {

    @Autowired
    private RoutesRepo routesRepo;

    @Autowired
    private CarsRepo carsRepo;

    @GetMapping("/")
    public String mainPage(){ return "redirect:/routes"; }

    @GetMapping("/routes")
    public String viewRoutes(Map<String, Object> model){
        model.put("listRoutes", routesRepo.findAll());
        return "routes";
    }

    @GetMapping("/addRoute")
    public String addRouteForm(){
        return "addRoute";
    }

    @PostMapping("/addRoute")
    public String addRoute(
                            @RequestParam(value = "routeNumber") int routeNumber,
                            @RequestParam(value = "routeStart") String routeStart,
                            @RequestParam(value = "routeFinish") String routeFinish,
                            @RequestParam(value = "routeDayPrice") int routeDayPrice,
                            @RequestParam(value = "routeDayPlan") int routeDayPlan){

        Routes newRoute = new Routes();
        newRoute.setRouteNumber(routeNumber);
        newRoute.setRouteStart(routeStart);
        newRoute.setRouteFinish(routeFinish);
        newRoute.setRouteDayPrice(routeDayPrice);
        newRoute.setRouteDayPlan(routeDayPlan);

        routesRepo.save(newRoute);

        return "redirect:/routes";
    }

    @GetMapping("/cars")
    public String cars(Map<String, Object> model){

        model.put("listCars", carsRepo.findAll());
        return "cars";
    }

    @GetMapping("/addCar")
    public String addCarForm(){
        return "addCar";
    }

    @PostMapping("/addCar")
    public String addCar(
                            @RequestParam(value = "carNumber") String carNumber,
                            @RequestParam(value = "carModel") String carModel) {
        Cars newCar = new Cars();
        newCar.setCarModel(carModel);
        newCar.setCarNumber(carNumber);

        carsRepo.save(newCar);

        return "redirect:/cars";

    }
}
