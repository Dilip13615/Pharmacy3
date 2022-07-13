package com.crud.controller;

import java.util.List;

import com.crud.model.Pharmacy;
import com.crud.service.PharmacyService;

public class PharmacyController {
	
	 PharmacyService pharmacyservice;
	 public PharmacyController() {
		 pharmacyservice=new PharmacyService();
			 
		}

	public int insertRecord(Pharmacy pharmacy) {
		int result=pharmacyservice.insertRecord(pharmacy);
		return result;
	}



	public int updateRecord(Pharmacy pharmacy) {
		int result=pharmacyservice.updateRecord(pharmacy);
		return result;
		 
	}

	 
	public int deleteRecord(int trans_id) {
		int result=pharmacyservice.deleteRecord(trans_id);
		return result; 
	
	}

	 
	public List<Pharmacy> getAllRecords() {
		List <Pharmacy> list=pharmacyservice.getAllRecords();
		return list;
	}

	 
	public Pharmacy getPharmacyByTrans_id(int trans_id) {
		Pharmacy pharmacy=pharmacyservice.getPharmacyByTrans_id(trans_id);
		return pharmacy;
		 
	}


}
