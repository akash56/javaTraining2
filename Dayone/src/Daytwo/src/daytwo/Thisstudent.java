/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daytwo;

/**
 *
 * @author akash
 */
public class Thisstudent {
  private int studentId=550;
private char studentType;
private String studentName;
public Thisstudent(){
    studentId+=1;
}
public Thisstudent(char sType,String fname, String lname){
    studentName=fname+lname;
    studentType=sType;
    
}
   public void  displayDetails(Thisstudent student){
       System.out.println("Student ID "+student.studentId);
       System.out.println("Student Type "+student.studentType);
       System.out.println("Student Name"+student.studentName);
   } 
public static void main(String args[]){
    Thisstudent studentOne=new Thisstudent('D',"Bony","Thomas");
    studentOne.displayDetails(studentOne);
    Thisstudent studentTwo=new Thisstudent('H',"Dinil","Bose");
    studentTwo.displayDetails(studentTwo);
}

}
