import java.util.Random;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int console = sc.nextInt();
        int[] array = new int[console];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
            System.out.print(array[i] + " ");
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Min is: " + min);

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Max is: " + max);

        double avg = 0;
        for(int i=0;i<array.length;i++) {
            avg += (double) array[i]/array.length;
        }
        System.out.println("Average is: " + avg);



    }


}


