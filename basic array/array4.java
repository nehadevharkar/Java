// wap, take 7 characters as ip
// print only vowels from the array.
// ip: a b c o d p e 
// op: a o e

import java.util.*;
class ArrayDemo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter size of array :");
        int size = sc.nextInt();

        char arr[]=new char[size];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.next().charAt(i);
        }

        for (int i=0;i<arr.length;i++){
            if (arr[i] == ('a' || 'A' || 'e' || 'E' || 'i' || 'I' || 'o' || 'O' || 'u' || 'U')){
                System.out.println (arr[i]);
            }
        }
    }
}