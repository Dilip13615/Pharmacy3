package com.crud.service;
import java.util.List;
import com.crud.model.Pharmacy;
public interface PharmacyCrud {
	int insertRecord(Pharmacy pharmacy);
	int updateRecord(Pharmacy pharmacy);
	int deleteRecord(int trans_id);
	List<Pharmacy> getAllRecords();
	Pharmacy getPharmacyByTrans_id(int trans_id);

}
