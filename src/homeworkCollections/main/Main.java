package collections.main;

import collections.model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        //Builder design pattern example
        Student Ivan = new Student.Builder("Ivan")
                .setLastName("Gyulumyan")
                .setAge(20)
                .build();

        CompareStudentsDescendingAge descendingAge = new CompareStudentsDescendingAge();
        CompareStudentAscendingAlphabeticaly ascendingFirstName = new CompareStudentAscendingAlphabeticaly();

        Student Anna = new Student("Anna", "Martirosyan", 18);
        Student Hakob = new Student("Hakob", "Petrosyan", 23);
        Student Arthur = new Student("Arthur", "Grigoryan", 22);
        Student Narek = new Student("Narek", "Asatryan", 21);

        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add(Arthur);
        dynamicArray.add(Ivan);
        dynamicArray.add(Anna);
        dynamicArray.add(Hakob);
        dynamicArray.add(Narek);
        System.out.println("Dynamic Array: ");
        DynamicArray.print(dynamicArray);

        System.out.println("\nLinked List: ");
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.addLast(Arthur);
        doublyLinkedList.addLast(Ivan);
        doublyLinkedList.addLast(Anna);
        doublyLinkedList.addLast(Hakob);
        doublyLinkedList.addLast(Narek);
        doublyLinkedList.printForward();

        ArrayList<Student> arrayListOfStudents = new ArrayList<Student>();
        arrayListOfStudents.add(Anna);
        arrayListOfStudents.add(Ivan);
        arrayListOfStudents.add(Hakob);
        arrayListOfStudents.add(Arthur);

        LinkedList<Student> linkedListOfStudents = new LinkedList<Student>();
        linkedListOfStudents.add(Anna);
        linkedListOfStudents.add(Ivan);
        linkedListOfStudents.add(Hakob);
        linkedListOfStudents.add(Arthur);
        linkedListOfStudents.add(Narek);

        System.out.println("\nList of students");
        Student.print(arrayListOfStudents);

        arrayListOfStudents.sort(descendingAge);
        System.out.println("\nList of students after sorting by descending age");
        Student.print(arrayListOfStudents);

        System.out.println("\nList of students after sorting by ascending firstname");
        arrayListOfStudents.sort(ascendingFirstName);
        Student.print(arrayListOfStudents);

        System.out.println("\nList of students after sorting by ascending lastname");
        Collections.sort(linkedListOfStudents);
        Student.print(linkedListOfStudents);


    }
}
