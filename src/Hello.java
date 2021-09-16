import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Scanner bscanner = new Scanner(System.in);
        int a ;
        String a1;
        System.out.println("nhap vao so a sau do la chuoi a1");
        
        a=scanner.nextInt();
        System.out.println(a);

        System.out.println("nhap vao chuoi a1");
        a1=bscanner.nextLine();
        System.out.println(a1);
    }
}
