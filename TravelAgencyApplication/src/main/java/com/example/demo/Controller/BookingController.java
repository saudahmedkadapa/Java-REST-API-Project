package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Booking;
import com.example.demo.Service.BookingService;
import java.util.List;

@RestController
@RequestMapping("/bookings")
@CrossOrigin(origins = "http://localhost:3000")
public class BookingController {
	
	 @Autowired
	    private BookingService bookingService;

	    @GetMapping
	    public List<Booking> getAllBookings() {
	        return bookingService.getAllBookings();
	    }

	    @PostMapping
	    public Booking saveBooking(@RequestBody Booking booking) {
	        return bookingService.saveBooking(booking);
	    }

}
