public class swapWithoutTempVariable {
    public static void main(String[] args) {
        int A = 10;
        int B = 40;
        A = A + B; // A = 50
        B = A - B; // B = 10
        A = A - B; // A = 40
        System.out.println("A = " + A);
        System.out.println("B = " + B);
    }
}
