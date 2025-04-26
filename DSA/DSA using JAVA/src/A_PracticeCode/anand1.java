package A_PracticeCode;

public class anand1 {
    static int power(int x, int y, int p)
    {
        int res = 1; // Initialize result

        x = x % p; // Update x if it is more than or equal to p
        if (x == 0)
            return 0; // In case x is divisible by p;
        while (y > 0)
        {
            // If y is odd, multiply x with result
            if ((y & 1) != 0)
                res = (res * x) % p;
            // y must be even now
            y = y >> 1; // y = y/2
            x = (x * x) % p;
        }
        return res;
    }
    public static void main(String[] args)
    {
        int x = 12;
        int y = 3;
        int p = 7;
        System.out.print("Power is " + power(x, y, p));
    }
}
