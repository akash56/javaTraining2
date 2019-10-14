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
public class DemoArray {
    public  static void main(String args[]){
    int firstArrayMatrix[][]={{1,1,1},{1,1,1}};
    int secondArrayMatrix[][]={{2,2,2},{2,2,2}};
    DemoArray demo=new DemoArray();
    demo.display("matrix 1",firstArrayMatrix);
    demo.display("matrix 2", secondArrayMatrix);
    demo.add(firstArrayMatrix,secondArrayMatrix);
    
    
    
    
    }
public void display(String matrixName, int[][] arrayMatrix){
    System.out.println(matrixName);
    for(int i=0;i<arrayMatrix.length;i++){
        for(int j=0;j<arrayMatrix[0].length;j++){
            System.out.print(arrayMatrix[i][j]+" ");
            
        }
        System.out.println();
    
        
    
    }
    }
public void add(int[][] matrixOne,int[][] matrixTwo){
    System.out.println("Sum of the Matrices");
    for(int i=0;i<matrixOne.length;i++){
        for(int j=0;j<matrixOne[0].length;j++){
            System.out.print(matrixOne[i][j]+matrixTwo[i][j]+" ");
            
        }
        System.out.println();
    
        
    
    }
}
}
