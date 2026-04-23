/* Nama File    : Anabul.java
 * Deskripsi    : Kelas induk Anabul yang mendefinisikan atribut nama serta perilaku gerak dan bersuara.
 * Pembuat      : Muhammad Fikri / 24060124130069
 * Tanggal      : 23 April 2026
 */

public class Anabul {
    protected String Nama;

    public Anabul(String Nama) {
        this.Nama = Nama;
    }

    public void Gerak() {
        System.out.println(Nama + " sedang bergerak");
    }

    public void Bersuara() {
        System.out.println(Nama + " bersuara");
    }
}