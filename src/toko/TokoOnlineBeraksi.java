package toko;

// Import IO
import java.util.Scanner;

// class TokoOnlineBeraksi
public class TokoOnlineBeraksi {
    // Main
    public static void main(String[] args) {
        
        // Error Handling
        try {
            // IO Sederhana
            Scanner scanner = new Scanner(System.in);
            
            // Array
            TokoOnlineDetail[] toko = new TokoOnlineDetail[2];
            
            // Perulangan untuk mengisi data toko
            for(int i = 0; i < toko.length; i++) {
                System.out.print("Masukkan Id Toko " + (i+1) + "\t: ");
                String idToko = scanner.nextLine();
                System.out.print("Masukkan Nama Toko " + (i+1) + "\t: ");
                String namaToko = scanner.nextLine();
                System.out.println("");
                
                // Object
                toko[i] = new TokoOnlineDetail(idToko, namaToko);
            }
            
            // Perulangan untuk menampilkan data toko
            for(int i = 0; i < toko.length; i++) {
                System.out.println("================================");
                System.out.println("DATA TOKO " + (i + 1));
                System.out.println("================================");
                System.out.println(toko[i].tokoInfo() + "\n");
            }
            
        }catch (NumberFormatException e) {
            System.out.println("Kesalahan Format Nomor: " + e.getMessage());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Kesalahan Format Id Toko: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Kesalahan Umum: " + e.getMessage());
        }
    }
}