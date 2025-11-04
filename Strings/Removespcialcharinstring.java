public class Removespcialcharinstring {
    public static void main(String[] args) {
        String str = "!R@E#S$E%R^V&A*T(I)O_N+";
        String newStr = str.replaceAll("[^0-9.a-z,A-Z]", "");
        System.out.println(newStr);
    }
}
