package fixedSize;

import java.util.HashMap;
import java.util.Map;

class CountOccurenceOfAnagram
{
    public static void main(String[] args) {
        String txt = "forxxorfxdofr";
        String pat = "for";
        Map<Character,Integer> map = new HashMap<>();
        int output=0;
        for(int i=0;i<pat.length();i++)
        {
            if(map.containsKey(pat.charAt(i)))
            {
                map.put(pat.charAt(i),map.get(pat.charAt(i))+1);
            }
            else
            {
                map.put(pat.charAt(i),1);
            }
        }
        int count = map.size();
        int i=0,j=0;
        while(j<txt.length())
        {
            if(map.containsKey(txt.charAt(j)))
            {
               map.put(txt.charAt(j),map.get(txt.charAt(j))-1); 
            }
            if(map.containsKey(txt.charAt(j)) && map.get(txt.charAt(j))==0)
            {
                count--;
            }
            if(j-i+1<pat.length())
            {
                j++;
            }
            else if(j-i+1==pat.length())
            {
                if(count==0)
                {
                   output++; 
                }
                if(map.containsKey(txt.charAt(i)))
                {
                    map.put(txt.charAt(i),map.get(txt.charAt(i))+1);
                    if(map.get(txt.charAt(i))==1)
                {
                    count++;
                }
                }
                i++;
                j++;
            }
        }
        System.out.println(output);
    }
}