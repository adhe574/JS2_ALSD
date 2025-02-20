public class MahasiswaMain01 {
    public static void main(String[] args) {
            
            Mahasiswa01 mhs1 = new Mahasiswa01();

            mhs1.nama = "Muhammad Ali Farhan";
            mhs1.nim = "2241720171";
            mhs1.kelas = "SI 2J";
            mhs1.ipk = 3.55;
    
            mhs1.tampilkanInformasi();
            mhs1.ubahKelas("SI 2K");
            mhs1. updateIpk(3.60);
            mhs1.tampilkanInformasi();

            Mahasiswa01 mhs2 = new Mahasiswa01("Annisa Nabila", "2141720160", "TI 2L", 3.25);
            mhs2.updateIpk(3.30);
            mhs2.tampilkanInformasi();

            Mahasiswa01 mhsAdhe = new Mahasiswa01("Adhe Widya", "244107060067", "SIB 1C", 3.60);
            mhsAdhe.tampilkanInformasi();
    }  
}