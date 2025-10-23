package tokoprinter;

public class InkjetPrinter extends Printer {
    private String inkType;

    public InkjetPrinter(String brand, int paperCapacity, String inkType) {
        super(brand, paperCapacity);
        this.inkType = inkType;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Ink Type: " + inkType);
    }

    // Bagian Polimorfisme (Overriding)
    @Override
    public void printDocuments() {
        System.out.println("Inkjet Printer (" + brand + ") mencetak " + documents + " dokumen dengan tinta " + inkType);
    }
}
