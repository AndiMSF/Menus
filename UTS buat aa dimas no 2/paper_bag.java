import java.util.Scanner;
public class paper_bag{

    Scanner scanner = new Scanner (System.in);

    public int PaketPaperBagXL = 30000000;
    public int PaketPaperBagL = 20000000;
    public int PaketPaperBagM = 10000000;

    String nama;
    int noKTP;
    int pilihan;
    int pinjamBulanan;
    public float jumlah;
    public float bunga = 0.025f;
    float total;



    public void namaNopeminjam ()
    {
        
        System.out.println("Masukkan Data Anda");
        System.out.println("==================");
        System.out.print("Masukkan Nama Peminjam : ");
        nama = scanner.nextLine();

        System.out.print("Masukkan No.KTP Peminjam : ");
        noKTP = scanner.nextInt();
    }

    public void ukuranKarung ()
    {
        

        System.out.println("===================");
        System.out.println("Pilih Ukuran Karung");
        System.out.println("===================");
        System.out.println("1.XL");
        System.out.println("2.L");
        System.out.println("3.M");
        System.out.print("Masukkan Pilihan : ");
        pilihan = scanner.nextInt();
        System.out.print("Berapa Lama Pinjam (Bulan) : ");
        pinjamBulanan = scanner.nextInt();

        if ( pilihan == 1)
        {
            System.out.println("Anda Memilih Paket XL");
            System.out.println("Dengan Pinjam "+PaketPaperBagXL);
            jumlah = (bunga*pinjamBulanan) * PaketPaperBagXL  ;
            System.out.println("Dengan Bunga "+jumlah);

        } else if ( pilihan == 2)
        {
            System.out.println("Anda Memilih Paket L");
            System.out.println("Dengan Pinjam "+PaketPaperBagL);
            jumlah = (bunga*pinjamBulanan) *  PaketPaperBagL ;
            System.out.println("Dengan Bunga "+jumlah);
        } else if ( pilihan == 3)
        {
            System.out.println("Anda Memilih Paket M");
            System.out.println("Dengan Pinjam "+PaketPaperBagM);
            jumlah = (bunga*pinjamBulanan) * PaketPaperBagM;
            System.out.println("Dengan Bunga "+jumlah);
        }
    
    }

    public void TotalPinjaman ()
    {
        System.out.println("Total Kewajiban Pinjaman");
        System.out.println("========================");
        System.out.println("Nama Peminjam : "+nama);

        if ( pilihan == 3)
        {
            total = PaketPaperBagM+jumlah;
        System.out.println("Kewajiban Bulanan = "+(total));
        } if ( pilihan == 2)
        {
            total = PaketPaperBagL+jumlah;
        System.out.println("Kewajiban Bulanan = "+(total));

        } if ( pilihan == 1)
        {
            total = PaketPaperBagXL+jumlah;
        System.out.println("Kewajiban Bulanan = "+(total));
        }

        System.out.println("Total Pinjaman "+total*pinjamBulanan);
    }
}