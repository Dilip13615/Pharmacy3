package com.crud.view;
import java.util.List;
import java.util.Scanner;

import com.crud.controller.PharmacyController;
import com.crud.model.Pharmacy;

public class PharmacyView {
	public static void main(String args[]) throws Exception{
		PharmacyController pharmacyctrl=new PharmacyController();
		 
		int result;
		Pharmacy pharmacy=null;
		int trans_id;
		String username;
		String mode;
		int amount;
		while(true) {
		System.out.println("1.Add Record");
		System.out.println("2.update Record");
		System.out.println("3.Delete Record");
		System.out.println("4.View Records");
		System.out.println("5.view a  Record");
		System.out.println("0.Exit");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter trans_id, username, mode,amount");
			trans_id=sc.nextInt();sc.nextLine();
			username=sc.nextLine();
			mode=sc.nextLine();
			amount=sc.nextInt();sc.nextLine();
			pharmacy=new Pharmacy(trans_id, username, mode,amount);
			 result=pharmacyctrl.insertRecord(pharmacy);
			if(result>0)
				System.out.println("Record Inserted");
			else
				System.out.println("Record not inserted");
			break;
		case 2:
			System.out.println("Enter trans_id, username, mode,amount");
			trans_id=sc.nextInt();sc.nextLine();
			username=sc.nextLine();
			mode=sc.nextLine();
			amount=sc.nextInt();sc.nextLine();
			pharmacy=new Pharmacy(trans_id, username, mode,amount);
			 result=pharmacyctrl.insertRecord(pharmacy);
			if(result>0)
				System.out.println("Record updated");
			else
				System.out.println("Record not updated");
			break;
		case 3:
			System.out.println("Enter trans_id");
			trans_id=sc.nextInt();
			result=pharmacyctrl.deleteRecord(trans_id);
				if(result>0)
					System.out.println("Record Deleted");
				else
					System.out.println("Record not Deleted");
			break;
		case 4:
			List<Pharmacy> list=pharmacyctrl.getAllRecords();
			if(list==null)
				System.out.println("No Record found");
			else{
			for(Pharmacy stud : list){
				System.out.println(stud.getTrans_id()+"\t"+stud.getUsername()+" "+stud.getMode()+" "+stud.getAmount());
			}
			}
			break;
		case 5:
			System.out.println("Enter trans_id");
			trans_id=sc.nextInt();
			pharmacy=pharmacyctrl.getPharmacyByTrans_id(trans_id);
			System.out.println("trans_id="+pharmacy.getTrans_id());
			System.out.println("trans_id="+pharmacy.getUsername());
			System.out.println("trans_id="+pharmacy.getMode());
			System.out.println("trans_id="+pharmacy.getAmount());
			break;
		case 0: System.exit(0);
		}
	}
	}

}
