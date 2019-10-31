/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10118004.latihan52.siapakamu;

/**
 *
 * @author 
 * Nama : Dahlia
 * NIM  : 10118004
 * Kelas: IF.1
 * Diskripsi Program : Program ini untuk membuat tampilan dosen dan mahasiswa
 */
public class PBO10118004Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Dosen dosen = new Dosen();
        dosen.setNip("41227829930");
        System.out.println("NIP DOSEN : "+dosen.getNip());
        dosen.siapaKamu();
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setUmur(27);
        dosen.setMataKuliah("PBO");
        dosen.mengajarApa();
        
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNim("10118004");
        System.out.println("\nNIM MAHASISWA : "+mahasiswa.getNim());
        mahasiswa.siapaKamu();
        mahasiswa.setNama("Dahlia");
        mahasiswa.setUmur(19);
        mahasiswa.setKelas("PBO");
        mahasiswa.kelasApa();
    }
    
}


    
    

