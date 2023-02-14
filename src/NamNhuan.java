import java.util.Scanner;

public class NamNhuan {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Nhập năm : ");
        year= scanner.nextInt();
        if (year%4==0){
            if (year%100==0){
                if (year%400==0){
                    System.out.println(year+" là năm nhuận.");
                }else {
                    System.out.println(year+" không phải năm nhuận");
                }
            }else{
                System.out.println(year+" là năm nhuận.");
            }
        }else{
            System.out.println(year+" không phải năm nhuận.");
        }
    }
}
