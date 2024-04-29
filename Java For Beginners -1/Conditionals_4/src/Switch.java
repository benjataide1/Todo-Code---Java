public class Switch {

    public static void main(String[] args) {


        int day = 4;
        String name = "";

        //! Always put break
        switch (day) {
            case 1:
                System.out.println("Monday");
                name = "Monday";
                break;
            case 2:
                System.out.println("Tuesday");
                name = "Tuesday";
                break;

            case 3:
                System.out.println("Wesday");
                name = "Wesnday";
                break;

            case 4:
                System.out.println("Thuesday");
                name = "Thuesday";
                break;
            case 5:
                System.out.println("Friday");
                name = "Friday";
                break;
            case 6:
                System.out.println("Saturday");
                name = "Saturday";
                break;
            case 7:
                System.out.println("Sunday");
                name = "Sunday";
                break;
            default:
                if (day == 0 || day >= 8) {
                    System.out.println("I'm not one off these ");
                }

        }

        System.out.println("The day is : " + name);
    }
}
