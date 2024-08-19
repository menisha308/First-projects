public class CountVowels {
    public static void main(String[] args) {
        String str = "Hello World";
        int vowelCount = 0;
        int consonantCount = 0;
        
        // Convert string to lowercase to simplify checking
        str = str.toLowerCase();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // Check if character is a letter
            if (Character.isLetter(ch)) {
                // Check if vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }
        
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }
}