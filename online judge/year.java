import java.util.Scanner;

/**
 * year
 */
public class year {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int getYear = input.nextInt();
        if ((getYear % 4 == 0 & getYear % 100 != 0 ) | getYear % 400 == 0) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}