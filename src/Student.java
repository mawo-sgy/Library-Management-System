public class Student extends Person{

    private String university;
    private String department;
    private String[] currentBorrowedBooks;

    Student(String firstName, String lastName, String id, int age, String university, String department){
        super(firstName, lastName, id, age);
        this.university = university;
        this.department = department;
    }

    Student(){
        super();
    }

    public String getUniversity() {
        return university;
    }

    public String getDepartment(){
        return department;
    }

    public void setUniversity(String department){
        this.university = university;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    @Override
    public void displayInfo(){
        System.out.println("=== Student <ID " + getId() + "> ===");
        System.out.println("Full name: " + getLastName().toUpperCase() + " " + getFirstName());
        System.out.println("Age: " + getAge() + " years old");
        System.out.println("University: " +  getUniversity());
        System.out.println("Department: " + getDepartment());
        System.out.println("===========================");
        System.out.println();
    }

}
