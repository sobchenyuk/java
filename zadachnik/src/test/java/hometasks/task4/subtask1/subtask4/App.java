package hometasks.task4.subtask1.subtask4;

/**
 * Created by andrey on 15.06.16.
 * ● сумму элементов, кратных 7
 */
public class App {
    public static void main(String[] args) {
        int[] arr = new int[100];


        for(int i=1;i<arr.length;i++){

            arr[i] = i;

            if (arr[i] % 7 ==0) System.out.print(arr[i] + " ");

        }
    }
}