# Java Printf Formatting - Panduan Lengkap

## Daftar Isi
1. [Pengenalan](#pengenalan)
2. [Syntax Dasar](#syntax-dasar)
3. [Format Specifiers](#format-specifiers)
4. [Flags](#flags)
5. [Width dan Precision](#width-dan-precision)
6. [Contoh Praktis](#contoh-praktis)
7. [Tips dan Trik](#tips-dan-trik)

---

## Pengenalan

`printf()` adalah method untuk mencetak output dengan format tertentu di Java. Method ini memberikan kontrol lebih besar terhadap tampilan output dibanding `println()`.

### Syntax Dasar
```
System.out.printf(format_string, argument1, argument2, ...);
```

**Contoh:**
```
String nama = "Budi";
int umur = 25;
System.out.printf("Nama: %s, Umur: %d tahun\n", nama, umur);
// Output: Nama: Budi, Umur: 25 tahun
```

---

## Format Specifiers

Format specifier dimulai dengan `%` diikuti karakter yang menentukan tipe data.

| Specifier | Tipe Data     | Keterangan                     |
|-----------|---------------|--------------------------------|
| `%d`      | int, long     | Integer desimal                |
| `%f`      | float, double | Floating point                 |
| `%s`      | String        | String                         |
| `%c`      | char          | Karakter                       |
| `%b`      | boolean       | Boolean                        |
| `%n`      | -             | Newline (platform independent) |
| `%x`      | int           | Hexadecimal (lowercase)        |
| `%X`      | int           | Hexadecimal (uppercase)        |
| `%o`      | int           | Octal                          |
| `%e`      | double        | Scientific notation            |

### Contoh Penggunaan:

```
// Integer
int angka = 42;
System.out.printf("Integer: %d\n", angka);
// Output: Integer: 42

// Float/Double
double harga = 15000.5;
System.out.printf("Harga: %f\n", harga);
// Output: Harga: 15000.500000

// String
String kota = "Jakarta";
System.out.printf("Kota: %s\n", kota);
// Output: Kota: Jakarta

// Character
char grade = 'A';
System.out.printf("Grade: %c\n", grade);
// Output: Grade: A

// Boolean
boolean lulus = true;
System.out.printf("Status: %b\n", lulus);
// Output: Status: true
```

---

## Flags

Flags mengubah tampilan output. Ditulis setelah `%` dan sebelum specifier.

| Flag        | Keterangan                            | Contoh  |
|-------------|---------------------------------------|---------|
| `-`         | Left-justified (rata kiri)            | `%-10s` |
| `+`         | Tampilkan tanda + untuk angka positif | `%+d`   |
| `0`         | Padding dengan 0                      | `%05d`  |
| ` ` (spasi) | Tambah spasi untuk angka positif      | `% d`   |
| `,`         | Gunakan separator ribuan              | `%,d`   |

### Contoh Flags:

```
// Left-justified
System.out.printf("|%-10s|\n", "Java");
// Output: |Java      |

// Right-justified (default)
System.out.printf("|%10s|\n", "Java");
// Output: |      Java|

// Padding dengan 0
System.out.printf("%05d\n", 42);
// Output: 00042

// Tanda + untuk positif
System.out.printf("%+d\n", 100);
// Output: +100

// Separator ribuan
System.out.printf("%,d\n", 1000000);
// Output: 1,000,000
```

---

## Width dan Precision

### Width (Lebar)
Menentukan jumlah minimum karakter yang akan dicetak.

```
System.out.printf("%10d\n", 42);     // Output:         42 (10 karakter)
System.out.printf("%10s\n", "Java"); // Output:       Java (10 karakter)
```

### Precision (Presisi)

Untuk **floating point**: jumlah digit desimal
```
double pi = 3.14159265;
System.out.printf("%.2f\n", pi);  // Output: 3.14 (2 desimal)
System.out.printf("%.4f\n", pi);  // Output: 3.1416 (4 desimal)
```

Untuk **string**: maksimal karakter yang ditampilkan
```
String text = "Hello World";
System.out.printf("%.5s\n", text);  // Output: Hello (5 karakter pertama)
```

### Kombinasi Width dan Precision

```
double nilai = 123.456789;
System.out.printf("%10.2f\n", nilai);  // Output:     123.46 (width 10, 2 desimal)
System.out.printf("%8.3f\n", nilai);   // Output: 123.457 (width 8, 3 desimal)
```

---

## Contoh Praktis

### 1. Tabel Data Sederhana

```
System.out.println("================================");
System.out.printf("%-15s %-10s %10s\n", "Produk", "Jumlah", "Harga");
System.out.println("================================");
System.out.printf("%-15s %-10d %,10.2f\n", "Laptop", 5, 15000000.00);
System.out.printf("%-15s %-10d %,10.2f\n", "Mouse", 20, 150000.00);
System.out.printf("%-15s %-10d %,10.2f\n", "Keyboard", 10, 500000.00);
System.out.println("================================");
```

**Output:**
```
================================
Produk          Jumlah          Harga
================================
Laptop          5           15,000,000.00
Mouse           20             150,000.00
Keyboard        10             500,000.00
================================
```

### 2. Format Angka dengan Leading Zero

```
int hari = 5;
int bulan = 9;
int tahun = 2024;
System.out.printf("Tanggal: %02d/%02d/%04d\n", hari, bulan, tahun);
// Output: Tanggal: 05/09/2024
```

### 3. Format Mata Uang

```
double saldo = 5000000.75;
System.out.printf("Saldo: Rp %,.2f\n", saldo);
// Output: Saldo: Rp 5,000,000.75
```

### 4. Laporan dengan Multiple Columns

```
System.out.printf("%-10s | %5s | %8s | %10s\n", "Nama", "NIM", "Nilai", "Grade");
System.out.println("------------------------------------------------");
System.out.printf("%-10s | %5d | %8.2f | %10c\n", "Andi", 12345, 85.5, 'A');
System.out.printf("%-10s | %5d | %8.2f | %10c\n", "Budi", 12346, 78.0, 'B');
System.out.printf("%-10s | %5d | %8.2f | %10c\n", "Citra", 12347, 92.5, 'A');
```

**Output:**
```
Nama       |   NIM |    Nilai |      Grade
------------------------------------------------
Andi       | 12345 |    85.50 |          A
Budi       | 12346 |    78.00 |          B
Citra      | 12347 |    92.50 |          A
```

### 5. Progress Bar Sederhana

```
int progress = 75;
System.out.printf("Progress: [%-20s] %3d%%\n", 
                  "==========", progress);
// Output: Progress: [==========          ]  75%
```

---

## Tips dan Trik

### 1. Gunakan Index Argument
Anda bisa menggunakan argumen yang sama berkali-kali:

```
String nama = "Budi";
System.out.printf("%1$s suka Java. %1$s adalah programmer.\n", nama);
// Output: Budi suka Java. Budi adalah programmer.
```

### 2. Escape Karakter %
Untuk mencetak karakter `%` literal:

```
System.out.printf("Diskon: 20%%\n");
// Output: Diskon: 20%
```

### 3. Platform Independent Newline
Gunakan `%n` daripada `\n` untuk newline yang bekerja di semua platform:

```
System.out.printf("Baris 1%nBaris 2%n");
```

### 4. Format dengan Locale
```
import .util.Locale;

double angka = 1234567.89;
System.out.printf(Locale.US, "%,.2f\n", angka);      // Output: 1,234,567.89
System.out.printf(Locale.GERMANY, "%,.2f\n", angka); // Output: 1.234.567,89
```

### 5. StringBuilder dengan Format
```
String hasil = String.format("Nama: %s, Umur: %d", "Andi", 25);
System.out.println(hasil);
// Output: Nama: Andi, Umur: 25
```

---

## Cheat Sheet Cepat

```
// Integer dengan padding
System.out.printf("%05d", 42);           // 00042

// Float 2 desimal
System.out.printf("%.2f", 3.14159);      // 3.14

// String rata kiri, width 10
System.out.printf("%-10s", "Java");      // "Java      "

// String rata kanan, width 10
System.out.printf("%10s", "Java");       // "      Java"

// Integer dengan separator ribuan
System.out.printf("%,d", 1000000);       // 1,000,000

// Kombinasi: string 15 char + int 3 digit
System.out.printf("%-15s%03d", "Java", 42); // "Java           042"
```

---

## Latihan

Coba buat output seperti ini:

```
====================================
ID     | Name           | Score
====================================
001    | Alice          | 95.50
002    | Bob            | 87.25
003    | Charlie        | 91.00
====================================
```

**Solusi:**
```
System.out.println("====================================");
System.out.printf("%-7s| %-15s| %s\n", "ID", "Name", "Score");
System.out.println("====================================");
System.out.printf("%03d    | %-15s| %.2f\n", 1, "Alice", 95.50);
System.out.printf("%03d    | %-15s| %.2f\n", 2, "Bob", 87.25);
System.out.printf("%03d    | %-15s| %.2f\n", 3, "Charlie", 91.00);
System.out.println("====================================");
```

---

## Referensi
- [Java Documentation - Formatter](https://docs.oracle.com/se/8/docs/api//util/Formatter.html)
- [Java Printf Examples](https://www.baeldung.com/java-printstream-printf)

---