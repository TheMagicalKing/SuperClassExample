public class Main {
    public static void main(String[] args) {

        //Students Class and Objects
        Student n = new Student();
        Student s = new Student();

        //Variables from SuperClass
        n.name = "Nicki";
        n.userID = "Student";
        n.cpr = 111111;
        n.alder = 21;
        n.correctPassword = true;

        //Variables from SubClass
        n.grades = 95.0;
        n.shownUp = 100.0;
        n.year = 1;


        //Variables from SuperClass
        s.name = "Sune";
        s.userID = "Student";
        s.cpr = 111111;
        s.alder = 21;
        s.correctPassword = true;
        //Variables from SubClass
        s.grades = 95.0;
        s.shownUp = 100.0;
        s.year = 1;


        //Employees Class and objects
        Employees aWestfall = new Employees();
        Employees aPedersen = new Employees();
        //Variables from SuperClass
        aWestfall.name = "Anders";
        aWestfall.userID = "Teacher";
        aWestfall.cpr = 221222;
        aWestfall.alder = 38;
        aWestfall.correctPassword = false;
        //Variables from SubClass
        aWestfall.sick = false;
        aWestfall.hasClass = false;
        aWestfall.gradedStudents = 22;
        aWestfall.ungradedStudents = 10;
        aWestfall.graduatedStudents = 200;
        aWestfall.workPerformance = 100.00;
        //Variables from SuperClass
        aPedersen.name = "Andrács";
        aPedersen.userID = "Teacher";
        aPedersen.cpr = 221122;
        aPedersen.alder = 41;
        aPedersen.correctPassword = true;
        //Variables from SubClass
        aPedersen.sick = false;
        aPedersen.hasClass = false;
        aPedersen.gradedStudents = 22;
        aPedersen.ungradedStudents = 10;
        aPedersen.graduatedStudents = 200;
        aPedersen.workPerformance = 100.00;

    }
}
