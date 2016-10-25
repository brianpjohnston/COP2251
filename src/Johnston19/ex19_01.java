package Johnston19;

/**
 * Created by tech140 on 10/24/2016.
 */
public class ex19_01 {
    public static void main(String[] args) {

        GenericStack<Integer> stack = new GenericStack<>();
        for (int i = 0; i < 50; i++) {
            stack.push(i + 10);
        }

        System.out.println("Stack: ");
        for (int i = 1; !stack.isEmpty(); i++) {
            if (i % 10 == 0)
                System.out.println(stack.pop());
            else
                System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }
}