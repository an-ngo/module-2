import java.util.Scanner;

public class namNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        boolean check = false;
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    check=true;
                }
            }
            else check=true;
        }
        if(check) System.out.println("day la nam nhuan");
        else System.out.println("day khong phai nam nhuan");
    }
}
