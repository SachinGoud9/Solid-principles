import Departments.*;
import Students.*;


public class College {
	public static void main(String args[]) {
		
		CSE cseDept = new CSE(1,150,650);
		
		ECE eceDept = new ECE(2,120,600);
		
		EEE eeeDept = new EEE(3,100,550);
		
		Civil civilDept = new Civil(4,75,200);
		
		Mech mechDept = new Mech(5,50,250);
		
		
		//displaying information
		
		
		//CSE Information 
		cseDept.displayInfo();
		
		//ECE Information
		eceDept.displayInfo();
		
		//EEE Information
		eeeDept.displayInfo();
		
		//Civil Information
		civilDept.displayInfo();
		
		//Mech Information
		mechDept.displayInfo();
		
		
		//Students Information
		
		
		//Management Students
		Management m = new Management();
		m.donationFee();
		m.tuitionFee();
		
		
		//Scholarship Students
		Scholars sc = new Scholars();
		sc.tuitionFee();
	}
}
