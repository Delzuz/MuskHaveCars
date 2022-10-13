package com.example.MuskHaveCars.Controller;

import com.example.MuskHaveCars.Classes.*;
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
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import static java.time.temporal.ChronoUnit.DAYS;

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
        Long idLocation = Long.valueOf(finalStartInfo.getIDlocation());
        Long idCar = Long.valueOf(finalStartInfo.getIDcar());
        LocalDate fromDate = LocalDate.parse(finalStartInfo.getFrom());
        LocalDate toDate = LocalDate.parse(finalStartInfo.getTo());



        GeoLocation geoLocation = geoRepository.findById(idLocation).orElse(null);
        Car car = carRepository.findById(idCar).orElse(null);



        Long dateDiff = DAYS.between(fromDate, toDate);
        assert car != null;
        Long totalPriceLong = car.getCarSegment().getPrice()*dateDiff;
        Integer totalPrice = Math.toIntExact(totalPriceLong);
        System.out.println(totalPrice);
        Rental rental = new Rental(fromDate, toDate, totalPrice);

        rental.setCustomer(nyaKunden);
        rental.setCar(car);
        System.out.println(rental);
        rentalRepository.save(rental);


        response.sendRedirect("http://localhost:8080/page4");

        return "hej";

    }

    @GetMapping("/car")
    public Car carToReturn(HttpSession session) {

        /*
        StartInfo startInfo = (StartInfo) session.getAttribute("startInfo");
        Long carId = Long.valueOf(startInfo.getIDcar());
        List<Car> cars = (List<Car>) carRepository.findById(carId).orElse(null);
         */
        StartInfo startInfo = (StartInfo) session.getAttribute("startInfo");
        Long carId = Long.valueOf(startInfo.getIDcar());
        Car car = carRepository.findById(carId).get();

        System.out.println(car);
        return car;
    }

}
