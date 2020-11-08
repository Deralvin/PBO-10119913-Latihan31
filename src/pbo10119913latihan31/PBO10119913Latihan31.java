/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10119913latihan31;

/**
 * @author
 * NAMA     : Muhammad Alvin Rizqi Ramdhan 
 * KELAS    : IF 10K
 * NIM      : 10119913
 */

public class PBO10119913Latihan31 {

    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();
        Mahasiswa mhs3 = new Mahasiswa();
        Mahasiswa mhs4 = new Mahasiswa();
        mhs1.nim = "10110269";
        mhs1.nama = "Rizki Adam Kurniawan";
        mhs2.nim = "10112270";
        mhs2.nama = "Indra Tiola";
        mhs3.nim = "10110271";
        mhs3.nama = "Robi Tansil Ganefi";
        mhs4.nim = "10110269";
        mhs4.nama = "Muhammad Nur Awaludin";
        mhs1.pekenalkanDiri();
        mhs2.pekenalkanDiri();
        mhs3.pekenalkanDiri();
        mhs4.pekenalkanDiri();
    }
}
