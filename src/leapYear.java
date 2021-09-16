import java.util.Scanner;

public class leapYear {
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
        if(check) System.out.println("this is leap year");
        else System.out.println("this is not a leap year");
        scanner.close();
    }
}
