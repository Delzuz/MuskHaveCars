package com.example.MuskHaveCars.Controller;

import com.example.MuskHaveCars.Classes.Car;
import com.example.MuskHaveCars.Repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
public class MuskController {

    @Autowired
    CarRepository carRepository;

    @GetMapping("/cars")
    public List<Car> cars() {
        List<Car> cars = (List<Car>) carRepository.findAll();

        return cars;
    }
    @RequestMapping("/hello")
    void handleThis(HttpServletResponse response) throws IOException {
        response.sendRedirect("https://stackoverflow.com/questions/29085295/spring-mvc-restcontroller-and-redirect");
    }


}
