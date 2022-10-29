import java.util.Scanner;

public class xor {
    public static void main(String[] args) {
        //利用与运算消除最低位上的1
        //00000000 00000000 00000000 00001010 这个数字是10
        //00000000 00000000 00000000 00000001 这个数字是1
        //两数相减
        //00000000 00000000 00000000 00001001 结果为9
        //用9和10做与运算
        //00000000 00000000 00000000 00001000 成功消去最低位上的0
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
