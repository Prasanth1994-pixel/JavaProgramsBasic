public class AddNnumbersofinteger {
    public static void main(String[] args) {
        int[] array = new int[1201];
        int add = 0;
        for(int i=0; i<array.length; i++)
        {
            array[i] = i + 1;
            add = add + array[i];
        }
        System.out.println(add);
    }
}
