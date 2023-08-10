import java.util.Arrays;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int console = sc.nextInt();

        int[] one = {1,2,3,4,5};
        int[] two = new int[one.length-1];
        int j=console;
        for(int i=0, l=0;i<one.length;i++){
            if(one[i]!=j){
                two[l]=one[i];
                l++;
            }
        }
        System.out.println("Было :" + Arrays.toString(one));
        System.out.println("Стало :" + Arrays.toString(two));

    }
}

