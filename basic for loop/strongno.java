//strong number : 145 = 1! + 4! + 5! = 154

class Strong1
{
    public static void main(String[] args) {
        int n = 145;
        int sum=0;
        int temp=n;

        while(n!=0)
        {
            int rem=n%10;
            int fact=1;
            for(int i=1;i<=rem;i++)
            {
                fact=fact*i;
            }
            sum=sum+fact;
            n=n/10;
        }
        if(sum==temp){
            System.out.println("Strong number");
        }
        else{
            System.out.println("Not Strong number");
        }

    }
}