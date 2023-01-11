package VariableSize;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringAllUnique {
    public static void main(String[] args) {
        String str = "pwwkew";
        int i=0,j=0;
        int start=0,end=0;
        int len=str.length();
        int maxSum = Integer.MIN_VALUE;
        Map<Character,Integer> map= new HashMap<>();
        while(j<len)
        {
            char ch = str.charAt(j);
            if(map.containsKey(ch))
            {
                map.put(ch, map.get(ch)+1);
            }
            else
            {
                map.put(ch, 1);
            }
            //window size is longest substring
            if(map.size()==j-i+1)
            {
                //maxSum = Math.max(maxSum, j-i+1);
                if(j-i+1>maxSum)
                {
                    maxSum=j-i+1;
                    start=i;
                    end=j;
                }
                j++;
            }
            else if(map.size()<j-i+1)
            {
                while(map.size()<j-i+1)
                {
                    map.put(str.charAt(i), map.get(str.charAt(i))-1);
                    if(map.get(str.charAt(i))==0)
                    {
                        map.remove(str.charAt(i));
                    }
                    i++;
                }
                j++;
            }
        }
    System.out.println(str.substring(start, end+1));
    System.out.println(maxSum);
    }
}
