public class Recursion {

    public static void main(String[] args) {
        // cycle printing
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteration: " + i);
        }

        // recursive printing
        int iterationCount = 0;
        recursionPrint(iterationCount);
    }

    static void recursionPrint(int a) {
        if (a < 10) {
            System.out.println("Iteration: " + a);
            a++;
            recursionPrint(a);
        }
    }
}