public class Mobil extends Kendaraan {

    private int jumlahPintu;

    public Mobil(String nomorIdentifikasi, double kecepatanMaksimum, int kapasitas, int jumlahPintu) {
        super(nomorIdentifikasi, kecepatanMaksimum, kapasitas);
        this.jumlahPintu = jumlahPintu;

    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "\njumlahPintu=" + jumlahPintu;
    }


}
