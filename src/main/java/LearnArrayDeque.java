import java.util.ArrayDeque;
import java.util.Queue;

public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(3);
        adq.offerFirst(1);
        adq.offerLast(5); // same as offer
        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());  // same as peekFirst()
        System.out.println(adq.peekLast());

        adq.pollFirst();
        System.out.println(adq);
        adq.pollLast();
        System.out.println(adq);
        adq.poll(); // same as pollFirst
        System.out.println(adq);
    }
}
