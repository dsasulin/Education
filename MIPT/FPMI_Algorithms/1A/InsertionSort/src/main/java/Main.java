import java.util.ArrayList;
import java.util.Scanner;
public class Main {
public static void main(String[] args)  {
        Integer number ;
        Scanner sc = new Scanner(System.in);
        //System.out.println("Input number of elements");
        number = sc.nextInt();
        ArrayList nums = new ArrayList<>();
        for (int i = 0; i<number;i++){
                //System.out.println("Input number ");
                nums.add(sc.nextInt());
        }
        Integer j;
        Integer t;
        for (int i = 0; i < number-1; i++){
               j = i + 1;
               while (j > 0 && (Integer)nums.get(j-1) > (Integer) nums.get(j)){
                       t = (Integer) nums.get(j);
                       nums.set(j, nums.get(j-1));
                       nums.set(j-1, t);
                       j = j-1;
               }
        }
        for (int i = 0; i< number; i++){
                System.out.println(nums.get(i));
        }
 }
}