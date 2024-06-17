package encapsulation.box;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        double length = Double.parseDouble(s.nextLine());
        double width = Double.parseDouble(s.nextLine());
        double height = Double.parseDouble(s.nextLine());

        try {
            Box box = new Box(length, height, width);
            System.out.printf("Surface Area - %.2f\n", box.calculateSurfaceArea());
            System.out.printf("Lateral Area - %.2f\n", box.calculateLateralSurfaceArea());
            System.out.printf("Volume Area - %.2f\n", box.calculateVolume());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


    }
}
