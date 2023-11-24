import java.util.ArrayList;
import java.util.Scanner;

public class Database {

    // TODO: Create List of Konser Object to Store Konser from Konser Class
    private ArrayList<Konser> KonserList;

    public Database() {
        KonserList = new ArrayList<Konser>();
    }
    // TODO: Create Method to insert Konser to Database
    public void AddKonser(Konser kons) {
        KonserList.add(kons);
    }
    
    // TODO: Create Method to Show Konser from Database
    public void ShowKonserList() {
        int index = 1; 
        for (Konser kons : KonserList) {
            System.out.println("Nomor: " + index); 
            System.out.println("Band Name: " + kons.getBandName());
            System.out.println("Date: " + kons.getDate());
            System.out.println("Location: " + kons.getLocation());
            System.out.println("PriceTicket: " + kons.getTicketPrice());
            System.out.println();
            index++; 
        }
    }
    
    // TODO: Create Method to Buy Ticket and Show the Total Price
    public void BuyTicket(int index) {
        if (index >= 1 && index <= KonserList.size()) {
            Konser konser = KonserList.get(index - 1); 
            try (Scanner input = new Scanner(System.in)) {
                System.out.println("Input jumlah tiket yang ingin dibeli: ");
                int ticketAmount = input.nextInt();
                input.nextLine(); 
    
                
                if (ticketAmount > 0) {
                    // get final price
                    int finalPrice = konser.getTicketPrice() * ticketAmount;
                    System.out.println("Anda telah membeli " + ticketAmount + " tiket untuk konser band " + konser.getBandName() + ".");
                    System.out.println("Total harga: " + finalPrice);
                } else {
                    System.out.println("Jumlah tiket tidak valid");
                }
            }
        } else {
            System.out.println("Nomor konser tidak valid");
        }
    }
    

}



    




    // TODO: Create Method to Buy Ticket and Show the Total Price

}
