/* Nama File    : MainAnabul.java
 * Deskripsi    : Program utama untuk mengilustrasikan konsep generik (Datum, OperatorGenerik, Bobot2, Data) pada keluarga kelas Anabul.
 * Pembuat      : Muhammad Fikri / 24060124130069
 * Tanggal      : 30 April 2026
 */

import java.util.ArrayList;
import java.util.List;

public class MainAnabul {
    public static void main(String[] args) {
        // Kamus
        Datum<Kucing> a1 = new Datum<>();

        // No 1
        // Mengisi a1 dengan objek Kembangtelon
        a1.setIsi(new Kembangtelon("Oyeng", 4.2));
        System.out.println(a1.getIsi());
        
        // Mengisi a1 dengan objek Anggora
        a1.setIsi(new Anggora("Snowy", 3.1));
        System.out.println(a1.getIsi());


        // No 2
        Datum<Integer> int1 = new Datum<>(3);
        Datum<Integer> int2 = new Datum<>(6);
        OperatorGenerik<Integer> tukarInt = new OperatorGenerik<>();

        System.out.println("Sebelum ditukar");
        System.out.println("int1 : " + int1.getIsi());
        System.out.println("int2 : " + int2.getIsi());

        System.out.println("Setelah ditukar");
        tukarInt.Tukar(int1, int2);
        System.out.println("int1 : " + int1.getIsi());
        System.out.println("int2 : " + int2.getIsi());

        Datum<String> str1 = new Datum<>("Setiawan");
        Datum<String> str2 = new Datum<>("Ade");
        OperatorGenerik<String> tukarStr = new OperatorGenerik<>();

        System.out.println("Sebelum ditukar");
        System.out.println("str1 : " + str1.getIsi());
        System.out.println("str2 : " + str2.getIsi());

        System.out.println("Setelah ditukar");
        tukarStr.Tukar(str1, str2);
        System.out.println("str1 : " + str1.getIsi());
        System.out.println("str2 : " + str2.getIsi());

        Datum<Anabul> anabul1 = new Datum<>(new Kucing("Mimi", 2.4));
        Datum<Anabul> anabul2 = new Datum<>(new Anjing("Puppy"));
        OperatorGenerik<Anabul> tukarAnabul = new OperatorGenerik<>();

        System.out.println("Sebelum ditukar");
        System.out.println("anabul1 : " + anabul1.getIsi());
        System.out.println("anabul2 : " + anabul2.getIsi());

        System.out.println("Setelah ditukar");
        tukarAnabul.Tukar(anabul1, anabul2);
        System.out.println("anabul1 : " + anabul1.getIsi());
        System.out.println("anabul2 : " + anabul2.getIsi());

        // No 3c: Bobot2 untuk menjumlahkan bobot dua keturunan kucing
        Bobot2 bobot2 = new Bobot2();
        Kucing k1 = new Anggora("Luna", 2.5);
        Kucing k2 = new Kembangtelon("Momo", 3.0);
        System.out.println("Jumlah bobot dua kucing: " + bobot2.jumlahBobot(k1, k2) + "kg");

        // Cara kerja konsep generik adalah dengan menyediakan sebuah wadah yang bisa diisi oleh tipe apapun. 
        // kelas generik hanya membuat semacam placeholder agar suatu kelas bisa menerima semua jenis input dan memamnggil operator dari semua jenis kelas terkait yang memiliki method tertentu. 
        // Konsep generik diterapkan pada tipe list dengan objek arraylist karena arraylist harus bisa menerima semua jenis kelas sebagai input

        Data<Anabul> d = new Data<>();

        System.out.println(d.getSize());
        d.setIsi(1, new Anjing("Bolu"));
        d.setIsi(2, new Kucing("Kitty", 1.8));
        System.out.println(d.getSize());
        System.out.println(d.getIsi(1));
        System.out.println(d.getIsi(2));

        // Contoh tambahan: penerapan List dengan kelas generik (Datum)
        List<Datum<? extends Anabul>> listDatum = new ArrayList<>();
        listDatum.add(new Datum<>(new Burung("Cici")));
        listDatum.add(new Datum<>(new Anggora("Mia", 3.2)));
        System.out.println("Isi List<Datum<? extends Anabul>>:");
        for (Datum<? extends Anabul> item : listDatum) {
            System.out.println(item.getIsi());
        }
        
        
    }
}