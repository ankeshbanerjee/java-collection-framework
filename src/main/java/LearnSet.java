import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
    public static void main(String[] args) {

        // values are stored in random order
        // all the operations take O(1)
        Set<Integer> s = new HashSet<>();
        s.add(3);
        s.add(51);
        s.add(33);
        s.add(98);
        s.add(33); // will not allow duplicate element
        System.out.println(s);

        // operations
        s.remove(3);
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.contains(98));
        System.out.println(s.isEmpty());

        // LinkedList implements set, so the order in which we insert the elements, is maintained
        Set<Integer> st = new LinkedHashSet<>();
        st.add(3);
        st.add(51);
        st.add(33);
        st.add(98);
        st.add(33);
        System.out.println(st);
        // rest operations are the same as HashSet

        // Binary Search Tree implements set, so, the elements are stored in sorted order
        // all the operations take O(logN)
        Set<Integer> set = new TreeSet<>();
        set.add(73);
        set.add(11);
        set.add(29);
        set.add(30);
        set.add(11);
        System.out.println(set);
        // rest operations are the same as HashSet

        // set of custom class data type
        Set<Student> students = new HashSet<>();
        students.add(new Student("s1", 1));
        students.add(new Student("s2", 5));
        students.add(new Student("s3", 3));
        students.add(new Student("s4", 3));
        System.out.println(students);

        // check if two students are same (if roll is same then students are same)
        Student s1 = new Student("s1", 33);
        Student s2 = new Student("s2", 33);
        System.out.println(s1.equals(s2));

    }
}
