import java.util.Scanner;

//Ödev
//Java'da döngüler kullanarak yıldızlar ile elmas yapınız.
//
//    *
//   ***
//  *****
// *******
//*********
// *******
//  *****
//   ***
//    *
public class YildizlarileUcgenYapimiPratik {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz : ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int h = 1; h <= (2 * i) - 1; h++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int x = 1; x <= n; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print(" ");
            }
            for (int z = 1; z <= (2 * n - (2 * x + 1)); z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}