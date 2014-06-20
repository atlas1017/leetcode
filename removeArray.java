public class Solution {
    public int removeDuplicates(int[] A) {
      int i,j,count;
      count = 1;
      j = 1;
      if(A.length <= 1)
        return A.length;
      for(i = 0; i < A.length-1; i++)
      {
        if(A[i+1] != A[i])
        {
            A[j++] = A[i+1];
            count++;
        }
      }
      return count;
    }
}
