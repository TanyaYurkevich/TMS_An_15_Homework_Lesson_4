import java.util.Arrays;

public class Task_3 {
    public static void main(String[] args) {
        int[] one = {1,4,3,45,15};
        System.out.println(Arrays.toString(one));

        int[] two = {1,4,3,8,15};
        System.out.println(Arrays.toString(two));

        double avg = 0;
        for(int i=0;i<one.length;i++) {
            avg += (double) one[i]/one.length;
        }
        double avg1 = 0;
        for(int i=0;i<two.length;i++) {
            avg1 += (double) two[i]/two.length;
        }
        if (avg>avg1){
            System.out.println("Среднее арифметическое первого массива больше второго");
        } if (avg<avg1) {
            System.out.println("среднее арифметическое второго массива больше первого");}
        if (avg==avg1){
            System.out.println("среднее арифметическое двух массивов равны");
        }



    }
}

