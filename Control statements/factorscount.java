class Prime {
    public static void main(String[] args) {
        int n = 9;
        int count = 0;

        for (int i =0 ; i<=n ; i++)
        {
            if (n%i==0)
            {
                count++;
            }
        }
        if (count==2)
        {
            System.out.println (n+" is a prime number");
        }
    }
}