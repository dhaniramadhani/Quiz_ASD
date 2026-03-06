package Quiz_ASD;

public class Dosen24Main {
    public static void main(String[] args) {
Dosen24 d1 = new Dosen24("001", "Budi", 2006, "S2", "Manajemen"); 

d1.tampilkanInfo();

d1.ubahProdi("Sistem Informasi");
d1.ubahPendidikan("S3");

System.out.println("Setelah Diubah");
d1.tampilkanInfo();

}
}
