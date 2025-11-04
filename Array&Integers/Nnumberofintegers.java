public class Nnumberofintegers {
    public static void main(String[] args) {
        int[] array = new int[1000];
        for(int i=0; i<array.length; i++)
        {
            array[i] = i + 1;
        }
        int x = 901;
        int y = array[x];
        System.out.println(y);

    }
}
