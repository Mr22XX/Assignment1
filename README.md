# 1. Perulangan 1-100 dengan bahasa Java dengan index ke 10 berisi nama (my name)
### Apa itu perulangan atau looping?
 Perulangan merupakan suatu proses dimana kita dapat mengulang satu atau beberapa perintah atau eksekusi blok kode tanpa henti, selama kondisi yang dijadikan acuan terpenuhi.
### Soal : Buatlah perulangan hingga 100 menggunakan Java dengan output sebagai berikut:
    1
    2
    3
    4
    5
    6
    7
    8
    9
    (Your Name)
    (Your Name)
    (Your Name)
 Penjelasan : 
Pada kondisi ini saya menggunakan For untuk melakukan looping, dapat dilihat dari soal pada index ke 10 nilai nya berubah menjadi (Your Name). Maka dari itu kita harus memberikan conditional statement di index ke 10 

     if (i<10){
        System.out.println(i)
        }
        else{
        System.out.println("Your Name")
        }  

Maksud dari kondisi di atas adalah Jika (i < 10) maka akan menghasilkan output angka 1-9 dan jika i telah lebih dari 9 maka akan menghasilkan output "Your Name"
dan hasilnya akan sama seperti soal di atas.
### Output :
    Nama : Rayhan Muhammad Adha
    NPM : G1A023051
    =================
    1
    2
    3
    4
    5
    6
    7
    8
    9
    Rayhan Muhammad Adha
    Rayhan Muhammad Adha
    Rayhan Muhammad Adha
    (sampai i ke-100)


# 2. Program menentukan ganjil genap dengan menerapkan if else dalam perulangan while

## Soal : Buatlah program bebas, dengan menerapkan if else dalam perulangan while

Penjelasan : Pada program ini saya menggunakan while untuk melakukan looping selain itu saya menggunakan Scanner sebagai pengambil inputan.
                    
              Scanner tampung = new Scanner(System.in);
              int angka;
              while (true) {
              System.out.print("Masukkan bilangan dan (untuk memberhentikan program ketik (00) lalu enter) : ");
              angka = tampung.nextInt();
Pada baris ke-1 yaitu mengubah Scanner ke dalam variable tampung yang mana valuenya ditampung lagi pada variable bernama angka, pada baris ke-2 mengdeklarasikan bahwa variable angka itu bertipe Integer. Pada baris ke-3 merupakan proses looping while dengan kondisi jika benar (true) maka looping akan terus berjalan.

        if (angka == 00) {
                  System.out.println("Program berakhir, thank you :).");
                  break;
              } else if (angka % 2 == 0) {
                  System.out.println("Bilangan genap.");
              } else {
                  System.out.println("Bilangan ganjil.");
              }
Pada code baris ke- 1 yaitu memberikan kondisi jika angka == 00 atau inputan berupa 00 maka akan keluar output seperti pada baris ke 2 dan looping akan berhenti dikarenakan dilakukan break.
pada code baris ke-4 (else if) yaitu memberikan kondisi bahwa jika angka(inputan) modulo 2 bernilai 0 maka akan mengeluarkan input : "Bilangan genap", seperti yang kita ketahui jika  bilangan atau angka di bagi 2 dan sisa baginya adalah 0 maka bilangan atau angka termasuk bilangan genap begitu juga sebaliknya. Pada code baris ke-6 (else) jika 2 kondisi diatasnya bernilai false maka output nya adalah "Bilangan ganjil".

## Contoh Output : 
          Masukkan bilangan dan (untuk memberhentikan program ketik (00) lalu enter) : 1
          Bilangan ganjil.
          Masukkan bilangan dan (untuk memberhentikan program ketik (00) lalu enter) : 2
          Bilangan genap.
          Masukkan bilangan dan (untuk memberhentikan program ketik (00) lalu enter) : 3232
          Bilangan genap.
          Masukkan bilangan dan (untuk memberhentikan program ketik (00) lalu enter) : 00
          Program berakhir, thank you :).


