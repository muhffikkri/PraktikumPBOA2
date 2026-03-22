/* Nama File    : Petani.java
 * Deskripsi    : Kelas turunan Manusia untuk merepresentasikan Petani
 * Pembuat      : Muhammad Fikri / 24060124130069
 * Tanggal      : 22 Maret 2026
 */

import java.time.LocalDate;
import java.time.Period;

/**
 * Merepresentasikan data petani beserta aturan pajak dan masa kerja.
 */
public class Petani extends Manusia implements Pajak {
    /************ATRIBUT************/
    // Menyimpan asal kota petani.
    private String asal_kota;
    public static int counterPetani;

    /************METHOD************/
    // Membuat objek petani dengan nilai default.
    public Petani() {
        super();
        this.asal_kota = "";
        counterPetani++;
    }

    // Membuat objek petani dengan data lengkap.
    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    // Mengambil asal kota petani.
    public String getAsal_kota() {
        return asal_kota;
    }

    // Mengubah asal kota petani.
    public void setAsal_kota(String asal_kota) {
        this.asal_kota = asal_kota;
    }

    // Mengambil jumlah objek petani.
    public static int getCounterPetani() {
        return counterPetani;
    }

    @Override
    // Menghitung masa kerja petani berdasarkan tanggal mulai kerja.
    public int hitungMasaKerja() {
        return Period.between(getTglMulaiKerja(), LocalDate.now()).getYears() + 0;
    }

    @Override
    // Menghitung pajak petani sesuai aturan yang berlaku.
    public double hitungPajak() {
        return 0.0;
    }

    @Override
    // Menampilkan informasi petani beserta asal kota.
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota : " + asal_kota);
    }
}
