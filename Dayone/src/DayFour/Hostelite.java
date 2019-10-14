/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DayFour.Assignment1;



/**
 *
 * @author akash
 */
class Student {
    private int studentId;
    private char studentType;
    private String studentName;
    private double feesPerMonth;
            

public Student(){
}
public Student(int id, char type, String firstName, String lastName){
    this.studentId=id;
    this.studentType=type;
    this.studentName=firstName+lastName;
    
}
public void setStudentId(int id){
    this.studentId=id;
}
public void setStudentType(char type){
    this.studentType=type;
}
public void setStudentName(String firstName,String lastName){
    this.studentName=firstName+lastName;
}
    public void setFeesPerMonth(double fees){
        this.feesPerMonth=fees;
    }
public int getStudentId(){
    return this.studentId;
}
public char getStudentType(){
    return this.studentType;
}
public String getStudentName(){
    return this.studentName;
}
public double getStudentFees(){
    return this.feesPerMonth;
}
public void displayStudentDetails(){
    
}
}
public class Hostelite extends Student {
private String hostelName;
private int roomNumber;
public Hostelite(){
}
public Hostelite(int id, char type,String firstName,String lastName, double feesPerMonth, String hostelName,int roomNo){
    super(id,type,firstName,lastName);
    this.hostelName=hostelName;
    this.roomNumber=roomNumber;
}
public String getHostelName(){
    return this.hostelName;
} 
public int getRoomNumber(){
    return this.roomNumber;
}
public static void main(String args){
    Hostelite hostelite=new Hostelite(0,'H',"akash","pokhrel",1000,"rock",142);
    System.out.println(hostelite.getStudentId()+hostelite.getStudentType()+hostelite.getStudentName()+hostelite.getStudentFees()+hostelite.getHostelName()+hostelite.getRoomNumber());
}
}

