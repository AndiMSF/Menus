import java.util.Scanner;
public class pinjaman {
    public static void main (String args [])
    {
        Scanner scanner = new Scanner(System.in);
        karung karung = new karung();
        paper_bag paper_bag = new paper_bag();

        int pilihan;

        System.out.println("Welcome To The Solution Of Money");
        System.out.println("================================");
        System.out.println("Silakan Pilih Paket Pinjaman : ");
        System.out.println("1. PAKET KARUNG");
        System.out.println("2. PAKET PAPER BAG");
        System.out.print("Masukkan Pilihan Paket : ");
        pilihan = scanner.nextInt();

        if (pilihan == 1)
        {
            karung.namaNopeminjam();
            karung.ukuranKarung();
            karung.TotalPinjaman();
        }  if (pilihan == 2)
        {
            paper_bag.namaNopeminjam();
            paper_bag.ukuranKarung();
            paper_bag.TotalPinjaman();
        }
        else {
        System.out.println("Pilihan Tidak Ada");
        }
        
        System.out.println("Program Selesai !");

    }
}
