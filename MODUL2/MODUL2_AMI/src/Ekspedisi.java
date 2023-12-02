public class Ekspedisi 
{
    // TO DO: Create Protected Attributes of Ekspedisi (jumlahCabang, pusat, tarif)
    protected String pusat;
    protected float tarif;
    protected int jumlahCabang;

    // TO DO: Create Constructor of Ekspedisi
    Ekspedisi (int jumlahCabang, String pusat, float tarif) {
        this.jumlahCabang = jumlahCabang;
        this.pusat = pusat;
        this.tarif = tarif;
    }

     // TO DO: Create 'informasi' Method to show Information
    public void informasi () {
       System.out.println("Ekspedisi TelUExpress dengan jumlah cabang"+"Ekspedisi TelUExpress dengan jumlah cabang"+"jumlahCabang dan berpusat"+"pusat"+"mempunyai tarif sebesar"+"tarif"+"Selain itu, ekspedisi ini melayani pengantaran"+"antarInter");
    }
}