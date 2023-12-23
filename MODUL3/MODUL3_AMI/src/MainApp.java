import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = new User();
        Bioskop bioskop = new Bioskop();
        Cashier cashier = new Cashier();

        
        System.out.println("=====Silahkan Register=====");
        System.out.print("Masukkan nama: ");
        user.setName(scanner.nextLine());
        System.out.print("Masukkan nomor telepon: ");
        user.setPhone(scanner.nextLine());
        user.register();

        bioskop.displaySeating();

// TO DO : Create a exception if user enter not number
        System.out.println("Apakah anda ingin memesan kursi? (y/n)");
        String bookingChoice = scanner.nextLine();
// TO DO : Create a exception if user enter number is out of range
        while (bookingChoice.equalsIgnoreCase("y")) {
            System.out.print("Pilih baris kursi: ");
            int row = scanner.nextInt();
            System.out.print("Pilih posisi kursi: ");
            int seat = scanner.nextInt();
            scanner.nextLine();
// TO DO : Call the method to reserve seats in the cinema
            bioskop.bookSeat(row, seat);
            if (bioskop.seats[row - 1][seat - 1] == 1) { // Check if booking was successful
                System.out.println("The row has been updated with your booking.");
                bioskop.displaySeating();
                cashier.printTicket(user);
            } else {
                System.out.println("Failed to update the row. The seat might be already booked.");
            }
// TO DO : Close the Scanner object when the user is finished
            System.out.println("Apakah anda ingin memesan kursi lain? (y/n)");
            bookingChoice = scanner.nextLine();
        }

        System.out.println("Terima kasih telah menggunakan layanan kami!");
        scanner.close();
    }
}


// TO DO : Create Bioskop and Cashier objects

// TO DO : Take the name from the user, make sure it is not empty

// TO DO : Take the phone number from the user, make sure it is valid

// TO DO : Create a code for ticket order







