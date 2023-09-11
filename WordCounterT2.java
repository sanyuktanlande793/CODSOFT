import java.util.*;
public class WordCounterT2
 {
    public static void main(String[] args)
     {
        Scanner snl = new Scanner(System.in);
        
        System.out.println("Enter a sentence: ");
        String input = snl.nextLine();
        
        // Split the input string into words using space as the delimiter
        String[] words = input.split(" ");
        
        // Count the number of words
        int wordCount = words.length;
        
        System.out.println("Word count: " + wordCount);
        
        snl.close();
    }
}
