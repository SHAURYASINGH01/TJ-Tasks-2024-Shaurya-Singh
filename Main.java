public class Q2 {
    public static int climbStairs(int n) {
        //write code here
        if (n <= 1) {
            return 1;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    public static void main(String[] args) {
        int n = 2;
        System.out.println(climbStairs(n));
    }
}
