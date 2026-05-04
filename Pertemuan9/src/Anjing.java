/* Nama File    : Anjing.java
 * Deskripsi    : Kelas turunan Anabul yang mengimplementasikan perilaku gerak dan suara anjing.
 * Pembuat      : Muhammad Fikri / 24060124130069
 * Tanggal      : 4 Mei 2026
 */

public class Anjing extends Anabul {
    // Algoritma
    public Anjing() {
        super();
    }

    public Anjing(String Nama) {
        super(Nama);
    }

    @Override
    public void Gerak() {
        System.out.println(getNama() + " bergerak dengan berjalan");
    }

    @Override
    public void Bersuara() {
        System.out.println(getNama() + " bersuara guk guk guk");
    }
}