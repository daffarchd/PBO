package tokoprinter;

public class Printer {
    protected String brand;
    protected int paperCapacity;
    protected int documents; 

    public Printer(String brand, int paperCapacity) {
        this.brand = brand;
        this.paperCapacity = paperCapacity;
    }

    public void displayInfo() {
        System.out.println("Printer Brand: " + brand);
        System.out.println("Paper Capacity: " + paperCapacity);
    }

    // Bagian Polimorfisme (Overloading)
    // Method overloading = nama method sama, parameter berbeda
    public void setDocuments(int documents) {
        this.documents = documents;
        System.out.println("Jumlah dokumen yang akan dicetak: " + documents);
    }

    public void setDocuments(String docType, int documents) {
        this.documents = documents;
        System.out.println("Jenis dokumen: " + docType + ", jumlah: " + documents);
    }

    // Bagian Polimorfisme (Overriding)
    // Method ini akan dioverride oleh subclass (InkjetPrinter dan LaserPrinter)
    public void printDocuments() {
        System.out.println("Printer generic sedang mencetak " + documents + " dokumen...");
    }
}
