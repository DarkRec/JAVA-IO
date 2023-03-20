package Instruction2;

public class Main {

    public static void main(String[] args) {
        ClassContainer dziennik = new ClassContainer();
        dziennik.addClass("klasa",5);
        dziennik.addClass("klasa2",10);


        Class klasa = dziennik.classMap.get("klasa");


        Student s1 = new Student("Jakub", "Litewka", StudentCondition.OBECNY ,6 );
        Student s2 = new Student("Robert", "Lewandowski", StudentCondition.NIEOBECNY ,1 );
        Student s3 = new Student("Adam", "Małysz", StudentCondition.NIEOBECNY );
        klasa.addStudent(s1);
        klasa.addStudent(s2);
        klasa.addStudent(s3);
        klasa.summary();
        klasa.addPoints(s2,5);
        klasa.removePoints(s2,3);
        System.out.println(klasa.search("Litewka"));
        System.out.println(klasa.searchPartial("d"));
        klasa.changeCondition(s2,StudentCondition.OBECNY);
        System.out.println(klasa.countByCondition(StudentCondition.OBECNY));
        System.out.println(klasa.sortByName());
        System.out.println(klasa.sortByPoints());
        System.out.println(klasa.max());
        klasa.summary();
        dziennik.summary();
        System.out.println(dziennik.findEmpty());
    }
}
