import java.util.Arrays;
import java.util.Scanner;

public class RotMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[][] = new int[a][a];
        for(int i=0; i<a; i++) {
            for(int j=0; j<a; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        forward(arr, a);
        backward(arr, a);
        for(int[] value : arr) {
            System.out.println(Arrays.toString( value));
        }
    }
    public static void forward(int[][] arr, int a) {
        int temp = 0;
        for(int i=0; i<a; i++) {
            for (int j=i+1; j<a; j++) {
                temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    public static void backward (int[][] ar, int a) {
        int size = ar.length;
        int size1 = ar[0].length-1;
        for(int b=0; b<size; b++) {
            int i=0;
            int j=size1;
            while(i<j) {
                int temp = ar[b][i];
                ar[b][i]=ar[b][j];
                ar[b][j]=temp;
                i++;
                j--;
            }
        }


    }
}
