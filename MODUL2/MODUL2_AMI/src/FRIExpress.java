public class FRIExpress extends Ekspedisi //...
{
    // TO DO: Create Protected Attribute of FRIExpress (pecahBelah)
    protected boolean pecahBelah;

    // TO DO: Create Constructor of FRIExpress
    FRIExpress(int jumlahCabang, String pusat, float tarif,boolean pecahBelah) {
    super(jumlahCabang, pusat,tarif);
    this.jumlahCabang=jumlahCabang;
    }

    // TO DO: Create 'informasi' Method to show Information
    public void informasi () {
        System.out.println("Ekspedisi FRIExpress dengan jumlah cabang"+"Ekspedisi FRIExpress dengan jumlah cabang"+"jumlahCabang dan berpusat"+"pusat"+"mempunyai tarif sebesar"+"tarif"+"Selain itu, ekspedisi ini melayani pengantaran"+"antarInter");
    }

    // TO DO: Create 'terima' Method to accept a number of packages
    public void terima () {
        System.out.println("FRIExpress baru saja menerima paket yang masukdan disortir sebanyak "+"pecahBelah");
    }

    // TO DO: Create 'kirim' Method to send a package to a destination
    public void kirim (String tujuan) {
        System.out.println("FRIExpress berhasil mengirimkan paket ke tujuan "+ tujuan);
    }
    // TO DO: Create 'kirim' Method to send a package to two destinations
    public void kirim (String tujuan1, String tujuan2) {
        System.out.println("FRIExpress berhasil mengirimkan paket ke tujuan "+tujuan1 +"dan" +tujuan2);
    }
}
