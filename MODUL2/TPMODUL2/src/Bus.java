public class Bus extends Kendaraan {
    private int jumlahKursi;

    public Bus(String nomorIdentifikasi, double kecepatanMaksimum, int kapasitas, int jumlahKursi) {
        super(nomorIdentifikasi, kecepatanMaksimum, kapasitas);
        this.jumlahKursi = jumlahKursi;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "\nJumlah Kursi = " + jumlahKursi;
    }



}
