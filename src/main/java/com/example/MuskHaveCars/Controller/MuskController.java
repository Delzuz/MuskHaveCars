package com.example.MuskHaveCars.Controller;

import com.example.MuskHaveCars.Classes.Car;
import com.example.MuskHaveCars.Classes.Customer;
import com.example.MuskHaveCars.Classes.GeoLocation;
import com.example.MuskHaveCars.Classes.StartInfo;
import com.example.MuskHaveCars.Repository.CarRepository;
import com.example.MuskHaveCars.Repository.CustomerRepository;
import com.example.MuskHaveCars.Repository.GeoLocationRepository;
import com.example.MuskHaveCars.Repository.RentalRepository;
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
    @Autowired
    CustomerRepository customerRepo;
    @Autowired
    RentalRepository rentalRepository;

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
    public String cookieTest(@RequestParam Integer location, @RequestParam String from, @RequestParam String to, HttpSession session, HttpServletResponse response) throws IOException {
        StartInfo startInfo = new StartInfo(location,from,to);
        //startInfo.setFrom(); osv
        session.setAttribute("startInfo", startInfo);
        /*System.out.println(from);
        System.out.println(to);
        System.out.println(location);*/
        response.sendRedirect("http://localhost:8080/page2");

        return "hej";

    }

    @PostMapping("/postPage2Data")
    public String cookieTest(@RequestParam Integer carButton, HttpSession session, HttpServletResponse response) throws IOException{
        StartInfo bilStartInfo = (StartInfo) session.getAttribute("startInfo");
        System.out.println(bilStartInfo);
        System.out.println(carButton);
        bilStartInfo.setIDcar(carButton);
        session.setAttribute("startInfo",bilStartInfo);


        response.sendRedirect("http://localhost:8080/page3");
        return"bil";
    }

    @PostMapping("/postPage3Data")
    public String customerInfo (@RequestParam String fName, @RequestParam String lName, @RequestParam String address, @RequestParam Integer pnr, @RequestParam String email, @RequestParam String pNumber, @RequestParam String zCode, @RequestParam String cCity, HttpServletResponse response, HttpSession session) throws IOException {

        Customer nyaKunden = new Customer(fName,lName, address,pnr,email, pNumber, zCode, cCity);
        customerRepo.save(nyaKunden);
        StartInfo finalStartInfo = (StartInfo) session.getAttribute("startInfo");
        System.out.println(finalStartInfo);


        /*Car car = (Car) carRepository.findById(1L);*/



        response.sendRedirect("http://localhost:8080/page4");

        return "hej";

    }
}
