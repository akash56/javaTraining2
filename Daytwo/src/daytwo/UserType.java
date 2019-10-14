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
public class UserType {
    String name;
    UserType(String parameterVal){
        name=parameterVal;
    }
    UserType(){
        this("student");
    }
    public static void main(String args[]){
        UserType usertype1=new UserType("Faculty");
        UserType usertype2=new UserType();
        System.out.println(usertype1.name);
        System.out.println(usertype2.name);
        
    }
    
}
