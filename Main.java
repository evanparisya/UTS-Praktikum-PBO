public class Main {
    public static void main(String[] args) {
        Komputer komputer = new Komputer("Dell", 3, 8, "Intel i5");
        Laptop laptop = new Laptop("Lenovo", 4, 16, "AMD Ryzen 7", "Lithium-ion");
        PC pc = new PC("HP", 3, 32, "Intel i7", 24);
        Mac mac = new Mac("Apple", 3, 16, "M1", "Lithium-polymer", "T2 Chip");
        Windows windows = new Windows("Acer", 4, 16, "Intel i5", 27, "Windows Hello");

        System.out.println("Komputer:");
        komputer.tampilData();
        System.out.println();

        System.out.println("Laptop:");
        laptop.tampilLaptop();
        System.out.println();

        System.out.println("PC:");
        pc.tampilPC();
        System.out.println();

        System.out.println("Mac:");
        mac.tampilMac();
        System.out.println();

        System.out.println("Windows:");
        windows.tampilWindows();
    }
}