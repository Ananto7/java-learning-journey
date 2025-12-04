# Daily Learning log

## Week 1

### Day 1 - [01/12/25]
**Topics**: Variable, Class, Wrapper Class, Overflow, Underflow, Casting, Statement, Expressions, Keywords, Code Block, Whitespace, Indentation, If Statement, Method, Arguments, Parameters, Void
**What I Learned**:
- Variable adalah tempat dimana menyimpan informasi/nilai pada komputer di simpan di ram.
- Class adalah konsep oop, dimana pada java digunakan untuk mendeklarasikan sebuah object blueprint, yg memiliki variable dan method didalamnya.
- Wrapper Class adalah Class yg berhubungan dengan utility tipe data primitive.
- Overflow adalah konsep dimana mencapai batas maximum dari suatu tipe data (int) dan akan dibulatkan menjadi nilai terkecil pada tipe data tersebut.
- Underflow adalah kebalikan konsep dari Overflow yaitu batas minimum dari suatu tipe data (int) dan akan dibulatkan menjadi nilai terbesar pada tipe data tersebut.
- Casting adalah suatu perubahan yg digunakan ketika tipe data berbeda dan ingin merubah nya ke dalam bentuk tipe data yg diinginkan, ada 2 kosep casting, casting implicit & casting explicit
- Expression adalah kombinasi literals, aritmatika/operators, variable/value, return method yg menghasilkan nilai.
- Statement adalah line berupa code syntax yg di terima atau di baca sebagai java code yg menghasilkan perintah diakhir line di tutup dengan semicolon ;.
- Keywords adalah syntax pada bahasa java.
- Code Block adalah tempat kumpulan dari statements di tandai dengan {}.
- Whitespace adalah spasi yg digunakan untuk mempermudah membaca code, whitespace akan diabaikan code.
- Indentation adalah format penulisan yg membantu programmer java dalam membaca code.
- If statement adalah keyword salah satu keyword java yg digunakan untuk pengkondisian percabangan alur program biasa digunakan dengan else if untuk kondisi kedua (else if bisa lebih dari satu) dan else akan dijalankan jika kondisi tidak ada yg terpenuhi atau dijalankan.
- Method adalah sebuah code block berada dalam suatu class yg bisa dijalankan dengan cara dipanggil memiliki sifat mengembalikan hasil/nilai menerima nilai sebagai arguments, method ketika dipanggil bisa menjadi statement dan expression.
- Parameters adalah variable yg dimiliki oleh sebuah method yg digunakan untuk menyimpan dan mendeklarasikan nya.
- Arguments adalah nilai atau variable yg diberikan kedalam sebuah method yg dipanggil tipe data yg di berikan harus sama dan harus sesuai dengan parameters pada method tertentu.
- Void memiliki arti tidak mengembalikan nilai, keyword ini digunakan ketika mendeklarasikan method.

### Day 2 - [02/12/25]
**Topics**: Comments, String, Memory Stack, Frame, Heap, String Pool, Array, Null, Method Overloading
**What I Learned**:
- Comments adalah tanda bahwa suatu statement atau multi line akan diabaikan oleh compiler dimaksud tidak akan terbaca oleh mesin, kegunaan nya untuk programmer menjelaskan code nya (why this code).
- String adalah tipe data object/class berbeda dengan tipe data primitives lain nya, cara penggunaan nya saja yg mirip, menyimpan literal kata ditandai kutip 2 di depan dan dibelakang.
- Memory stack adalah suatu mekanisme cara kerja dalam pemrosesan pemanggilan setiap method pada code java, memory stack bersifat LIFO last in first out.
- Frame adalah nama lain dari function/method yg ada di code yg sudah kita buat dimana frame yg kita buat akan di masukan kedalam memory stack agar diatur sesuai urutan pemanggilan.
- Heap adalah salah satu mekanisme mirip dengan memory stack tapi heap digunakan untuk object atau references types.
- String Pool adalah memory yg berada di dalam heap, digunakan untuk menyimpan value dari object String.
- Array adalah tempat untuk menyimpan beberapa value di satu variable sesuai dengan tipe data nya, array index dimulai dari 0, dan array bersifat tetap. array memiliki default value yaitu 0 jika tipe data primitives jika boolean false lalu jika object maka nilai default nya akan null.
- Null adalah tanda bahwa variable reference type tidak memiliki alamat ke salah satu object.
- Method Overloading adalah konsep di java untuk menggunakan nama method bisa lebih dari satu dengan catatan parameters nya harus unik.

