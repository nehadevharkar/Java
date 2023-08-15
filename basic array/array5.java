// wap, take 10 ip from user & print only elements that are divisible by 5
// ip : 10 2 2 3 3 3 4 4 25 55 
// op : 10 25 55


import java.util.*;
class ArrayDemo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter size of array :");
        int size =sc.nextInt();
        int arr[] = new int[size];

        System.out.println ("Enter array elements :");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Elements divisible by 5 :");
        for (int i=0;i<arr.length;i++){
            if(arr[i]%5==0){
                System.out.println (arr[i]);
            }
        }
    }
}