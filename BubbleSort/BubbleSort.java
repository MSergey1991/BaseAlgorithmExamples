public class BubbleSort {

    public static void main(String[] args) {
        int[] testArray = {3, 4, 19, 6, 1, 13, 20};
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            printArray(testArray);
            for (int i = 0; i < testArray.length - 1; i++) {
                if (testArray[i] > testArray[i + 1]) {

                    int temp = testArray[i];
                    testArray[i] = testArray[i + 1];
                    testArray[i + 1] = temp;
                    isSorted = false;
                }
            }
        }
    }

    static void printArray(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.println(a[a.length - 1]);
    }
}
