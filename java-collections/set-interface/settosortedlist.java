import java.util.*;

public class settosortedlist {
    public static List setsortList(Set<Integer> s){
        List<Integer> fin = new ArrayList<>(s);
        Collections.sort(fin);
        return fin;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of set = ");
        int s1 = sc.nextInt();
        System.out.println("Enter the elements of set = ");
        Set<Integer> st = new HashSet<>();
        for(int i=0;i<s1;i++){
            int a = sc.nextInt();
            st.add(a);
        }

        System.out.println("Set to sorted list is = "+setsortList(st));

    }
}