package com.example.demo.Model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
public class Booking {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String customerName;
	    private String email;
	    private String phone;

	    @ManyToOne
	    @JoinColumn(name = "package_id")
	    private Package bookedPackage;

	    private LocalDate bookingDate;
	    private BigDecimal totalPrice;
		public Booking() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Booking(Long id, String customerName, String email, String phone, Package bookedPackage,
				LocalDate bookingDate, BigDecimal totalPrice) {
			super();
			this.id = id;
			this.customerName = customerName;
			this.email = email;
			this.phone = phone;
			this.bookedPackage = bookedPackage;
			this.bookingDate = bookingDate;
			this.totalPrice = totalPrice;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public Package getBookedPackage() {
			return bookedPackage;
		}
		public void setBookedPackage(Package bookedPackage) {
			this.bookedPackage = bookedPackage;
		}
		public LocalDate getBookingDate() {
			return bookingDate;
		}
		public void setBookingDate(LocalDate bookingDate) {
			this.bookingDate = bookingDate;
		}
		public BigDecimal getTotalPrice() {
			return totalPrice;
		}
		public void setTotalPrice(BigDecimal totalPrice) {
			this.totalPrice = totalPrice;
		}
		@Override
		public String toString() {
			return "Booking [id=" + id + ", customerName=" + customerName + ", email=" + email + ", phone=" + phone
					+ ", bookedPackage=" + bookedPackage + ", bookingDate=" + bookingDate + ", totalPrice=" + totalPrice
					+ "]";
		}
	    
	    

}
