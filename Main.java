// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Mobil mbl = new Mobil("Marcedes Benz","Sport");
        mbl.setBahanBakar("Bensin");
        mbl.setCC(15000.00);

        System.out.println("Merk : "+mbl.getMerk());
        System.out.println("Jenis : "+mbl.getJenis());
        System.out.println("Bahan Bakar : "+mbl.getBB());
        System.out.println("Cylinder : "+mbl.getCC());
    }
    }
