package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Package;

@Repository
public interface PackageRepository extends JpaRepository<Package, Long> {
	
}


