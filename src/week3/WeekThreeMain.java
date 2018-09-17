package week3;

public class WeekThreeMain {
    public static void main(String[] args) {
        LinkedStackOfStrings stack = new LinkedStackOfStrings();

        while (!args[0].isEmpty()) {
            String s = args[0];

            if (s.equals("-")) System.out.print(stack.pop());
            else stack.push(s);
        }
    }
}
