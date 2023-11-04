import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner tampung = new Scanner(System.in);
        int angka;

        while (true) {
            System.out.print("Masukkan bilangan dan (untuk memberhentikan program ketik (00) lalu enter) : ");
            angka = tampung.nextInt();

            if (angka == 00) {
                System.out.println("Program berakhir, thank you :).");
                break;
            } else if (angka % 2 == 0) {
                System.out.println("Bilangan genap.");
            } else {
                System.out.println("Bilangan ganjil.");
            }
        }
        tampung.close();
    }
}