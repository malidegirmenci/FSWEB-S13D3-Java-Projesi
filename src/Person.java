public class Person {
    String firstName;
    String lastName;
    String profession;
    String[] hobbies;
    int height;
    int weight;
    int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, String profession, String[] hobbies, int height, int weight, int age) {
        this(firstName,lastName,age);
        this.profession = profession;
        this.hobbies = hobbies;
        this.height = height;
        this.weight = weight;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen(){
        return this.age >= 13 && this.age < 19;
    }
}
