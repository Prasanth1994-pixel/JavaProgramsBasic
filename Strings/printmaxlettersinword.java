public class printmaxlettersinword {
    public static void main(String[] args) {
        String word = "RESERVATION";
        int count = 0;
        for(int i=0; i<word.length(); i++)
        {
            if(word.charAt(i) == 'E')
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
