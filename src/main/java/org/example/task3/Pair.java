package org.example.task3;

public class Pair {
    private String first;
    private String second;

    public static void main(String[] args) {
        // Creating Pair objects using different constructors
        Pair pair1 = new Pair();
        Pair pair2 = new Pair("hello", "world");

        // Displaying the values of fields for pair2 using getters
        System.out.println("Value of 'first' in pair2: " + pair2.getFirst());
        System.out.println("Value of 'second' in pair2: " + pair2.getSecond());
    }


    {
        System.out.println("Field values in the initialization block: first = " + first + ", second = " + second);
        first = "one";
        second = "two";
    }

    // Default constructor
    public Pair() {
        System.out.println("Field values in the default constructor: first = " + first + ", second = " + second);
    }

    // Parameterized constructor
    public Pair(String first, String second) {
        this.first = first;
        this.second = second;
        System.out.println("Field values in the parameterized constructor: first = " + first + ", second = " + second);
    }

    // Getters
    public String getFirst() {
        return first;
    }

    public String getSecond() {
        return second;
    }


}
