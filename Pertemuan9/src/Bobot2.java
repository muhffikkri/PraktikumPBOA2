/* Nama File    : Bobot2.java
 * Deskripsi    : Kelas dengan fungsi generik untuk menjumlahkan bobot dua objek turunan Kucing.
 * Pembuat      : Muhammad Fikri / 24060124130069
 * Tanggal      : 4 Mei 2026
 */

public class Bobot2 {
    public <T extends Kucing> double jumlahBobot(T kucing1, T kucing2) {
        // Algoritma
        return kucing1.getBobot() + kucing2.getBobot();
    }
}