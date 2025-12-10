package com.learning.oop01;

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            LPAStudent s = new LPAStudent("S92300" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Sam";
                        case 5 -> "Braun";
                        default -> "Anonymous";
                    },
                    "05/11/2025",
                    "Java Master");
            System.out.println(s);
        }

        Student pojoStudent = new Student("S923600", "Ann", "09/12/25", "Java Master");
        LPAStudent recordStudent = new LPAStudent("S923600", "Uni", "09/12/25", "Java Master");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");

        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());
    }
}
