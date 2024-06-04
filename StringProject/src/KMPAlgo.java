class KMPAlgo
{
    public static void main(String[] args) {
        String text = "abdcefghijklghifghsd";
        String pattern = "aabcadaabe";
        int textLen = text.length();
        int patLen = pattern.length();
        //getnavieSoln(text,pattern,textLen,patLen);
        usingKMP(text,pattern,textLen,patLen);
    }
    private static void usingKMP(String text, String pattern, int textLen, int patLen) {
        int i=0,j=0;
        int []lps = getlps(pattern,patLen);
        boolean found = false;
        while(i<textLen)
        {
            if(j==patLen)
            {
                System.out.println("Pattern found at index : "+(i-j));
                j=lps[j-1];
                found=true;
            }
            else
            {
                if(text.charAt(i)==pattern.charAt(j))
                {
                    i++;
                    j++;
                }
                else
                {
                    if(j!=0)
                    {
                        j=lps[j-1];
                    }
                    else
                    {
                        i++;
                    }
                }
            }
        }
        if(j==patLen)
        {
                System.out.println("Pattern found at index : "+(i-j));
                found=true;
        }
        if(!found)
        {
            System.out.println("Pattern not found");
        }
    }
    private static int[] getlps(String pattern, int patLen) {
        int []lsp = new int[patLen];
        int i=1;
        int len=0;
        lsp[len]=0;
        while(i<patLen)
        {
            if(pattern.charAt(i)==pattern.charAt(len))
            {
                len++;
                lsp[i]=len;
                i++;
            }
            else
            {
                if(len!=0)
                {
                    len=lsp[len-1];
                }
                else
                {
                    lsp[i]=len;
                    i++;
                }
            }
        }
        return lsp;
    }
    public static void getnavieSoln(String t,String p,int l1,int l2)
    {
        //T.C. of this algorthim is O((n-m+1)m)
        //l1 is for outther loop and l2 for equals methods;
        //S.C. is O(1) no extra space is use
        boolean found = false;
        for(int i=0;i<=l1-l2;i++)
        {
            String s = t.substring(i,i+l2);
            if(p.equals(s))
            {
                System.out.println("Pattern found at index : "+i);
                found=true;
            }
        }
        if(!found)
        {
            System.out.println("Pattern not found");
        }
    }

}