import java.util.Scanner;

class Trapezium {
    public static void main(String[] args) {

        Scanner Velues = new Scanner(System.in);

        System.out.println("Enter 1st Parall Value");
        Double V1 = Velues.nextDouble();
        System.out.println("Enter 2nd Parall Value");
        Double V2 = Velues.nextDouble();
        System.out.println("Enter Direct high");
        Double Dh = Velues.nextDouble();

        Double Area = 0.5 * (V1 + V2) * Dh;
        System.out.println("Your Trapezium Area is" + " " + Area);

    }

}
