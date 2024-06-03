public class bt6 {
    public static void main(String[] args) {
        int n = 1;
        while (true){
            if(n % 3 == 0 && n % 5 == 0 & n % 7 == 0){
                System.out.println("số nhỏ nhất chia hết cho (3,5,7) là:" + n);
                break;
            }
            n++;
        }
    }
}
