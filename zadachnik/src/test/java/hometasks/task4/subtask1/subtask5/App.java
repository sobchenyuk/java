package hometasks.task4.subtask1.subtask5;

/**
 * Created by andrey on 15.06.16.
 * ● произведение элементов, кратных 3
 */
public class App {
    public static void main(String[] args) {


        int[] arr = new int[100];
        int sum = 0;

        for(int i=1;i<arr.length;i++){

            arr[i] = i;


            if (arr[i] % 3 == 0) {
                sum *= i;
                System.out.print(arr[i] + " ");
            }

        }
    }
}
