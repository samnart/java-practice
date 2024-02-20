public class isMultiple
{

    boolean isMultiply(long n, long m)
    {
        return n % m == 0;
    }

    static boolean isEven(int i)
    {
        return (i & 1) == 0;
    }

    static int sum(int n)
    {
        if (n >= 0)
        {
            int sum1 = 0;
            for (int i = 1; i <= n; i++)
            {
                sum1 += i;
            }
            return sum1;
        }
        else
            return 0;

    }

    static int oddSum(int n)
    {
        int sum = 0;
        for (int i = 1; i <= n; i++)
        {
            if (i % 2 == 1)
            {
                sum += i;
            }
        }
        return sum;
    }

    static int woefjw(int n)
    {
        int sum = 0;
        for (int i = 1; i <= n; i++)
        {
            sum += i * i;
        }
        return sum;
    }

    static int count(String string)
    {
        int count = 0;
        for (int i = 0; i < string.length(); i++)
        {
            if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u')
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args)
    {
        System.out.println(count("alfjkajfworafjkaf"));
    }
}
