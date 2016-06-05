/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie_3;

/**
 *
 * Создать программу, которая выводит в консоль следуюшие данные:  
● ФИО 
● номер группы 
● время занятий 
в виде: 
ФИО: [ваши данные] 
номер группы: [ваши данные] 
время занятий: [ваши данные] 
При выполнении задания использовать числовые типы данных, 
строки, оперировать выходными данными на уровне сложения строк, 
сложения строк и числовых данных. 
 * @author andrey
 */
public class zadanie_3 {
        public static void main(String[] args) {

	String fio = "ФИО: ";
        String fio_text = " Собченюк Андрей Владимирович";
        
        String nomer_gruppi_text ="номер группы: " ;
        
	int nomer_gruppi = 1;
        
        String data_text ="время занятий: " ;
        
	String data ="19:00" ;
        
	String itog = fio + fio_text + "\n" 
                + nomer_gruppi_text + nomer_gruppi 
                + "\n" + data_text + data;
            
        
	System.out.println(itog);
}
}
