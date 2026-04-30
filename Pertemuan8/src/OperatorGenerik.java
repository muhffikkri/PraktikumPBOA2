/* Nama File    : OperatorGenerik.java
 * Deskripsi    : Kelas yang berisi prosedur generik Tukar untuk menukar isi dua wadah generik (Datum).
 * Pembuat      : Muhammad Fikri / 24060124130069
 * Tanggal      : 30 April 2026
 */

public class OperatorGenerik<T> {
    public void Tukar(Datum<T> a, Datum<T> b) {
        T temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }
}