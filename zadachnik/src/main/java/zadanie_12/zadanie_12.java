/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie_12;

/**
 *  объем полого цилиндра
 * @author andrey
 */
public class zadanie_12 {
        public static void main(String[] args) {
	//float s2 = 3.1415f; //π - число пи (3.1415)
        int r1 = 2;//R - радиус внутриний
            r1 *= 2;
            
        int r2 = 4;//R - радиус наружный
            r2 *= 2; 
            
        int h = 15;// h - высота цилиндра
        
        
        if (r2 > r1) {
    double V = Math.PI * h* (r2 - r1);
	System.out.println("r2 > r1 " +"\n" + V + "   объем полого цилиндра");
}
        else{
    double V = Math.PI * h* (r1 - r2);
	System.out.println("r1 < r2" +"\n" + V + "   объем полого цилиндра");
}       
        if (r2 == r1){
	System.out.println("параметры введены не корректно");
}
}   
}
