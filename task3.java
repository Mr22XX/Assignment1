import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        Scanner tampung = new Scanner(System.in);
        System.out.println("masukkan tanggal lahir anda : ");
        int tanggal = tampung.nextInt();
        System.out.println("masukka bulan lahir anda : ");
        int bulan = tampung.nextInt();

        String zodiac = "";

        if((tanggal >=21 &&  bulan == 3) || (tanggal <=19 && bulan ==4)){
             zodiac = "Aries";
        }
        else if ((tanggal >= 20 && bulan == 4 )|| (tanggal <= 20 && bulan == 5 )){
             zodiac = "Taurus";
        }
        else if((tanggal >= 21 && bulan == 5) || (tanggal <= 20 && bulan == 6 )){
             zodiac = "Gemini";
        }
        else if((tanggal >= 21 && bulan == 6) || (tanggal <= 22 && bulan == 7)){
             zodiac = "Cancer";
        }
        else if((tanggal >= 23 && bulan == 7) || (tanggal <= 22 && bulan == 8)){
             zodiac = "Leo";
        }
        else if((tanggal >= 23 && bulan == 8 )|| (tanggal <= 22 && bulan == 9)){
             zodiac = "Virgo";
        }
        else if ((tanggal >= 23 && bulan == 9) || (tanggal <= 22 && bulan == 10)){
             zodiac = "Libra";
        }
        else if((tanggal >= 23 && bulan == 10) || (tanggal <= 21 && bulan == 11 )){
             zodiac = "Scorpio";
        }
        else if((tanggal >= 22 && bulan == 11) || (tanggal <= 21 && bulan == 12)){
             zodiac = "Sagittarius";
        }
        else if((tanggal >= 22 && bulan == 12) || (tanggal <= 19 && bulan == 1)){
             zodiac = "Capricorn";
        }
        else if ((tanggal >= 20 && bulan == 1) || (tanggal <= 18 && bulan == 2)){
             zodiac = "Aquarius";
        }
        else{
             zodiac = "Pisces";
        }
        System.out.println("Saya tebak Zodiak kamu : " + zodiac + ":^ hehe");
        tampung.close();
    }
}
