import java.io.*;
public class Employee {

   String name;
   int experience;
   String designation;
   double salary;

   public Employee(String name) {
      this.name = name;
   }

   public void empExp(int empExp) {
	   experience = empExp;
   }

     public void empDesignation(String empDesig) {
      designation = empDesig;
   }

    public void empSalary(double empSalary) {
      salary = empSalary;
   }

   public void printEmployee() {
      System.out.println("Name:"+ name );
      System.out.println("Experience:" + experience );
      System.out.println("Designation:" + designation );
      System.out.println("Salary:" + salary);
   }
}