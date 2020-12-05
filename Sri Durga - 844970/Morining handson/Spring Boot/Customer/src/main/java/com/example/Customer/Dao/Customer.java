package com.example.Customer.Dao;

import java.time.LocalDate;

public class Customer {
	@Entity
	@Table
	public class Customer {

		@Id
		@Column(name="customer_Id")
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int customerID;
		private String name;
		private LocalDate dob;
		public int getCustomerID() {
			return customerID;
		}
		public void setCustomerID(int customerID) {
			this.customerID = customerID;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public LocalDate getDob() {
			return dob;
		}
		public void setDob(LocalDate dob) {
			this.dob = dob;
		}
		public Customer(int customerID, String name, LocalDate dob) {
			super();
			this.customerID = customerID;
			this.name = name;
			this.dob = dob;
		}
		public Customer() {
			super();
		}



	public void setDob(LocalDate dob) {
		// TODO Auto-generated method stub
		
	}
	}

	public void setDob(LocalDate dob) {
		// TODO Auto-generated method stub
		
	}
}
	
