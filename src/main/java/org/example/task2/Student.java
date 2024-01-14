package org.example.task2;

public class Student implements Cloneable {
    private String firstName;
    private String lastName;
    private int groupNumber;


    public static void main(String[] args) {

        Student student1 = new Student("Ivan", "Ivanov", 2);


        Student student2 = new Student(student1);


        System.out.println("Link for obj before changing: " + (student1 == student2));


        student1.setFirstName("New name");


        System.out.println("Name of original: " + student1.getFirstName());
        System.out.println("Name of cloned obj: " + student2.getFirstName());
    }

    public Student(String firstName, String lastName, int groupNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        setGroupNumber(groupNumber);
    }

    public Student(String firstName, String lastName) {
        this(firstName, lastName, 1); // По умолчанию устанавливаем номер группы 1
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        if (groupNumber > 0) {
            this.groupNumber = groupNumber;
        } else {
            throw new RuntimeException("Number of the group must be positive");
        }
    }

    // Next group method
    public void moveToNextGroup() {
        setGroupNumber(groupNumber + 1);
    }

    /*
    Cloned constructor
     */
    public Student(Student original) {
        this(original.firstName, original.lastName, original.groupNumber);
    }


}

