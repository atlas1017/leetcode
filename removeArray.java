public class Solution {
    public int removeDuplicates(int[] A) {
        
        if(A.length == 0)
            return 0;
        
        int i, j, count;
        count = 1;
        for(i = 0; i < A.length-1; i++)
        {
            if(A[i+1] != A[i])
                count++;
        }
        
        
        int[] res = new int[count];
        res[0] = A[0];
        j = 0;
        for(i = 0; i < A.length; i++)
        {
            if(A[i] != res[j])
            {
                res[j+1] = A[i];
                j++;
            }
        }
        A = res;
        return count;
    }
}
