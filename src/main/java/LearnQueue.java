import java.util.*;
public class LearnQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();  // linkedList implements Queue interface, so this can be written.
        q.offer(3); // add could be used, but on error, it throws exception
        q.offer(4);
        q.offer(5);

        System.out.println(q);
        System.out.println(q.peek()); // element could be used, with a risk of getting exception

        q.poll(); // remove could be used, with a risk of exception

        System.out.println(q.peek());
    }

}
