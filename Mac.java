public class Mac extends Laptop{
    String security;

    Mac(String merk, int kecepatanProsesor, int sizeMemory, String jenisProsesor, String jenisBaterai, String security) {
        super(merk, kecepatanProsesor, sizeMemory, jenisProsesor, jenisBaterai);
        this.security = security;
    }

    void tampilMac() {
        tampilLaptop();
        System.out.println("Security: " + security);
    }
}
