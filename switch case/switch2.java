class Switch2 {
    public static void main(String[] args) {
        int ch = 'A';
        switch(ch){
            case 'A':
                System.out.println("char:A");           //error
                break;
            case 65:
                System.out.println("num-65");
                break;
            case 'B':
                System.out.println("char-B");           //error
                break;
            case 66:
                System.out.println("num-66");
                break;

        }
        System.out.println("outside switch");
    }
}