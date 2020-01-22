package homeworkCollections.main;

import homeworkCollections.model.DoublyLinkedList;
import homeworkCollections.model.DynamicArray;
import homeworkCollections.model.Student;

public class Main {
    public static void main(String[] args) {

        //Builder design pattern example
        Student Ivan = new Student.Builder("Ivan")
                .setLastName("Gyulumyan")
                .setAge(20)
                .build();

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

    }
}
