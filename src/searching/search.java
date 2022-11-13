package searching;

public abstract class search {
    int size=5;



    abstract void search(int arr[], int first, int last, int key);
    abstract int search(int[] arr, int key);

    abstract void print(int arr[]);


}
