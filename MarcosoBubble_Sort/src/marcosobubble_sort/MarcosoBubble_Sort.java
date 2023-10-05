
package marcosobubble_sort;

public class MarcosoBubble_Sort {

    public static void main(String[] args) {
        // TODO code application logic here
        int arr[] = { 5,1,4,2,8};
        int length = arr.length;
        
            System.out.print("Unsorted array " );
    for (int i=0;i<length;i++)
       System.out.print(arr[i] + " ");
    
        for (int i=0; i<length; i++) {
            for (int j=1;j<length - i; j++){
                if (arr[j-1] > arr[j]){
                     int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;   
                }
                    
            }
        }
        System.out.println();
    System.out.print("Sorted array " );
    for (int i=0;i<length;i++)
       System.out.print(arr[i] + " ");
    }
}