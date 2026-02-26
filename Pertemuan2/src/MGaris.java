public class MGaris {
    public static void main(String[] args) {
        Garis G1 = new Garis();
        System.out.println("Garis G1");
        G1.printTGaris();
        Titik T1 = new Titik(4, 0);
        Titik T2 = new Titik(2, 4);
        G1.setTAwal(T1);
        G1.setTAkhir(T2);
        G1.printTGaris();
        System.out.println("Panjang garis G1 : " + G1.lenGaris());
        System.out.println("Gradien garis G1 : " + G1.gradien());
        G1.TTengahGaris().printTitik();
        G1.persamaanGaris();
        System.out.println("");

        Titik T3 = new Titik(-8, 0);
        Titik T4 = new Titik(0, 4);
        Garis G2 = new Garis(T3, T4);
        System.out.println("Garis G2");
        G2.printTGaris();
        G2.persamaanGaris();
        System.out.println("Apakah G1 sejajar dengan G2 : " + G1.isSejajar(G2));
        System.out.println("Apakah G1 tegak lurus dengan G2 : " + G1.isTegakLurus(G2));
        
        System.out.println("");
        System.out.println("Jumlah Objek Garis = " + Garis.getCounterGaris());
    }
}
