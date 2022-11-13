package searching;

public class linearSearch extends search {

    @Override
    void search(int[] arr, int first, int last, int key) {

    }

    @Override
    public int search(int[] arr, int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                System.out.println("Element "+key+" is found at index: " + i);
            }
        }
        return -1;
    }

    @Override
    public void print(int[] arr) {
        System.out.println("given array");
        for(int i=0;i<5;i++){
            System.out.println(arr[i]);
        }
        //int key=search();
    }
}
