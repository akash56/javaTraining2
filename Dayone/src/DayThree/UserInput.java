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
public class UserInput {
    public static void main(String args[]){
        int number, iterations;
        number=Integer.parseInt(args[0]);
        iterations=Integer.parseInt(args[1]);
        for(int i=1;i<=iterations;i++){
        int product=number*iterations;
            System.out.println(number+" * "+iterations+" = "+ product);
        }
    }

}
