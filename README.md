
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
