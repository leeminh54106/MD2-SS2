import java.util.Scanner;

public class luyentap5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập vào số cần kiểm tra");
       int num = scanner.nextInt();

       if(num < 2){
           System.out.println("không phải là số nguyên tố");
       }else {
           int i =2;
           boolean check = true;
           while (i <= Math.sqrt(num)){
               if(num % i == 0){
                   check = false;
                   break;
               }
               i++;

           }
           if(check) {
               System.out.println(num + "là số nguyên tố");
           }else {
               System.out.println(num + "không là số nguyên tố");
           }
       }

    }
}
