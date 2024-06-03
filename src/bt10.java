import java.util.Scanner;

public class bt10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c;

        while (true){
            System.out.println("nhập vào cạch phải");
            a = scanner.nextInt();
            System.out.println("nhập vào cạch trái");
            b = scanner.nextInt();
            System.out.println("nhập vào cạch đáy");
            c = scanner.nextInt();

            if(a > 0&& b >0&& c >0&& a+b > c && a+c > b&& c+b >a){
                System.out.println("nhập vào chiều cao");
                int chieucao = scanner.nextInt();
                int chuvi = a+b+c;
                int dientich = (c * chieucao)/2;
                System.out.println("chu vi của hình tam giac là: "+chuvi);
                System.out.println("diện tích cảu hình tam giác là: " +dientich);
                break;
            }else {
                System.out.println("nhập sai rồi, mời nhập lại");
            }


        }
    }
}
