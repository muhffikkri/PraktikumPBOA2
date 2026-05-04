/* Nama File    : Kucing.java
 * Deskripsi    : Kelas turunan Anabul yang memiliki atribut bobot (kg) serta perilaku gerak dan suara kucing.
 * Pembuat      : Muhammad Fikri / 24060124130069
 * Tanggal      : 4 Mei 2026
 */

public class Kucing extends Anabul {
    // Kamus
    private double bobot;

    // Algoritma
    public Kucing() {
        super();
        this.bobot = 0.0;
    }

    public Kucing(String Nama, double bobot) {
        super(Nama);
        this.bobot = bobot;
    }

    public double getBobot() {
        return bobot;
    }

    public void setBobot(double bobot) {
        this.bobot = bobot;
    }

    @Override
    public void Gerak() {
        System.out.println(this.getNama() + " bergerak dengan berjalan");
    }

    @Override
    public void Bersuara() {
        System.out.println(this.getNama() + " bersuara miaw");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{Nama='" + getNama() + "', bobot=" + getBobot() + "kg}";
    }
}