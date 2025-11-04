public class ReverseTheStringAndcheckThePalindrome {
    public static void main(String[] args) {
        String Word = "MadaM";
        String rev = "";
        for(int i=Word.length()-1; i>=0; i--)
        {
            rev = rev + Word.charAt(i);
        }
        System.out.println(rev);
        if(Word.equals(rev))
        {
            System.out.println("its a palindrome");
        }
        else{
             System.out.println("its not a palindrome");
        }
    }
}
