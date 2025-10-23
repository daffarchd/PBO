package tokoprinter;

public class Main {
    public static void main(String[] args) {

        // Objek dari kelas turunan
        Printer inkjet = new InkjetPrinter("Canon", 150, "Dye Ink");
        Printer laser = new LaserPrinter("HP", 300, 85);

        // Bagian Polimorfisme (Overloading)
        inkjet.setDocuments(10);
        inkjet.setDocuments("Foto", 5);

        laser.setDocuments(20);
        laser.setDocuments("Dokumen Kantor", 15);

        // Bagian Polimorfisme (Overriding)
        inkjet.printDocuments();
        laser.printDocuments();
    }
}
