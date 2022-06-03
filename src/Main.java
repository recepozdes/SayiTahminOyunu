import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int sayi = (int) (Math.random() * 100);
        int[] wrongElement = new int[5];
        //System.out.println(sayi);
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Tahmininizi giriniz :");
            int tahmin = input.nextInt();
            if (tahmin > 99 || tahmin < 0) {
                System.out.println("0-100 arasında bir sayı giriniz");
                i--;
            } else if (tahmin == sayi) {
                System.out.println("Tebrikler bildiniz");
                break;
            } else if (tahmin > sayi) {
                System.out.println("Tahmininiz biraz büyük oldu sanki :D . Kalan tahmin hakkiniz : " + (5 - (i + 1)));
            } else {
                System.out.println("Tahmininiz biraz küçük oldu sanki :D . Kalan tahmin hakkiniz : " + (5 - (i + 1)));
            }
            wrongElement[i] = tahmin;
        }
        System.out.println();
        System.out.println("Maalesef tahmin hakkınız doldu başka bir oyunda görüşmek üzere");
        System.out.println("Tahmin edilmesi gereken sayı : "+sayi+" Sizin tahminleriniz : ");
        for(int i:wrongElement){
            System.out.print(i+" ");
        }

    }
}
