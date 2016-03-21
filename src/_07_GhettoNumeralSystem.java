import java.util.Scanner;

/**
 * Created by galeto on 16.03.16.
 */
public class _07_GhettoNumeralSystem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String convertNumber = convertNumtoGhetto(n);
        System.out.println(convertNumber);
    }
    private static String convertNumtoGhetto(Integer num){
        String numAsString = num.toString();
        StringBuilder ghettoNumber = new StringBuilder();
        for (int i = 0; i < numAsString.length(); i++){
            ghettoNumber.append(digitToGhettoNum(numAsString.charAt(i)));
        }
        return ghettoNumber.toString();
    }
    private static String digitToGhettoNum(char digit){
        String ghettoNum = " ";
        switch (digit){
            case '0' : ghettoNum = "Gee";
                break;
            case '1' : ghettoNum = "Bro";
                break;
            case '2': ghettoNum = "Zuz";
                break;
            case '3': ghettoNum = "Ma";
                break;
            case '4': ghettoNum = "Duh";
                break;
            case '5': ghettoNum = "Yo";
                break;
            case '6': ghettoNum = "Dis";
                break;
            case '7': ghettoNum = "Hood";
                break;
            case '8': ghettoNum = "Jam";
                break;
            case '9' : ghettoNum = "Mack";
                break;
            default:
                break;
        }
        return ghettoNum;
    }
}
