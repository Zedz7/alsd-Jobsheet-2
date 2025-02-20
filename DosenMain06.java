public class DosenMain06 {
    public static void main(String[] args) {
        Dosen06 d1 = new Dosen06();
        d1.idDosen = "123";
        d1.nama = "Andriana";
        d1.statusAktif = true;
        d1.tahunBergabung = 2006;
        d1.bidangKeahlian = "Matematika";

        System.out.println("=====================================");
        System.out.println();

        d1.tampilInformasi();
        System.out.println("Dosen " + d1.nama + " sudah mengajar selama " + d1.hitungMasaKerja(2012) + " tahun");
        d1.ubahKeahlian("Fisika");
        d1.setStatusAktif(false);
        System.out.println("==== Setelah dilakukan perubahan ====");
        d1.tampilInformasi();

        System.out.println("====================================");
        System.out.println();

        Dosen06 d2 = new Dosen06("456", "Azril", false, 2007, "Biologi");
        d2.tampilInformasi();
    }
}
