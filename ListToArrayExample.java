import java.util.ArrayList;
import java.util.List;

public class ListToArrayExample {
    public static void main(String[] args) {
        List<String> people = new ArrayList<>();
        people.add("menisha");
        people.add("Thowfik");
        people.add("lava ");
		people.add("Meow");
		
        
        // Convert List to Array
        String[] array = people.toArray(new String[0]);
        
        // Print the array
        for (String element : array) {
            System.out.println(element);
        }
    }
}