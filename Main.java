import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int number  = rand.nextInt(100);

        Scanner sc = new Scanner(System.in);
        int right=0;
        int selected;
        int[] wrong= new int[5];
        boolean isWin=false;

        while (right < 5){
            System.out.print("Lütfen tahmin ettiğiniz sayiyi giriniz: ");
            selected = sc.nextInt();

            if(selected<0 || selected>99) {
                System.out.println("Lütfen 0-100 arasında bir değer giriniz. ");
                continue;
            }

            if(selected == number){
                System.out.println("Tebrikler, doğru tahmin ! Tahmin ettiğiniz sayi: "+number);
                isWin=true;
                break;
            }
            else{

                System.out.println("Hatalı bir sayı girdiniz ! ");
                if(selected > number){
                    System.out.println(selected+" sayısı, gizli sayıdan büyüktür. ");
                }
                else{
                    System.out.println(selected+" sayısı, gizli sayıdan küçüktür. ");
                }

                wrong[right]=selected;
                right++;
                System.out.println("Kalan Hakkınız: "+ (5-right));

            }

        }

        if(!isWin){
            System.out.println("Kaybettiniz ! ");
            System.out.println("Gizli Sayı: "+ number);
        }
        System.out.println("Tahminleriniz: "+ Arrays.toString(wrong));

    }
}
//Java dilinde programın 0-100 arasında rastgele seçtiği bir sayıyı kullanıcının
// tahmin etmesini istediğimiz bir "Sayı Tahmin Oyunu" yapıyoruz.