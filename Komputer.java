/**
 * Komputer
 */
public class Komputer {

    String merk;
    int kecepatanProsesor;
    int sizeMemory;
    String jenisProsesor;

    Komputer(String merk, int kecepatanProsesor, int sizeMemory, String jenisProsesor) {
        this.merk = merk;
        this.kecepatanProsesor = kecepatanProsesor;
        this.sizeMemory = sizeMemory;
        this.jenisProsesor = jenisProsesor;
    }

    void tampilData() {
        System.out.println("Merk: " + merk);
        System.out.println("Kecepatan Prosesor: " + kecepatanProsesor + " GHz");
        System.out.println("Size Memory: " + sizeMemory + " GB");
        System.out.println("Jenis Prosesor: " + jenisProsesor);
    }
}