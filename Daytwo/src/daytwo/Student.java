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
public class Student {
    private int studentId;
    private char studentType;
    public Student(){
        studentId=10;
        studentType='F';
    }
    public void setStudentId(int id){
        studentId=id;
    }
    public void setStudentType(char type){
        studentType=type;
    }
    public int getStudentId(){
        return studentId;
    }
    public int getStudentType(){
        return studentType;
    }
    public static void main(String args[]){
        Student student=new Student();
        System.out.println(student.getStudentId());
        System.out.println(student.getStudentType());
    }
}
