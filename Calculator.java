import java.util.*;
public class Calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("press 1 for sum\npress 2 for diff\npress 3 for product\npress 4 for division\npress5 for power");
        int button = sc.nextInt();
        switch (button) {
            case 1: System.out.println(a+b);
            break;
            case 2: System.out.println(a-b);
            break;
            case 3: System.out.println(a*b);
            break;
            case 4: System.out.println(a/b);
            break;
            default: System.out.println(a^b);
            
            
        }
    }
}


        
