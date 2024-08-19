public class ExtractEmail {
    public static void main(String[] args) {
        String text = "Hey, there how are you? this is my email id great123@gmail.com";
        
        // Regular expression to match an email address
        String regex = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}\\b";
        
        // Compile the regex pattern
        Pattern pattern = Pattern.compile(regex);
        
        // Create matcher object
        Matcher matcher = pattern.matcher(text);
        
        // Find email addresses
        while (matcher.find()) {
            System.out.println("Email found: " + matcher.group());
        }
    }