import java.util.*;

public class LearnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        System.out.println(list);

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        System.out.println(list1);

        // read element of an index
        System.out.println(list1.get(3));
        // modify an index
        list1.set(1, 50);
        System.out.println(list1);

        // adding a new list
        list1.addAll(list);
        System.out.println(list1);

        // remove at index
        list1.remove(0);
        // remove at element with the given value
        list1.remove(Integer.valueOf(50));
        System.out.println(list1);

        // looping through the list
        for (int i=0; i<list1.size(); i++){
            System.out.print(list1.get(i) + " ");
        }
        System.out.print('\n');

        // forEach looping
        for (Integer element: list1){
            System.out.print(element + " ");
        }
        System.out.print('\n');

        // looping using iterator
        Iterator<Integer> it = list1.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.print('\n');


        // empty the list
        list1.clear();
        System.out.println(list1);


    }
}
