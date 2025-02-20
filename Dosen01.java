public class Dosen01 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen01() {
    }

    public Dosen01(String idDosen, String nama, boolean  statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen= idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;

    }

    void tampilkanInformasi() {
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama: " + nama);
        System.out.println("Status Aktif: " + (statusAktif? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
    }

    void setStatusAktif(boolean status) {
        statusAktif = status;
        System.out.println("------------------------------------------------------");
        System.out.println("Status dosen " + nama + " telah diubah menjadi " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("------------------------------------------------------");
    }
            
    int hitungMasaKerja(int thnSkrg) {
        int masaKerja = thnSkrg - tahunBergabung;
        return masaKerja;
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
        System.out.println("Bidang keahlian dosen " + nama + " telah diubah menjadi: " + bidangKeahlian);

    }   
}