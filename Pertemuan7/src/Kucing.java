/* Nama File    : Kucing.java
 * Deskripsi    : Kelas turunan Anabul yang mengimplementasikan perilaku gerak dan suara kucing.
 * Pembuat      : Muhammad Fikri / 24060124130069
 * Tanggal      : 23 April 2026
 */

public class Kucing extends Anabul {
    public Kucing(String Nama) {
        super(Nama);
    }

    @Override
    public void Gerak() {
        System.out.println(Nama + " bergerak dengan berjalan");
    }

    @Override
    public void Bersuara() {
        System.out.println(Nama + " bersuara miaw");
    }
}