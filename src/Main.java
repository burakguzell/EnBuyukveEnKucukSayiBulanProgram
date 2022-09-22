import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;
        int min = 0,max = 0;

        System.out.print("Kaç Tane Sayı Gireceksiniz : ");
        n = input.nextInt();

        for(int i = 1; i <= n; i++){

            System.out.print(i + ". Sayıyı giriniz : ");
            int sayi = input.nextInt();

            if(i == 1){
                min = sayi;
                max = sayi;
            }

            min = Math.min(min,sayi);
            max = Math.max(max,sayi);
        }
        System.out.println("En büyük sayı : " + max);
        System.out.println("En küçük sayı : " + min);
    }
}