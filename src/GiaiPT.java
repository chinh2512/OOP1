import java.util.Scanner;
public class GiaiPT {
        public static void main(String[]args){
            System.out.println("Cho một phương trình dạng 'a * x + b = c', vui lòng nhập các hằng số:");
            Scanner scanner = new Scanner(System.in);
            System.out.println("a: ");
            double a = scanner.nextDouble();
            System.out.println("b: ");
            double b = scanner.nextDouble();
            System.out.println("c: ");
            double c = scanner.nextDouble();
            if (a!=0){
                double answer = (c-b)/a;
                System.out.println(answer);
            } else{
                if (b==c) {
                    System.out.println("Vô số nghiệm");
                } else {
                    System.out.println("Vô nghiệm");
                }
            }

        }

}