# Tugas Coding

## No. 1 
Soal No. 1 Buatlah perulangan hingga 100 menggunakan Java dengan output sebagai berikut:
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
- for (int i = 1; i <= 100; i++):
  Ini adalah perulangan for. Ini akan menjalankan blok kode di dalamnya dari i mulai dari 1 hingga 100. i akan terus bertambah dengan nilai 1 setiap kali perulangan selesai.

- if (i <= 9) { System.out.println(i); }:
  Ini adalah pernyataan kondisional if. Jika i kurang dari atau sama dengan 9, maka program akan mencetak nilai i. Ini akan mencetak angka dari 1 hingga 9.

- else { System.out.println("(Farros)"); }:
   Jika kondisi di atas tidak terpenuhi, maka program akan mencetak "(Farros)" sebagai output. Ini akan terjadi ketika nilai i lebih besar dari 9, yaitu dari 10 hingga 100.

## No. 2
Soal No. 2 Buatlah program bebas, dengan menerapkan if else dalam perulangan while
Penjelasan : 
  - Program ini meminta pengguna untuk memasukkan bilangan bulat. Selama bilangan yang dimasukkan tidak sama dengan 0, program akan memeriksa apakah bilangan tersebut genap atau 
  ganjil dengan menggunakan operator modulus (%). Kemudian, program akan mencetak hasilnya. Pengguna dapat terus memasukkan bilangan atau mengakhiri program dengan memasukkan 0.
  Program akan berjalan dalam perulangan while sampai pengguna memasukkan 0.

## No. 3
Soal No. 3 Buatlah program zodiac dengan menggunakan fitur input dengan hasil menampilkan zodiac sesuai dengan tanggal lahir yang diinputkan
Penjelasan :
### 1
```sh
System.out.print("Masukkan tanggal lahir (contoh: 31): ");
int tanggal = input.nextInt();
```
Ini adalah pernyataan yang mencetak pesan ke layar, meminta pengguna untuk memasukkan tanggal lahir, dan kemudian menggunakan nextInt() untuk membaca bilangan bulat dari masukan pengguna dan menyimpannya dalam variabel tanggal.

### 2
```sh
System.out.print("Masukkan bulan lahir (contoh: 12): ");
int bulan = input.nextInt();
```
Ini adalah pernyataan yang mirip dengan yang sebelumnya, tetapi kali ini meminta pengguna untuk memasukkan bulan lahir dan menyimpannya dalam variabel bulan.

### 3
```sh
String zodiak = hitungZodiak(tanggal, bulan)
```
ni adalah pemanggilan metode hitungZodiak dengan dua argumen, yaitu tanggal dan bulan, yang akan mengembalikan zodiak berdasarkan tanggal dan bulan yang diinputkan.

### 4
```sh
System.out.println("Zodiak Anda adalah: " + zodiak);
```
Ini adalah pernyataan yang mencetak zodiak yang dihitung ke layar.

### 5
```sh
public static String hitungZodiak(int tanggal, int bulan) {
```
Ini adalah deklarasi metode hitungZodiak yang menerima dua parameter, yaitu tanggal dan bulan.

### 6
```sh
if ((bulan == 3 && tanggal >= 21) || (bulan == 4 && tanggal <= 19)) {
    return "Aries";
}
```
Ini adalah pernyataan if yang memeriksa apakah tanggal dan bulan cocok dengan rentang untuk zodiak Aries. Jika benar, metode ini mengembalikan string "Aries".

### 7
```sh
else if ((bulan == 4 && tanggal >= 20) || (bulan == 5 && tanggal <= 20)) {
    return "Taurus";
}
```
Ini adalah pernyataan else if yang memeriksa apakah tanggal dan bulan cocok dengan rentang untuk zodiak Taurus. Jika benar, metode ini mengembalikan string "Taurus".

Dan seterusnya, ada serangkaian pernyataan else if yang memeriksa berbagai zodiak berdasarkan tanggal dan bulan. Jika tidak ada kondisi yang terpenuhi, program akan mencapai pernyataan else di akhir metode hitungZodiak, dan mengembalikan string "Pisces" sebagai nilai default.

## No. 4
Soal No. 4 Buatlah sebuah variabel dengan tipe data array, kemudian tampilkan semua nilai dalam variabel tersebut menggunakan perulangan for
Penjelasan :
### 1
```
String[] fruits = {"Apel", "Jeruk", "Pisang", "Mangga", "Strawberry"};
```
Ini adalah deklarasi array fruits dengan tipe data String. Array ini berisi beberapa nilai String (nama-nama buah) yang diinisialisasi secara langsung dengan menggunakan kurung kurawal {}.

### 2
```
for (int i = 0; i < fruits.length; i++) {
```
Ini adalah inisialisasi perulangan for. Dalam deklarasi ini, kita membuat variabel i dengan tipe data int dan menginisialisasinya dengan nilai 0. Perulangan akan terus berjalan selama i kurang dari panjang array fruits.

### 3
```
System.out.println("Buah ke-" + i + ": " + fruits[i]);
```
Ini adalah bagian yang akan dieksekusi pada setiap literasi perulangan. Ini mencetak teks ke layar menggunakan System.out.println. Teks yang dicetak adalah "Buah ke-" diikuti oleh nilai i (indeks) dan kemudian nama buah yang diambil dari array fruits menggunakan fruits[i].

Dengan demikian, kode ini membuat array fruits yang berisi nama-nama buah, kemudian menggunakan perulangan for untuk mengiterasi melalui array tersebut dan mencetak setiap nama buah bersama dengan indeksnya ke layar.


