/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DayThree;

/**
 *
 * @author akash
 */
public class Student {
    private int studentId;
    private char studentType;
    private String studentName;
    private String residentalStatus;
    private double feesPerMonth;
    public Student(){
        studentId=10;
        studentType='F';
    }
    public Student(int id, char type,String firstName,String lastName){
        studentId=id;
        studentType=type;
        studentName=firstName+lastName;
       }
    
    public void setStudentName(String firstName,String secondName){
        studentName=firstName+secondName;
    }
    public void setStudentName(String name){
        studentName=name;
    }
    public void setStudentId(int id){
        studentId=id;
    }
    public void setStudentType(char type){
        studentType=type;
    }
   public void setResidentalStatus(String status){
       residentalStatus=status;
   } 
   public void calculateFees(double semFees){
       feesPerMonth=semFees;
   }
   public void calculateFees(double semFees,double hostelFees){
       feesPerMonth=semFees+hostelFees;
   }
   public String getResidentalStatus(){
       return residentalStatus;
   } 
   public double getFees(){
       return feesPerMonth;
   }
   public int getStudentId(){
        return studentId;
    }
    public int getStudentType(){
        return studentType;
    }
    public String getStudentName(){
        return studentName;
    }
    public static void main(String args[]){
        Student student=new Student();
        int studentId=Integer.parseInt(args[0]);
        String studentName=String.valueOf(args[1]);
        String residentalStatus=String.valueOf(args[2]);
        
        double semFees=Double.parseDouble(args[3]);
        if (residentalStatus.equals("Hostelelite")){
        double hostelFee=Double.parseDouble(args[4]);
        student.calculateFees(semFees,hostelFee);
        }
        else{
        student.calculateFees(semFees);
        
        }
        
        student.setStudentId(studentId);
        student.setStudentType('F');
        student.setStudentName(studentName);
        student.setResidentalStatus(residentalStatus);
        
        System.out.println(student.getStudentId()+" "+student.getStudentType()+" "+student.getStudentName()+" "+student.getResidentalStatus()+student.getFees());
        Student student1=new Student(1,'C',"Hari","Adhikari");
        System.out.println(student1.getStudentId()+" "+student1.getStudentType()+" "+student1.getStudentName());
            
    }
    

}
