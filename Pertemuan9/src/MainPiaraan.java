/* Nama File    : MainPiaraan.java
 * Deskripsi    : Kelas aplikasi untuk menguji seluruh operasi pada kelas Piaraan.
 * Pembuat      : Muhammad Fikri / 24060124130069
 * Tanggal      : 4 Mei 2026
 */

public class MainPiaraan {
	public static void main(String[] args) {
		// Kamus
		Piaraan P;
		Kucing K1;
		Anggora K2;
		Kembangtelon K3;
		Anjing A1;
		Burung B1;

		// Algoritma
		P = new Piaraan();

		K1 = new Kucing("Kucing-1", 4.2);
		K2 = new Anggora("Anggora-1", 3.1);
		K3 = new Kembangtelon("Kembangtelon-1", 3.7);
		A1 = new Anjing("Anjing-1");
		B1 = new Burung("Burung-1");

		K1.setPanggilan("Milo");
		K2.setPanggilan("Chiko");
		K3.setPanggilan("Oyen");
		A1.setPanggilan("Bruno");
		B1.setPanggilan("Cici");

		System.out.println("NBElement : " + P.getNbelm());

		P.enqueueAnabul(K1);
		P.enqueueAnabul(K2);
		P.enqueueAnabul(K3);
		P.enqueueAnabul(A1);
		P.enqueueAnabul(B1);

		System.out.println("NBElement Sekarang : " + P.getNbelm());
		System.out.println("Seluruh Anabul (panggilan) : ");
		P.showAnabul();

		System.out.println("Anabul pertama (tanpa dequeue) : " + P.getAnabul().getPanggilan());
		System.out.println("Apakah 'Milo' ada di antrean : " + P.isMember(K1));

		System.out.println("Count Keluarga Kucing : " + P.countKucing());
		System.out.println("Total Bobot Keluarga Kucing : " + P.bobotKucing() + "kg");

		System.out.println("Tampilkan jenis tiap Anabul : ");
		P.showJenisAnabul();

		System.out.println("Dequeue 1 Anabul : " + P.dequeueAnabul().getPanggilan());
		System.out.println("NBElement Setelah Dequeue : " + P.getNbelm());

		System.out.println("Seluruh Anabul setelah dequeue : ");
		P.showAnabul();
	}
}
