import java.util.Scanner;

public class AnyBaseToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int base = scanner.nextInt();
        StringBuilder sb = new StringBuilder();

        while (number>0){
          int  num=number%base;
          number=number/base;
          sb.append(num);




        }
        System.out.println((sb.reverse()).toString());

    }
}
