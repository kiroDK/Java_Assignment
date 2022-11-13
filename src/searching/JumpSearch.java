package searching;

public class JumpSearch extends search{
    public static int jumpSearch(int[] arr, int key)
    {
        int n = arr.length;

        // Finding block size to be jumped
        int step = (int)Math.floor(Math.sqrt(n));

        // Finding the block where element is
        // present (if it is present)
        int prev = 0;
        while (arr[Math.min(step, n)-1] < key)
        {
            prev = step;
            step += (int)Math.floor(Math.sqrt(n));
            if (prev >= n)
                return -1;
        }

        // Doing a linear search for x in block
        // beginning with prev.
        while (arr[prev] < key)
        {
            prev++;

            // If we reached next block or end of
            // array, element is not present.
            if (prev == Math.min(step, n))
                return -1;
        }

        // If element is found
        if (arr[prev] == key)
            return prev;

        return -1;
    }

    @Override
    void search(int[] arr, int first, int last, int key) {

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
