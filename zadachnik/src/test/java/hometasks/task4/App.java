/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hometasks.task4;


import java.util.Arrays;





/**
 *вывести все элементы массива в прямом и обратном порядке
 * @author andrey
 */
public class App {
    public static void main(String[] args) {
    
     int[] arr = new int[20];
     
    
    for(int i=0;i<arr.length;i++){
        
  	 arr[i] = (int)(Math.random()*10);
        
        //System.out.print(arr[i] +" ");
        
        }
    
    System.out.print(Arrays.toString(arr)+ "\n");
        String arry = Arrays.toString(arr);
    String b = new StringBuffer(arry).reverse().toString();
    System.out.print(b + " "); 
    }


}
