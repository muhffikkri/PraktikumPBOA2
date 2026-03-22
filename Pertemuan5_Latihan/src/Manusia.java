/* Nama File    : Manusia.java
 * Deskripsi    : Kelas induk (superclass) untuk semua Manusia, berisi atribut dan method dasar
 * Pembuat      : Muhammad Fikri / 24060124130069
 * Tanggal      : 11 Maret 2026
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * Abstraksi umum untuk data manusia.
 * Menyimpan identitas dasar dan kontrak masa kerja.
 */
public abstract class Manusia {
    // Data dasar manusia.
    private String nama;
    private LocalDate tgl_mulai_kerja;
    private String alamat;
    private double pendapatan;

    // Counter total objek turunan Manusia yang dibuat.
    public static int counterMhs;

    // Formatter tanggal untuk output yang konsisten.
    protected DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy", new Locale("id", "ID"));

    // Membuat objek manusia dengan nilai default.
    public Manusia() {
        this.nama = "";
        this.tgl_mulai_kerja = LocalDate.of(2000, 1, 1);
        this.alamat = "";
        this.pendapatan = 0;
        counterMhs++;
    }

    // Membuat objek manusia dengan data lengkap.
    public Manusia(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMhs++;
    }

    // Mengambil nama manusia.
    public String getNama() {
        return nama;
    }

    // Mengambil tanggal mulai kerja.
    public LocalDate getTglMulaiKerja() {
        return tgl_mulai_kerja;
    }

    // Mengambil alamat manusia.
    public String getAlamat() {
        return alamat;
    }

    // Mengambil nilai pendapatan.
    public double getPendapatan() {
        return pendapatan;
    }

    // Mengambil jumlah objek turunan Manusia.
    public static int getCounterMhs() {
        return counterMhs;
    }

    // Alias method agar tetap kompatibel dengan pemanggilan lama di kelas utama.
    public static int getCounterMns() {
        return counterMhs;
    }

    // Mengubah nama manusia.
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Mengubah tanggal mulai kerja.
    public void setTglMulaiKerja(LocalDate tgl_mulai_kerja) {
        this.tgl_mulai_kerja = tgl_mulai_kerja;
    }

    // Mengubah alamat manusia.
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // Mengubah nilai pendapatan.
    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    // Menampilkan informasi dasar manusia.
    public void cetakInfo() {
        // Menampilkan identitas utama objek.
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Mulai Kerja : " + tgl_mulai_kerja.format(fmt));
        System.out.println("Alamat : " + alamat);
        System.out.println("Pendapatan : " + pendapatan);
    }

    // Setiap turunan menentukan aturan perhitungan masa kerja sendiri.
    public abstract int hitungMasaKerja();
} 
