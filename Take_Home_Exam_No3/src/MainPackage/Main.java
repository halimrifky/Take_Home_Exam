package MainPackage;
import java.util.Scanner;
/* @author Halim */
public class Main {
    public record Mahasiswa(String nim_mahasiswa, String nama_mahasiswa, int nilai_mahasiswa) {}
    
    public static void main(String[] args){
        Scanner dt_input = new Scanner(System.in);
        System.out.print("Masukkan jumlah data Mahasiswa: ");
        int jml_data = dt_input.nextInt();
        dt_input.nextLine(); 

        Mahasiswa mahasiswa_nilai_tertinggi = null;
        int nilai_tertinggi = 0;
        
        for (int i = 0; i < jml_data; i++) {
            System.out.println("Data mahasiswa ke-" + (i + 1) + ":");
            
            System.out.print("NIM: ");
            String nim = dt_input.nextLine();
            
            System.out.print("Nama: ");
            String nama = dt_input.nextLine(); 
            if (!CheckValidasiNama(nama)){
                System.out.println("Program dihentikan!");
                break;
            }
            
            System.out.print("Nilai: ");
            int nilai = dt_input.nextInt();
            if(!CheckValidasiNilai(nilai)){
                System.out.println("Program dihentikan!");
                break;
            }
            
            dt_input.nextLine(); 

            if (nilai > nilai_tertinggi) {
                mahasiswa_nilai_tertinggi = new Mahasiswa(nim, nama, nilai);
                nilai_tertinggi = nilai;
            }
        }
        
        System.out.println("Mahasiswa dengan nilai tertinggi:");
        System.out.println("NIM: " + mahasiswa_nilai_tertinggi.nim_mahasiswa());
        System.out.println("Nama: " + mahasiswa_nilai_tertinggi.nama_mahasiswa());
        System.out.println("Nilai: " + mahasiswa_nilai_tertinggi.nilai_mahasiswa());

        dt_input.close();
    }
    
    static boolean CheckValidasiNama(String nama){
        if (nama.length() < 3) {
            System.out.println("Data Nama kurang dari 3 karakter! Harap input dari ulang!");
            return false;
        }
        else if(nama.length() > 20){
            System.out.println("Data Nama lebih dari 20 karakter! Harap input dari ulang!");
            return false;
        }
        else{
            return true;
        }
    }
    
    static boolean CheckValidasiNilai(int nilai){
        if(nilai < 0){
            System.out.println("Data Nilai tidak boleh kurang dari 0! Harap input dari ulang!");
            return false;
        }
        else if(nilai > 100){
            System.out.println("Data Nilai tidak boleh lebih dari 100! Harap input dari ulang!");
            return false;
        }
        else{
            return true;
        }
    }
}
