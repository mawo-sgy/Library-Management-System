public abstract class Person {

    private String firstName;
    private String lastName;
    private String id;
    private int age;

    Person(){
        this.firstName = "Not provided";
        this.lastName = "Not provided";
        this.id = "Not provided";
        this.age = 0;
    }

    Person(String firstName, String lastName, String id, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getId(){
        return id;
    }

    public int getAge(){
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setAge(int age){
        this.age = age;
    }

    public abstract void displayInfo();

}


