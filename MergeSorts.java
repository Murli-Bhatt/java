public class MergeSorts {
    public static void conquer(int arr[],int si,int mid,int ei){
        int merged[] = new int[ei-si+1];
        int indx1 =si;
        int indx2 = mid+1;
        int i =0;
        while(indx1<=mid && indx2<=ei ){
            if(arr[indx1]<=arr[indx2]){
                merged[i] =arr[indx1];
                i++;
                indx1 ++;
            }
            else {
                merged[i] = arr[indx2];
                i++;
                indx2++;
            }
            
        }
        //if any elements are left then they will fill here 
        while(indx1<=mid){
            merged[i] = arr[indx1];
            i++;
            indx1++;
        }
        while(indx2<=ei){
            merged[i] = arr[indx2];
            i++;
            indx2++;
        }
        //here we make change in real array
      for(int k =0 , j = si;k<merged.length;k++,j++){
        arr[j] = merged[k];

      }
    }
    public static void divide(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid = si + (ei-si)/2;
        //we divide and conquer here arrays 
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr, si, mid, ei);
    }
    public static void main(String[] args){
        int arr[] = {2,7,3,5,4,8};
        int n = arr.length;

        divide(arr, 0, n-1);

        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    

}

