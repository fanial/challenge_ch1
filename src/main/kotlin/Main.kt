fun main() {
//  Object untuk memanggil class Ukuran dan Child Pola
    val banyak = Ukuran(n = 0, k = 0)
    val polaFun = Pola(n = 0, k = 0)

//  Memasukan data ukuran untuk nilai n di function pola
    print("Masukan Ukuran Pola : ")
    banyak.n = readln().toInt()

//  Menampilkan Function Pola
    polaFun.pola1(banyak.n)
    polaFun.pola2(banyak.n)
    polaFun.pola3(banyak.n)
    polaFun.pola4(banyak.n)
    polaFun.pola5(banyak.n)
}