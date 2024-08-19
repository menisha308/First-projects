import java.util.LinkedList;

public class RetrieveLastElementLinkedList {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add("Java");
        linkedList.add("Python");
        linkedList.add("C++");
        linkedList.add("JavaScript");

        // Retrieve the last element (without removing it)
        String lastElement = linkedList.getLast();

        // Print the last element
        System.out.println("Last element of the LinkedList: " + lastElement);
    }
}