### Day 3 - [03/12/25]
**Topic**:
**What I Learned**: String Build, Scanner, Switch, Case, Break, Return, Default, Yield, Looping, Math Sqrt
- String build adalah salah satu kelas string yg digunakan untuk memodifikasi kalimat string tidak seperti assignment string pada umum nya yg bersifat immutable sedangkan string build mutable.
- Scanner adalah salah satu class / object yg digunakan untuk menerimaa input user dari console dan file.
- Switch statement adalah salah satu pengkondisian code berdasarkan option pilihan berupa variable bilangan maupun string dan char serta enum, mirip dengan if beda nya jika if menggunakan boolean tapi model enhancement wajib menggunakan default sedangkan yg model lama opsional.
- Case adalah keyword yg digunakan bersamaan dengan switch case mirip seperti option pilihan yg dipilih akan menjalankan code atau statement nya. 
- Break adalah keyword java yg digunakan untuk keluar dari looping atau suatu proses, break di gunakan pada proses switch case sebagai pembatas agar tidak terjadi fall through pada switch new enhancement fall through sudah tidak ada lagi dan sudah tidak menggunakan break dapat digunakan dalam loop untuk keluar dari perulangan.
- Return adalah keyword java yg digunakan untuk keluar mirip dengan break, perbedaan nya ada di sifat return keluar bisa sambil membawa value sedangkan break tidak, dan return bisa exit dari method sedangkan break hanya di looping atau proses switch.
- Default adalah keyword yg digunakan mirip dengan else pada if tapi default digunakan di switch ketika tidak ada case yg dipilih atau sesuai maka akan masuk ke default.
- Yield adalah new keyword untuk switch case model baru / enhancement digunakan ketika kita akan membuat code block pada suatu case dan akan mengembalikan return value maka menggunakan yield.
- Looping adalah konsep perulangan pada code yg dijalankan sesuai dengan kondisi yg terpenuhi ada 3 loop yg digunakan pada java for untuk perulangan secara pasti, while perulangan tidak pasti akhir nya selama kondisi terpenuhi akan di ulang prosses nya dan do while sama seperti while tapi berbeda cara kerja pengecekan kondisi dilakukan di akhir proses jadi bisa dikatakan proses akan dijalankan sekali baru melakukan pengecekan kondisi.
- Math Sqrt adalah library bawaan java di dalam class Math sqrt digunakan untuk mencari bilangan akar kuadrat dari suatu angka dan akan return bilangan real.

### Day 4 - [04/12/25]
**Topic**:
**What I Learned**: Math Pow, Printf, Math Random, Debug, Breakpoint, Continue
- Math pow adalah library math bawaan pada java berfungsi untuk menghitung bilangan perpangkatan.
- Printf adalah method yg mirip dengan print & println untuk menampilkan output ke console, perbedaan nya ada di formating literal menggunakan kombinasi serta pemanggilan argument nya.
- Math Random adalah library math bawaan pada java digunakan untuk menentukan angka random sesuai dengan kamauan user library ini memiliki cara kerja memberika angka double dari 0.0 - 1.0 jadi ketika kita ingin menggunakan nya biasa kita kalikan dengan angka.
- Debug adalah istilah programer untuk mencari issue atau error pada code ketika run time program di jalankan.
- Breakpoint debug adalah sebuah node atau titik tuju, yg digunakan untuk mempause suatu proses pada kegiatan debug sebuah program, breakpoint bisa lebih dari satu.
- Continue adalah keyword yg digunakan untuk skip satu proses perulangan yg ada di looping sebuah program.