/* Nama File    : Teman.java
 * Deskripsi    : Kelas Teman untuk mengelola koleksi nama teman (List of String).
 * Pembuat      : Muhammad Fikri / 24060124130069
 * Tanggal      : 4 Mei 2026
 */

import java.util.*;

public class Teman {
    // Kamus
    private Integer nbelm;
    private List<String> Lnama;
    
    // Algoritma
    public Teman() {
        nbelm = 0;
        Lnama = new ArrayList<>();
    }

    public Integer getNbelm() {
        return nbelm;
    }

    public String getNama(Integer indeks) {
        return Lnama.get(indeks - 1);
    }

    public void setNama(Integer indeks, String nama) {
        Lnama.set(indeks - 1, nama);
    }

    public void addNama(String nama) {
        Lnama.add(nama);
        nbelm += 1;
    }

    public void delNama(String nama) {
        boolean berhasil = Lnama.remove(nama);
        if (berhasil) {
            nbelm -= 1;
        }
    }

    public boolean isMember(String nama) {
        return Lnama.contains(nama);
    }

    public void gantiNama(String nama, String namabaru) {
        for (int i = 0; i < Lnama.size(); i++) {
            if (Lnama.get(i).equals(nama)) {
                Lnama.set(i, namabaru);
            }
        }
    }

    public Integer countNama(String nama) {
        return Collections.frequency(Lnama, nama);
    }

    public void showTeman() {
        for (int i = 0; i < Lnama.size(); i++) {
            System.out.println((i + 1) + ". " + Lnama.get(i));
        }
    }
}
