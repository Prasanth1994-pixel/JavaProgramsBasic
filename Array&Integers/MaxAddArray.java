public class MaxAddArray {
    public static void main(String[] args) {
        int[] array = {12,20,30,40,60,80,100,140,160};
        for(int i=0; i<array.length-1; i++)
        {
            int NewArray = array[i+1] + array[i];
            System.out.println(NewArray);
        }
    }
}
