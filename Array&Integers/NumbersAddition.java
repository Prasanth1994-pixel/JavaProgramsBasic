public class NumbersAddition {
    public static void main(String[] args) {
        int[] Addnum = {1,2,3,4,5,6,7,8};
        int add = 0;
        for(int i=0; i<Addnum.length; i++)
        {
            add = add + Addnum[i];
        }
        System.out.println(add);
    }
}
