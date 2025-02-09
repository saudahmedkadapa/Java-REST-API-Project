package com.example.demo.Model;

import java.math.BigDecimal;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Package {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String name;
	    private String description;
	    private BigDecimal price;
	    private String duration;
	    private Boolean availability;
		public Package() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Package(Long id, String name, String description, BigDecimal price, String duration,
				Boolean availability) {
			super();
			this.id = id;
			this.name = name;
			this.description = description;
			this.price = price;
			this.duration = duration;
			this.availability = availability;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public BigDecimal getPrice() {
			return price;
		}
		public void setPrice(BigDecimal price) {
			this.price = price;
		}
		public String getDuration() {
			return duration;
		}
		public void setDuration(String duration) {
			this.duration = duration;
		}
		public Boolean getAvailability() {
			return availability;
		}
		public void setAvailability(Boolean availability) {
			this.availability = availability;
		}
		@Override
		public String toString() {
			return "Package [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price
					+ ", duration=" + duration + ", availability=" + availability + "]";
		}
	    

}
