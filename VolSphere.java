
import java.util.Scanner;

/**
* Finidng the volume of a sphere.
*
* @author  Keiden B
* @version 1.0
* @since   2023-02-13
*/

public final class VolSphere {
    /**
    * Necessary to prevent HideUtilityClass Error.
    *
    * @exception IllegalStateException Utility class
    * @see IllegalStateException
    */
    private VolSphere() {
        throw new IllegalStateException("Utility class");
    }

    /**
    * Main lines of code.
    *
    * @param args a placeholder value when making the main function
    */
    public static void main(String[] args) {
        final Scanner get = new Scanner(System.in);

        System.out.println("Hi! This is a calculator "
            + "for the volume of a sphere.");
        System.out.print("What is the radius of your sphere?\n");
        final String radius = get.nextLine();

        final double radiusDouble = Double.parseDouble(radius);

        if (radiusDouble >= 0.00) {
            final double volume = Math.pow(radiusDouble, 3) * Math.PI * 4 / 3;

            System.out.printf("The volume of a sphere with a radius of %.3f cm"
                + " is %.3f cm^3.\n", radiusDouble, volume);
        } else {
            System.out.println("Radius can not be a negative number!");
        }
        get.close();
    }
}
