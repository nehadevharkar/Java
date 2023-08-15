class nestedswitch2 {
    public static void main(String[] args) {
        System.out.println ("University");
        String str = "SPPU";
        switch(str){
            case "Chandigarh University":
            {
                String str1="fests";
                switch (str1){
                    case "exams":
                        System.out.println("13.01.2023");
                        break;

                    case "fests":
                    System.out.println("16..02.2023");
                    break;
                }
            }
            break;

            case "SPPU":
            {
                String str1="exams";
                switch (str1){
                    case "exams":
                        System.out.println("18.05.2023");
                        break;

                    case "fests":
                    System.out.println("13.02.2023");
                    break;
                }
            }
            break;
        }
    }
    
}
