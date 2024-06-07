/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package camscanner;

/**
 *
 * @author DwikSanti(2201010595)
 * TGL:24-05-24
 */

    import java.util.Scanner;

public class CamScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DocumentManager manager = new DocumentManager(100); // Kapasitas array 100

        while (true) {
            System.out.println("Menu Aplikasi CamScanner:");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Ubah Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Membersihkan buffer newline

            switch (choice) {
                case 1:
                    System.out.print("Masukkan ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Membersihkan buffer newline
                    System.out.print("Masukkan Konten: ");
                    String content = scanner.nextLine();
                    Document newDocument = new Document(id, content);
                    manager.addDocument(newDocument);
                    break;
                case 2:
                    manager.displayDocuments();
                    break;
                case 3:
                    System.out.print("Masukkan indeks yang ingin diubah: ");
                    int indexToUpdate = scanner.nextInt();
                    scanner.nextLine(); // Membersihkan buffer newline
                    System.out.print("Masukkan ID baru: ");
                    int newId = scanner.nextInt();
                    scanner.nextLine(); // Membersihkan buffer newline
                    System.out.print("Masukkan Konten baru: ");
                    String newContent = scanner.nextLine();
                    Document updatedDocument = new Document(newId, newContent);
                    manager.updateDocument(indexToUpdate, updatedDocument);
                    break;
                case 4:
                    System.out.print("Masukkan indeks yang ingin dihapus: ");
                    int indexToDelete = scanner.nextInt();
                    manager.deleteDocument(indexToDelete);
                    break;
                case 5:
                    System.out.println("Keluar dari aplikasi.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opsi tidak valid. Silakan coba lagi.");
            }
        }
    }
}

    

