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
public class GajiPegawai {
    private String nama;
    private String alamat;
    private int uangTrasport;
    private int uangTunjangan;
    private int gajiPokok;
    private int totalGaji;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getUangTrasport() {
        return uangTrasport;
    }

    public void setUangTrasport(int uangTrasport) {
        this.uangTrasport = uangTrasport;
    }

    public int getUangTunjangan() {
        return uangTunjangan;
    }

    public void setUangTunjangan(int uangTunjangan) {
        this.uangTunjangan = uangTunjangan;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public int getTotalGaji() {
        return totalGaji;
    }

    public void setTotalGaji(int totalGaji) {
        this.totalGaji = totalGaji;
    }
    
    public int totalGaji(int uangTunjangan, int uangTransport, int gajiPokok){
        int total = uangTunjangan + uangTransport + gajiPokok;
        return total;
    }
    public void tampilData(String nama, String alamat, int uangTransport, int uangTunjangan, int gajiPokok, int totalGaji){
        System.out.printf("Nama Karyawan\t : %s%n",nama);
        System.out.printf("Alamat\t\t : %s%n",alamat);
        System.out.printf("Uang Transport\t : %s%n",uangTransport);
        System.out.printf("Uang Tunjangan\t : %s%n",uangTunjangan);
        System.out.printf("Gaji Pokok\t : %s%n",gajiPokok);
        System.out.printf("Total Gaji\t : %s%n",totalGaji);
    }
    
}
