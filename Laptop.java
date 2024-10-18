public class Laptop extends Komputer{
    String jenisBaterai;

    Laptop(String merk, int kecepatanProsesor, int sizeMemory, String jenisProsesor, String jenisBaterai) {
        super(merk, kecepatanProsesor, sizeMemory, jenisProsesor);
        this.jenisBaterai = jenisBaterai;
    }

    void tampilLaptop() {
        tampilData();
        System.out.println("Jenis Baterai: " + jenisBaterai);
    }
}
