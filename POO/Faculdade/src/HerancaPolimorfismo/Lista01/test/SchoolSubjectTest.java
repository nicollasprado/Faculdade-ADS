package HerancaPolimorfismo.Lista01.test;

import HerancaPolimorfismo.Lista01.SchoolSubject;

public class SchoolSubjectTest {
    public static void main(String[] args) {
        SchoolSubject math = new SchoolSubject("matematica", 60.0, 50.0, 80.0);

        System.out.println(math.parcialGrade());
        System.out.println(math.isApproved());
        System.out.println(math.finalAverage());
        System.out.println(math.isApproved());
    }
}
