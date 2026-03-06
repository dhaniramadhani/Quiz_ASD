package Quiz_ASD;

import java.util.ArrayList;

public class Matakuliah24 {
    String kodeMK;
    String namaMK;
    int sks;
    ArrayList <Dosen24> dosenPengampu = new ArrayList<>();
    
    public Matakuliah24(String kodeMK,String namaMK, int sks){
        this.namaMK = namaMK;
        this.kodeMK = kodeMK;
        this.sks = sks;
    }

    public void tampilkanInfo(){
        System.out.println("Kode MataKuliah : "+kodeMK);
        System.out.println("Nama MataKuliah : "+namaMK);
        System.out.println("SKS : "+sks);

        System.out.println("Dosen Pengampu: ");
        for(Dosen24 d : dosenPengampu){
            System.out.println("- "+ d.nama);
        }
        System.out.println();
    }
    public void ubahNamaMK(String namaMKBaru){
        namaMK = namaMKBaru;
    }
    public void ubahSKS(int sksBaru){
        if (sksBaru >=2) {
            sks = sksBaru;
        }else{
            System.out.println("SKS Tidak Boleh Kurang dari 2");
        }
    }
    public void tambahDosen(Dosen24 dosen24){
        dosenPengampu.add(dosen24);
    }
    
}
