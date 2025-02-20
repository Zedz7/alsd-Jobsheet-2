public class mataKuliahMain06 {
    public static void main(String[] args) {
        mataKuliah06 mk1 = new mataKuliah06();
        mk1.kodeMK = "123";
        mk1.nama = "Rusdi";
        mk1.sks = 2;
        mk1.jumlahJam = 4;

        mk1.tampilInformasi();
        mk1.ubahSKS(3);
        mk1.tambahJam(3);
        mk1.kurangiJam(2);
        mk1.tampilInformasi();

        mataKuliah06 mk2 = new mataKuliah06("456", "Fuad", 3, 3);
        mk2.tampilInformasi();
    }
}
