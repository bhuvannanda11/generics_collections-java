import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
public class reverseQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of queue");
        int n = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        System.out.println("Enter elements");
        for(int i =0; i<n; i++){
            int a = sc.nextInt();
            queue.add(a);
        }
        reverseResult(queue);
        System.out.println("Reversed queue");
        for(int i =0; i<n; i++){
            System.out.print(queue.poll()+" ");
        }
    }
    public static void reverseResult(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();
        while(!queue.isEmpty()){
            stack.push(queue.poll());
        }
        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }

    }
}