import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        // min heap
        Queue<Integer> pq = new PriorityQueue<>();
        pq.offer(5);
        pq.offer(3);
        pq.offer(7);
        pq.offer(1);

        System.out.println(pq);
        System.out.println(pq.peek());
        pq.poll();
        System.out.println(pq.peek());

        // max heap
        Queue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());
        pq1.offer(9);
        pq1.offer(1);
        pq1.offer(3);
        pq1.offer(7);
        pq1.offer(5);
        System.out.println(pq1);
        System.out.println(pq1.peek());
        pq1.poll();
        System.out.println(pq1.peek());
        pq1.poll();
        System.out.println(pq1.peek());
    }
}
