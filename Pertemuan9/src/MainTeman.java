/* Nama File    : MainTeman.java
 * Deskripsi    : Kelas aplikasi untuk menguji seluruh operasi pada kelas Teman.
 * Pembuat      : Muhammad Fikri / 24060124130069
 * Tanggal      : 4 Mei 2026
 */

public class MainTeman {
    public static void main(String[] args) {
        // Kamus
        Teman T;
        String Teman1;
        String Teman2;
        String Teman3;
        String Teman4;
        String Teman5;
        String Teman5_rename;
        String Teman6;

        // Algoritma
        T = new Teman();
        Teman1 = "Setiawan";
        Teman2 = "Ade";
        Teman3 = "Windah";
        Teman4 = "Basudara";
        Teman5 = "Ryan";
        Teman5_rename = "Ryan Armando Pasya";
        Teman6 = "Ade";

        System.out.println("NBElement : " + T.getNbelm());

        T.addNama(Teman1);
        T.addNama(Teman2);
        T.addNama(Teman3);
        T.addNama(Teman4);
        T.addNama(Teman5);

        System.out.println("Nama Teman 1 : " + T.getNama(1));
        System.out.println("Apakah Ryan merupakan teman : " + T.isMember("Ryan"));
        System.out.println("NBElement Sekarang : " + T.getNbelm());

        T.addNama(Teman6);
        System.out.println("Setelah Add Teman 6 : " + T.getNbelm());
        System.out.println("Count Nama Ade : " + T.countNama(Teman6));

        System.out.println("Set Nama Teman ke-2 menjadi 'Ade (Update)'");
        T.setNama(2, "Ade (Update)");

        System.out.println("Ganti Nama Ryan Menjadi Ryan Armando Pasya");
        T.gantiNama(Teman5, Teman5_rename);

        System.out.println("Seluruh teman sekarang : ");
        T.showTeman();

        System.out.println("Delete Ade");
        T.delNama("Ade");

        System.out.println("Seluruh teman setelah delete : ");
        T.showTeman();
        System.out.println("NBElement Akhir : " + T.getNbelm());
    }
}
