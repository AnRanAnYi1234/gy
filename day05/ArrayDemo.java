package day05;
import java.util.Arrays;
public class ArrayDemo {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] arr2 = new int[10];
        // for (int i = 0; i < arr.length; i++) {
        //     arr2[i] = arr[i];
        //     System.out.println(arr2[i]);
        // }
        System.arraycopy(arr, 1, arr2, 0, 8);
        // 数组的扩容
        int[] arr3 = new int[arr.length + 1];
        System.arraycopy(arr, 0, arr3, 0, arr.length);
        arr3[arr3.length - 1] = 11;
        int [] arr4 = {1,2,3,4,5,6,7,8,9,10,11};
        arr4=Arrays.copyOf(arr4, arr4.length + 1);
        
    }
}
