package com.learning.java.fundamentals00;

public class Main {
    public static void main(String[] args) {
        // floating point challenge

        // 1 pound is equal to 0.45359237 of a kilogram
        int numberOfPound = 2;
        double resultOfKilogram = (double) numberOfPound * 0.45359237;
        System.out.println("The kilogram is " + resultOfKilogram);

        // char challenge

        char mySimpleChar = '?';
        char myUnicodeChar = '\u003f';
        char myDecimalChar = 63;

        System.out.println("My values are " + mySimpleChar + " and " + myUnicodeChar + " and " + myDecimalChar);

        // ternary operator

        String makeOfCar = "volkswagen";
        boolean isDomestic = makeOfCar == "volkswagen" ? false : true;

        // precedence operator challenge

        double myFirstDouble = 20.00;
        double mySecondDouble = 80.00;
        double myFirstResult = (myFirstDouble + mySecondDouble) * 100.00;
        double mySecondResult = myFirstResult % 40.00;
        boolean myFirstBoolean =  mySecondResult == 0.00 ? true : false;
        System.out.println("Result My First Boolean " + myFirstBoolean);

        if (!myFirstBoolean) {
            System.out.println("got some remainder");
        }

        // Increment & Decrement

        int number = 0;
        System.out.println(number++); // post increment -> ketika code dijalankan hasil tetap 0 karna belum di tambah hasil nya 0.
        System.out.println("Hasil Post Increment " + number);
        int numberTwo = 0;
        System.out.println(++numberTwo); // pre increment -> ketika code belum dijalankan akan ditambah terlebih dahulu baru di jalankan hasil nya 1.
        System.out.println("Hasil Pre Increment " + numberTwo);

        // Comparison Operator

        // < <= > >= == !=
        System.out.println(10 > 10);
        System.out.println(10 >= 10);
        System.out.println(10 < 10);
        System.out.println(10 <= 10);
        System.out.println(10 == 10);
        System.out.println(10 != 10);

        // Strings

        String firstString = "learning";
        String secondString = "code";
        String greeting = new String("Hello");
        String name = new String("Andri");
        String thirdString = firstString + secondString; // Concat -> menggabungkan 2 variable string jika tipe data int dan literal string di concat akan menjadi String.
        System.out.println(thirdString.toUpperCase()); // method uppercase digunakan untuk membuat kalimat menjadi besar semua.
        System.out.println(thirdString.toLowerCase()); // method lowercase digunakan untuk membuat kalimat menjadi kecil semua.
        System.out.println(thirdString.substring(0, 8)); // untuk memotong kalimat berdasarkan index dimulai dari 0.
        System.out.println(" ".isEmpty()); // untuk menentukan hasil berupa boolean jika kalimat kosong atau tidak.
        System.out.println(" ".isBlank()); // untuk menentukan hasil berupa boolean jika kalimat kosong atau tidak.
        System.out.println(" a ".trim()); // untuk menghapus spasi dalam kalimat.

        int numberString = 42;
        String numberAsString = String.valueOf(numberString);

        double price = 19.99;
        String priceAsString = String.valueOf(price);

        String text = "Hello, Java!";

        int getLength = text.length();
        System.out.println("Length: " + getLength);

        char firstChar = text.charAt(0);
        char lastChar = text.charAt(text.length() - 1);

        String str1 = "Hello";
        String str2 = "Java!";
        boolean isEqual = str1.equals(str2);
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2);

        boolean startsWith = str1.startsWith("He");
        boolean endsWith = str1.endsWith("lo");

        String original = " Hello, Java! ";

        String trimmed = original.trim();
        System.out.println("trim " + trimmed);

        String replaced = original.replace("Java", "World");

        String text2 = "Java is Awesome!";

        boolean isContains = text2.contains("Java");

        int index = text2.indexOf("is");
        int lastIndex = text2.lastIndexOf("a");

        String fromIndex = text2.substring(5);

        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(", ");
        sb.append("Java");
        sb.append("!");
        String result = sb.toString();
        System.out.println(result);

        String setence = "Hello Java World";
        System.out.println("Starts with 'World': " + setence.endsWith("World") + '\u0022');

        int currentYear = 2025;
        String usersDateOfBirth = "1999";

        int dateOfBirth = Integer.parseInt(usersDateOfBirth);

        System.out.print("Age: " + (currentYear - dateOfBirth));

        String usersAgeWithPartialYear = "22.5";
        double ageWithPartialYear = Double.parseDouble(usersAgeWithPartialYear);
        System.out.println("ageWithPartialYear = " + ageWithPartialYear);
    }
}
