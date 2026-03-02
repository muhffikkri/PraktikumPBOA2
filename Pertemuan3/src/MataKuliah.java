public class MataKuliah {
    // Atribut
    String idMatKul;
    String namaMatKul;
    int sks;

    // Method
    
    // Konstruktor tanpa parameter
    MataKuliah() {
        idMatKul = "#";
        namaMatKul = "#";
        sks = 0;
    }

    // Konstruktor dengan parameter
    MataKuliah(String newIdMatKul, String newNamaMatKul, int newSks) { 
        idMatKul = newIdMatKul;
        namaMatKul = newNamaMatKul;
        sks = newSks;
    }

    // Mengembalikan nilai idMatKul
    String getIdMatKul() {
        return idMatKul;
    }

    // Mengembalikan nilai namaMatKul
    String getNamaMatKul() {
        return namaMatKul;
    }

    // Mengembalikan nilai sks
    int getSks() {
        return sks;
    }

    // Mengatur nilai idMatKul
    public void setIdMatKul(String newIdMatKul) {
        idMatKul = newIdMatKul;
    }

    // Mengatur nilai namaMatKul
    public void setNamaMatKul(String newNamaMatKul) {
        namaMatKul = newNamaMatKul;
    }

    // Mengatur nilai sks    
    public void setSks(int newSks) {
        sks = newSks;
    }
}
