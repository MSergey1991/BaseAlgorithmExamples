import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    //mergeSort for two sorted arrayLists into one of them
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(1, 4, 19, 20, 30, 116, 220, 320));
        ArrayList<Integer> b = new ArrayList<Integer>(Arrays.asList(-10, -3, 5, 17, 33));

        merge(a, b);

        System.out.println(a);
        System.out.println(b);
    }

    static void merge(ArrayList<Integer> a, ArrayList<Integer> b) {

        ArrayList<Integer> receiverArray = new ArrayList();
        int indexOfArrayA = 0;
        int indexOfArrayB = 0;

        for (int i = 0; i < (a.size() + b.size()); i++) {
            if (indexOfArrayA < a.size() && (indexOfArrayB >= b.size() || a.get(indexOfArrayA) < b.get(indexOfArrayB))) {
                receiverArray.add(i, a.get(indexOfArrayA));
                indexOfArrayA++;
            } else {
                receiverArray.add(i, b.get(indexOfArrayB));
                indexOfArrayB++;
            }
        }

        a.clear();
        a.addAll(receiverArray);
    }
}