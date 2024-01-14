class Solution {
    public int[] searchRange(int[] a, int target) {
           int b[]=new int[2];
        int low=0;
        int high=a.length-1;
        int mid=0;
        while(low<=high){
            mid=(low+high)/2;
            if(a[mid]==target){
              if(mid==0)
              {
                  b[0]=mid;
                  break;
              }else{
                  if(a[mid-1]==target){
                      high=mid-1;
                  }
                  else if(a[mid-1]!=target){
                      b[0]=mid;
                      break;
                  }
              }
            }
            else if(a[mid]<target)
                low=mid+1;
            else
                high=mid-1;
        }
        low=0;high=a.length-1;
        int k=0;
        while(low<=high){
            mid=(low+high)/2;
            if(a[mid]==target){
                if(mid==a.length-1)
                {
                    b[1]=mid;
                    k++;
                    break;
                }else{
                    if(a[mid+1]==target){
                     
                        low=mid+1;
                    }
                    else if(a[mid+1]!=target){
                        b[1]=mid;
                        k++;
                        break;
                    }
                }
            }
            else if(a[mid]<target)
                low=mid+1;
            else
                high=mid-1;
        }
        if(k==0){
           b[0]=-1;
            b[1]=-1;
            return b;
        }
        return b;
    }
}