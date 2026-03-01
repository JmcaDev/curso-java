package atributoStatic;

public class MainClassroom {
    public static void main(String[] args) {
        Classroom student1 = new Classroom("Jose");
        Classroom student2 = new Classroom("Miguel");

        student1.showInformation();
        student2.showInformation();

        Classroom.setSchoolName("Escuela Técnica N°2");

        student1.showInformation();
        student2.showInformation();
    }
}
