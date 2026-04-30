/* Nama File    : Anabul.java
 * Deskripsi    : Kelas induk Anabul yang mendefinisikan atribut nama serta perilaku gerak dan bersuara.
 * Pembuat      : Muhammad Fikri / 24060124130069
 * Tanggal      : 30 April 2026
 */

public class Anabul {
    private String Nama;

    public Anabul() {
        this.Nama = "";
    }

    public Anabul(String Nama) {
        this.Nama = Nama;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }
    
    public void Gerak() {
        System.out.println(getNama() + " sedang bergerak");
    }

    public void Bersuara() {
        System.out.println(getNama() + " bersuara");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{Nama='" + getNama() + "'}";
    }
}