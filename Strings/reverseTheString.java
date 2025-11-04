public class reverseTheString {
    public static void main(String[] args) {
        String Word = "Selenium";
        for(int i=Word.length()-1; i>=0; i--)
        {
            System.out.print(Word.charAt(i));
        }
    }
}
