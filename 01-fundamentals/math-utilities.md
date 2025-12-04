# Math Utilities — Java Reference

[Doc Math Java](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html)<br>
Dokumen ini berisi rangkuman fungsi–fungsi penting dari kelas java.lang.Math yang sering digunakan dalam pemrograman Java.
Tujuannya untuk membantu memahami logika matematika dasar yang sering dipakai dalam perhitungan, validasi, maupun pembuatan algoritma.

- Akar Kuadrat — Math.sqrt
- Pangkat — Math.pow
- Nilai Absolut — Math.abs
- Pembulatan Normal — Math.round
- Pembulatan ke Atas — Math.ceil
- Pembulatan ke Bawah — Math.floor
- Angka Acak — Math.random

---
1. Math.sqrt() : Mengembalikan akar kuadrat dari sebuah angka.
Sintaks:
`Math.sqrt(x)`
Contoh:
`double result = Math.sqrt(25); // 5.0`

2. Math.pow() : Menghitung x pangkat y.
Sintaks:
`Math.pow(a, b)`
Contoh:
`double result = Math.pow(2, 4); // 16.0`

3. Math.abs() : Mengembalikan nilai absolut → menghapus tanda minus bila ada.
Sintaks:
`Math.abs(x)`
Contoh:
`int result = Math.abs(-10); // 10`
4. Math.round() : Pembulatan "normal" ke angka terdekat. 
Sintaks:
`Math.round(x)`
Contoh:
`long result = Math.round(2.6); // 3`
`long result2 = Math.round(2.4); // 2`
5. Math.ceil() : Pembulatan ke atas ke bilangan bulat terdekat.
Sintaks:
`Math.ceil(x)`
Contoh:
`double result = Math.ceil(2.1); // 3.0`
6. Math.floor() : Pembulatan ke bawah ke bilangan bulat terdekat.
Sintaks:
`Math.floor(x)`
Contoh:
`double result = Math.floor(2.9); // 2.0`
7. Math.random() : Menghasilkan angka acak antara 0.0 hingga < 1.0.
Sintaks:
`Math.random()`
Contoh:
`double r = Math.random(); // contoh: 0.72831`
Random dalam range tertentu, Range yang diinginkan Rumus:
`0 - 99	(int)(Math.random() * 100)`
`1 - 10	(int)(Math.random() * 10) + 1`
`a - b	(int)(Math.random() * (b - a + 1)) + a`

***Contoh Program Lengkap:***

```java
public class MathDemo {
public static void main(String[] args) {

        System.out.println("sqrt(16): " + Math.sqrt(16));
        System.out.println("pow(3,2): " + Math.pow(3, 2));
        System.out.println("abs(-7): " + Math.abs(-7));
        System.out.println("round(3.7): " + Math.round(3.7));
        System.out.println("ceil(3.1): " + Math.ceil(3.1));
        System.out.println("floor(3.9): " + Math.floor(3.9));

        int random = (int) (Math.random() * 100);
        System.out.println("random 0-99: " + random);
    }
}
```
---

## Tips untuk Programmer Pemula
- Fungsi Math sangat membantu untuk logika seperti validasi angka, perhitungan statistik sederhana, perhitungan fisika, atau game logic.
- Pahami konsep dasar: akar, pangkat, pembulatan, dan range random.
- Gunakan casting (int) jika ingin hasil dalam bentuk integer.