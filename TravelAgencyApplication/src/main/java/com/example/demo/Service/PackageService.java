package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.PackageRepository;
import com.example.demo.Model.Booking;
import com.example.demo.Model.Package;

import java.util.List;

@Service
public class PackageService {
	 @Autowired
	    private PackageRepository packageRepository;

	    public List<Package> getAllPackages() {
	        return packageRepository.findAll();
	    }

	    public Package addPackage(Package tourPackage) {
	        return packageRepository.save(tourPackage);
	    }

	    public void deletePackage(Long id) {
	        packageRepository.deleteById(id);
	    }


}
