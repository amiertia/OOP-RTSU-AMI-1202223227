public class Bioskop {
    int rows = 5;
    int seatPerRow = 10;
    int[][] seats = new int[rows][seatPerRow];

    public Bioskop() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seatPerRow; j++ ) {
                seats[i][j] = 0;
            }
        }    
    }

    // TO DO: Add a method to display the seat layout
    public void displaySeating() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seatPerRow; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }

    // TO DO: Add a method to reserve seats
    public void bookSeat(int row, int seat) {
        if (seats[row - 1][seat - 1] == 0) {
            seats[row - 1][seat - 1] = 1;
            System.out.println("Seat booked in row " + row + ", seat " + seat);
            displaySeating();
        } else {
            System.out.println("Seat already booked");
        }
    }

}
