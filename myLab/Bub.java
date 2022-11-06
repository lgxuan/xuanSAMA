//终究是低估了冒泡算法的神奇了。。。

import java.lang.reflect.Array;
import java.util.Arrays;

public class Bub {
    public static void main(String[] args) {
        int[] testData = {2,0,1};
        for (int i = 0; i < testData.length; i++) {
            int j = 0;
            while (testData[j++] < testData[j+1]) {
                System.out.println(j);
                if (j+1 > testData.length) {
                    break;
                }
            }
            if (j+1 < testData.length) {
                int temp = testData[j - 1];
                testData[j - 1] = testData[i];
                testData[i] = temp;
            }
        }
        System.out.println(Arrays.toString(testData));
    }
}
