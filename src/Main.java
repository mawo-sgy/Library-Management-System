
public class Main {
    public static void main(String[] args){

        Librarian librarian = new Librarian("Mohamed", "Guerra", "L001", 45, "10/09/2022");
        Student student = new Student("Lamine", "Dieng", "S001", 19, "UMBB", "CS");
        Student student1 = new Student();

        librarian.displayInfo();
        student.displayInfo();
        student1.displayInfo();

    }
}