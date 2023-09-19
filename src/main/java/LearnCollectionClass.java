import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(2);
        list.add(1);
        list.add(10);
        list.add(3);

        // sort a list
        Collections.sort(list);
        System.out.println(list);

        // sort in decreasing order
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);

        // get min and max element in list
        System.out.println("max is: " + Collections.max(list));
        System.out.println("min is: " + Collections.min(list));

        // list of custom class
        List<Student> ls = new ArrayList<>();
        ls.add(new Student("subham", 3));
        ls.add(new Student("ankesh", 5));
        ls.add(new Student("raja", 1));
        ls.add(new Student("ankit", 2));
        ls.add(new Student("sunny", 4));

        System.out.println(ls);

        // sorting on the basis of property of the class
        Collections.sort(ls, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name); // using compareTo property of string
            }
        });
        System.out.println(ls);

        // sort on the basis of rollNo
        Collections.sort(ls, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.rollNo - o2.rollNo;
            }
        });
        System.out.println(ls);

        // using lambda (introduced in java8) -> shorter syntax
        Collections.sort(ls, (o1, o2) -> o1.name.compareTo(o2.name));
        System.out.println(ls);

        Collections.sort(ls, (o1, o2) -> o1.rollNo - o2.rollNo);
        System.out.println(ls);
    }
}
