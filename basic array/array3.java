// wap to take size of array from user and also take integer elements from user. 
// Print product of odd ***INDEX*** only
// ip: Enter size = 6
// Enter array elements : 1 2 3 4 5 6
// op: 48 (2*4*6)

import java.util.*;
class ArrayDemo3 {
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
            if (i%2==1){
                mult=mult*arr[i];
            }
        }
        System.out.println("Product of even elements = "+mult);

    }
}