/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dayfive.Assignment3;

/**
 *
 * @author akash
 */
interface Interface {
       int varOne=50;
       int varTwo=100;
       void methodOne();
       void methodTwo();
       
}
class Example implements Interface{
    public void methodOne(){
        System.out.println();
        System.out.println("Value of varTwo:"+varTwo);
        System.out.println("Good Morning");
    }
    public void methodTwo(){
    System.out.println("Good Afternoon");
}
 
}
class DemoInterface{
    public static void main(String args[]){
        Example obj=new Example();
        obj.methodOne();
    }
}