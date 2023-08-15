class Armstrong1 {
    public static void main(String[] args) {
        int n = 456;
        int count = 0;
        int temp1 = n;
        int temp2 = n;
        int sum = 0;

        while (n != 0) 
        {
            count++;
            n = n / 10;
        }

        while (temp1 != 0) {
            int rem = temp1 % 10;
            int mult = 1;
            for (int i = 1; i <= count; i++) {
                mult = mult * rem;
            }
            sum = sum + mult;
            temp1 = temp1 / 10;
        }

        if (temp2 == sum) {
            System.out.println(temp2 + " is an armstrong number");
        } else {
            System.out.println(temp2 + " is not an armstrong number");
        }
    }
}