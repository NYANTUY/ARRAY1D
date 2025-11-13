import java.util.Scanner;
public class tugasArray03 {
    public static void main(String[] args) {
          
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", 
                         "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String cari = sc.nextLine();

        boolean ditemukan = false;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                System.out.println(menu[i] + " tersedia di menu.");
                ditemukan = true;
                break;
                
            }
        }
    }
}
