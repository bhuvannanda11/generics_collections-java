import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class findsubsets {
    public static boolean containsSet(Set<Integer> s , Set<Integer> t){
        boolean result = t.containsAll(s);
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of set 1 = ");
        int s1 = sc.nextInt();
        System.out.println("Enter the size of set 2 = ");
        int s2 = sc.nextInt();

        System.out.println("Enter the elements of set 1 = ");
        Set<Integer> st = new HashSet<>();
        for(int i=0;i<s1;i++){
            int a = sc.nextInt();
            st.add(a);
        }
        System.out.println("Enter the elements of set 2 = ");
        Set<Integer> st2 = new HashSet<>();
        for(int i=0;i<s2;i++){
            int b = sc.nextInt();
            st2.add(b);
        }

        System.out.println("Is Subset ? = "+containsSet(st,st2));
    }
}