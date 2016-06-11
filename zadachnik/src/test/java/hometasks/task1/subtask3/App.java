/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hometasks.task1.subtask3;

/**
 * ● вычисляет разность сумм последовательности чисел, кратных 7 и 2 
 * 
 * ● вычисляет отношение последовательности чисел, кратных 5 к 
 * последовательности чисел, кратных 3 
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
   
         int sumy = 0; 
    for (int i = 0; i <= 100; i++) {
        if (i % 3 ==0){ 
       sumy = sumy + i;
    }
   } 
         int summ = 0; 
    for (int i = 0; i <= 100; i++) {
        if (i % 5 ==0){ 
       summ = summ + i;
    }
   } 
   
         int suma = 0; 
    for (int i = 0; i <= 100; i++) {
        if (i % 7 ==0){ 
       suma = suma + i;
    }
   }
    
     sum -= suma;
        System.out.print("\n" + sum + "\n");
    
     sumy /= summ;
        System.out.print("\n" + sumy + "\n");
  } 
}
