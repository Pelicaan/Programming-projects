import java.util.Scanner;

public class Fibomacci {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the max value of the fibionacci sequence to display: ");
        int i = input.nextInt();
        int x = 0;
        int y = 1;
        int z = 0;

        while (x + y <= i) {
            x += y;
            z = y;
            y = x;
            System.out.println(x);
        }
    }
}