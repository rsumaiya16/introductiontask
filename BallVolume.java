import java.util.Scanner;

public class BallVolume {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // System.out.println(" the radius of the ball: ");
            double radius = scanner.nextDouble();

            double volume = (4.0 / 3) * Math.PI * Math.pow(radius, 3);
            System.out.println("The volume of the ball is: " + volume);
        } 
    }
}
