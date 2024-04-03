package com.learning.core.day1session1;

public interface MedicineInfo {
	void displayLable();

}

class Tablet implements MedicineInfo{
	@Override
	public void displayLable() {
		System.out.println("Store Tablets in a cool dry place.");
	}

}

class Syrup implements MedicineInfo{
	@Override
	public void displayLable() {
		System.out.println("Syrup is consumable only on prescription.");
	}
}

class Ointment implements MedicineInfo{

	@Override
	public void displayLable() {
		System.out.println("Ointement is for external use only.");
		
	}
	

}