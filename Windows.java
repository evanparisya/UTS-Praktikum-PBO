public class Windows extends PC {
    String fitur;

    Windows(String merk, int kecepatanProsesor, int sizeMemory, String jenisProsesor, int ukuranMonitor, String fitur) {
        super(merk, kecepatanProsesor, sizeMemory, jenisProsesor, ukuranMonitor);
        this.fitur = fitur;
    }

    void tampilWindows() {
        tampilPC();
        System.out.println("Fitur Tambahan: " + fitur);
    }

}
