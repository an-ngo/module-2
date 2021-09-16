import java.util.Scanner;

public class ptb1 {
    public static void main(String[] args) {
        //ax+b=0
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as ' a*x+b=0");
        Scanner scanner = new Scanner(System.in);

        System.out.println("a: ");
        double a= scanner.nextDouble();

        System.out.println("b: ");
        double b = scanner.nextDouble();

        if(a==0){
            if(b==0){
                System.out.println("pt co  vo so nghiem");
            }else System.out.println("pt vo nghiem");
        }else{
            System.out.println("pt co nghiem la: "+(-b/a));
        }

    }
}
