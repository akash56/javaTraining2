/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DayFour.Assignment5;

/**
 *
 * @author akash
 */
 class Student {
    protected static int studentId;
    protected char studentType;
    protected String studentName;
public Student(){
    studentId++;
}
public Student(int id, char type, String name){
    this();
    this.studentName=name;
    this.studentType=type;
}

}
class PostGradStudent extends Student{
    protected int postCourseId;
    protected String postCourseName;
    protected int postCourseFees;

public PostGradStudent(int courseId, String courseName, int courseFees,int id,String name,char type){
    super(id,type,name);
    this.postCourseFees=courseFees;
    this.postCourseId=courseId;
    this.postCourseName=courseName;
}
}
 class DayScholar extends PostGradStudent{
private String residentalAddress;
public DayScholar(int pcourseId,String pCourseName,int pCourseFees,int sid,char stype,String sName,String rAddress){
    super(pcourseId,pCourseName,pCourseFees,sid,sName,stype);
    this.residentalAddress=rAddress;
}
public void calculateFees(){
    double fees=super.postCourseFees/6.0;
    System.out.println(fees);
}
    public int getFees(){
        return super.postCourseFees;
    }
public static void main(String[] args){
    DayScholar dayScholar=new DayScholar(5,"OOP",16000,1001,'D',"Manu","No 32/3 Vijayanagar");
    dayScholar.calculateFees();
}
}
