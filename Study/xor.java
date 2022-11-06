import java.util.Scanner;

public class xor {
    public static void main(String[] args) {
        //此方法可以计算一个数字的二进制码中1的数量
        //方法如下
        System.out.print("Please input a number:");
        Scanner input = new Scanner(System.in);
        int theNum = input.nextInt();
        int i = 0;
        while(theNum != 0){
            i++;
            theNum = (theNum - 1) & theNum;
        }
        System.out.println(i);
    }
    
}
