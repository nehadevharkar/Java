class Switch1 {
    public static void main(String[] args) {
        int x=1;
        switch(x){
            case 1:
            System.out.println("one");
            break;

            case 2:
            System.out.println("two");
            break;

            default:
            System.out.println("invalid");
            break;
        }
        System.out.println("outside switch");
    }
}