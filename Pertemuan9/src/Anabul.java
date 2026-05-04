/* Nama File    : Anabul.java
 * Deskripsi    : Kelas induk Anabul yang mendefinisikan atribut nama, panggilan, serta perilaku gerak dan bersuara.
 * Pembuat      : Muhammad Fikri / 24060124130069
 * Tanggal      : 4 Mei 2026
 */

public class Anabul {
    // Kamus
    private String Nama;
    private String panggilan;

    // Algoritma
    public Anabul() {
        this.Nama = "";
        this.panggilan = "";
    }

    public Anabul(String Nama) {
        this.Nama = Nama;
        this.panggilan = "";
    }

    public String getNama() {
        return Nama;
    }

    public String getPanggilan() {
        return panggilan;
    }
    
    public void setNama(String Nama) {
        this.Nama = Nama;
    }
    
    public void setPanggilan(String panggilan) {
        this.panggilan = panggilan;
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