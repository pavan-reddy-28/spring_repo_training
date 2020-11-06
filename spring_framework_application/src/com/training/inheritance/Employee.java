package com.training.inheritance;

public class Employee extends Person {

		private String empId;
		
	
	@Override
		public String toString() {
		 System.out.println(super.toString());
			return "Employee [empId=" + empId + "]";
		}


	public String getEmpId() {
			return empId;
		}


		public void setEmpId(String empId) {
			this.empId = empId;
		}


	

}
