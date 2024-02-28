package book;

import java.util.Scanner;

public class Books {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Buku Book1 = new Buku("Tama", "Cara Menjadi Sukses di Usia Muda", 75000.00, 1);
            String information = Book1.information1();
            System.out.println("\nInformasi buku " + information);

            System.out.print("Masukkan Jumlah Buku yang Ingin dibeli: ");
            int jumlahBuku = scanner.nextInt();
            double totalPrice = Book1.calculateBooks(jumlahBuku);
            System.out.println("Total Pembelian buku : Rp." + totalPrice + "\n");

            scanner.close();
        }

    }
   