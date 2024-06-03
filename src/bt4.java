import java.util.Scanner;

public class bt4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập điểm toán");
        double toan = scanner.nextDouble();

        System.out.println("nhập điểm văn");
        double van = scanner.nextDouble();

        System.out.println("nhập điểm anh");
        double anh = scanner.nextDouble();

        System.out.println("nhập điểm hóa");
        double hoa = scanner.nextDouble();

        System.out.println("nhập điểm lý");
        double ly = scanner.nextDouble();

        double diemtb = (toan + van + anh + hoa + ly)/5;

        if(diemtb >= 0 && diemtb <5){
            System.out.println(diemtb+ " xếp loại yếu");
        } else if (diemtb >= 5 && diemtb <6.5) {
            System.out.println(diemtb+ " xếp loại trung bình");
        } else if (diemtb >= 6.5 && diemtb <8) {
            System.out.println(diemtb+ " xếp loại khá");
        } else if (diemtb >=8 && diemtb <9) {
            System.out.println(diemtb+ " xếp loại giỏi");
        }else if (diemtb >= 9 && diemtb <= 10) {
            System.out.println(diemtb + " xếp loại xuất sắc");
        }else {
            System.out.println(diemtb + " bôc phét");
        }
    }
}
