public class Librarian extends Person{

    private String hireDate;

    Librarian(String firstName, String lastName, String id, int age, String hireDate){
        super(firstName, lastName, id, age);
        this.hireDate = hireDate;
    }

    public void setHireDate(String hireDate){
        this.hireDate = hireDate;
    }

    public String getHireDate(){
        return hireDate;
    }

    @Override
    public void displayInfo(){
        System.out.println("=== Librarian <ID "+ this.getId() + "> ===");
        System.out.println("Full name: " + getLastName().toUpperCase() + " " + getFirstName());
        System.out.println("Age: " + getAge() + " years old");
        System.out.println("Hire Date: " + getHireDate());
        System.out.println("============================");
        System.out.println();
    }

}
