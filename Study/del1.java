import java.util.Scanner;

/**
 * del1
 */
public class del1 {
        //利用与运算消除最低位上的1
        //00000000 00000000 00000000 00001010 这个数字是10
        //00000000 00000000 00000000 00000001 这个数字是1
        //两数相减
        //00000000 00000000 00000000 00001001 结果为9
        //用9和10做与运算
        //00000000 00000000 00000000 00001000 成功消去最低位上的0
        //代码如下
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int theNum = input.nextInt();
        System.out.println((theNum - 1) & theNum);
    }
}