package MainPackage;

import java.util.Scanner;

/* @author Halim */
public class Main {
    
    public static void main (String[] args){
        HalamanMenu();
    }
    
    static void HalamanMenu(){
        Scanner scanner = new Scanner(System.in);
        Member member1 = null;

        int pilih_menu = 0;
        
        while (pilih_menu <= 4) {
            System.out.println("==============================");            
            System.out.println("Menu:");
            System.out.println("1. Buat Member Baru");
            System.out.println("2. Tambah Point");
            System.out.println("3. Tukar Hadiah");
            System.out.println("4. Keluar");
            System.out.println("==============================");            
            System.out.print("Pilih opsi: ");            
            pilih_menu = scanner.nextInt();
            scanner.nextLine();
            
            switch (pilih_menu) {
                case 1:
                    System.out.print("Masukkan Kode member: ");
                    String kode_member = scanner.nextLine();
                    System.out.print("Masukkan nama member: ");
                    String nama_member = scanner.nextLine();
                    member1 = new Member(kode_member, nama_member);
                    System.out.println("Member berhasil dibuat!");
                    break;
                
                case 2:
                    if (member1 == null) {
                        System.out.println("Silakan buat member terlebih dahulu.");
                    } else {
                        System.out.print("Masukkan jumlah transaksi: ");
                        int transaksi = scanner.nextInt();
                        member1.addPoint(transaksi);
                        System.out.println("Sisa point: " + member1.getPoint());
                    }
                    break;
                
                case 3:
                    if (member1 == null) {
                        System.out.println("Silakan buat member terlebih dahulu.");
                    } else {
                        System.out.println("Pilih hadiah yang ingin ditukar:");
                        System.out.println("1. Boneka - 10000 point");
                        System.out.println("2. Mainan - 7000 point");
                        System.out.println("3. Mie Instant - 5000 point");
                        System.out.println("4. Biskuit - 4000 point");
                        System.out.print("Pilih hadiah: ");
                        int pilih_hadiah = scanner.nextInt();
                        
                        switch (pilih_hadiah) {
                            case 1:
                                Hadiah hadiahBoneka = new Hadiah(1, "Boneka", 10000);
                                member1.ambilHadiah(hadiahBoneka);
                                break;
                            case 2:
                                Hadiah hadiahMainan = new Hadiah(2, "Mainan", 7000);
                                member1.ambilHadiah(hadiahMainan);
                                break;
                            case 3:
                                Hadiah hadiahMieInstant = new Hadiah(3, "Mie Instant", 5000);
                                member1.ambilHadiah(hadiahMieInstant);
                                break;
                            case 4:
                                Hadiah hadiahBiskuit = new Hadiah(4, "Biskuit", 4000);
                                member1.ambilHadiah(hadiahBiskuit);
                                break;
                            default:
                                System.out.println("Pilihan tidak valid.");
                                break;
                        }
                        System.out.println("Sisa point: " + member1.getPoint());
                    }
                    break;
                
                case 4:
                    System.out.println("Keluar dari program.");
                    break;
                
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        
        }
        
        scanner.close();
    }
}




