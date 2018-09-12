
package kasir1;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Kasir1 {

    public static void main(String[] args) {
        System.out.println ("Dewi Nurul Mahardika / X RPL 6 / 16") ;
        
        System.out.println("--PROGRAM KASIR PENJUALAN--");
        String namaBarang, namaKasir, kodeBarang;
        byte lanjut = 0;
        double hargaBarang, angkaDiskon, diskon, totalHarga, totalBayar = 0;
        int jumlahBarang;
        
        //membuat scanner masukan
        Scanner baca = new Scanner(System.in);

        do {
            // input
            jumlahBarang = 0;
            diskon = 0;
            hargaBarang = 0;
            totalBayar = 0;
            angkaDiskon = 0;
            //kodeBarang = ''"";

            System.out.println("Nama Kasir: ");
            namaKasir = baca.next();
            System.out.println("Nama Barang :");
            namaBarang = baca.next();
            System.out.println("Kode Barang :");
            kodeBarang = baca.next();
            System.out.println("Jumlah Barang : ");
            jumlahBarang = baca.nextInt();
            System.out.println("Harga Barang : ");
            hargaBarang = baca.nextDouble();
            System.out.println("Total Harga");
            
            //proses
            totalHarga = jumlahBarang * hargaBarang;
            System.out.println(totalHarga);

            if (totalHarga > 100000 && totalHarga<=200000){
                angkaDiskon = 0.1;
                diskon = 0.1 * totalHarga;
            }
            
            else if (totalHarga > 200000 && totalHarga<=500000) {
                angkaDiskon = 0.2;
                diskon = 0.2 * totalHarga;
            }
            
            else if (totalHarga > 500000) {
                angkaDiskon = 0.5;
                diskon = 0.5 * totalHarga;
            }
            else {
                diskon =0;
            }
            
            
            totalBayar = totalHarga - diskon;
            System.out.println("Angka diskon= :" + angkaDiskon);
            System.out.println("Total diskon = :" + diskon);
            System.out.println("Total bayar = :" + totalBayar);

              //output
            System.out.println("Lanjut ke costumer berikutnya ? (1/0) :");
            lanjut = baca.nextByte();

        } while (lanjut == 1);
        System.out.println("--PROGRAM SELSESAI--");

    }

}
