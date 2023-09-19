import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.push("str1");
        st.push("str2");
        st.push("str3");
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());
    }
}
