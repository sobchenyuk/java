/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie_6;

/**
 *​
 площадь кольца
 * @author andrey
 */
public class zadanie_6 {//​площадь кольца 
    public static void main(String[] args) {

	//float s2 = 3.1415f; //π - число пи (3.1415)
        
        int r = 4; //Радиус (r): изменяемое значение переменной
            r *= 2;
            
        int R = 6; //Радиус (r): изменяемое значение переменной
            R *= 2;
        
        double S =  Math.PI*(R-r);
        
	System.out.println(S);

}
}
