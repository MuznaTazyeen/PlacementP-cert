package com.example.placementP.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.placementP.entity.Certificate;
import com.example.placementP.repository.CertRepo;

@Service
public class CertService {
	
	@Autowired
	private CertRepo crepo;
	
	//adding cert details
	public Certificate addCert(Certificate cert) {
		return crepo.save(cert);
	}
	
	//read cert details
	public List<Certificate> getCert() {
		return crepo.findAll();
	}
	
	//update cert details
	public Certificate updateCert(Certificate cert) {
		
		Integer certID = cert.getId();
		Certificate cert1 = crepo.findById(certID).get();
		cert1.setCollege(cert.getCollege());
		cert1.setYear(cert.getYear());
		return crepo.save(cert1);
		
	}
	
	//delete cert
	public void deleteCert(Integer id) {
		crepo.deleteById(id);
	}

}
