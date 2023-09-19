import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnMap {
    public static void main(String[] args) {

        // all the operations are done in O(1)
        Map<String, Integer> mp = new HashMap<>();
        mp.put("one", 1);
        mp.put("two", 2);
        mp.put("three", 3);
        mp.put("four", 4);
        // insert with condition
        mp.putIfAbsent("two", 22);
        // or
        if (!mp.containsKey("two"))
            mp.put("two", 22);
        System.out.println(mp);

        // check for key or value is present or not
        System.out.println( mp.containsKey("one") + " " + mp.containsValue(3));

        // check if empty
        System.out.println(mp.isEmpty());

        // iterating
        for (Map.Entry<String, Integer> e : mp.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        // geting the keys only
        for (String key : mp.keySet()){
            System.out.println(key);
        }

        // getting the values only
        for (Integer val: mp.values()){
            System.out.println(val);
        }

        // get the value of a key
        System.out.println(mp.get("one"));

        // remove a key
        mp.remove("four");
        System.out.println(mp);

        // clear
        mp.clear();

        // bst implements Map, elements are stored in sorted order of key
        // all the operations take O(logN)
        Map<String, Integer> mpp = new TreeMap<>();
        mpp.put("one", 1);
        mpp.put("two", 2);
        mpp.put("three", 3);
        mpp.put("four", 4);
        mpp.put("five", 5);
        System.out.println(mpp);

        // rest operations are same
    }
}
