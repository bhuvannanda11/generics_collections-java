import java.lang.reflect.Array;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class removeDup {
    public static Set<Integer> remDup(int arr[]){

        int n =arr.length;
        LinkedHashSet<Integer> st = new LinkedHashSet<>();

        for(int i=0;i<n;i++){
            st.add(arr[i]);
        }
        return st;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array = ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array = ");
        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();
        }

        System.out.println(remDup(arr));
    }
}