import static java.lang.System.out;
import java.util.Arrays;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        /* creating a new vehicle and  setting the attribute(
        Would most likely use a constructor in the real world ?..
        */

        // entering a new car order example


        Vehicle v1 = new Vehicle();
        v1.setBrand("Ford");
        v1.setColor("Blue");
        v1.setMaxSpeed(200);
        v1.setZeroToSixty(2.9);
        v1.setSeats(2);
        //v1.setOptions("Air con", "Bluetooth", "Satnav"); //need to look at setting an array - Arrays.toString

        System.out.println(v1.getBrand());
    }
}
/*
// Second vehicle being built with custom input from the user
        Scanner sc = new Scanner(System.in);

            Vehicle v2 = new Vehicle();

        System.out.println("Please enter the brand of Vehicle you would like.");
        v2.setBrand(sc.nextLine());

        System.out.println("Please specify a color.");
        v2.setColor(sc.nextLine());

        System.out.println("Please specify a top speed.");
        v2.setMaxSpeed(sc.nextInt());

        System.out.println("Please specify a 0-60 time.");
        v2.setZeroToSixty(sc.nextDouble());

        System.out.println("Please specify the number of seats.");
        v2.setSeats(sc.nextInt());



        }
    }
} */
