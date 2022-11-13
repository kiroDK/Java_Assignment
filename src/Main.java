import searching.*;

import java.util.*;

public class Main {
    public static void main(String args[]){

        int arr[];
        int first,last,i;

        //int arr[] = {10,20,30,40,50};
        //int last=arr.length-1;
        int IWTS=1;

        Scanner sc=new Scanner(System.in);



        while(IWTS==1)
        {
            first=0;
            System.out.println("Enter the searching space length in which you want to search: ");
            int n=sc.nextInt();

            arr=new int[n];
            last=arr.length-1;

            System.out.println("Enter the elements of array: ");
            for(i=0;i<arr.length;i++)
            {
                arr[i]=sc.nextInt();
            }

            System.out.println("Enter the key element you want to search");
            int key=sc.nextInt();

            System.out.println("Enter 1 if you want to search through binary ");
            System.out.println("Enter 2 if you want to search through linear ");
            System.out.println("Enter 3 if you want to search through jump ");
            //System.out.println("Enter 4 if you want to search through fibonacci ");

            int ch=sc.nextInt();


                    switch(ch)

                        {
                            case 1:
                            {
                                binarySearch b = new binarySearch();
                                b.search(arr,0,4,key);
                                b.print(arr);
                                break;
                            }

                            case 2:
                            {
                                linearSearch l = new linearSearch();
                                l.search(arr,key);
                                l.print(arr);
                                break;
                            }

                            case 3:
                            {
                                JumpSearch j=new JumpSearch();
                                j.jumpSearch(arr,key);
                                int index = j.jumpSearch(arr, key);

                                System.out.println("\nNumber " + key +
                                        " is at index " + index);
                                j.print(arr);
                                break;
                            }

                            default: {

                                System.out.println();
                                break;
                            }
                        }
                    System.out.println("Enter 1 if you want to continue searching else 0");
                    IWTS=sc.nextInt();
                }




    }
}