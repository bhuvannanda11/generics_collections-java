import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class freqofElements {
    public static Map freq(String[] s){
        HashMap<String,Integer> st = new HashMap<>();
        for(int i=0;i<s.length;i++){
            if(st.containsKey(s[i])){
                st.put(s[i],st.get(s[i])+1);
            }
            else{
                st.put(s[i],1);
            }
        }
        return st;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of string array = ");
        int n = sc.nextInt();
        String arr[] = new String[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.next();
        }

        System.out.println(freq(arr));
    }
}