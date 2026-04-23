/* Nama File    : Anjing.java
 * Deskripsi    : Kelas turunan Anabul yang mengimplementasikan perilaku gerak dan suara anjing.
 * Pembuat      : Muhammad Fikri / 24060124130069
 * Tanggal      : 23 April 2026
 */

public class Anjing extends Anabul {
    public Anjing(String Nama) {
        super(Nama);
    }

    @Override
    public void Gerak() {
        System.out.println(Nama + " bergerak dengan berjalan");
    }

    @Override
    public void Bersuara() {
        System.out.println(Nama + " bersuara guk guk guk");
    }
}