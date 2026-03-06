package Quiz_ASD;
import java.util.ArrayList;
public class Dosen24 {
    String nidn;
    int tahunMasuk;
    String nama;
    String jenjanPendidikan;
    String  prodi;

    public Dosen24(String nidn,String nama,int tahunMasuk, String jenjangPendidikan , String prodi){
        this.tahunMasuk=tahunMasuk;
        this.nidn = nidn;
        this.nama = nama;
        this.prodi = prodi;
        this.jenjanPendidikan = jenjangPendidikan;
    }
    public void tampilkanInfo(){
        System.out.println("NIDN: "+nidn);
        System.out.println("Nama: "+nama);
        System.out.println("Tahun Masuk: "+tahunMasuk);
        System.out.println("Jenjang Pendidikan: "+ jenjanPendidikan);
        System.out.println("Prodi: "+prodi);
        System.out.println("================");
    }

    public void ubahProdi(String prodiBaru){
        this.prodi = prodiBaru;
    }

    public void ubahPendidikan(String pendidikanBaru){
        this.jenjanPendidikan = pendidikanBaru;
    }


}
