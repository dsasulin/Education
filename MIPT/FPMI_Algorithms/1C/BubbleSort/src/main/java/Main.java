import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer number ;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        ArrayList nums = new ArrayList<>();
        for (int i = 0; i<number;i++){
            nums.add(sc.nextInt());
        }
        Integer j;
        Integer t;
        for (int i = 0; i < number; i++){
            for (j = 0; j < number-1-i; j++){
                if ((Integer)nums.get(j) < (Integer) nums.get(j+1)) {
                    t = (Integer) nums.get(j);
                    nums.set(j, nums.get(j+1));
                    nums.set(j+1, t);
                }
            }
        }
        for (int i = 0; i< number; i++){
            System.out.println(nums.get(i));
        }

    }
}