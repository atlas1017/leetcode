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


// the brief version
public class Solution {
    public int removeDuplicates(int[] A) {
      int offset = 0;
      for(int i = 0; i < A.length-1; i++)
      {
          if(A[i+1] == A[i])
            offset++;
          else
            A[i+1-offset] = A[i+1];
      }
      return A.length-offset;
    }
}

// even more brief
public class Solution {
    public int removeDuplicates(int[] A) {
        if(A.length < 2)
            return A.length;
        
        int pos = 0;
        for(int i = 1; i < A.length; i++)
        {
            if(A[i] != A[pos])
                A[++pos] = A[i];
        }
        return pos+1;
    }
}
