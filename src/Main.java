import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chuỗi của bạn ");
        String chuoi = scanner.nextLine();
        Palindrome(chuoi);
    }
    public static void Palindrome(String chuoi){
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < chuoi.length(); i++) {
            stack.push(chuoi.charAt(i));
            queue.add(chuoi.charAt(i));
        }
        for (int i = 0; i < chuoi.length(); i++) {
            if (stack.peek() == queue.peek()){
                System.out.println("đây là chuỗi palindrome");
            }else {
                System.out.println(" đây không là chuỗi palindrome");
            }
        }
    }
}
