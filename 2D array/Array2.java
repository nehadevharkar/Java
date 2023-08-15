class Array2 {
    public static void main(String[] args) {
        int arr[]={10,20,30};
        int arr1[]={10,20,30};

        System.out.println(System.identityHashCode(arr1[0]));
        System.out.println(System.identityHashCode(arr[0]));
    }
    
}
