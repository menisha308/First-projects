import java.util.LinkedList;

public class RetrieveFirstElementLinkedList {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add("Java");
        linkedList.add("Python");
        linkedList.add("C++");
        linkedList.add("JavaScript");

        // Retrieve the last element (without removing it)
        String firstElement = linkedList.getFirst();

        // Print the last element
        System.out.println("First element of the LinkedList: " + firstElement);
    }
}
