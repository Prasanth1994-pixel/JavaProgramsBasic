public class swapWithTempVariable {
    public static void main(String[] args) {
        int A = 10;
        int B = 40;
        int temp;
        temp = A; // temp = 10
        A = B; // A = 40
        B = temp; // B= 10
        System.out.println("A = " + A);
        System.out.println("B = " + B);
    }
}
