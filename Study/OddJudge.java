import java.util.Scanner;

/**
 * BitStudy
 */
public class OddJudge {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number:");
        int num = input.nextInt();
        if ((num & 1) == 1) {
            System.out.println("success this is a Odd.");
        }
    }
}