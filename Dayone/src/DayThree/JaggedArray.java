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
public class JaggedArray {
public static void main(String args[]){
    String jaggedArray[][]={{"Tony","JAVA","C","C++"},{"Thomas","JAVA","UNIX"},{"Dinil","Linux","Oracle"},{"Delvin","RDBMS","C#","ORACLE"}};
  //  Array<String>[4][] jaggedArray={{"Tony","JAVA","C","C++"},{"Thomas","JAVA","UNIX"},{"Dinil","Linux","Oracle"},{"Delvin","RDBMS","C#","ORACLE"}};
    for(int i=0;i<jaggedArray[3].length;i++){
        System.out.print(jaggedArray[3][i]+" ");
    }
}}
