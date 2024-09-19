package com.example.placementP.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.placementP.entity.Certificate;
import com.example.placementP.service.CertService;

@RestController
public class CertController {
	
	@Autowired
	private CertService cservice;
	
	
	@PostMapping("/addcert")
	public Certificate addCert(@RequestBody Certificate cert) {
		return cservice.addCert(cert);
	}
	
	
	@GetMapping("/getcert")
	public List<Certificate> getCert() {
		return cservice.getCert();
	}
	
	
	@PutMapping("/updatecert")
	public Certificate updateCertificate (@RequestBody Certificate cert) {
		return cservice.updateCert(cert);
	}
	
	@DeleteMapping("/deletecert/(id)")
	public void deleteMapping (@PathVariable Integer id) {
		cservice.deleteCert(id);
	}
	

}
