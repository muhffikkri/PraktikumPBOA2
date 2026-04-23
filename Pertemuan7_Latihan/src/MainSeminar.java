/* Nama File : MainSeminar.java

Deskripsi : Program utama untuk simulasi registrasi dan penampilan data peserta seminar.
Pembuat : Muhammad Fikri / 24060124130069
Tanggal : 23 April 2026
*/

public class MainSeminar {
    public static void main(String[] args) {

        Seminar seminar = new Seminar();

        // e. 2 dosen
        Dosen d1 = new Dosen("Pak Eko", "D001");
        Dosen d2 = new Dosen("Bu Adi", "D002");

        // e. 5 mahasiswa
        Mahasiswa m1 = new Mahasiswa("Setiawan", "M001");
        Mahasiswa m2 = new Mahasiswa("Ade", "M002");
        Mahasiswa m3 = new Mahasiswa("Karina", "M003");
        Mahasiswa m4 = new Mahasiswa("Ian", "M004");
        Mahasiswa m5 = new Mahasiswa("Giselle", "M005");

        // f. registrasi semua
        seminar.registrasi(d1);
        seminar.registrasi(d2);
        seminar.registrasi(m1);
        seminar.registrasi(m2);
        seminar.registrasi(m3);
        seminar.registrasi(m4);
        seminar.registrasi(m5);

        // c & g
        seminar.tampilPeserta();
        System.out.println("Total Peserta: " + seminar.countPeserta());

        // h
        System.out.println("Total Mahasiswa: " + seminar.countMahasiswa());
        System.out.println();

        // i. set wali
        m1.setWali(d1);
        m2.setWali(d1);
        m3.setWali(d2);
        m4.setWali(d2);
        m5.setWali(d1);

        // j. tampil data mahasiswa
        m1.tampilDataMahasiswa();
        m2.tampilDataMahasiswa();
        m3.tampilDataMahasiswa();
        m4.tampilDataMahasiswa();
        m5.tampilDataMahasiswa();
    }
}