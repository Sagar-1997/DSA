package VariableSize;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringKUnique {
    public static void main(String[] args) {
        String str = "aabacbebebe";
        int k=3;
        int len = str.length();
        int i=0,j=0;
        int maxSum = Integer.MIN_VALUE;
        Map<Character,Integer> map = new HashMap<>();
        while(j<len)
        {
            if(map.containsKey(str.charAt(j)))
            {
                map.put(str.charAt(j), map.get(str.charAt(j))+1);
            }
            else
            {
                map.put(str.charAt(j), 1);
            }
            if(map.size()<k)
            {
                j++;
            }
            else if(map.size()==k)
            {
                maxSum = Math.max(maxSum, j-i+1);
                j++;
            }
            else if(map.size()>k)
            {
                while(map.size()>k)
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
        System.out.println(maxSum);
    }
}
