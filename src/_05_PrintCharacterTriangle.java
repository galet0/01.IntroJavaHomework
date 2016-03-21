import java.util.Scanner;

/**
 * Created by galeto on 16.03.16.
 */
public class _05_PrintCharacterTriangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        for (char i = 'a'; i < 'a' + num; i++){
            printAlphabet(i);
        }
        for (char i =(char)('a' + num); i >= 'a'; i--){
            printAlphabet(i);
        }
    }
    private static void printAlphabet(char ch){
        for (char letter = 'a'; letter <= ch; letter++){
            System.out.print(letter + " ");
        }
        System.out.println();
    }
}
