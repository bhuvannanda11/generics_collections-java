import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class reverseArryList {
    public static void reverse(List<Integer> s){


        for(int i=s.size()-1;i>=0;i--){
            System.out.print(s.get(i)+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of list = ");
        int n = sc.nextInt();

        ArrayList<Integer> st = new ArrayList<>();
        System.out.println("Enter the elements of list = ");
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            st.add(a);
        }

        reverse(st);
    }
}