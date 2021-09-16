import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight = scanner.nextDouble();
        double height = scanner.nextDouble();
        double bmi = weight/height/height;
        if(bmi<18.5){
            System.out.println("UnderWeight");
        }
        else if(bmi<25){
            System.out.println("Normal");
        }
        else if(bmi<30){
            System.out.println("OverWeight");
        }
        else System.out.println("Obese");
    }
}
