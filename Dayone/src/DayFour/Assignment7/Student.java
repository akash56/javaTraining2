/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DayFour.Assignment7;

/**
 *
 * @author akash
 */
public class Student {
    protected int studentId;
	protected char studentType;
	protected String studentName;
	protected final int semesterFees=2000;
        public void setStudentId(int sId) {
		this.studentId = sId;
	}
	public void setStudentType(char sType) {
		this.studentType = sType;
	}
	public void setStudentName(String sName) {
		this.studentName = sName;
}
        public void getDetails() {
		System.out.println("Student ID "+studentId);
		System.out.println("Student Type: "+studentType);
                System.out.println("Student Name "+studentName);
        }
public final void displayDetails(){
    getDetails();
    System.out.println(semesterFees);
}
}
final class DayScholar extends Student{
	private String residentialAddress;
	
        public void setResAddress(String resAddress) {
		this.residentialAddress = resAddress;
	}
	public void displayDayDetails() {
		super.displayDetails();
		
		System.out.println("Residential Address "+residentialAddress);
	}
        
}
 class DynamicEx {

	public static void main(String[] args) {
		DayScholar dayScholar = new DayScholar();
		dayScholar.setStudentId(1001);
		dayScholar.setStudentType('D');
		dayScholar.setStudentName("Thomas");
		dayScholar.setResAddress("No 32/3 Vijayanagar");
		dayScholar.displayDayDetails();

	}

}