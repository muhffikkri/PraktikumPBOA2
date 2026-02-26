/* Nama File    : MTitik.java
 * Deskripsi    : berisi penggunaan atribut dan method dalam clans Titik
 * Pembuat      : Muhammad Fikri / 24060124130069
 * Tanggal      : 23 Februari 2026
 */

public class MTitik {
    public static void main(String[] args) {
        // Testing konstruktor default dan setter
        Titik T1 = new Titik();
        System.out.print("T1 (default): ");
        T1.printTitik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        System.out.print("T1 setelah set (3,4): ");
        T1.printTitik();
        System.out.println("");

        // Testing geser
        System.out.print("T1 sebelum digeser: ");
        T1.printTitik();
        T1.geser(2, -1);
        System.out.print("T1 setelah digeser (2,-1): ");
        T1.printTitik();
        System.out.println("");

        // Testing kuadran
        Titik T2 = new Titik(3, 5);
        System.out.print("T2: ");
        T2.printTitik();
        System.out.println("Kuadran T2: " + T2.getKuadran());
        
        Titik T3 = new Titik(-3, 5);
        System.out.print("T3: ");
        T3.printTitik();
        System.out.println("Kuadran T3: " + T3.getKuadran());
        
        Titik T4 = new Titik(-3, -5);
        System.out.print("T4: ");
        T4.printTitik();
        System.out.println("Kuadran T4: " + T4.getKuadran());
        
        Titik T5 = new Titik(3, -5);
        System.out.print("T5: ");
        T5.printTitik();
        System.out.println("Kuadran T5: " + T5.getKuadran());
        System.out.println("");

        // Testing jarak
        System.out.println("Jarak T2 ke pusat: " + T2.getJarakPusat());
        System.out.println("Jarak T2 ke T3: " + T2.getJarak(T3));
        System.out.println("");

        // Testing refleksi
        Titik T6 = new Titik(4, 6);
        System.out.print("T6 awal: ");
        T6.printTitik();
        
        T6.refleksiX();
        System.out.print("T6 setelah refleksi X: ");
        T6.printTitik();
        
        T6.refleksiY();
        System.out.print("T6 setelah refleksi Y: ");
        T6.printTitik();
        System.out.println("");

        // Testing getRefleksi (mengembalikan objek baru)
        Titik T7 = new Titik(5, 8);
        System.out.print("T7 awal: ");
        T7.printTitik();
        
        Titik T7X = T7.getRefleksiX();
        System.out.print("Hasil refleksi X dari T7: ");
        T7X.printTitik();
        System.out.print("T7 tetap: ");
        T7.printTitik();
        
        Titik T7Y = T7.getRefleksiY();
        System.out.print("Hasil refleksi Y dari T7: ");
        T7Y.printTitik();
        System.out.println("");
        
        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
    }
}