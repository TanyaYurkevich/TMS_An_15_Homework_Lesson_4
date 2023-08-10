import java.util.Arrays;

public class Task_5 {
    public static void main(String[] args) {
        int[] one = {1,2,3,4,5};
        System.out.println(Arrays.toString(one));

        for(int i=0;i<one.length;i++){
            if(i%2==0){
                one[i]= 0;
            }
        }
        System.out.println("Стало :" + Arrays.toString(one));


    }
}



