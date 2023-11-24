public class Konser {
    // TODO: Create Private Attribute of Konser (Band Name, Date, Location, Ticket Price) then Create Setter and Getter
    private String BandName;
    private String DATE; //Y-M-D
    private String Location;
    private int Price;

    public Konser(String bandName, String date, String location, int price) {
       BandName = bandName;
       DATE = date;
       Location = location;
       Price = price;

    }

    public String getBandName() {
        return BandName;
    }

    public void setBandName(String bandName) {
        BandName = bandName;
    }

    public String getDATE() {
        return DATE;
    }

    public void setDATE(String dATE) {
        DATE = dATE;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }
}