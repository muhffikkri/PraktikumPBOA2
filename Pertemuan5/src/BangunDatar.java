/* Nama File    : BangunDatar.java
 * Deskripsi    : Kelas induk (superclass) untuk bangun datar, berisi atribut dan method dasar
 * Pembuat      : Muhammad Fikri / 24060124130069
 * Tanggal      : 21 Maret 2026
 */

/**
 * Abstraksi umum untuk semua bangun datar.
 * Menyimpan atribut dasar serta kontrak luas dan keliling.
 */
public abstract class BangunDatar {
    /************ATRIBUT************/
    protected int jmlSisi;      // jumlah sisi bangun datar
    protected String warna;     // warna bangun datar
    protected String border;    // jenis border bangun datar
    
    // Atribut static untuk menghitung jumlah objek BangunDatar
    private static int counterBangunDatar = 0;

    /************METHOD************/
    // Konstruktor default, menambah counter
    public BangunDatar() {
        counterBangunDatar++;
    }

    // Konstruktor berparameter untuk inisialisasi semua atribut
    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    // Mengembalikan jumlah sisi
    public int getJmlSisi() {
        return jmlSisi;
    }

    // Mengeset jumlah sisi dengan nilai baru
    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    // Mengembalikan warna bangun datar
    public String getWarna() {
        return warna;
    }

    // Mengeset warna dengan nilai baru
    public void setWarna(String warna) {
        this.warna = warna;
    }

    // Mengembalikan jenis border
    public String getBorder() {
        return border;
    }

    // Mengeset border dengan nilai baru
    public void setBorder(String border) {
        this.border = border;
    }

    // Kontrak: setiap turunan wajib menghitung luas.
    public abstract double getLuas();

    // Kontrak: setiap turunan wajib menghitung keliling.
    public abstract double getKeliling();

    // Membandingkan luas objek ini dengan objek bangun datar lain.
    public boolean isEqualLuas(BangunDatar X) {
        return this.getLuas() == X.getLuas();
    }

    // Membandingkan keliling objek ini dengan objek bangun datar lain.
    public boolean isEqualKeliling(BangunDatar X) {
        return this.getKeliling() == X.getKeliling();
    }

    // Mencetak informasi bangun datar (dapat di-override oleh subclass)
    public void printInfo() {
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }

    // Method static untuk mencetak jumlah objek BangunDatar yang telah dibuat
    public static void printCounterBangunDatar() {
        System.out.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    }
}