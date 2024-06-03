import java.util.Scanner;

public class bt7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;

        for(int i = 2; count < 20; i++){
            boolean check = true;
            for (int j = 2; j < i; j++){
                if(i % j == 0){
                    check = false;
                    break;
                }
            }
            if(check){
                System.out.print(i+",");
                count++;
            }
        }
    }
}
