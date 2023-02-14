import java.util.Scanner;

public class BMI {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        double weight,height,bmi;
        System.out.println("Nhập cân nặng: ");
        weight= scanner.nextDouble();
        System.out.println("Nhập chiều cao");
        height= scanner.nextDouble();
        bmi=weight/(height*height);
        System.out.println("BMI: "+bmi);
        if (bmi>=30){
            System.out.println("Béo quá béo");
        } else if (bmi>=25) {
            System.out.println("Hơi mũm mĩm");
        } else if (bmi>=18) {
            System.out.println("Body chuẩn");
        }else{
            System.out.println("Gầy dơ xương");
        }
    }
}