# 3.  Membuat program zodiac dengan fitur input
## Soal :  Buatlah program zodiac dengan menggunakan fitur input dengan hasil menampilkan zodiac sesuai dengan tanggal lahir yang diinputkan

Penjelasan: Disini saya memakai Scanner untuk mendapatkan inputan, hal yang pertama kali harus dilakukan adalah mengimport Scanner yaitu dengan cara :
      import java.util.Scanner;
Setelah itu menampung Scanner ke sebuah variable yang bernama tampung :
                                      
        Scanner tampung = new Scanner(System.in);
        System.out.println("masukkan tanggal lahir anda : ");
        int tanggal = tampung.nextInt();
        System.out.println("masukkan bulan lahir anda : ");
        int bulan = tampung.nextInt();

        String zodiac = "";

Maksud dari code baris ke-1 adalah menampung Scanner ke sebuah variable bernama tampung, baris ke 2 adalah untuk menampilkan output "masukkan tanggal lahir anda" dan inputan akan di tampung pada variable tanggal pada baris ke-3 dengan tipe data inputan integer. Sama halnya dengan yang tadi pada baris ke-4 adalah untuk menampilkan output "masukkan bulan lahir anda" dan inputan akan di tampung pada variable bulan dengan tipe data inputan integer, dan pada baris terakhir adalah membuat variable zodiac dengan tipe data string tetapi tanpa value dikarenakan akan diisi nantinya. 

## Mengapa hanya mengambil 2 inputan ?? 
Jawab : Dikarenakan zodiac hanya di tentukan oleh tanggal dan bulan oleh karena itu hanya diambil 2 inputan.

>>>

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

Pada code diatas merupakan code yang menentukan apa zodiac sesuai inputan nantinya. Disini saya membuat nya dengan conditional statement if else, seperti kita ketahui bahwa orang yang berzodiac aries jika lahir pada 21 maret - 19 april itu kenapa pada if yang pertama berisi jika tanggal >= 21 && bulan == 3 ||  tanggal <=19 && bulan ==4 jika salah satu kondisi ini benar maka zodiac akan bernilai aries dan akan mengeluarkan output : 

      masukkan tanggal lahir anda : 
      18
      masukka bulan lahir anda :
      4
      Saya tebak Zodiak kamu : Aries:^ hehe
   

      **Notes : && = dan , || = atau

Begitu juga dengan kondisi lainnya !!! Thank You :)


# 4. Menampilkan variable dengan tipe data array
## Soal : Buatlah sebuah variabel dengan tipe data array, kemudian tampilkan semua nilai dalam variabel tersebut menggunakan perulangan for

## Penjelasan : 

    public class task4 {
    public static void main(String[] args) {
        String [] mahasiswa = {"Rayhan Muhammad Adha", "Ghazi Al-ghifari", "Faros Jundi", "Diffo Ramadhan", "Ammar Sirraj"};
        for (int i=0 ; i<mahasiswa.length; i++){
            System.out.println(mahasiswa[i]);
        }
    }
    }
  Pada code diatas terdapat variable dengan tipe data array dengan nama mahasiswa dan nilainya : "Rayhan Muhammad Adha", "Ghazi Al-ghifari", "Faros Jundi", "Diffo Ramadhan", "Ammar Sirraj". Untuk menampilkan semua nilai ini kita harus melakukan perulangan atau looping seperti code diatas dengan int (integer) i = 0 ; i<mahasiswa.length maksud dari mahasiswa.length adalah panjang dari variable mahasiswa ; i++ artinya i akan selalu bertambah jika i kurang dari panjang variable mahasiswa dan untuk menampilkan semua nilai di dalam variable seperti biasa dengan (SOUT) yang di dalamnya variable mahasiswa dengan tipe data array. Jika code diatas dijalankan maka akan menghasilkan output : 

    Rayhan Muhammad Adha
    Ghazi Al-ghifari
    Faros Jundi
    Diffo Ramadhan
    Ammar Sirraj


