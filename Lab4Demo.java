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

import java.util.*;
import java.io.*;

public class Lab4Demo {
   public static void main(String[] args) throws FileNotFoundException {
      
      //create array of student employee objects to be filled
      StudentEmployee[] e =  new StudentEmployee[Integer.valueOf(args[0])];
      
      //setup file to be read into memory
      File file = new File(args[1]);
      Scanner inputFile = new Scanner(file);
      inputFile.useDelimiter("\n");
      
      //import one line of the .csv at a time
      for(int i = 0; i < Integer.valueOf(args[0]); i ++){
         String studentData = inputFile.next();
         String[] params = studentData.split(",");
      
         e[i] = new StudentEmployee(params[0], params[1],
         params[2], params[3], params[4], params[5]);
      
         System.out.println(e[i].toString());
      }
      
      //close file
      inputFile.close();
   }
}