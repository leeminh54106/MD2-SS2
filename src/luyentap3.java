import java.util.Scanner;

public class luyentap3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập số a:");
        int a = Integer.parseInt(scanner.nextLine());

        System.out.println("nhập số b:");
        int b = scanner.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 && b == 0) {
            System.out.println("không có ước chung lớn nhất");
        }
        while (a != b){
            if(a > b){
                a = a - b;
                System.out.println("a =" +a);
            }else {
                b = b - a;
                System.out.println("b =" +b);
            }
        }
        System.out.println("ước chung lớn nhất là: " +b);
    }
}
