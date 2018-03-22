import java.io.*;
public class EmployeeTest {

   public static void main(String args[]) {
      Employee empOne = new Employee("Tania Hossain");
      Employee empTwo = new Employee("Mohammad Ullah Mahamud");

      empOne.empExp(9);
      empOne.empDesignation("Graphic Designer");
      empOne.empSalary(1000);
      empOne.printEmployee();

      empTwo.empExp(14);
      empTwo.empDesignation("Managing Director");
      empTwo.empSalary(1500);
      empTwo.printEmployee();
   }
}