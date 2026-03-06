package Quiz_ASD;

public class Matakuliah24Main {
    public static void main(String[] args) {
        Dosen24 d1 = new Dosen24("001", "Budi", 2006, "S2", "Manajemen"); 
        Dosen24 d2 = new Dosen24("002", "Bambang", 2006, "S2", "Teknik Informatika"); 
        Dosen24 d3 = new Dosen24("003", "Siana", 2006, "S2", "Matematika Murni"); 

        Matakuliah24 mk = new Matakuliah24("TI1", "Pemograan Web", 5);

        mk.tambahDosen(d1);
        mk.tambahDosen(d2);
        mk.tambahDosen(d3);
       

        mk.tampilkanInfo();

        mk.ubahNamaMK("Pembelajaran Bahasa React.js");
        mk.ubahSKS(1);

        System.out.println("Setelah Perubahan");
        mk.tampilkanInfo();

    }
}
