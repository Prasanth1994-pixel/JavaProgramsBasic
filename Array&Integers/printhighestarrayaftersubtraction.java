public class printhighestarrayaftersubtraction {
    public static void main(String[] args) {
         int[] array = {12,20,30,40,60,80,100,140,160};
         int maxNumAftersubtraction = 0;
         for(int i=0; i<array.length-1; i++)
         {
            int newArray = array[i+1] - array[i];
            if(newArray > maxNumAftersubtraction)
            {
                maxNumAftersubtraction = newArray;
            }
         }
         System.out.println(maxNumAftersubtraction);
    }
}
