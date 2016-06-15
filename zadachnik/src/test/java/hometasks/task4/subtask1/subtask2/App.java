package hometasks.task4.subtask1.subtask2;

/**
 * Created by andrey on 14.06.16.
 * ● вывести все четные элементы массива
 */
public class App {
    public static void main(String[] args) {
        int[] arr = new int[20];


        for(int i=0;i<arr.length;i++){

            arr[i] = (int)(Math.random()*10);

            if (arr[i] % 2 ==0) System.out.print(arr[i] + " ");

        }
    }
}