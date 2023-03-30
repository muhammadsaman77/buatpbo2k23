public class Mahasiswa {
  //atribut
  private String nama;
  private String nim;
  Mahasiswa (String nama, String nim){
    this.nama = nama;
    this.nim = nim;
  }
  //Method getter
  public String getNama(){
    return this.nama;
  }
  public String getNim(){
    return this.nim;
  }
  //setter
  public void setNama(String nama){
    this.nama = nama;
  }




  //method
  String belajar (){
    return "Mahasiswa dapat belajar didalam kampus";
  }
  void lomba(){
    System.out.println("Mahasiswa dapat mengikuti berbagai macam perlombaan");
  }
  void praktikum (){
    System.out.println("Mahasiswa dapat melakukan berbagai macam praktikum");
  }
}
