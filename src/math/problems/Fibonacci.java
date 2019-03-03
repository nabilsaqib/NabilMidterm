package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
        int n = 40;
        int a = 0;
        int b = 1;

        for (int i = 1; i <= n; i++)
        {
            System.out.println(a);

            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}