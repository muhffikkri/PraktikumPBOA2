/* Nama File : CivitasAkademika.java

Deskripsi : Kelas induk civitas akademika yang menyimpan nama dan method dasar identitas.
Pembuat : Muhammad Fikri / 24060124130069
Tanggal : 23 April 2026
*/

public class CivitasAkademika {
    protected String Nama;

    public CivitasAkademika(String Nama) {
        this.Nama = Nama;
    }

    public String getNomor() {
        return ""; 
    }

    public String getNama() {
        return this.Nama;
    }
}