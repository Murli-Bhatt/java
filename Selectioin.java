public class Selectioin {

    public static void selectionSort(int arr[]){

        int n = arr.length;
        for(int i =0; i<n-1;i++){
            int temp=i;
            for(int j=i+1;j<n;j++){
                if(arr[temp]>arr[j]){
                  temp = j;
                }
            }
            int val = arr[temp];
            arr[temp] = arr[i];
            arr[i] = val;
        }

        for(int i=0 ;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
    }
    public static void main(String[] args){
        int arr[] = {3,4,2,1,5,6};
        selectionSort(arr);
        
    }
    
}
