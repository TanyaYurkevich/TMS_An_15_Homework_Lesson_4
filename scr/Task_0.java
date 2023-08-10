import java.util.Scanner;

public class Task_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();

        int[] a = {1, 5, 8, 9, 11, 12};
        int numb=6;
        for (int i = 0; i < 6; i++) {
            if (b == a[i])
                System.out.println("число " + b + " входит в массив");
            else numb= numb-1;
        }
        if (numb!=1)
            System.out.println ("в массиве нет такого числа");



    }}



