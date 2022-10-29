import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

import javafx.scene.chart.PieChart.Data;

/**
 * cake
 */
public class cake {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String[] getScale = input.nextLine().split(" ",num);
        int[] toScale = new int[getScale.length];
        for (int i = 0; i < getScale.length; i++) {
            In
            toScalep[i] = IntgetScale[i]
        }
        //遍历角度数组，找出一个角度差最小的组合
        //再把这两个数从数组中删除
        //题目仅要求角度差最小，并不需要求出怎么分
        for(int i = 0; i < getScale.length; i++){
            if (num > 1) {
                int[] tMin = getMin(getScale);
                delEle(getScale, tMin[1]);
                delEle(getScale, tMin[2] - 1);
            }
        }
        System.out.println(getScale);
    }
    //离谱，才知道java不能用一个函数删除数组中的元素
    public static int[] delEle(int[] data,int num) {
        int[] afterData = new int[data.length - 1];
        j = 0;
        for(int i = 0;i < data.length;i++){
            if(i == num){
                continue;
            }
            afterData[j++] =data[i]; 
        }
        return afterData;
    }
    //获取差的最小值，并返回是哪两个脚标
    public static int[] getMin(int[] theData) {
        int sub1 = 0,sub2 = 0;
        int Min = 360;
        for (int i = 0; i < theData.length; i++) {
            for (int j = i + 1; j < theData.length; j++) {
                int getMin = Math.abs(theData[i] - theData[j]);
                if (getMin < Min){
                    Min = getMin;
                    sub1 = i;
                    sub2 = j;
                }
            }
        }
        int[] end = new int[]{Min,sub1,sub2};
        return end;
    }
}