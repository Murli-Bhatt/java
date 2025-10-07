public class Boubble {

    public static void boubbleSort(int arr[] ,int n){
        for (int i = 0; i<n-1;i++){
            for(int j =0; j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i =0 ; i<n;i++){
            System.out.print(arr[i] +" ");
        }
    }
    public static void main (String[] args){
       
        int arr[] = {6,4,7,8,1,2,3};
        boubbleSort(arr,7);

    }
    
}
