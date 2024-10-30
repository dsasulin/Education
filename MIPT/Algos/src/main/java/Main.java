import java.util.Scanner;

public class Main {
    // 1 --

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Input first value");
        Integer x = sn.nextInt();
        System.out.println("Input second value");
        Integer y = sn.nextInt();
        Integer sum;
        sum = x + y;
        System.out.println("Sum is: " + sum);
    }
}

