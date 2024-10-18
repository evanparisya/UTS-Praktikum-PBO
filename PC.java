public class PC extends Komputer{
    int ukuranMonitor;

    PC(String merk, int kecepatanProsesor, int sizeMemory, String jenisProsesor, int ukuranMonitor) {
        super(merk, kecepatanProsesor, sizeMemory, jenisProsesor);
        this.ukuranMonitor = ukuranMonitor;
    }

    void tampilPC() {
        tampilData();
        System.out.println("Ukuran Monitor: " + ukuranMonitor + " inch");
    }
}
