Nama : Ilham Ari Prastyo
NIM : 5311421014
MODUL 4

ini jawaban hasil program diatas, untuk program adjacency ada 4 itu untuk soal no 1 sampai 4 pada modul 4
lalu untuk EightPuzzleSearch 1 sampai 4 adalah program dari soal 1 sampai 4 untuk modul 5

1.	Algoritma BFS dapat menemukan node 6,7,8 dari titik awal node 3. Untuk mencapai node 6 (n6), urutan node yang dilewati adalah n3, n2, n4, dan kemudian mencapai n6. Sedangkan untuk node 7 (n7) setelah sampai di n6 kemudian baru ke n7, sedangkan untuk n8 setelah sampai di n6 kemudian sampai di n8. Setiap node yang dilewati akan ditandai dengan Gray untuk  menandai jalur pencarian.
2.	Untuk menemukan n5. Dalam kasus ini, jika kita mulai dari simpul `n0`, BFS akan pertama-tama menjelajahi tetangga-tetangga langsung dari `n0`, yaitu `n1` dan `n2`. Kemudian, dari `n1`, BFS akan menjelajahi tetangga-tetangga `n3` dan `n4`, dan dari `n2`, akan menjelajahi `n5` dan `n6`. Ketika BFS mencapai `n5`, maka perjalanan selesai karena sudah menjelajahi semua simpul yang dapat dijangkau dari `n0`. Dengan demikian, BFS berhasil menemukan `n5` dari `n0` dengan menghitung jarak terpendek yang adalah `2`. Ini didasarkan dari gambar 4.5.
3.	Untuk menemukan n9 dalam kasus ini dari n1 maka akan menjelajah ke n2 n3 dan n4 terlebih dahulu yang memiiki distance 1. Kemudian dilanjutkan ke n5 n6 n7 dan n8 yang memiliki distance 2. Karena belum ketemu akan dilanjutakn ke distance 3 yaitu ke n9 n10 n11 dan n12, akhirnya ketemu n9 di distance 3 dari n1melewati n2 ke n5 lalu ke n9. 
4. Dari soal aku misalkan jika huruf F berarti 6 berarti node 1 adalah 6, yang dicari adalah C berarti data 3 yang berada di node 7 berjarak d=3. dari hasil pada running menunjukan (6,d=0) (2,d=1) (7,d=1) (1,d=2) (4,d=2) (9,d=2) (3,d=3) (5,d=3) (8,d=3) berarti membutuhkan 3 langkah fdari node 1 untuk ke node 7 melewati node 2 node 5 lalu baru ke node 7 untuk mencapai 3 atau C.

MODUL 5
1.  Pada kasus ini saat initial state [4 1 2 0 6 3 7 5 8] dan goal diubah akan menjadi [1 2 3 4 0 5 6 7 8]
    4 1 2 0 6 3 7 5 8

    4 1 2 6 0 3 7 5 8
    4 1 2 6 5 3 7 0 8
    4 1 2 6 5 3 0 7 8
    4 1 2 0 5 3 6 7 8
    0 1 2 4 5 3 6 7 8
    1 0 2 4 5 3 6 7 8
    1 2 0 4 5 3 6 7 8
    1 2 3 4 5 0 6 7 8
    1 2 3 4 0 5 6 7 8
3.  Pada kasus kedua pola yang akan terjadi dari posisi awal [1 5 3 4 6 8 2 7 0] sampai ke [7 6 5 8 0 4 1 2 3]
    1 5 3 4 6 8 2 7 0
    1 5 3 4 6 8 2 7 0
    1 5 3 4 6 0 2 7 8
    1 0 5 4 6 3 2 7 8
    1 6 5 4 0 3 2 7 8
    1 6 5 4 7 3 2 0 8
    1 6 5 4 7 3 2 8 0
    1 6 5 4 7 0 2 8 3
    1 6 0 4 7 5 2 8 3
    1 0 6 4 7 5 2 8 3
    1 7 6 4 0 5 2 8 3
    1 7 6 0 4 5 2 8 3
    0 7 6 1 4 5 2 8 3
    7 0 6 1 4 5 2 8 3
    7 6 0 1 4 5 2 8 3
    7 6 5 1 4 0 2 8 3
    7 6 5 1 4 2 0 8 3
    7 6 5 1 0 4 2 8 3
    7 6 5 1 8 4 2 0 3
    7 6 5 1 8 4 0 2 3
    7 6 5 1 8 4 1 2 3
    7 6 5 0 8 4 1 2 3
    7 6 5 8 0 4 1 2 3
4.  pada kasus ketiga pola yang akan terjadi adalah dibawah ini, inisial state nya berasal dari urutan [1 2 3 4 5 6 7 8 0] sampai ke [1 2 3 4 0 5 6 7 8]
    1 2 3 4 5 6 7 8 0
    1 2 3 4 5 6 7 0 8
    1 2 3 4 0 6 7 5 8
    1 2 3 4 6 0 7 5 8
    1 2 0 4 6 3 7 5 8
    1 0 2 4 6 3 7 5 8
    0 1 2 4 6 3 7 5 8
    4 1 2 6 0 3 7 5 8
    4 1 2 6 5 3 7 0 8
    4 1 2 6 5 3 0 7 8
    0 1 2 4 5 3 6 7 8
    1 2 0 4 5 3 6 7 8
    1 0 2 4 5 3 6 7 8
    0 1 2 4 5 3 6 7 8
    1 2 0 4 5 3 6 7 8
    1 2 3 4 5 0 6 7 8
    1 2 3 4 0 5 6 7 8
    1 2 3 4 0 5 6 7 8
5.  pada kasus keempat dimulai dari inisial 4
   
