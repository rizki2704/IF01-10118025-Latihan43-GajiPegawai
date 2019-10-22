/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118025.latihan43.gajipegawai;

/**
 * Nama     : Rizki Restu Illahi
 * NIM      : 10118025
 * Kelas    : IF-01
 */
public class IF0110118025Latihan43GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GajiPegawai gaji = new GajiPegawai();
        gaji.setNama("Rizki Adam Kurniawan");
        gaji.setAlamat("Jalan Semar dlm 4 No 72/66");
        gaji.setUangTrasport(250000);
        gaji.setUangTunjangan(300000);
        gaji.setGajiPokok(4500000);
        
        System.out.println("### Data Gaji Karyawan PT. KAKATU ###");
        System.out.println("--------------");
        gaji.tampilData(gaji.getNama(), gaji.getAlamat(), gaji.getUangTrasport(), gaji.getUangTunjangan(), gaji.getGajiPokok(), gaji.totalGaji(gaji.getUangTunjangan(), gaji.getUangTrasport(), gaji.getGajiPokok()));
    }
    
}
