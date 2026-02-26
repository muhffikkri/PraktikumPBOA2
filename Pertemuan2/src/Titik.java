/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam clans Titik
 * Pembuat      : Muhammad Fikri / 24060124130069
 * Tanggal      : 23 Februari 2026
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

    // mengeset ordinat titik dengan nilai baru y
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

    // menghasilkan kuadran dari titik
    int getKuadran() {
        if (absis == 0 || ordinat == 0) {
            return 0;
        }
        
        if (absis > 0) {
            if (ordinat > 0) {
                return 1;
            } else {
                return 4;
            }
        } else {
            if (ordinat > 0) {
                return 2;
            } else {
                return 3;
            }            
        }
    }

    // menghasilkan jarak titik terhadap titik pusat
    double getJarakPusat() {
        return Math.sqrt(Math.pow(absis, 2) + Math.pow(ordinat, 2));
    }

    // menghasilkan jarak titik terhadap titik tertentu
    double getJarak(Titik T) {

        return Math.sqrt(Math.pow(absis - T.getAbsis(), 2) + Math.pow(ordinat - T.getOrdinat(), 2));
    }

    // Merefleksikan titik terhadap sumbu X
    void refleksiX() {
        ordinat = ordinat * -1; 
    }

    // Merefleksikan titik terhadap sumbu Y
    void refleksiY() {
        absis = absis * -1;
    }

    // Mengembalikan titik hasil refleksi terhadap sumbu X
    Titik getRefleksiX() {
        Titik res = new Titik(getAbsis(), getOrdinat());
        res.refleksiX();

        return res;
    }

    // Mengembalikan titik hasil refleksi terhadap sumbu Y
    Titik getRefleksiY() {
        Titik res = new Titik(getAbsis(), getOrdinat());
        res.refleksiY();

        return res;
    }
}