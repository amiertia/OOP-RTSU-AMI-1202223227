public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("M-001", 200, 4, 4);
        System.out.println("Informasi Mobil"+mobil.toString());
        System.out.println("Waktu Tempuh Mobil = " + mobil.hitungWaktuTempuh(400) + " jam");
        System.out.println();
        Bus bus = new Bus("B-001", 100, 20, 40);
        System.out.println("Informasi Bus"+bus.toString());
        System.out.println("Waktu Tempuh Bus = " + bus.hitungWaktuTempuh(1000) + " jam");
    }
}
