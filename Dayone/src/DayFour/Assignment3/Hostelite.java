/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DayFour.Assignment3;



/**
 *
 * @author akash
 */
class Student {
    protected int studentId;
    protected char studentType;
    protected String studentName;
    protected double feesPerMonth;
            

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
    System.out.println("Details of the Student are: ");
		System.out.println("Student Id is: "+getStudentId());
		System.out.println("Student Name is: "+getStudentName());
System.out.println("Student Type is: "+getStudentType());
}
}
public class Hostelite extends Student {
private String hostelName;
private int roomNumber;
public Hostelite(){
}
public Hostelite(int id, char type,String firstName,String lastName, double feesPerMonth, String hostelName,int roomNo){
    super.studentId = id;
    super.studentType = type;
    super.studentName = firstName+lastName;
    super.feesPerMonth=feesPerMonth;
    this.hostelName=hostelName;
    
    this.roomNumber=roomNumber;
}
public String getHostelName(){
    return this.hostelName;
} 
public int getRoomNumber(){
    return this.roomNumber;
}
public void displayStudentDetails() {
		super.displayStudentDetails();
		System.out.println("Student hostelName is: "+getHostelName());
		System.out.println("Student hostel room NO is: "+getRoomNumber());
		
}
public static void main(String args[]){
    String resStatus = args[0];
		Student student; 
		if(resStatus.equals("Hostelite")) {
			student = new Hostelite(2,'F',"Tribikram","Aryal",4500,"Las COlinas",25);
		}
		else {
			student = new DayScholar(5,'N',"Shyam","Buda",4600,"Irving");
		}
		student.displayStudentDetails();
	
}
    //System.out.println(hostelite.getStudentId()+hostelite.getStudentType()+hostelite.getStudentName()+hostelite.getStudentFees()+hostelite.getHostelName()+hostelite.getRoomNumber());

}
class DayScholar extends Student{
private String residentalAddress;
    	public DayScholar() {
		
}
public DayScholar(int id, char type,String firstName,String lastName, double feesPerMonth, String address){
    super.studentId=id;
    super.studentName=firstName+lastName;
    super.feesPerMonth=feesPerMonth;
    this.residentalAddress=address;
}
public String getResidentalAddress(){
    return this.residentalAddress;
}
public void displayStudentDetails() {
		super.displayStudentDetails();
		System.out.println("Student hostelName is: "+getResidentalAddress());
}
}

