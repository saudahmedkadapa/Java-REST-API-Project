package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Booking;
import com.example.demo.Repository.BookingRepository;
import java.util.List;

@Service
public class BookingService {
	 @Autowired
	    private BookingRepository bookingRepository;

	    public List<Booking> getAllBookings() {
	        return bookingRepository.findAll();
	    }

	    public Booking saveBooking(Booking booking) {
	        return bookingRepository.save(booking);
	    }

}
