package Departments;

public class Civil extends DepartmentInformation{
    public Civil(int d,int nE,int nS){
    	deptName="CSE";
    	deptId=d;
    	noOfEmployees=nE;
        noOfStudents=nS;
    }
    
    @Override
    public void displayInfo(){
        System.out.println("Department Name: "+deptName);
        System.out.println("Department ID: "+deptId);
        System.out.println("Number of Emplodyees: "+noOfEmployees);
        System.out.println("Number of Students: "+noOfStudents+"\n");
    }
}
