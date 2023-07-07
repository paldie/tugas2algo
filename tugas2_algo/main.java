//FAKHRI NAUFALDI RAMADHAN 227064516035
//EXA IKHTAR ALDIANSYAH 227064516032
package tugas2_algo;
public class main {

    public static void main(String[] args) {
        karyawan orang1 = new karyawan();
        orang1.NIP      = "227064516035";
        orang1.nama     = "Fakhri Naufaldi Ramadhan";
        orang1.kelamin  = "Laki-Laki";
        orang1.hari     = 29;
        orang1.karyawan();
        orang1.Absen_kerja();
        orang1.Hitung_gaji();
        System.out.println();
        
        karyawan orang2 = new karyawan();
        orang2.NIP      = "227064516032";
        orang2.nama     = "Exa Ikhtar Aldiansyah";
        orang2.kelamin  = "Laki-Laki";
        orang2.hari     = 25;
        orang2.karyawan();
        orang2.Absen_kerja();
        orang2.Hitung_gaji();
    }  
}
