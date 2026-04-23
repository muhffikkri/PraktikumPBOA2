/* Nama File : Dosen.java

Deskripsi : Kelas turunan civitas akademika untuk data dosen dengan identitas NIP.
Pembuat : Muhammad Fikri / 24060124130069
Tanggal : 23 April 2026
*/

public class Dosen extends CivitasAkademika {
    private String NIP;

    public Dosen(String Nama, String NIP) {
        super(Nama);
        this.NIP = NIP;
    }

    @Override
    public String getNomor() {
        return this.NIP;
    }
}