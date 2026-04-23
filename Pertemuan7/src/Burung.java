/* Nama File    : Burung.java
 * Deskripsi    : Kelas turunan Anabul yang mengimplementasikan perilaku gerak dan suara burung.
 * Pembuat      : Muhammad Fikri / 24060124130069
 * Tanggal      : 23 April 2026
 */

public class Burung extends Anabul {
    public Burung(String Nama) {
        super(Nama);
    }

    @Override
    public void Gerak() {
        System.out.println(Nama + " bergerak dengan terbang");
    }

    @Override
    public void Bersuara() {
        System.out.println(Nama + " bersuara cuit cuit cuit");
    }
}