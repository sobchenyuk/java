/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hometasks.task1.subtask2;

/**
 *находит сумму чисел для каждой из последовательностей 
 * @author andrey
 */
public class App {
     public static void main(String[] args) {
         
         int sum = 0; 
    for (int i = 0; i <= 100; i++) {
        if (i % 2 ==0){ 
       sum = sum + i;
    }
   } 
    System.out.print("\n Сумма чисел в последовательности от 0 до 100 значении кратном 2 равна:  " + sum +"\n"); 
    
    
         int sumy = 0; 
    for (int i = 0; i <= 100; i++) {
        if (i % 3 ==0){ 
       sumy = sumy + i;
    }
   } 
    System.out.print("\n Сумма чисел в последовательности от 0 до 100 значении кратном 3 равна:  " + sumy +"\n"); 


         int summ = 0; 
    for (int i = 0; i <= 100; i++) {
        if (i % 5 ==0){ 
       summ = summ + i;
    }
   } 
    System.out.print("\n Сумма чисел в последовательности от 0 до 100 значении кратном 5 равна:  " + summ +"\n"); 
   
         int suma = 0; 
    for (int i = 0; i <= 100; i++) {
        if (i % 7 ==0){ 
       suma = suma + i;
    }
   } 
    System.out.print("\n Сумма чисел в последовательности от 0 до 100 значении кратном 7 равна:  " + suma +"\n"); 
   
    
  }  
}
