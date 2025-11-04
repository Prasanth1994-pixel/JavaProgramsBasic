public class printLargestWordinString {
    public static void main(String[] args) {
        String Sentence = "INDIAN RAILWAYS PASSENGER RESERVATION ENQUIRY";
        String[] words = Sentence.split(" ");
        String LargestWord = "";
        for(String word : words)
        {
            if(word.length() > LargestWord.length())
            {
                LargestWord = word;
            }
        }
        System.out.println("the largest word in the sentence is " + LargestWord);
    }
}
