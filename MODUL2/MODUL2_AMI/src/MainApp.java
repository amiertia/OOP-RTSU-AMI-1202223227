public class MainApp {
    public static void main(String[] args){
        
        // TO DO: Create expedisi Object from Ekspedisi Class
        Ekspedisi ekspedisi = new Ekspedisi(10, "Jakarta", 100000);
        ekspedisi.informasi();

        // TO DO: Create teluexpress Object from TelUExpress Class
        TelUExpress telUExpress = new TelUExpress(15, "Bandung", 5000000, true);
        telUExpress.informasi();

        // TO DO: Create friexpress Object from FRIExpress Class
        FRIExpress friExpress = new FRIExpress (50,"Yogyakarta",80000,false);
        friExpress.informasi();
    }
}
