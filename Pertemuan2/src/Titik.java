/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam clans Titik
 * Pembuat      :
 * Tanggal      :
 */


public class Titik {
    /************ATRIBUT************/
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /************METHOD************/
    Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    Titik() {
        this(0,0);
    }

    // mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }
    
    // mengembalikan nilai ordinat

    double getOrdinat() {
        return ordinat;
    }

    static int getCounterTitik() {
        return counterTitik;
    }

    // mengeset absis titik dengan nilai baru x
    void setAbsis(double x) {
        absis = x;
    }

    void setOrdinat(double y) {
        ordinat = y;
    }

    // menggeser nilai absis dan ordinat titik masing masing sejauh x dan y
    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }
    
    // mencetak koordinat titik
    void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
}