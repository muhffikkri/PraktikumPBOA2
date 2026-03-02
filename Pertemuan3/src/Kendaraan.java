public class Kendaraan {
    // Atribut
    private String noPlat;
    private String jenis;

    // Method
    
    // Konstruktor tanpa parameter
    Kendaraan() {
        noPlat = "#";
        jenis = "#";
    }

    // Konstruktor dengan parameter
    Kendaraan(String newNoPlat, String newJenis) {
        noPlat = newNoPlat;
        jenis = newJenis;
    }

    // Mengembalikan nilai noPlat
    String getNoPlat() {
        return noPlat;
    }

    // Mengembalikan nilai jenis
    String getJenis() {
        return jenis;
    }

    // Mengatur nilai noPlat
    public void setNoPlat(String newNoPlat) {
        noPlat = newNoPlat;
    }

    // Mengatur nilai jenis
    public void setJenis(String newJenis) {
        jenis = newJenis;
    }
}
