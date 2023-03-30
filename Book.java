public class Book {
  String judul;
  int jumlahHalaman;
  Book(String judul, int jumlahHalaman){
    this.judul = judul;
    this.jumlahHalaman = jumlahHalaman;
  }  
}

class Novel extends Book{
  String genre;
  Novel(String judul, int jumlahHalaman,String genre){
    super(judul, jumlahHalaman);
    this.genre = genre;
  }
}

class Majalah extends Book{
  String kategory;
  Majalah(String judul, int jumlahHalaman,String kategory){
    super(judul, jumlahHalaman);
    this.kategory = kategory;
  }
}