import java.util.Scanner;

public class DocSo {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập số muốn đọc: ");
            int donvi = scanner.nextInt();
            switch (donvi){
                case 1:
                    System.out.println("một");
                    break;
                case 2:
                    System.out.println("hai");
                    break;
                case 3:
                    System.out.println("ba");
                    break;
                case 4:
                    System.out.println("bốn");
                    break;
                case 5:
                    System.out.println("năm");
                    break;
                case 6:
                    System.out.println("sáu");
                    break;
                case 7:
                    System.out.println("bảy");
                    break;
                case 8:
                    System.out.println("tám");
                    break;
                case 9:
                    System.out.println("chín");
                    break;
                default:
                    int hangchuc = scanner.nextInt();
                    switch (hangchuc) {
                        case 10:
                            System.out.println("mười");
                            break;
                        case 20:
                        case 30:
                        case 40:
                        case 50:
                        case 60:
                        case 70:
                        case 80:
                        case 90:
                    }
            }

            }
    }
