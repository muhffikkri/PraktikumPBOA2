/* Nama File    : Pengusaha.java
 * Deskripsi    : Kelas turunan Manusia untuk merepresentasikan Pengusaha
 * Pembuat      : Muhammad Fikri / 24060124130069
 * Tanggal      : 22 Maret 2026
 */

import java.time.LocalDate;
import java.time.Period;

/**
 * Merepresentasikan data pengusaha beserta aturan pajak dan masa kerja.
 */
public class Pengusaha extends Manusia implements Pajak {
    /************ATRIBUT************/
    // Nomor pokok wajib pajak milik pengusaha.
    private String npwp;
    public static int counterPengusaha;

    /************METHOD************/
    // Membuat objek pengusaha dengan nilai default.
    public Pengusaha() {
        super();
        this.npwp = "";
        counterPengusaha++;
    }

    // Membuat objek pengusaha dengan data lengkap.
    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    // Mengambil NPWP pengusaha.
    public String getNpwp() {
        return npwp;
    }

    // Mengubah NPWP pengusaha.
    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    // Mengambil jumlah objek pengusaha.
    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    @Override
    // Menghitung masa kerja pengusaha dengan penyesuaian aturan khusus.
    public int hitungMasaKerja() {
        return Period.between(getTglMulaiKerja(), LocalDate.now()).getYears() + 6;
    }

    @Override
    // Menghitung pajak pengusaha dari pendapatan.
    public double hitungPajak() {
        return 0.15 * getPendapatan();
    }

    @Override
    // Menampilkan informasi pengusaha beserta NPWP.
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP : " + npwp);
    }
}
