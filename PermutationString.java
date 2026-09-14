class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1=s1.length();
        int n2=s2.length();

        if (n1 > n2) {
            return false;
        }

        int x1[]=new int[26];
        int x2[]=new int[26];

        for(int i=0;i<n1;i++)
        {
            x1[s1.charAt(i)-'a']++;
            x2[s2.charAt(i)-'a']++;

        }
        //check if freq are equal
        if (checkEqual(x1,x2))
            return true;

        //slide window
        for(int i=n1;i<n2;i++)
        {
            x2[s2.charAt(i)-'a']++;
            x2[s2.charAt(i-n1)-'a']--;
            if (checkEqual(x1, x2)) {
                return true;
            }

        }
        return false;
    

    }
    boolean checkEqual(int[]x1, int[]x2)
    {
        for(int i=0;i<26;i++)
    {
        if(x1[i]!=x2[i]){
            return false;
        }
    }
    return true;
    }
    
}
