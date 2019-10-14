/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DayThree;
import java.util.Scanner;
/**
 *
 * @author akash
 */
public class Stringclass {
public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    String userName=in.next();
     System.out.println(userName.length());
     System.out.println("Hi " +userName);
     System.out.println(userName.toLowerCase());
     System.out.println(userName.toUpperCase());
     if (userName.charAt(0)=='a'){
         System.out.println("True");
     }else{
     System.out.println("False");
     }
     userName=userName.replace(userName, "KRISHNA");
     System.out.println(userName);
}
}

