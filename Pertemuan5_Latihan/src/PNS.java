/* Nama File    : PNS.java
 * Deskripsi    : Kelas turunan Manusia untuk merepresentasikan Pegawai Negeri Sipil
 * Pembuat      : Muhammad Fikri / 24060124130069
 * Tanggal      : 22 Maret 2026
 */

import java.time.LocalDate;
import java.time.Period;

/**
 * Merepresentasikan data PNS beserta aturan pajak dan masa kerja.
 */
public class PNS extends Manusia implements Pajak {
    /************ATRIBUT************/
    // Identitas khusus PNS.
    private String nip;
    public static int counterPNS;

    /************METHOD************/
    // Membuat objek PNS dengan nilai default.
    public PNS() {
        super();
        this.nip = "";
        counterPNS++;
    }

    // Membuat objek PNS dengan data lengkap.
    public PNS(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public PNS(String nama, LocalDate tgl_mulai_kerja, double pendapatan, String nip) {
        this(nama, tgl_mulai_kerja, "", pendapatan, nip);
    }

    // Mengambil NIP PNS.
    public String getNIP() {
        return nip;
    }

    // Mengubah NIP PNS.
    public void setNIP(String nip) {
        this.nip = nip;
    }

    // Mengambil jumlah objek PNS.
    public static int getCounterPNS() {
        return counterPNS;
    }

    @Override
    // Menghitung masa kerja PNS dengan penyesuaian aturan khusus.
    public int hitungMasaKerja() {
        return Period.between(getTglMulaiKerja(), LocalDate.now()).getYears() + 9;
    }

    @Override
    // Menghitung pajak PNS dari pendapatan.
    public double hitungPajak() {
        return 0.1 * getPendapatan();
    }

    @Override
    // Menampilkan informasi PNS beserta NIP.
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP : " + nip);
    }
}
