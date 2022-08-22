package com.hospital.staff.doctor.salary;

class Salary {
	protected void calculateSalary(double amount, double Tax) {
		System.out.println(amount*Tax/100);
	}

	public static void main(String[] args) {
		Salary ob = new Salary();
		ob.calculateSalary(200000, 10 );
	}
}
