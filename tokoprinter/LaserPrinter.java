package tokoprinter;

public class LaserPrinter extends Printer {
    private int tonerLevel;

    public LaserPrinter(String brand, int paperCapacity, int tonerLevel) {
        super(brand, paperCapacity);
        this.tonerLevel = tonerLevel;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Toner Level: " + tonerLevel + "%");
    }

    // Bagian Polimorfisme (Overriding)
    @Override
    public void printDocuments() {
        System.out.println("Laser Printer (" + brand + ") mencetak " + documents + " dokumen menggunakan toner level " + tonerLevel + "%");
    }
}
