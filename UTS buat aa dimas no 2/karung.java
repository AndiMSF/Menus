import java.util.Scanner;
public class karung {

    Scanner scanner = new Scanner (System.in);
    private String nama;
    private String noKTP;

    public int pilihan;
    public int pinjamBulanan;

    public int PaketKarunghargaXL = 100000000;
    public int PaketKarunghargaL = 75000000;
    public int PaketKarunghargaM = 50000000;

    public float jumlah;
    public float bunga = 0.025f;

    public float total;
    public void namaNopeminjam ()
    {
        
        System.out.println("Masukkan Data Anda");
        System.out.println("==================");
        System.out.print("Masukkan Nama Peminjam : ");
        nama = scanner.nextLine();

        System.out.print("Masukkan No.KTP Peminjam : ");
        noKTP = scanner.nextLine();
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
            System.out.println("Dengan Pinjam "+PaketKarunghargaXL);
            jumlah = (bunga*pinjamBulanan) * PaketKarunghargaXL  ;
            System.out.println("Dengan Bunga "+jumlah);

        } else if ( pilihan == 2)
        {
            System.out.println("Anda Memilih Paket L");
            System.out.println("Dengan Pinjam "+PaketKarunghargaL);
            jumlah = (bunga*pinjamBulanan) *  PaketKarunghargaL ;
            System.out.println("Dengan Bunga "+jumlah);
        } else if ( pilihan == 3)
        {
            System.out.println("Anda Memilih Paket M");
            System.out.println("Dengan Pinjam "+PaketKarunghargaM);
            jumlah = (bunga*pinjamBulanan) * PaketKarunghargaM;
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
            total = PaketKarunghargaM+jumlah;
        System.out.println("Kewajiban Bulanan = "+(total));
        } if ( pilihan == 2)
        {
            total = PaketKarunghargaL+jumlah;
        System.out.println("Kewajiban Bulanan = "+(total));

        } if ( pilihan == 1)
        {
            total = PaketKarunghargaXL+jumlah;
        System.out.println("Kewajiban Bulanan = "+(total));
        }

        System.out.println("Total Pinjaman "+total*pinjamBulanan);
    }



}
