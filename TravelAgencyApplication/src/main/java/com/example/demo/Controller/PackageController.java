package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Package;
import com.example.demo.Service.PackageService;

import java.util.List;


@RestController
@RequestMapping("/packages")
@CrossOrigin(origins = "http://localhost:3000")
public class PackageController {
	
	 @Autowired
	    private PackageService packageService;

	    @GetMapping
	    public List<Package> getAllPackages() {
	        return packageService.getAllPackages();
	    }

	    @PostMapping
	    public Package addPackage(@RequestBody Package tourPackage) {
	        return packageService.addPackage(tourPackage);
	    }

	    @DeleteMapping("/{id}")
	    public void deletePackage(@PathVariable Long id) {
	        packageService.deletePackage(id);
	    }

}
