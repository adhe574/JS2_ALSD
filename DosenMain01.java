import java.util.Scanner;
public class DosenMain01 {
    public static void main(String[] args) {
        Scanner sc01 = new Scanner(System.in);

        Dosen01 Dosen1 = new Dosen01();

        Dosen01 Dosen2 = new Dosen01("A001", "Maharani", true, 2012, "Statistika");

        System.out.println("====================");
        System.out.println("Informasi Dosen 2 : ");
        System.out.println("====================");
        Dosen2.tampilkanInformasi();

        Dosen2.setStatusAktif(false);

        System.out.print("\nMasukkan tahun sekarang: ");
        int tahunSkrg =sc01.nextInt();
        System.out.println("Masa kerja dosen: " + Dosen2.hitungMasaKerja(tahunSkrg) + " tahun");

        System.out.println("Masukkan bidang keahlian baru: ");
        String bidangKeahlian = sc01.nextLine();
        Dosen2.ubahKeahlian(bidangKeahlian);

        System.out.println("\nInformasi Dosen 2 setelah diperbarui: ");
        Dosen2.tampilkanInformasi();
    }
}
