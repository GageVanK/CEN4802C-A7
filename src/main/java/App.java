
public class App {
    public static void main( String[] args )
    {
        int n = 10;
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + fibMethod(n));
    }
    public static int fibMethod(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibMethod(n - 1) + fibMethod(n - 2);
    }
}
