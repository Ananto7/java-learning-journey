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

### Day 5 - [05/12/25]
**Topic**:
**What I Learned**: Local Variable, Object, New, Static, Package
- Local Variable adalah suatu mekanisme pada bahasa pemograman atau di java yg menandakan sebuah cakupan penggunaan pada variable, yg dimaksud kita bisa menggunakan variable yg sudah kita buat. Ketika kita buat variable di outer block maka inner block akan dapat mengakses nya begitu juga inner block jika memiliki variable yg di deklarasikan di inner block maka bisaa digunakan di inner itu tidak bisa di outer.
- Object adalah mengacu pada variable yg memiliki referensi sebuah class atau instance, ditandai pada dekalrasi nya menggunakan keyword new.
- New adalah suatu keyword yg digunakan untuk membuat instance baru dari sebuah class.
- Static adalah penamaan pada method maupun field yg di berikan untuk mendapatkan efek khusus hampir mirip cara kerja dengan instance, perbedaan nya untuk deklarasi instance/object menggunakan new sedangkan static hanya perlu menambahkan static pada awal deklarasi. Cara pemanggilan static hanya perlu menggunakan Nama Class yg dimana di dalam nya ada field static maupun method static, dan hanya bisa di panggil oleh method static juga.
- Package adalah folder pada project java, package bertujuan untuk mengatur kumpulan folder project pada java, yg nanti nyaa package berhubungan dengan access modifier.

### Day 6 - [06/12/25]
**Topic**:
**What I Learned**: System.in, System Console, Exception, Try statement, Catch, Import
- System.in adalah menandakan kita bisa mendapatkan input konsol atau terminal biasa digunakan sebagai argumen setiap pembuatan objek scanner.
- System.console adalah keyword yg digunakan untuk mengambil input atau menampilkan output pada terminal.
- Exception adalah sebuah class dan tanda sebuah error yg ada di code. 
- Try Statement adalah sebuah statement yg digunakan ketika kita ingin membuat code kita dapat menerima error kita harapkan dan dapat di tangani.
- Catch adalah keyword pada java biasa kita gunakan ketika membuat try statement, kegunaan nya adalah menangkap error yg di lempar ke lingkup try statement yg sudah kita buat.
- Import adalah keyword yg digunakan untuk memanggil sebuah package, dimana di dalam package tersebut terdapat class/library orang lain atau bawaan dari java yg bisa kita gunakan.

### Day 7 - [07/12/25]
**Topic**: - review ulang soal, mengerjakan soal baru terkait looping pengkondisian dan input menggunakan scanner. 

### Day 8 - [08/12/25]
**Topic**:
**What I Learned**: Access Modifier, Public, Private, Protected, Default, Encapsulation, Getter, Setter, This, Constructor, Constructor Chaining,
- access modifier adalah suatu konsep pada java untuk menentukan akses level pada suatu class method dan variable, access modifier ada 4 (public, private, protected, default).
- public adalah keyword& salah satu access modifier pada java, sebagai penanda bahwa method atau field yg dideklarasikan dengan public akan bisa di akses di seluruh package.
- private adalah access modifier digunakan jika hanya ingin digunakan pada class itu sendiri.
- protected adalah access modifier yg digunakan untuk menandakan bahwa yg bisa digunakan hanya class dari turunan nya saja atau inheritance.
- default adalah access modifier yg hanya bisa digunakan pada package yg sama saja, penggunaan default ketika deklarasi tidak menentukan salah satu dari access modifier maka otomatis akan default.
- Encapsulation adalah konsep oop yg digunakan untuk menyembunyikan sebuah field method maupun class, tujuan nya untuk menutup segala internal proses yg ada.
- getter adalah method yg digunakan untuk mendapatkan value dari private field.
- setter adalah method yg digunakan untuk menetapkan/sets value untuk private field.
- this adalah keyword yg digunakan sebagai penanda class itu sendiri biasa digunakan untuk me reference field dan method yg ada di class itu.
- Constructor adalah method khusus sebuah kelas ketika membuat instance object baru dengan new namakelas(). jika tidak membuat constructor maka akan di buat otomatis, tidak ada return type nama method harus sama dengan class nya dan mempunyai konsep overload method. Kegunaan constructor untuk memberikan nilai awal pada field instance. 
- Constructor chaining adalah konsep pemanggilan constructor di dalam constructor lain dengan tujuan ketika membuat instance baru maka value nya akan merata dan sesuai pada pemanggilan nya menggunakan this() sesuai dengan parameters nya yg ada dan pemanggilan didalam constructor lain nya harus baris pertama.

### Day 9 - [09/12/25]
**Topic**:
**What I Learned**: POJO, Annotation, Override, Record
- pojo adalah singkatan dari plain old java object kegunaan nya adalah hanya untuk menyimpan data, membuat template data yg di gunakan untuk operasi DTO ke DB atau file. Biasa di sebut bean atau javaBean
- annotation adalah salah satu tipe meta data yg digunakan untuk menjelaskan code, mirip dengan comment lebih ter struktur dan lebih berarti karna bisa di baca oleh compiler sama seperti code dengan tujuan menapilkan informasi tidak impact ke code kita sifat nya optional.
- Override atau overridden method adalah method yg digunakan pada child class, dengan tujuan menerapkan konsep dry code. dan memiliki tujuan yg fleksible bisa menggunakan code dari parent tanpa perubahan atau overriden method merubah kode pada child class agar unik.
- Record adalah spesial class yg digunakan untuk menggantikan POJO dengan tambahan peraturan yg lebih ketat perbedaan nya pada pojo adalah tidak ada function setter pada record.

### Day 10 - [10/12/25]
**Topic**:
**What I Learned**: Inheritance, Extends, Super, Polymorphism
- Inheritance adalah suatu konsep oop pada java, tujuan nya mengatur hirarki parent-child class dengan maksud menggunakan code yg sudah ada pada parent class dan digunakan kembali pada child class.
- Extends adalah keyword yg digunakan untuk menentukan suatu class menjadi child class / subclass dari class yg ditunjuk sebagai parent nya.
- Super adalah keyword yg menrujuk kepada parent class pada code child class atau super() bisa disebut sebagai constructor nya parent class.
- Polymorphism adalah salah satu konsep oop pada java, kegunaan nya membuat code lebih simple, umumnya pada parent class - child class, child class akan menggunakan method yg sudah ada dan merubah nya sesuai dengan karakteristik dari child class itu sendiri.