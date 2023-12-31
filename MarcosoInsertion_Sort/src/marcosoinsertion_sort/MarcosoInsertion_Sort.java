package marcosoinsertion_sort;

public class MarcosoInsertion_Sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[] = {12, 11 ,13, 5, 6};
        int length = arr.length;

        System.out.print("Unsorted array : ");
        for(int i=0;i<length;i++)
        System.out.print(arr[i] + " ");

        for(int i=1;i<length;i++){
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j = j - 1 ;
            }
            arr [j+1] = key;
        } 
        System.out.print("Sorted array : ");
        for(int i=0;i<length;i++)
        System.out.print(arr[i] + " ");
    }
}