import java.util.Scanner;

public class changeCoin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input vao VND va USD");

        int USD = scanner.nextInt();
        
        int VND = USD*24000;
        System.out.println(VND);
        scanner.close();
    }
}
