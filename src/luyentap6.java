import java.util.Scanner;

public class luyentap6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = -1;
        while (number != 0){
            System.out.println("menu");
            System.out.println("0 = exit");
            System.out.println("1 là hình vuông");
            System.out.println("2 là hình tam giác");
            System.out.println("3 là hình tam giác ngược");
            System.out.println("nhập vào number:");
            number = Integer.parseInt(scanner.nextLine());

            switch (number){
                case 1:
                    System.out.println("*******");
                    System.out.println("*******");
                    System.out.println("*******");
                    break;
                case 2:
                    System.out.println("   *");
                    System.out.println("  ***");
                    System.out.println("*******");
                    System.out.println("*********");
                    break;
                case 3:
                    System.out.println("*********");
                    System.out.println(" *******");
                    System.out.println("   ***");
                    System.out.println("    *");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println(" chưa thiết kế");
            }
        }

    }
}
