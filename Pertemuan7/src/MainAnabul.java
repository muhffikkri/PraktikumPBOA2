/* Nama File    : MainAnabul.java
 * Deskripsi    : Program utama untuk mendemonstrasikan polimorfisme pada kelas-kelas turunan Anabul.
 * Pembuat      : Muhammad Fikri / 24060124130069
 * Tanggal      : 23 April 2026
 */

public class MainAnabul {
    public static void main(String[] args) {

        Anabul a1 = new Kucing("Kitty");
        Anabul a2 = new Anjing("Doggy");
        Anabul a3 = new Burung("Tweety");

        Anabul[] daftar = {a1, a2, a3};

        for (Anabul a : daftar) {
            a.Gerak();
            a.Bersuara();
            System.out.println();
        }
    }
}