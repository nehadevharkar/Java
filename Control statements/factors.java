class CountFactor
{
    public static void main(String[] args) {
        int n = 6;
        int count = 0;
        int fact = 1;

        for (int i = 1; i<=n ; i++)
        {
            if (n%i==0)
            {
                count++;
                fact = fact * i;
                System.out.println ("Factors are : " +fact);
            }
        }
        System.out.println("Count of factors is "+count);
    }
}