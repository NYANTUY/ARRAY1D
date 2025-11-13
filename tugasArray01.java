import java.util.Scanner;

public class tugasArray01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();

        int[] nilai = new int[n];
        int total = 0, tertinggi, terendah;

        for (int i = 0; i < n; i++) {
            System.out.print("Nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
            total += nilai[i];
        }

        tertinggi = nilai[0];
        terendah = nilai[0];
        for (int val : nilai) {
            if (val > tertinggi) tertinggi = val;
            if (val < terendah) terendah = val;
        }

        double rata2 = (double) total / n;
        System.out.println("\nNilai rata-rata: " + rata2);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah : " + terendah);

        System.out.println("\nDaftar nilai:");
        for (int val : nilai) System.out.println(val);

        sc.close();
          
    }
}
