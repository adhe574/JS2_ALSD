public class MataKuliah01 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah01() {
    }

    public MataKuliah01(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam =jumlahJam;

    }

    void tampilkanInformasi() {
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Nama MK: " + nama );
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS telah diubah menjadi: " + sksBaru);
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println(jam + "Jam telah ditambahkan. Total jam: " + jumlahJam);
    }

    void kurangiJam(int jam) {
        if (jam > jumlahJam) {
            System.out.println("Pengurangan jam gagal");
        } else {
            jumlahJam -= jam;
            System.out.println(jam + "Jam telah dikurangi. Total jam: " + jumlahJam);
        }
        
    }
}