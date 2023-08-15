class Square
{
    public static void main (String args[])
    {
        int n = 254611;
        while (n!=0)
        {
            int x = n%10;
            if (x%2==0)
            {
                System.out.println (x*x);
            }
            n=n/10;
        }
    }
}