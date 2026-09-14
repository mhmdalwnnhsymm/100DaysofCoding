import java.util.Scanner;

public class KalkulatorSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== KALKULATOR SEDERHANA ===");
        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();

        System.out.print("Masukkan angka kedua  : ");
        double angka2 = input.nextDouble();

        double penjumlahan = angka1 + angka2;
        double pengurangan = angka1 - angka2;
        double perkalian = angka1 * angka2;
        double pembagian = 0;

        if (angka2 != 0) {
            pembagian = angka1 / angka2;
        } else {
            System.out.println("Peringatan: Pembagian dengan nol tidak terdefinisi.");
        }

        System.out.println("\n========== HASIL PERHITUNGAN ==========");
        System.out.printf("Hasil Penjumlahan : %.2f%n", penjumlahan);
        System.out.printf("Hasil Pengurangan : %.2f%n", pengurangan);
        System.out.printf("Hasil Perkalian   : %.2f%n", perkalian);
        
        if (angka2 != 0) {
            System.out.printf("Hasil Pembagian   : %.2f%n", pembagian);
        } else {
            System.out.println("Hasil Pembagian   : Tidak dapat dibagi 0");
        }
        System.out.println("=======================================");
    }
}
