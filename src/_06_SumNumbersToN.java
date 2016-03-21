import java.util.Scanner;

/**
 * Created by galeto on 16.03.16.
 */
public class _06_SumNumbersToN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int result = 0;
        for (int i = 1; i <= number; i++){
            result += i;
        }
        System.out.println(result);
    }
}
