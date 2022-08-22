package com.hospital.staff.doctor.salary;

interface Main {
	void update();

	void save();

	void delete();

	void search();
}

class Manager implements Main {

	@Override
	public void update() {
		System.out.println("update");
	}

	@Override
	public void save() {
		System.out.println("save");
	}

	@Override
	public void delete() {
		System.out.println("delete");
	}

	@Override
	public void search() {
		System.out.println("search");
	}

}

class Main2 {
	public static void main(String[] args) {
		Manager ob = new Manager();
		ob.delete();
		ob.save();
		ob.update();
		ob.search();
	}

}
