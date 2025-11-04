public class printthelargestwordintheStringandperformereverseandprintpalindrome {
    public static void main(String[] args) {
        String sentence = "INDIAN RAILWAYS PASSENGER RESERVATION ENQUIRY";
        String[] words = sentence.split(" ");
        String largestWord = "";
        for(String word : words)
        {
            if(word.length() > largestWord.length())
            {
                largestWord = word;
            }
        }
        System.out.println("the largest word in the string is " + largestWord);
        String rev = "";
        for(int i=largestWord.length()-1; i>=0; i--)
        {
            rev = rev + largestWord.charAt(i);
        }
        System.out.println(rev);
        if(largestWord.equals(rev))
        {
            System.out.println("its a palindrome");
        }
        else{
            System.out.println("its not a palindrome");
        }
    }
}
