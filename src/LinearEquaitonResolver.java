import java.util.Scanner;

public class LinearEquaitonResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equaiton Resolver:");
        System.out.println("'Given a question as: ax + b = c' , please enter condition ");
        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        double a = scanner.nextDouble();
        System.out.print("b: ");
        double b = scanner.nextDouble();
        System.out.print("c: ");
        double c = scanner.nextDouble();

        if(a != 0){
            double answer = (c - b) / a;
            System.out.print("The solution is x = " + answer);
        }else{
            if(b == c){
                System.out.print("The solution is all x");
            }else{
                System.out.print("No solution");
            }
        }
    }

}
