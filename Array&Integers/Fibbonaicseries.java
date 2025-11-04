public class Fibbonaicseries {
    public static void main(String[] args) {
        int A = 10;
        int B = 80;
        for(int i=0; i<=10; i++)
        {
            int sum = A + B;
            A = B;
            B = sum;
            System.out.println(sum);
        }
    }
}
