import java.util.Scanner;

public class bt5 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("nhập số bắt đầu");
        int start = scanner.nextInt();

        System.out.println("nhập số kết thúc");
        int end = scanner.nextInt();
        int sum = 0;
        for(int i = start; i <= end; i++){
            if(i % 2 == 0){
               sum += i;
            }
        }
        System.out.println("Tổng các số chẵn trong khoảng (" + start + " -> " + end + ") là: " + sum);
    }
}
