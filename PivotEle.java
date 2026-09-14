class Solution {
    public int pivotIndex(int[]a) {
        int left=0;
        int right=a.length-1;
        int suml=0;
        int total=0;
        for(int i=0;i<a.length;i++)
        {
            total+=a[i];
        }
        for(int i=0;i<a.length;i++)
        {
            if(suml==total-suml-a[i])
            {
                return i;
            }
            suml+=a[i];
        }

        return -1;
    }
}
