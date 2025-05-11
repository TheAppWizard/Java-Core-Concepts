public class ControlStatements {
    public static void main(String[] args) {

        int number = 5;

        // IF-ELSE STATEMENT
        if (number > 0) {
            System.out.println("Number is positive");
        } else if (number < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }

        // SWITCH STATEMENT
        // int day = 3;
        // switch (day) {
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
        //     case 3:
        //         System.out.println("Wednesday");
        //         break;
        //     default:
        //         System.out.println("Other Day");
        // }

        //SWITCH RULE
        int day = 3;
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            default -> System.out.println("Other Day");
        }


        // FOR LOOP
        //“Start counting from 1. As long as the number is less than or equal to 3, keep going. After each step, go to the next number.”
        // It will print i = 1 to i =3 and it will stop 
        System.out.println("For loop:");
        for (int i = 1; i <= 3; i++) {
            System.out.println("i = " + i);
        }

        // WHILE LOOP
        //Start at 1. While the number is 3 or less, keep printing and then go to the next number.”It checks the condition before printing.
        System.out.println("While loop:");
        int j = 1;
        while (j <= 3) {
            System.out.println("j = " + j);
            j++;
        }

        // DO-WHILE LOOP
        //Do this at least once, and then check if the number is still 3 or less. If yes, do it again.”
        //This loop always runs once, even if the condition is false at the start
        System.out.println("Do-while loop:");
        int k = 1;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k <= 3);
    }
}
