public class Q6 {
  public static long number_spiral(long y, long x) {
      long max = Math.max(Math.abs(x), Math.abs(y));
        long level = max;

        // Calculate the offset from the corner of the current level
        long offset = max - 1;

        // Determine the quadrant
        int quadrant = 0;
        if (x == -offset && y <= offset) {
            quadrant = 1; // Top left corner
        } else if (y == offset && x >= -offset) {
            quadrant = 2; // Top right corner
        } else if (x == offset && y >= -offset) {
            quadrant = 3; // Bottom right corner
        } else if (y == -offset && x <= offset) {
            quadrant = 4; // Bottom left corner
        }

        // Calculate the value based on the quadrant and offset
        switch (quadrant) {
            case 1:
                return level * level - offset + y;
            case 2:
                return level * level + offset - x;
            case 3:
                return level * level + offset + y;
            case 4:
                return level * level - offset + x;
            default:
                return 0; // Should never happen
        }
  }
  public static void main(String[] args) {
        // Default Test Cases
        long[][] test_cases = {
            {2, 3},  // Output: 8
            {1, 1},  // Output: 1
            {4, 2}   // Output: 15
        };

        // Run Test Cases
        for (long[] test_case : test_cases) {
            System.out.println(number_spiral(test_case[0], test_case[1]));
        }
    }
}
