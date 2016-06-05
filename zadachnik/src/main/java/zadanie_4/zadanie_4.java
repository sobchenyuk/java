/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie_4;

/**
 *Длина окружности
 * @author andrey
 */
public class zadanie_4 {
    public static void main(String[] args) {

	int s1 = 2;
        
	//float s2 = 3.1415f; //π - число пи (3.1415)
        
        int r = 3; //Радиус (R): изменяемое значение переменной
        
        int p = (int) (s1 * Math.PI * r); //P - Периметр круга (длина окружности)
        

	System.out.println(p + " Длина окружности");
//Периметр круга равен произведению радиуса на два пи (3.1415). 
}
}
