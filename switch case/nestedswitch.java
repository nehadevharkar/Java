class NestedSwitch1 {
    public static void main(String[] args) {
        System.out.println("O PUNE");
        String str = "Non-veg";
        switch (str) {
            case "Non-veg": {
                String str1 = "Main course";
                switch (str1) {
                    case "Main course":
                        System.out.println("available");
                        break;

                    case "Starters":
                        System.out.println("not available");
                        break;
                }
            }
                break;

            case "Veg": {
                String str1 = "Starters";
                switch (str1) {
                    case "Starters":
                        System.out.println("Available");
                        break;

                    case "Main course":
                        System.out.println("Not available");
                        break;
                }
            }
                break;

        }
    }
}