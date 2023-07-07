//FAKHRI NAUFALDI RAMADHAN 227064516035
//EXA IKHTAR ALDIANSYAH 227064516032
package tugas2_algo;
public class karyawan {
    String NIP;
    String nama;
    String kelamin;
    int hari;
    int totalgaji;
    
    void karyawan (){
        System.out.println("NIP : " + NIP);
        System.out.println("nama : " + nama);
        System.out.println("jenis kelamin : " + kelamin);
    } 
    void Absen_kerja (){
        System.out.println("Absen Kerja : " + hari);
    }
    void Hitung_gaji (){
        System.out.println("Gaji : " + (hari*50000));
    }   
}
class Dosen extends karyawan{
    String golongan;
    int SKS;
    int upahtotal;
    void Hitung_gaji(){
        System.out.println("Total Gaji : " + (SKS*upahtotal*hari));
    }
}
class Staff extends karyawan{
}
