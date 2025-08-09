package Hashtable.LinearProbing;

import Hashtable.Student;

public class TestLP {
    public static void main(String[] args) {
        HashtableLP htlp = new HashtableLP();

        htlp.addStudent(new Student("Nicollas", 20));
        htlp.addStudent(new Student("Pedro", 10));
        htlp.addStudent(new Student("Carlos", 15));
        htlp.addStudent(new Student("Roma", 44));
        htlp.addStudent(new Student("amor", 37));
        htlp.print();
        System.out.println(htlp.getStudentGrade("Roma"));
        htlp.addStudent(new Student("Joao", 55));
        htlp.addStudent(new Student("Vitor", 100));
        htlp.print();
        System.out.println(htlp.getStudentGrade("Roma"));
        htlp.addStudent(new Student("Caio", 11));
        htlp.addStudent(new Student("Samuel", 99));
        htlp.addStudent(new Student("Erick", 87));
        htlp.addStudent(new Student("Caue", 84));
        htlp.addStudent(new Student("Jose", 65));
        htlp.addStudent(new Student("Jefferson", 54));
        htlp.addStudent(new Student("a", 22));
        htlp.addStudent(new Student("bu", 26));
        htlp.print();
        System.out.println(htlp.getStudentGrade("Roma"));
        System.out.println(htlp.getStudentGrade("bu"));
        htlp.removeStudent("Roma");
        htlp.print();
        htlp.addStudent(new Student("Roma", 77));
        htlp.print();
        System.out.println(htlp.getStudentGrade("Roma"));
    }
}
