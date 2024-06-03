import java.util.Scanner;

public class bt8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số muốn  kiểm tra");
        int numbercheck = sc.nextInt();
        boolean flag = true;
        int index;

        while (true){
            do {
                System.out.println("1.kiểm tra tính chẵn lẻ của 1 số");
                System.out.println("2.kiểm tra số nguyên tố");
                System.out.println("3.kiểm tra 1  số có chia hết cho 3 hay không");
                System.out.println("4.thoát ");

                System.out.println("chọn chức năng muốn dùng");
                index = sc.nextInt();

                if (index > 0 && index < 5) {
                    flag = false;
                }

            } while (flag);

            switch (index) {
                case 1:
                    if(numbercheck %2 ==0){
                        System.out.println( numbercheck+ " là số chẵn");
                    }else {
                        System.out.println( numbercheck+ " là số lẻ");
                    }
                    break;
                case 2:
                    boolean check = true;
                    for(int i = 2; i <= Math.sqrt(numbercheck);i++){
                        if(numbercheck %i == 0){
                            check = false;
                            break;
                        }
                    }
                    if(check){
                        System.out.println(numbercheck+ " là số nguyên tố");
                    }else {
                        System.out.println(numbercheck+ " không là số nguyên tố");
                    }
                    break;
                case 3:
                    if(numbercheck %3 == 0){
                        System.out.println(numbercheck+ " chia hết cho 3");
                    }else {
                        System.out.println(numbercheck+ " không chia hết cho 3");
                    }
                    break;
                case 4:
                    return;
            }
        }

    }
}
