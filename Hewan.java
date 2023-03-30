public class Hewan {
  String nama;
  int jumlahKaki;
  String jenis;
  Hewan(String nama, int jumlahKaki, String jenis){
    this.nama = nama;
    this.jumlahKaki = jumlahKaki;
    this.jenis = jenis;
  }
  String berlari(){
    if (jumlahKaki>=2){
      return this.nama + " dapat berlari";
    }return this.nama + " tidak dapat berlari";
  }
}
