package Stack;

/**
 * Created by hadoop on 17-3-12.
 */
public class StackTest {

    public static void main(String[] args) {
        StackI stack = new StackI(1);
        stack.push(1);
        stack.push(2);
        System.out.println(stack.size());
        stack.push(3);
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.size());

        Stack<String> s = new Stack<String>();
        s.push("aaa");
        s.push("bbb");
        s.push("ccc");
        System.out.println(s.pop());
        System.out.println(s.peek());
    }
}
