import java.util.ArrayList;

public class comparetwoarraysandplaceinnewarray {
    public static void main(String[] args) {
        int[] array1 = {12,20,30,40,60,80,100,140,160};
        int[] array2 = {12,2,30,40,6,80,100,14,16};
        ArrayList<Integer> array3 = new ArrayList<Integer>();
        for(int i=0; i<array1.length; i++)
        {
            if(array1[i] == array2[i])
            {
                array3.add(array1[i]);
            }
        }
        System.out.println(array3);
    }
}
