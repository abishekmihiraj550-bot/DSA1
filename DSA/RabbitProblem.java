import java.util.Scanner;

public class RabbitProblem {

    static int rabbits(int n) {
        if (n <= 2) return 1;
        return rabbits(n-1) + rabbits(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter months: ");
        int m = sc.nextInt();
        System.out.println("Rabbit pairs: " + rabbits(m));
    }
}
