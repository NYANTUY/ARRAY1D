import java.util.Scanner;

public class tugasArray02 {
    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah pesanan: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] nama = new String[n];
        double[] harga = new double[n];
        double total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Nama makanan/minuman ke-" + (i + 1) + ": ");
            nama[i] = sc.nextLine();
            System.out.print("Harga: ");
            harga[i] = sc.nextDouble();
            sc.nextLine();
            total += harga[i];
        }

        System.out.println("\nDaftar Pesanan:");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". " + nama[i] + " - Rp" + harga[i]);
        }
        System.out.println("Total Biaya: Rp" + total);
        
        sc.close();
    }
}
