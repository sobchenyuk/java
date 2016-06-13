/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hometasks.task3;



/**
 *Реализовать приложение, выполняющее функцию “генератора казенных речей” 
(​
http://alamor.kvintone.ru/work/ii/speech.htm​
). Для реализации использовать циклические 
конструкции, массивы. На основании набора фраз приложение должно генерировать 
речь, состоящую из указанного кол­ва предложений, но не менее 10, каждое 
предложение компонуется из набора строк, взятого последовательно из 1, 2, 3, 4 
массива строк случайным образом. 
 * @author andrey
 */
public class App {
 public static void main(String[] args) {
     
                String[] arr1 = {"Товарищи!","реализация намеченных плановых заданий",
                    "играет важную роль в формировании",
                    "существующих финансовых и административных условий."};
                
                String[] arr2 = {"С другой стороны",
                    "рамки и место обучения кадров",
                    "требуют от нас анализа",
                    "дальнейших направлений развития."};
                
                String[] arr3 = {"Не следует, однако, забывать, что",
                    "постоянный количественный рост и сфера нашей активности",
                    "требуют определения и уточнения","системы массового участия."};
                
                String[] arr4 = {"Таким образом","сложившаяся структура организации",
                    "способствуют подготовке и реализации",
                    "позиций, занимаемых участниками в отношении поставленных задач."};
                
                for (int i = 0; i <= 3; i++){
                int arr1length = arr1.length;//количество значений в массиве
                
                int arr2length = arr2.length;
                int arr3length = arr3.length;
                int arr4length = arr4.length;
                
                int rand1 = (int) (Math.random()*arr1length);//умножаю количество значений на случайное число
                
                int rand2 = (int) (Math.random()*arr2length);
                int rand3 = (int) (Math.random()*arr3length);
                int rand4 = (int) (Math.random()*arr4length);
                
              
                String result = arr1[rand1]+" "+arr2[rand2]+" "+arr3[rand3]+" "+arr4[rand4]+" ";
                
                //вывожу массива строк случайным образом
                System.out.println(result);
              }
        }   
}
