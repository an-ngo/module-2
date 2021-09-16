import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String a;
        System.out.println("Enter your name:");
        System.out.println("nhap vao chuoi a");
        a=scanner.nextLine();
        System.out.println("Hello: "+a);
    }
}