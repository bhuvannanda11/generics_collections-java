import java.util.*;

public class nthElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Character> ls = new LinkedList<Character>();
        System.out.println("Enter number of characters = ");
        int n = sc.nextInt();
        System.out.println("Enter the characters = ");
        for(int i =0; i<n; i++){
            char a = sc.next().charAt(0);
            ls.add(a);
        }
        System.out.println("Enter the number = ");
        int p = sc.nextInt();
        System.out.println(p+" element from end is "+findElement(ls,p));
    }
    public static char findElement(LinkedList<Character> ls , int n){
        return ls.get(ls.size()-n);
    }
    }