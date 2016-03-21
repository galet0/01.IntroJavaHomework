import java.util.Scanner;

/**
 * Created by galeto on 16.03.16.
 */
public class _08_GetAverage {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double a = scn.nextDouble();
        double b = scn.nextDouble();
        double c = scn.nextDouble();
        System.out.println(calcAverage(a,b,c));

    }
    private static double calcAverage(double a,double b,double c){
        double average = (a + b + c)/3;
        return average;
    }
}
