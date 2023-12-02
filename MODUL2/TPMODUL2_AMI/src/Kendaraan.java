public class Kendaraan {

    private String nomorIdentifikasi;
    private double kecepatanMaksimum;
    private int kapasitas;

    public Kendaraan(String nomorIdentifikasi, double kecepatanMaksimum, int kapasitas) {
        this.nomorIdentifikasi = nomorIdentifikasi;
        this.kecepatanMaksimum = kecepatanMaksimum;
        this.kapasitas = kapasitas;
    }

    public int hitungWaktuTempuh(double jarak) {
        return (int) (jarak / kecepatanMaksimum);
    }

    @Override
    public String toString() {
        return "\nnomorIdentifikasi=" + nomorIdentifikasi + "\nkecepatanMaksimum=" + kecepatanMaksimum
                + "\nkapasitas=" + kapasitas + "";
    }

}
