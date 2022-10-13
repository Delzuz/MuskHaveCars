package com.example.MuskHaveCars.Controller;

import com.example.MuskHaveCars.Classes.Car;
import com.example.MuskHaveCars.Classes.GeoLocation;
import com.example.MuskHaveCars.Classes.StartInfo;
import com.example.MuskHaveCars.Repository.CarRepository;
import com.example.MuskHaveCars.Repository.GeoLocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@RestController
public class MuskController {

    @Autowired
    CarRepository carRepository;
    @Autowired
    GeoLocationRepository geoRepository;

    @GetMapping("/cars")
    public List<Car> cars() {
        List<Car> cars = (List<Car>) carRepository.findAll();
        return cars;
    }

    @GetMapping("/geoCities")
    public List<GeoLocation> geoCities () {
       List<GeoLocation> geoCities = (List<GeoLocation>) geoRepository.findAll();
       return  geoCities;

    }

    @PostMapping("/postPage1Data")
    public String cookieTest(@RequestParam String location, @RequestParam String from, @RequestParam String to, HttpSession session, HttpServletResponse response) throws IOException {
        StartInfo startInfo = new StartInfo();
        //startInfo.setFrom(); osv
        session.setAttribute("startInfo", startInfo);
        System.out.println(from);
        System.out.println(to);
        System.out.println(location);
        response.sendRedirect("http://localhost:8080/page2");

        return "hej";

    }

    @PostMapping("/postPage2Data")
    public String cookieTest(@RequestParam String button, HttpSession session, HttpServletResponse response) throws IOException{

        System.out.println("test");
        System.out.println(button);
        response.sendRedirect("http://localhost:8080/page3");
        return"bil";
    }

    @PostMapping("/postPage3Data")
    public String customerInfo (@RequestParam String fName, @RequestParam String lName, @RequestParam String address, @RequestParam Integer pnr, @RequestParam String email, @RequestParam String pNumber, @RequestParam String zCode, @RequestParam String cCity, HttpServletResponse response) throws IOException {
        System.out.println(fName);
        System.out.println(lName);
        System.out.println(address);
        System.out.println(pnr);
        System.out.println(cCity);

        response.sendRedirect("http://localhost:8080/page4");

        return "hej";

    }
}
