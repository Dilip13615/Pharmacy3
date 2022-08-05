package com.xadmin.usermanagement.bean;

public class User {
	 
		protected int id;
		protected String name;
		protected String email;
		protected String password;
		protected String address;
		protected String contactno;
		protected String medicine;
		public User() {
		}
		
		public User( String name, String email, String password, String address,String contactno,String medicine) {
			super();
			this.name = name;
			this.email = email;
			this.password=password;
			this.address = address;
			this.contactno = contactno;
			this.medicine = medicine;
		}

		public User(int id, String name, String email, String password, String address,String contactno,String medicine) {
			super();
			this.id = id;
			this.name = name;
			this.email = email;
			this.password=password;
			this.address = address;
			this.contactno = contactno;
			this.medicine = medicine;
		}

		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getContactno() {
			return contactno;
		}
		public void setContactno(String contactno) {
			this.contactno = contactno;
		}
		public String getMedicine() {
			return medicine;
		}
		public void setMedicine(String medicine) {
			this.medicine = medicine;
		}
	}


