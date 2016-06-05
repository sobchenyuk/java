/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie_11;

/**
 *объем цилиндра
 * @author andrey
 */
public class zadanie_11 {
        public static void main(String[] args) {

	//float s2 = 3.1415f; //π - число пи (3.1415)
        
        int R = 2;//R - радиус оснований
            R *= 2;
            
        int h = 15;// h - высота цилиндра
        
        double V = (Math.PI * R * h);
        
	System.out.println(V + " объем цилиндра");

}   
}
