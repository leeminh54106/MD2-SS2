import java.util.Scanner;

public class bt3 {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập vào số bất kỳ");
            int a = sc.nextInt();
            if (a <= 10) {
                String b = unit(a);
                System.out.printf(b);
            } else if (a > 10 && a < 20) {
                String b = dozens(a);
                System.out.println(b);
            } else if (a > 20 && a < 100) {
                String b = dozens2(a);
                System.out.println(b);
            } else if (a >= 100 && a < 1000) {
                String b = hundred(a);
                System.out.println(b);
            }

        }
        public static String unit ( int a){
            switch (a) {
                case 0:
                    break;
                case 1:
                    return "One";
                case 2:
                    return "Two";
                case 3:
                    return "Three";
                case 4:
                    return "Four";
                case 5:
                    return "Five";
                case 6:
                    return "Six";
                case 7:
                    return "Seven";
                case 8:
                    return "Eight";
                case 9:
                    return "Nine";
                case 10:
                    return "Ten";
            }
            return "";
        }
        public static String dozens ( int a){
            int b = a % 10;
            String c = "";
            switch (b) {
                case 0:
                    break;
                case 1:
                    c = "Elevent";
                    break;
                case 2:
                    c = "Twelve";
                    break;
                case 3:
                    c = "Thirteen";
                    break;
                case 4:
                    c = "Fourteen";
                    break;
                case 5:
                    c = "Fifteen";
                    break;
                case 6:
                    c = "Sixteen";
                    break;
                case 7:
                    c = "Seventeen";
                    break;
                case 8:
                    c = "Eighteen";
                    break;
                case 9:
                    c = "Nineteen";
                    break;
            }
            return c;
        }
        public static String dozens2 ( int a){
            int b = a / 10;
            int c = a % 10;
            String d = "";
            String e = unit(c);
            switch (b) {
                case 0:
                    break;
                case 1:
                    break;
                case 2:
                    d = "twenty";
                    break;
                case 3:
                    d = "thirty";
                    break;
                case 4:
                    d = "fourty";
                    break;
                case 5:
                    d = "fifty";
                    break;
                case 6:
                    d = "sixty";
                    break;
                case 7:
                    d = "seventy";
                    break;
                case 8:
                    d = "eighty";
                    break;
                case 9:
                    d = "ninety";
                    break;
            }
            return d + " " + e;
        }
        public static String hundred ( int a){
            int b = a / 100;
            int c = a % 100;
            String y = "";
            if (c > 10 && c < 20) {
                y = dozens(c);
            } else {
                y = dozens2(c);
            }
            String z = unit(b);
            return z + "hundred and " + y;
        }

    }

