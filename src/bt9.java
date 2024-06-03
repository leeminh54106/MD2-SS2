import java.util.Scanner;

public class bt9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean flag = true;
        while (true){
            do{
                System.out.println("1. tính chu vi và diện tích hình chữ nhật");
                System.out.println("2. tính chu vi và diện tích  hình tam giác");
                System.out.println("3. tính chu vi và diện tích  hình tròn");
                System.out.println("4.thoát");
                choice = scanner.nextInt();

                if(choice > 0 && choice < 4){
                    flag = false;
                }
            }while (flag);

            switch (choice){
                case 1:
                    System.out.println("nhập chiều dài");
                    int chieudai = scanner.nextInt();
                    System.out.println("nhập chiều rộng");
                    int chieurong = scanner.nextInt();
                    int chuvi = 2*chieudai*chieurong;
                    int dientich =  chieudai*chieurong;
                    System.out.println("chu vi hình chữ nhật là: " +chuvi);
                    System.out.println("diện  tích hình chữ nhật là: " +dientich);
                    break;
                case 2:
                    System.out.println("nhập cạch trái");
                    int cachtrai = scanner.nextInt();
                    System.out.println("nhập cạch phải");
                    int cachphai = scanner.nextInt();
                    System.out.println("nhập cạch đáy");
                    int cachday = scanner.nextInt();

                    System.out.println("nhập chiều cao");


                    double cvtamgiac = cachtrai+cachphai+cachday;
                    double dttamgiac = Math.pow(cvtamgiac,2)*(cvtamgiac-cachtrai)*(cvtamgiac-cachphai)*(cvtamgiac-cachday);

                    System.out.println("chu vi hình tam giác: " +cvtamgiac);
                    System.out.printf("diện tích hình tam giác: %.2f" ,dttamgiac);
                    break;
                case 3:
                    System.out.println("nhập bán kính");
                    double r = scanner.nextDouble();
                    double cvhinhtron = 2*3.14*r;
                    double dthinhtron = 3.14*Math.pow(r,2);

                    System.out.println("chu vi hình tròn là: " +cvhinhtron);
                    System.out.println("diện tích hình tròn là: " +dthinhtron);
                    break;
                case 4:
                    return;
            }
        }


    }
}
