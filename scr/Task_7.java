import java.util.Arrays;

public class Task_7 {
    public static void main(String[] args) {
        int [] array = {9,6,14,28,65,1};

        boolean isSorted = false;
        int val;
        while (!isSorted) {
            isSorted=true;
            for (int i=0;i<array.length-1;i++){
                if (array[i]>array[i+1]){
                    isSorted = false;

                    val=array[i];
                    array[i]=array[i+1];
                    array[i+1]=val;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}


