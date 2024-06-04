import java.util.ArrayList;

public class GoodNumber {
    public static void main(String[] args) {
        int n=10;
        int []even = new int[]{0,2,4,6,8};
        int []prime = new int[]{2,3,5,7};
        System.out.println(getGoodNumbers(0,even,prime,n));
    }

    private static int getGoodNumbers(int index, int[] even, int[] prime, int n) {
        int l=0;
        int r = 0;
        if(index==n)
        {
            return 1;
        }
        if((index & 1)==0)
        {
            for(int i=0;i<even.length;i++)
            {
                l = l+getGoodNumbers(index+1,even,prime,n);
            }
        }
        else
        {
            for(int i=0;i<prime.length;i++)
            {
                r = r+getGoodNumbers(index+1,even,prime,n);
            }
        }
        return (l+r);
    }
}
