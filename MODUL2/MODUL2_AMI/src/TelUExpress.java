public class TelUExpress extends Ekspedisi//extend
{
    // TO DO: Create Protected Atribute of TelUExpress(antarInter)
    protected boolean antarInter ;

    // TO DO: Create Constructor of TelUExpress
    TelUExpress (int jumlahCabang, String pusat, float tarif,boolean antarInter) {
    super(jumlahCabang, pusat,tarif);
    this.antarInter = antarInter;
    }

    // TO DO: Create 'informasi' Method to show Information
    public void informasi () {
        System.out.println("Ekspedisi TelUExpress dengan jumlah cabang"+"Ekspedisi TelUExpress dengan jumlah cabang"+"jumlahCabang dan berpusat"+"pusat"+"mempunyai tarif sebesar"+"tarif"+"Selain itu, ekspedisi ini melayani pengantaran"+"antarInter");
    }
    // TO DO: Create 'ambil' Method to pick up a package
    public void ambil (int resi) {
        System.out.println("TelUExpress berhasil mengambil paket"+"jumlahCabang");
    }
    // TO DO: Create 'antar' Method to send a package
    public void antar(int resi) {
        System.out.println("TelUExpress berhasil mengantar paket dengan"+"resi");
    }
    // TO DO: Create 'antar' Method to send two packages
  public void antar(int resi1 , int resi2) {
    System.out.println("TelUexpress berhasil mengantar paket dengan "+ resi1 +"dan"+resi2);
}}
