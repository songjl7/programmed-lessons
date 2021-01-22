public class Person {
    private String firstName;
    private String lastName;

    // constructors
    public Person(){
        this.firstName = "John";
        this.lastName = "Doe";
    }

    public Person(String first, String last){
        this.firstName = first;
        this.lastName = last;
    }

    // printing
    public void print(){
        System.out.println(this.toString());
    }

    public String toString(){
        return this.firstName + " " + this.lastName;
    }

    public void printFirstLast(){
        System.out.println(this.lastName + ", " + this.firstName);
    }

    // getters
    public String getFirstName(){ return this.firstName; }
    public String getLastName(){ return this.lastName; }

    // setters
    public void setName(String first, String last){ 
        this.firstName = first; 
        this.lastName = last;
    }

    // other methods
    public boolean equals(Object obj){ 
        return (obj instanceof Person && (((Person) obj).getFirstName().equals(firstName) && ((Person) obj).getLastName().equals(lastName))); 
    }

    public void copy(Person per){
        this.firstName = per.getFirstName();
        this.lastName = per.getLastName();
    }

    public Person getCopy(){
        return new Person(firstName, lastName);
    }

}