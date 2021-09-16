import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n<10){
            System.out.println(check(n));
        }
        else{
            System.out.println(check(n/10)+"ty "+check(n%10));   
        }
        scanner.close();
    }

    static String check(int n){
        String d="";
        switch (n) {
            case 1:
                d="one";
                break;
            case 2:
                d="two";
                break;
            case 3:
                d="three";
                break;
            case 4:
                d="four";
                break;
            case 5:
                d="five";
                break;
                    
            case 6:
                d="six";
                break;
            
            case 7:
                d="seven";
                break;
            case 8:
                d="eight";
                break;
            
            case 9:
                d="nine";
                break;
        }
        return d;
    }
}
