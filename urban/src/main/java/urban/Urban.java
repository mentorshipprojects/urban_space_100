package urban;

import java.text.DateFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * Created by and on 15.02.17.
 */
public class Urban {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        //User input

        System.out.println("Please enter day");
        DateFormat format = new SimpleDateFormat("MM-dd");
        System.out.println("Enter date and time in the format MM-dd");
        System.out.println("For example, it is now " + format.format(new Date()));
        Date date = null;
        int price2 = 0;
        while (date == null) {
            String line = userInput.nextLine();
            try {
                date = format.parse(line);
            } catch (ParseException e) {
                System.out.println("Sorry, that's not valid. Please try again.");
            }
        }
        Format form = new SimpleDateFormat("MM-dd");
        String dat = form.format(date);
        List valid = Arrays.asList("12-12", "12-13", "01-01", "17-02", "07-01", "08-03", "01-04", "02-04", "16-05");


        if (valid.contains(dat)) {
            System.out.println("Sorry we are have holidays");
        } else {
            System.out.println("Welcome to urban Space \n");
            System.out.println("Please type 1 if you want to book hall \nPlease type 2 if you want to have food");
            int a = userInput.nextInt();

            switch (a) {
                case 1:
                    System.out.println("Please type 1 if you want to book all seats and you a member of Teple Misto ");
                    System.out.println("Please type 2 if you want to book all seats  ");
                    System.out.println("Please type 3 if you want to book hall without seats  ");
                    System.out.println("Please type 4 if you know how many seats you want to book   ");
                    int b = userInput.nextInt();
                    switch (b) {
                        case 1:
                            System.out.println("You booked all seats(50 seats) so you order is 1650 uah ");
                            break;
                        case 2:
                            System.out.println("You booked all seats(50 seats) so you order is 1750 uah ");
                            break;
                        case 3:
                            System.out.println("You booked all seats(50 seats) so you order is 1000 uah ");
                            break;
                        case 4:
                            System.out.println("Please type how many seats you want to book ");
                            int c = userInput.nextInt();
                            if (c <= 50) {
                                int res = c * 20 + 950;
                                System.out.println("Your order is " + res + "uah");
                            } else {
                                System.out.println("Please type below than 50 seats ");
                            }

                            break;
                        default:
                            System.out.println("Please type 1 or 2 or 3 or 4 ");

                    }

                case 2:
                    System.out.println("Our menu");
                    System.out.println("Please type 1 if you want to have soup");
                    System.out.println("Please type 2 if you want to have soft drink ");
                    System.out.println("Please type 3 if you want to have meat dishes ");
                    System.out.println("Please type 4 if you want to have seafood");
                    System.out.println("Please type 5 if you want to have steak ");
                    System.out.println("Please type 6 if you want to have side dishes");
                    System.out.println("Please type 7 if you want to have dessert ");
                    int c = userInput.nextInt();
                    switch (c) {
                        case 1:
                            System.out.println("Please type 2");
                            break;
                        case 2:
                            System.out.println("Please type 1 if you want to have coca-cola");
                            System.out.println("Please type 2 if you want to have sprite ");
                            int drink = userInput.nextInt();
                            if (drink == 1) {
                                price2=10;
                            }else{
                                price2=15;
                            }
                            System.out.println("Your order is " + price2);

                            break;
                        default:
                            System.out.println("Please type 1 or 2 ");
                            break;
                    }


            }
        }
    }
}
