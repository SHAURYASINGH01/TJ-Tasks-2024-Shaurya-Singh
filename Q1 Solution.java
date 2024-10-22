import java.util.ArrayList;
import java.util.List;

public class Q1 {
    public static void generatePascalTriangle(int n) {
        List<List<Integer>> pascalTriangle = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    // The value is the sum of the two values above it
                    int value = pascalTriangle.get(i - 1).get(j - 1) + pascalTriangle.get(i - 1).get(j);
                    row.add(value);
                }
            }
            pascalTriangle.add(row);
        }

        System.out.println("The first " + n + " rows of Pascal's Triangle: " + pascalTriangle);
    }

    public static void main(String[] args) {
        int n = 5;
        generatePascalTriangle(n);
    }
}
