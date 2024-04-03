package com.learning.core.day1session1;

public class TestClass {
	public static void main(String[] args) {
		MedicineInfo[]medicines = new MedicineInfo[3];
		medicines[0]= new Tablet();
		medicines[1]= new Syrup();
		medicines[2]= new Ointment();
		
		for(MedicineInfo medicine:medicines) {
			medicine.displayLable();
		}
	}

}
