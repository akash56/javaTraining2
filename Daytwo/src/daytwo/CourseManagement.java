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
public class CourseManagement {
    public static void main(String args[]){
        int studentId=2;
        char studentType='F';
        Student student=new Student();
            student.setStudentType(studentType);
            student.setStudentId(studentId);
            System.out.println(student.getStudentId());
            System.out.println(student.getStudentType());
    }
}
