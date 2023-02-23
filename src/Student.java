public class Student {
    int age;
    private String name;
    String surname;
    void setName(String name) {
        name = this.name;
    }
    String getName() {
        return name;
    }
    Student(int newAge, String newName, String newSurname) {
        age = newAge;
        name = newName;
        surname = newSurname;
    }
    Student(Student h) {
        age = h.age;
        name = h.name;
        surname = h.surname;
    }

    void Informationst() {
        System.out.println("Information about students: " + name +" "+ age+" years old " + surname);
    }

}
