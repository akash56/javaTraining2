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
public class PassByVal {
    public void passTheValueMethod(int sid){
        sid=10;
        Student std=new Student();
        std.setStudentId(sid);
        System.out.println(std.getStudentId());
    }
    public static void main(String args[]){
        int sId=25;
        PassByVal val=new PassByVal();
        System.out.println(sId);
        val.passTheValueMethod(sId);
        System.out.println("The sId are"+sId);
    }
    
            
}
