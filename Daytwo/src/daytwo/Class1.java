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
public class Class1 {
    private int i;
    private int j;
    private boolean k;
    private boolean l;
    public Class1(){
        i=22;
        j=14000;
    }
    public int geti(){
        return i;
    }
    public int getj(){
        return j;
    }
    public static void main(String args[]){
        
        Class1 class1=new Class1();
           int i= class1.i;
           int j=class1.j;
           boolean k=class1.method1(i);
           boolean l=class1.method2(j);
           l=class1.method2(j);
        if(k==true && l==true){
            System.out.print("Is a new employee");
            
        }
        else{
            System.out.print("Is not a new employee");
            
        }    
        
        
    }
    public  boolean method1(int i){
        if (i>20 && i<30){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean method2(int j){
        if (j>=14000 && j<20000){
            return true;
        }
        else{
            return false;
        }
    }
}
