//***********************************************************************
// Project: Lab 4
//
// Author: Craig Tuschhoff
//
// Completion time: 3 hours total
//
// Honor Code: I pledge that this program represents my own program code.
// I received help from (write names here or no one) in designing and
// debugging my program.
//***********************************************************************

public class StudentEmployee extends Employee {

private int hoursWorked;
private boolean isWorkStudy;
private double payRate;

   //constructor
   public StudentEmployee(String name, String id, String isworking,
      String hoursworked, String workstudy, String payrate) {
      
      //call the superclass constructor
      super(name, id, isworking);
         
      //handle fields specific to StudentEmployee
      hoursWorked = Integer.valueOf(hoursworked);
      payRate = Double.valueOf(payrate);
         
      if(workstudy.equalsIgnoreCase("true")) {
         isWorkStudy = true;
      } else {
         isWorkStudy = false;
      }
   }
   
   public double getPayRate() {
      return payRate;
   }
   
   public void setPayRate(double rate) {
      payRate = rate;
   }
   
   public String toString() {
      return super.toString() + "\t" + hoursWorked + "\t" +
         isWorkStudy + "\t" + payRate;
   }
}