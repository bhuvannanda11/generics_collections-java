import java.lang.reflect.Array;
import java.util.Scanner;

public class rotateArr {
    public static void rotArr(int arr[], int pos){
        int fin[] = new int[arr.length] ;

        for(int i=0;i<arr.length;i++){
            fin[(i+pos)%arr.length] = arr[i];
        }

        for(int i = 0;i<arr.length;i++){
            System.out.print(fin[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array = ");
        int n = sc.nextInt();
        System.out.println("Enter the number by which array is rotated = ");
        int pos = sc.nextInt()+1;
        int arr[] = new int[n];
        System.out.println("Enter the elements of array = ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        rotArr(arr,pos);
    }
}