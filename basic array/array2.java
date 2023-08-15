// wap to take size of array from user and also take integer elements from user.
// print product of even elements onlu.
// ip: Enter size = 9
// Enter array elements = 1 2 3 2 5 10 55 77 99
// op : 40 (2*2*10)

import java.util.*;
class ArrayDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter size of array : ");
        int size= sc.nextInt();

        int arr[]=new int[size];
        System.out.println("Enter array elements : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int mult=1;
        for (int i=0;i<arr.length;i++){
            if (arr[i]%2==0){
                mult=mult*arr[i];
            }
        }
        System.out.println("Product of even elements = "+mult);

    }
}