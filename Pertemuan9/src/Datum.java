/* Nama File    : Datum.java
 * Deskripsi    : Kelas generik Datum sebagai wadah (container) untuk sebuah nilai bertipe generik.
 * Pembuat      : Muhammad Fikri / 24060124130069
 * Tanggal      : 4 Mei 2026
 */

public class Datum<T> {
    // Kamus
    private T isi;

    // Algoritma
    public Datum() {
        this.isi = null;
    }

    public Datum(T isi) {
        this.isi = isi;
    }

    public T getIsi() {
        return isi;
    }

    public void setIsi(T isiBaru) {
        this.isi = isiBaru;
    }
}
