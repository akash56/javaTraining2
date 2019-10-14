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
public class SwitchCase {
    
public static void main(String args[]){    
    char grade='B';
        String result;
    switch(grade){
    case 'A':
        result="80-100";
    case 'B':
        result="73-79";
    case 'C':
        result="65-72";
    case 'D':
        result="55-64";
        break;
    default:
        result="Grade must not be exist";
    }
        System.out.println(result);
        
    
}}
