/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hometasks.task1.subtask1;

/**
 *С помощью арифметических операций, операций сравнения и конструкций 
if­else и циклических операций создать приложение которое: 
● в последовательности чисел от 0 до 100 выводит все значения кратные 2, 3, 5, 
7 
 * @author andrey
 */
public class App {
    
    public static void main(String[] args) {
  System.out.print("\n"+" значения кратные 2:  ");
    for (int i = 0; i <= 100; i++) {
        if (i % 2 ==0){
  System.out.print(i  + " ");
    }
        
   } 
  System.out.print("\n"+" значения кратные 3:  ");
    for (int i = 0; i <= 100; i++) {
        if (i % 3 ==0){
  System.out.print(i  + " ");
    }
        
   } 
    System.out.print("\n"+" значения кратные 5:  ");
    for (int i = 0; i <= 100; i++) {
        if (i % 5 ==0){
  System.out.print(i  + " ");
    }
       
   } 
    System.out.print("\n"+" значения кратные 7:  ");
    for (int i = 0; i <= 100; i++) {
        if (i % 7 ==0){
  System.out.print(i  + " ");
    }

   } 
  }  
}
