import java.util.Random;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int console = sc.nextInt();
        int[] array = new int[console];
        Random random = new Random();
        int j =console;
        int s;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
            if (j>5&& j<= 10){
                s = array[i];
                System.out.println(s);
            } else {
                System.out.println("Введите верное значение");
            }
        }
    }
}

