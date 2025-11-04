public class pyramid2 {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++)
        {
            for(int j=i; j<=i; j++)
            {
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++)
            {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
