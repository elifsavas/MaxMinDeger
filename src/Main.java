import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int k, l, maxNum = 0, minNum = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç Tane Sayı Gireceksiniz? :");
        k = input.nextInt();

        for (int i = 1; i <= k; i++) {
            System.out.print(i + ". Sayıyı Giriniz: ");
            l = input.nextInt();

            if (i==1) {
                maxNum = l ;
                minNum = l ;
            }

            if (l< minNum ) {
                minNum = l ;
            } else if (l>maxNum) {
                maxNum = l;
            }

        }

        System.out.println("En Büyük Sayı:" + maxNum);
        System.out.println("En Küçük Sayı" + minNum);

    }




}
