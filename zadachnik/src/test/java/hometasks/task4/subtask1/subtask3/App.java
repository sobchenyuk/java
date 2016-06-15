package hometasks.task4.subtask1.subtask3;

/**
 * Created by andrey on 14.06.16.
 * ● вывести все нечетные элементы массива
 */
public class App {
    public static void main(String[] args) {
        int[] arr = new int[19];


        for(int i=1;i<arr.length;i++){

            arr[i] = (int)(Math.random()*11);

            if (arr[i] % 3 ==0) System.out.print(arr[i] + " ");

        }
    }
}