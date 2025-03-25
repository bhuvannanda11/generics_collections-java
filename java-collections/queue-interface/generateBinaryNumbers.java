import java.sql.SQLOutput;
import java.util.*;
public class generateBinaryNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        generateNumbers(n);
    }
    // To generate binary numbers
    public static void generateNumbers(int n){
        Queue<String> queue = new LinkedList<>();
        queue.offer("1");
        for(int i =1; i<=n; i++){
            String current = queue.poll();
            System.out.println(i+" -> " + current);
            queue.offer(current+"0");
            queue.offer(current+"1");
        }
    }

}