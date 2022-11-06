import java.util.Arrays;

/**
 * Bub1
 */
public class Bub1 {

    public static void main(String[] args) {
        int[] testData = {1 , 2, 0, 1, 5, 8};
        for (int i = 0; i < testData.length; i++) {
            for (int j = 0; j < testData.length - 1; j++) {
                if (testData[j] > testData[j+1]) {
                    int temp = testData[j];
                    testData[j] = testData[j+1];
                    testData[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(testData));
    }
}