package searching;

public class binarySearch extends search{
    int x;
    int y;

    public void search(int arr[], int first, int last, int key){
        int mid = (first + last)/2;
        while( first <= last ){
            if ( arr[mid] < key ){
                first = mid + 1;
            }else if ( arr[mid] == key ){
                System.out.println("Element is found at index: " + mid);
                break;
            }else{
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        if ( first > last ){
            System.out.println("Element is not found!");
        }
    }



    @Override
    int search(int[] arr, int key) {
        return 0;
    }

    @Override
    public void print(int[] arr) {
        for(int i=0;i<size;i++) {
            System.out.println(arr[i]);
        }
    }
}
